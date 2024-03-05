package Controlador;

public class cls_Experiencia_lab {

    private int idInt;
    private String empresaStr;
    private String contactoStr;
    private String tiempoStr;
    private String cargoStr;

    public cls_Experiencia_lab(int idInt, String empresaStr, String contactoStr, String tiempoStr, String cargoStr) {
        this.idInt = idInt;
        this.empresaStr = empresaStr;
        this.contactoStr = contactoStr;
        this.tiempoStr = tiempoStr;
        this.cargoStr = cargoStr;
    }

    public int getIdInt() {
        return idInt;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

    public String getEmpresaStr() {
        return empresaStr;
    }

    public void setEmpresaStr(String empresaStr) {
        this.empresaStr = empresaStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    public String getTiempoStr() {
        return tiempoStr;
    }

    public void setTiempoStr(String tiempoStr) {
        this.tiempoStr = tiempoStr;
    }

    public String getCargoStr() {
        return cargoStr;
    }

    public void setCargoStr(String cargoStr) {
        this.cargoStr = cargoStr;
    }

    
    
}
