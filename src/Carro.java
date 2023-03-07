public class Carro {

    private String modelo;
    private Motor motor;
    private TanqueCombustivel tanque;

    //Construtor para carro com tanque e motor de tipo unico
    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new MotorUnico(tipoCombustivel, consumoMotor);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
    }

    //Construtor para carro com motor e tanque de tipos distintos, mas motor unico
    public Carro(String modelo, TipoCombustivel tipoCombustivelMotor, int consumoMotor,
                TipoCombustivel tipoCombustivelTanque, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new MotorUnico(tipoCombustivelMotor, consumoMotor);
        tanque = new TanqueCombustivel(tipoCombustivelTanque, capacidadeTanque);
    }

    //Construtor para carro com MotorFlex
    public Carro(String modelo, int consumoAlcool, int consumoGasolina, int capacidadeTanque){
        this.modelo = modelo;
        motor = new MotorFlex(TipoCombustivel.FLEX, consumoGasolina, consumoAlcool);
        tanque = new TanqueCombustivel(TipoCombustivel.FLEX, capacidadeTanque);
    }

    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoInicial, int consumoMinimo, int capacidadeTanque){
        this.modelo = modelo;
        motor = new MotorEcono(tipoCombustivel, consumoInicial, consumoMinimo);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
    }

    public String getModelo() {
        return modelo;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    /**
     * Retorna a quantidade efetivamente abastecida
     * 
     * @param tipoCombustivel Tipo de combustivel usado para abastecer
     * @param quantidade Quantidade de combustivel abastecido
     * @return quanto foi abastecido
     */
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();
        if (capacidadeLivre < quantidade) {
            tanque.abastece(tipoCombustivel, capacidadeLivre);
            return capacidadeLivre;
        } else {
            tanque.abastece(tipoCombustivel, quantidade);
            return quantidade;
        }
    }

    /**
     * Retorna a distancia que consegue viajar com o combustivel remanescente
     * 
     * @param distancia Distancia desejada
     * @return Distancia possivel
     * 
     * Em caso de MotorFlex, confere o tipo de combustivel no tanque
     */
    public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario;
        
        if (motor instanceof MotorFlex){
            combustivelNecessario = ((MotorFlex) motor).combustivelNecessario(distancia, tanque.getTipoNoTanque());
        }
        else if (motor instanceof MotorUnico){
            combustivelNecessario = ((MotorUnico) motor).combustivelNecessario(distancia);
        }
        else {
            combustivelNecessario = ((MotorEcono) motor).combustivelNecessario(distancia);
        }

        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            if (motor instanceof MotorFlex){
                return tanque.getCombustivelDisponivel() * ((MotorFlex) motor).getConsumo(tanque.getTipoNoTanque());
            }
            else if (motor instanceof MotorUnico){
                return tanque.getCombustivelDisponivel() * ((MotorUnico) motor).getConsumo();
            }
            else {
                return tanque.getCombustivelDisponivel() * ((MotorEcono)motor).getConsumo();
            }
        }
    }

    // Retorna true se conseguiu viajar
    public boolean viaja(int distancia) {
        if (verificaSePodeViajar(distancia) >= distancia) {
            motor.percorre(distancia);
            if (motor instanceof MotorFlex){
                tanque.gasta(((MotorFlex) motor).combustivelNecessario(distancia, tanque.getTipoNoTanque()));
            }
            else if (motor instanceof MotorUnico){
                tanque.gasta(((MotorUnico) motor).combustivelNecessario(distancia));
            }
            else{
                tanque.gasta(((MotorEcono) motor).combustivelNecessario(distancia));
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + motor + "\n  Tanque=" + tanque;
    }
}
