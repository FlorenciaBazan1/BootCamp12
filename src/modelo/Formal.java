package modelo;

public class Formal extends Calzado {
    private String color;
    private String tipoMaterial;

    public Formal(String diaVenta, int numero, Producto producto, String color) {
        super(diaVenta, numero, producto);
        this.color = color;
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
}
