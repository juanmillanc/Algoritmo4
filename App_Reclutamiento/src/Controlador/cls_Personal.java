package Controlador;


public class cls_Personal{

private int idint;
private String nombreStr;
private String contactoStr;
private String direccionStr;
private String correoStr;
private String PerfilStr;





public cls_Personal(int idint, String nombreStr, String contactoStr, String direccionStr, String correoStr,
        String perfilStr) {
    this.idint = idint;
    this.nombreStr = nombreStr;
    this.contactoStr = contactoStr;
    this.direccionStr = direccionStr;
    this.correoStr = correoStr;
    PerfilStr = perfilStr;
}





public int getIdint() {
    return idint;
}





public void setIdint(int idint) {
    this.idint = idint;
}





public String getNombreStr() {
    return nombreStr;
}





public void setNombreStr(String nombreStr) {
    this.nombreStr = nombreStr;
}





public String getContactoStr() {
    return contactoStr;
}





public void setContactoStr(String contactoStr) {
    this.contactoStr = contactoStr;
}





public String getDireccionStr() {
    return direccionStr;
}





public void setDireccionStr(String direccionStr) {
    this.direccionStr = direccionStr;
}





public String getCorreoStr() {
    return correoStr;
}





public void setCorreoStr(String correoStr) {
    this.correoStr = correoStr;
}





public String getPerfilStr() {
    return PerfilStr;
}





public void setPerfilStr(String perfilStr) {
    PerfilStr = perfilStr;
}










}