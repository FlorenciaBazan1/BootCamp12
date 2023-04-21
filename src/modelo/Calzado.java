package modelo;

public abstract class Calzado {

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

    //metodo valor de venta
    public int valorVenta (){
        int valorVenta = 0;

        if (this.diaVenta.equalsIgnoreCase("Semana")){

            valorVenta = this.getProducto().getValorBase() - Math.round(this.getProducto().getValorBase()*15/100);

        }else if (this.diaVenta.equalsIgnoreCase("Fin de semana")){

            valorVenta = this.getProducto().getValorBase() + Math.round(this.getProducto().getValorBase()*24/100);
        }

        return valorVenta;
    }

    public int impuestoIva(){

        return Math.round(this.valorVenta()*19/100);
    }

    //metodo valor a pagar, debe ser abstracto
    public abstract int valorPagar ();
}
