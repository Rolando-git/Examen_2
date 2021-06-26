package Principal;

public class bateria {

    private String marca;
    private int capacidad;
    private String auntonomia;
    private int modulos;
    private int carga;
    private String vehiculo;
    private int ensamblaje;

    public bateria() {
    }

    public bateria(String marca, int capacidad, String auntonomia, int modulos, int carga, String vehiculo, int ensamblaje) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.auntonomia = auntonomia;
        this.modulos = modulos;
        this.carga = carga;
        this.vehiculo = vehiculo;
        this.ensamblaje = ensamblaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getAuntonomia() {
        return auntonomia;
    }

    public void setAuntonomia(String auntonomia) {
        this.auntonomia = auntonomia;
    }

    public int getModulos() {
        return modulos;
    }

    public void setModulos(int modulos) {
        this.modulos = modulos;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getEnsamblaje() {
        return ensamblaje;
    }

    public void setEnsamblaje(int ensamblaje) {
        this.ensamblaje = ensamblaje;
    }

    @Override
    public String toString() {
        return "bateria{" + "marca=" + marca + ", capacidad=" + capacidad + ", auntonomia=" + auntonomia + ", modulos=" + modulos + ", carga=" + carga + ", vehiculo=" + vehiculo + ", ensamblaje=" + ensamblaje + '}';
    }

}
