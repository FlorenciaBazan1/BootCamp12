package modelo;

public class Hombre extends Formal {

    public Hombre(String diaVenta, int numero, Producto producto, String color, String tipoMaterial) {
        super(diaVenta, numero, producto, color, tipoMaterial);
    }

   public Hombre (){

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

    @Override
    public int descuento() {
        int descuento = 0;

        if (this.getColor().equalsIgnoreCase("Rojo") || this.getColor().equalsIgnoreCase("Verde")){
            descuento = this.valorVenta() * 25/100;
            return descuento;
        }

        return descuento;
    }
}
