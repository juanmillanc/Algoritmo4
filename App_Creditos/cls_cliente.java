public class cls_cliente{
    private String idStr;
    private String nombreStr;
    private float salarioFlt;
    private float montoFlt;
    private int plazoInt;
    private String estadoStr;
    private float cuotaFlt;

    public cls_cliente(String id, String nombre, float salario, float monto, int plazo, String estado,
            float cuota) {
        this.idStr = id;
        this.nombreStr = nombre;
        this.salarioFlt = salario;
        this.montoFlt = monto;
        this.plazoInt = plazo;
        this.estadoStr = estado;
        this.cuotaFlt = cuota;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public float getSalarioFlt() {
        return salarioFlt;
    }

    public void setSalarioFlt(float salarioFlt) {
        this.salarioFlt = salarioFlt;
    }

    public float getMontoFlt() {
        return montoFlt;
    }

    public void setMontoFlt(float montoFlt) {
        this.montoFlt = montoFlt;
    }

    public int getPlazoInt() {
        return plazoInt;
    }

    public void setPlazoInt(int plazoInt) {
        this.plazoInt = plazoInt;
    }

    public String getEstadoStr() {
        return estadoStr;
    }

    public void setEstadoStr(String estadoStr) {
        this.estadoStr = estadoStr;
    }

    public float getCuotaFlt() {
        return cuotaFlt;
    }

    public void setCuotaFlt(float cuotaFlt) {
        this.cuotaFlt = cuotaFlt;
    }

    

}