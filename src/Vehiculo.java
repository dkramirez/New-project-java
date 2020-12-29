public class Vehiculo implements Comparable<Vehiculo>  {

    private String marca;
    private String modelo;
    private int puertas;
    private String cilindrada;
    private double precio;
    private String tipo;

    public Vehiculo(String marca, String modelo, int puertas, String cilindrada, double precio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Vehiculo() {

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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", cilindrada='" + cilindrada + '\'' +
                ", precio=" + precio +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vehiculo o) {
        if (precio < o.precio) {
            return -1;
        }
        if (precio > o.precio) {
            return 1;
        }
        return 0;
    }

}
