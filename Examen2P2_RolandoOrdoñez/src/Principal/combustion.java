package Principal;

public class combustion {

    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;
    private int cilindrada;
    private int cilindros;
    private int consumo;

    public combustion() {
    }

    public combustion(String marca, String modelo, int vin, String carroceria, int cilindrada, int cilindros, int consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.cilindrada = cilindrada;
        this.cilindros = cilindros;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "combustion{" + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", cilindrada=" + cilindrada + ", cilindros=" + cilindros + ", consumo=" + consumo + '}';
    }

}
