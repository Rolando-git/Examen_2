package Principal;

public class hibrido {

    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;
    private int autonomia;
    private int pasajeros;
    private int precio;
    private bateria bateria;

    public hibrido() {
    }

    public hibrido(String marca, String modelo, int vin, String carroceria, int autonomia, int pasajeros, int precio, bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.autonomia = autonomia;
        this.pasajeros = pasajeros;
        this.precio = precio;
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

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public bateria getBateria() {
        return bateria;
    }

    public void setBateria(bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "hibrido{" + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", autonomia=" + autonomia + ", pasajeros=" + pasajeros + ", precio=" + precio + "bateria" + bateria + '}';
    }

}
