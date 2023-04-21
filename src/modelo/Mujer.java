package modelo;

public class Mujer extends Formal{

    private int alturaTaco;

    public Mujer(String diaVenta, int numero, Producto producto, String color, String tipoMaterial, int alturaTaco) {
        super(diaVenta, numero, producto, color, tipoMaterial);
        this.alturaTaco = alturaTaco;
    }

    public Mujer () {

    }

    @Override
    public int valorPagar() {
        int valorAPagar;

        if (this.getProducto().getStock()> 0){
            valorAPagar = this.valorVenta() - descuento() + impuestoEspecifico()+ impuestoIva();
            this.getProducto().setStock(this.getProducto().getStock()-1);

        }else {
            System.out.println("Sin stock disponible.");
            valorAPagar= -1;

        }
        return valorAPagar;
    }

    //sobreEscritura
    @Override
    public int descuento() {
        int descuento = 0;

        if (this.getAlturaTaco() > 10){
            descuento = this.valorVenta() * 20/100;
            return descuento;
        }

        return descuento;
    }

    public int getAlturaTaco() {
        return alturaTaco;
    }

    public void setAlturaTaco(int alturaTaco) {
        this.alturaTaco = alturaTaco;
    }
}
