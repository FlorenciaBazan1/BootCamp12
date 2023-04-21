package modelo;

public abstract class Formal extends Calzado {
    private String color;
    private String tipoMaterial;

    public Formal(String diaVenta, int numero, Producto producto, String color, String tipoMaterial) {
        super(diaVenta, numero, producto);
        this.color = color;
        this.tipoMaterial = tipoMaterial;
    }

    public Formal(String color, String tipoMaterial) {
        this.color = color;
        this.tipoMaterial = tipoMaterial;
    }

    public Formal() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int impuestoEspecifico (){

        return (int)Math.round(this.getProducto().getValorBase()*7.4/100);
    }

    //Metodo de descuento (metodo abstracto: se construye en las subclases (hombre o mujer))
    public abstract int descuento ();
}
