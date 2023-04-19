package modelo;

public class Deportivo {

    private String tipoDeporte;
    private String tipoMaterial;

    public Deportivo() {
    }

    public Deportivo(String tipoDeporte, String tipoMaterial) {
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
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
}
