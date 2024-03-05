import javax.swing.JOptionPane;

public class app_credito {

    static cls_cliente[] asistencia = new cls_cliente[6];

    public static void main(String[] args) {
        fnt_asignarValores();
        fnt_menu(true);
    }

    private static void fnt_asignarValores() {
        for (int i = 0; i < 6; i++) {
            asistencia[i] = null;
        }
    }

    private static void fnt_agregar(int pos) {
        if (pos >= 0 && pos <= 9) {
            if (asistencia[pos] == null) {
                String id = JOptionPane.showInputDialog(null, "ID");
                String nombre = JOptionPane.showInputDialog(null, "Nombre");
                float salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Salario"));
                float cap_desc = salario * 60 / 100;
                float credito = Integer.parseInt(JOptionPane.showInputDialog(null, "Credito"));
                int plazo = Integer.parseInt(JOptionPane.showInputDialog(null, "Plazo en meses(12 - 36)"));
                if (plazo < 12 || plazo > 36) {
                    JOptionPane.showMessageDialog(null, "Error de ingreso del plazo",
                            "ERROR", 2);
                }
                float monto = credito / plazo;
                String estado = null;
                float cuotaFlt;
                if (cap_desc > monto) {
                    estado = "Aprobado";
                    cuotaFlt = monto;

                    asistencia[pos] = new cls_cliente(id, nombre, salario, monto, plazo, estado, cuotaFlt);
                    JOptionPane.showMessageDialog(null, "Crédito " + estado + ". Cuota: " + cuotaFlt);
                } else {
                    estado = "Rechazado";
                    cuotaFlt = 0;
                    JOptionPane.showMessageDialog(null, "Crédito rechazado");
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Este lugar ya se encuentra asignado a:" + asistencia[pos].getNombreStr());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Posicion incorrecta");
        }
    }

    private static void fnt_consultar(int pos) {
        if (pos >= 0 && pos <= 5) {
            if (asistencia[pos] != null) {
                JOptionPane.showMessageDialog(null, "Información del cliente en la posición " + pos + ":\n" +
                        "ID: " + asistencia[pos].getIdStr() + "\n" +
                        "Nombre: " + asistencia[pos].getNombreStr() + "\n" +
                        "Salario: " + asistencia[pos].getSalarioFlt() + "\n" +
                        "Monto del crédito: " + asistencia[pos].getMontoFlt() * asistencia[pos].getPlazoInt() + "\n" +
                        "Plazo en meses: " + asistencia[pos].getPlazoInt() + "\n" +
                        "Estado: " + asistencia[pos].getEstadoStr() + "\n" +
                        "Cuota: " + asistencia[pos].getCuotaFlt());
            } else {
                JOptionPane.showMessageDialog(null, "La posición " + pos + " está vacía.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Posición incorrecta.");
        }
    }

    private static void fnt_menu(boolean m) {
        while (m) {
            String opcionStr = JOptionPane.showInputDialog(null,
                    "1. Agregar\n2. Consultar\n3. Salir");
            if (opcionStr.equals("1")) {
                fnt_agregar(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese la posición (0 - 5)")));
            } else if (opcionStr.equals("2")) {
                fnt_consultar(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese la posición a consultar (0 - 5)")));
            } else if (opcionStr.equals("3")) {
                m = false;
            }
        }
    }

}
