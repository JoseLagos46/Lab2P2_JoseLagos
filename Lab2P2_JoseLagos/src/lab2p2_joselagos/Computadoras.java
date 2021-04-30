package lab2p2_joselagos;

public class Computadoras {
    private String modelo;
    private int serie;
    private int capacidad;
    private int pantalla;
    private boolean teclado;
    private String procesador;
    private String tarjeta;
    private String SO;
    private int horas;
    private int miliamperios;
    private int duracion;

    public Computadoras() {
    }

    public Computadoras(String modelo, int serie, int capacidad, int pantalla, boolean teclado, String procesador, String tarjeta, String SO, int horas, int miliamperios, int duracion) {
        this.modelo = modelo;
        this.serie = serie;
        this.capacidad = capacidad;
        this.pantalla = pantalla;
        this.teclado = teclado;
        this.procesador = procesador;
        this.tarjeta = tarjeta;
        this.SO = SO;
        this.horas = horas;
        this.miliamperios = miliamperios;
        this.duracion = duracion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMiliamperios(int miliamperios) {
        this.miliamperios = miliamperios;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getModelo() {
        return modelo;
    }

    public int getSerie() {
        return serie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPantalla() {
        return pantalla;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public String getSO() {
        return SO;
    }

    public int getHoras() {
        return horas;
    }

    public int getMiliamperios() {
        return miliamperios;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Modelo = " + modelo + ", Numero de Serie = " + serie + ", Capacidad = " + capacidad + " GB, Pantalla = " + pantalla + "in, Teclado Numerico = " + teclado + ", Procesador = " + procesador + ", Tarjeta Grafica = " + tarjeta + ", Sistema Operativo = " + SO + ", Horas de fabricacion = " + horas + " horas, Capacidad de bateria = " + miliamperios + "mAh, Duracion de bateria = " + duracion+" horas" ;
    }
    
}
