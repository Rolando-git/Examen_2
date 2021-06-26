package Principal;

public class electrico {

    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;
    private int aerodinamico;
    private int motores;
    private int carga;
    private bateria bateria;

    public electrico() {
    }

    public electrico(String marca, String modelo, int vin, String carroceria, int aerodinamico, int motores, int carga, bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.aerodinamico = aerodinamico;
        this.motores = motores;
        this.carga = carga;
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

    public int getAerodinamico() {
        return aerodinamico;
    }

    public void setAerodinamico(int aerodinamico) {
        this.aerodinamico = aerodinamico;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public bateria getBateria() {
        return bateria;
    }

    public void setBateria(bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "electrico{" + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", aerodinamico=" + aerodinamico + ", motores=" + motores + ", carga=" + carga + "bateria" + bateria + '}';
    }

}
