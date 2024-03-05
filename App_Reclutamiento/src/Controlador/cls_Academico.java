package Controlador;

public class cls_Academico {

    private int idInt;
    private String tituloStr;
    private String instituStr;
    private String año_gradoStr;
    private String gradoStr;
    private String contactoStr;

    public cls_Academico(int idInt, String tituloStr, String instituStr, String año_gradoStr, String gradoStr,
            String contactoStr) {
        this.idInt = idInt;
        this.tituloStr = tituloStr;
        this.instituStr = instituStr;
        this.año_gradoStr = año_gradoStr;
        this.gradoStr = gradoStr;
        this.contactoStr = contactoStr;
    }

    public int getIdInt() {
        return idInt;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

    public String getTituloStr() {
        return tituloStr;
    }

    public void setTituloStr(String tituloStr) {
        this.tituloStr = tituloStr;
    }

    public String getInstituStr() {
        return instituStr;
    }

    public void setInstituStr(String instituStr) {
        this.instituStr = instituStr;
    }

    public String getAño_gradoStr() {
        return año_gradoStr;
    }

    public void setAño_gradoStr(String año_gradoStr) {
        this.año_gradoStr = año_gradoStr;
    }

    public String getGradoStr() {
        return gradoStr;
    }

    public void setGradoStr(String gradoStr) {
        this.gradoStr = gradoStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    
    
    
    

    
    

}