public class MotorFlex extends Motor{

      private int consumoAlcool, consumoGasolina;

      public MotorFlex(TipoCombustivel tipoMotor, int consumoGasolina, int consumoAlcool) {
            super(tipoMotor);
            this.consumoAlcool = consumoAlcool;
            this.consumoGasolina = consumoGasolina;
      }

      public int getConsumo(TipoCombustivel tipo){
            if (tipo == TipoCombustivel.GASOLINA){
                  return consumoGasolina;
            }
            else {
                  return consumoAlcool;
            }
      }

      public int combustivelNecessario(int distancia, TipoCombustivel tipo) {
            if (tipo == TipoCombustivel.GASOLINA){
                  return distancia / consumoGasolina;
            }
            else {
                  return distancia / consumoAlcool;
            }
      }

      @Override
      public String toString(){
            return "Motor [consumo gasolina=" + consumoGasolina + ", consumo alcool=" + consumoAlcool + " quilometragem="
            + super.getQuilometragem() + ", tipoMotor=" + super.getTipoMotor() + "]";
      }      
}
