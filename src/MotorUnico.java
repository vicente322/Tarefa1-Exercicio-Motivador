public class MotorUnico extends Motor {
      
      private int consumo;

      public MotorUnico(TipoCombustivel tipo, int consumo){
            super(tipo);
            this.consumo = consumo;
      }

      
      public int getConsumo() {
            return consumo;
      }

      public int combustivelNecessario(int distancia) {
            return distancia / consumo;
      }


      @Override
      public String toString() {
            return "Motor [consumo=" + consumo + " quilometragem=" + super.getQuilometragem() +
            ", tipoMotor=" + super.getTipoMotor() + "]";
      }

}
