package modelo;

public class Calzado {

    private String diaVenta; //Semana o fin de semana
    private int numero;
    private Producto producto;

    public Calzado(String diaVenta, int numero, Producto producto) {
        this.diaVenta = diaVenta;
        this.numero = numero;
        this.producto = producto;
    }

    public Calzado() {
    }

    public String getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(String diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


}
