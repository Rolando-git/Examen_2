package Principal;

public class enchufable {

    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;
    private int maletero;
    private int combustible;
    private bateria bateria;

    public enchufable() {
    }

    public enchufable(String marca, String modelo, int vin, String carroceria, int maletero, int combustible, bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.maletero = maletero;
        this.combustible = combustible;
        this.bateria = bateria;
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

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public bateria getBateria() {
        return bateria;
    }

    public void setBateria(bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "enchufable{" + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", maletero=" + maletero + ", combustible=" + combustible + "bateria" + bateria + '}';
    }

}
