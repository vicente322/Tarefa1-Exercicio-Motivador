public abstract class Motor {

    private TipoCombustivel tipoMotor;
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public abstract int combustivelNecessario(int distancia);

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public abstract String toString();
}