public class TanqueCombustivel {

    private TipoCombustivel tipoCombustivel;
    private TipoCombustivel tipoNoTanque;
    private int capacidade;
    private int combustivelDisponivel;

    public TanqueCombustivel(TipoCombustivel tipoCombustivel, int capacidade) {
        this.tipoCombustivel = tipoCombustivel;
        this.capacidade = capacidade;
        this.combustivelDisponivel = 0;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public TipoCombustivel getTipoNoTanque(){
        return tipoNoTanque;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getCombustivelDisponivel() {
        return combustivelDisponivel;
    }

    /**
     * Retorna false se o tipo de combustivel for incompativel ou se a quantidade
     * for maior que a capacidade livre
     * 
     * @param tipoCombustivel Tipo abastecido
     * @param quantidade Quantidade abastecido
     * @return True se foi possivel abastecer, false caso contrario
     * 
     * Modificacao para o exercicio 4 ajusta o tipoNoTanque ao abastecer
     */
    public boolean abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        if (tipoCombustivel != this.tipoCombustivel) {
            if (this.tipoCombustivel == TipoCombustivel.FLEX) {
                if (!(tipoCombustivel == TipoCombustivel.GASOLINA || tipoCombustivel == TipoCombustivel.ALCOOL)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (getCombustivelDisponivel() + quantidade > getCapacidade()) {
            return false;
        } else {
            combustivelDisponivel += quantidade;
            if (this.tipoCombustivel == TipoCombustivel.FLEX){
                tipoNoTanque = tipoCombustivel;
            }
            return true;
        }
    }

    public boolean gasta(int quantidade) {
        if (getCombustivelDisponivel() - quantidade < 0) {
            return false;
        } else {
            combustivelDisponivel -= quantidade;
            return true;
        }
    }

    @Override
    public String toString() {
        return "TanqueCombustivel [capacidade=" + capacidade + ", combustivelDisponivel=" + combustivelDisponivel
                + ", tipoCombustivel=" + tipoCombustivel + ", tipo no tanque=" + tipoNoTanque + "]";
    }

}
