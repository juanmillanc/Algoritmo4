package Controlador;

public class cls_Familiar {

    private int idInt;
    private String nombreStr;
    private String parentezcoStr;
    private String contactoStr;

    public cls_Familiar(int idInt, String nombreStr, String parentezcoStr, String contactoStr) {
        this.idInt = idInt;
        this.nombreStr = nombreStr;
        this.parentezcoStr = parentezcoStr;
        this.contactoStr = contactoStr;
    }

    public int getIdInt() {
        return idInt;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getParentezcoStr() {
        return parentezcoStr;
    }

    public void setParentezcoStr(String parentezcoStr) {
        this.parentezcoStr = parentezcoStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    

    

    
}
