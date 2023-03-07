public class MotorEcono extends Motor {

      private int consumoInicial, consumoMinimo;

      public MotorEcono(TipoCombustivel tipoMotor, int consumoInicial, int consumoMinimo) {
            super(tipoMotor);
            this.consumoInicial = consumoInicial;
            this.consumoMinimo = consumoMinimo;
      }

      public int getConsumo(){
            int consumoAtual = consumoInicial - (super.getQuilometragem() / 5000);

            if (consumoAtual < consumoMinimo) {
                  return consumoMinimo;
            } else {
                  return consumoAtual; 
            }
      
      }

      public int combustivelNecessario(int distancia) {
            return distancia / getConsumo();
      }
      @Override
      public String toString() {
            return "Motor [consumo=" + getConsumo() + " quilometragem=" + super.getQuilometragem() +
            ", tipoMotor=" + super.getTipoMotor() + "]";
      }
}
