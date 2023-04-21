package modelo;

public class Deportivo extends Calzado{

    private String tipoDeporte;
    private String tipoMaterial;

    public Deportivo(String diaVenta, int numero, Producto producto, String tipoDeporte, String tipoMaterial) {
        super(diaVenta, numero, producto);
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
    }

    public Deportivo(String tipoDeporte, String tipoMaterial) {
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
    }

    public Deportivo(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public Deportivo() {

    }

    @Override
    public int valorPagar() {
        int valorAPagar;

        if (this.getProducto().getStock()> 0){
            valorAPagar = this.valorVenta() + impuestoMaterial() + impuestoIva();
            this.getProducto().setStock(this.getProducto().getStock()-1);

        }else {
            System.out.println("Sin stock disponible.");
            valorAPagar= -1;

        }
        return valorAPagar;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    //metodo impuestoMaterial
    public int impuestoMaterial (){
        int impuestoMaterial = (this.getTipoMaterial().equals("Cuero")) ? Math.round(this.getProducto().getValorBase()*15/100) :  Math.round(this.getProducto().getValorBase()*6/100);
        return impuestoMaterial;
    }
}
