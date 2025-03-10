public class Motor {

    private TipoCombustivel tipoMotor, tipoTanque;
    private int consumo; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.consumo = consumo;
    }

//    public Motor(TipoCombustivel tipoMotor, TipoCombustivel tipoTanque, int consumo) {
//        this.tipoMotor = tipoMotor;
//        this.tipoTanque = tipoTanque;
//        this.consumo = consumo;
//    }

    public int getConsumo() {
        return this.consumo;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia) {
        return distancia / consumo;
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}