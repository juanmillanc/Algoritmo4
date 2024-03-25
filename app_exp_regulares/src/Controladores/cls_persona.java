package Controladores;

public class cls_persona {
    private String idStr;
    private String p_nombreStr; // primer nombre
    private String s_nombreStr; // segundo nombre
    private String p_apellidoStr; // primer apellido
    private String s_apellidoStr; // segundo apellido
    private String edadStr;
    private String correoStr;
    private String contactoStr;
    private String fecha_nacStr;
    private String ciudadStr;
    private String perfilStr;
    private String profesionStr;
    private String tecnologiaStr;

    public cls_persona(String idStr, String p_nombreStr, String s_nombreStr, String p_apellidoStr, String s_apellidoStr,
            String edadStr, String correoStr, String contactoStr, String fecha_nacStr, String ciudadStr,
            String perfilStr, String profesionStr, String tecnologiaStr) {
        this.idStr = idStr;
        this.p_nombreStr = p_nombreStr;
        this.s_nombreStr = s_nombreStr;
        this.p_apellidoStr = p_apellidoStr;
        this.s_apellidoStr = s_apellidoStr;
        this.edadStr = edadStr;
        this.correoStr = correoStr;
        this.contactoStr = contactoStr;
        this.fecha_nacStr = fecha_nacStr;
        this.ciudadStr = ciudadStr;
        this.perfilStr = perfilStr;
        this.profesionStr = profesionStr;
        this.tecnologiaStr = tecnologiaStr;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getP_nombreStr() {
        return p_nombreStr;
    }

    public void setP_nombreStr(String p_nombreStr) {
        this.p_nombreStr = p_nombreStr;
    }

    public String getS_nombreStr() {
        return s_nombreStr;
    }

    public void setS_nombreStr(String s_nombreStr) {
        this.s_nombreStr = s_nombreStr;
    }

    public String getP_apellidoStr() {
        return p_apellidoStr;
    }

    public void setP_apellidoStr(String p_apellidoStr) {
        this.p_apellidoStr = p_apellidoStr;
    }

    public String getS_apellidoStr() {
        return s_apellidoStr;
    }

    public void setS_apellidoStr(String s_apellidoStr) {
        this.s_apellidoStr = s_apellidoStr;
    }

    public String getEdadStr() {
        return edadStr;
    }

    public void setEdadStr(String edadStr) {
        this.edadStr = edadStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    public String getFecha_nacStr() {
        return fecha_nacStr;
    }

    public void setFecha_nacStr(String fecha_nacStr) {
        this.fecha_nacStr = fecha_nacStr;
    }

    public String getCiudadStr() {
        return ciudadStr;
    }

    public void setCiudadStr(String ciudadStr) {
        this.ciudadStr = ciudadStr;
    }

    public String getPerfilStr() {
        return perfilStr;
    }

    public void setPerfilStr(String perfilStr) {
        this.perfilStr = perfilStr;
    }

    public String getProfesionStr() {
        return profesionStr;
    }

    public void setProfesionStr(String profesionStr) {
        this.profesionStr = profesionStr;
    }

    public String getTecnologiaStr() {
        return tecnologiaStr;
    }

    public void setTecnologiaStr(String tecnologiaStr) {
        this.tecnologiaStr = tecnologiaStr;
    }

}
