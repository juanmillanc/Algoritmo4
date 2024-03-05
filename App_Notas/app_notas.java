import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_notas {

    static LinkedList<cls_estudiantes> estudiantes = new LinkedList<cls_estudiantes>();
    static LinkedList<cls_notas> notas = new LinkedList<cls_notas>();
    static int posicionInt;
    static boolean swBln;

    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_registrar_moduloestudiantes() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Id"));
        String nombre = JOptionPane.showInputDialog(null, "Nombre");
        String contacto = JOptionPane.showInputDialog(null, "Contacto");
        String correo = JOptionPane.showInputDialog(null, "Correo");
        String programa = JOptionPane.showInputDialog(null, "Programa");
        String semestre = JOptionPane.showInputDialog(null, "Semestre");
        estudiantes.add(new cls_estudiantes(id, nombre, contacto, correo, programa, semestre));
        JOptionPane.showMessageDialog(null, "SE REGISTRO EXITOSAMENTE");
    }

    private static void fnt_consultar_moduloestudiantes() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Id"));
        swBln = false;
        posicionInt = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdInt() == id) {
                posicionInt = i;
                swBln = true;
                break;
            }
        }
        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL ESTUDIANTE");
        } else {
            JOptionPane.showMessageDialog(null,
                    "NOMBRE: " + estudiantes.get(posicionInt).getNombreStr() +
                            "\nCONTACTO: " + estudiantes.get(posicionInt).getContactoStr() +
                            "\nCORREO" + estudiantes.get(posicionInt).getCorreoStr() +
                            "\nPROGRAMA" + estudiantes.get(posicionInt).getProgramaStr() +
                            "\nSEMESTRE" + estudiantes.get(posicionInt).getSemestreStr());
        }
    }

    private static void fnt_moduloestudiantes(boolean m1) {
        while (m1 == true) {
            String op1 = JOptionPane.showInputDialog(null,
                    "MODULO ESTUDIANTE\n1. REGISTRAR\n2. CONSULTAR\n3. ACTUALIZAR\n4. SALIR");
            switch (op1) {
                case "1":
                    fnt_registrar_moduloestudiantes();
                    break;
                case "2":
                    fnt_consultar_moduloestudiantes();
                    break;
                case "3":

                    break;
                case "4":
                    m1 = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
    }

    private static void fnt_registrar_modulonotas() {
        String fecha = JOptionPane.showInputDialog(null, "FECHA");
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 1"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 2"));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 3"));
        String id_estudiante = JOptionPane.showInputDialog(null, "Id");
        String asignatura = JOptionPane.showInputDialog(null, "Asignatura");
        notas.add(new cls_notas(fecha, nota1, nota2, nota3, id_estudiante, asignatura));
        JOptionPane.showMessageDialog(null, "NOTA REGISTRADA CON EXITO");
    }

    private static void fnt_reporte_modulonotas() {
        String id = JOptionPane.showInputDialog(null, "Id");
        for (int p = 0; p < estudiantes.size(); p++) {
            swBln = false;
            if (notas.get(p).getId_estudianteStr().equals(id)) {
                swBln = true;
                break;
            }
        }
        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON REGISTRO");
        } else {
            for (int i = 0; i < notas.size(); i++) {
                if (notas.get(i).getId_estudianteStr().equals(id)) {
                    JOptionPane.showMessageDialog(null,
                            "FECHA REGISTRO: " + notas.get(i).getFechaStr() +
                                    "\nNOTA 1: " + notas.get(i).getNota1Flt() +
                                    "\nNOTA 2: " + notas.get(i).getNota2Flt() +
                                    "\nNOTA 3: " + notas.get(i).getNota3Flt() +
                                    "\nDEFINITIVA: " + notas.get(i).getDefinitivaFlt() +
                                    "\nASIGNATURA: " + notas.get(i).getAsignaturaStr());
                }
            }
        }
    }

    private static void fnt_modulonotas(boolean m2) {
        while (m2 == true) {
            String op2 = JOptionPane.showInputDialog(null,
                    "MODULO NOTAS\n1. REGISTRAR\n2. REPORTE\n3. SALIR");
            switch (op2) {
                case "1":
                    fnt_registrar_modulonotas();
                    break;
                case "2":
                    fnt_reporte_modulonotas();
                    break;
                case "3":
                    m2 = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
    }

    private static void fnt_menu(boolean men) {
        while (men == true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES\n1. MODULO ESTUDIANTE\n2. MODULO NOTAS\n3. SALIR");
            switch (opcion) {
                case "1":
                    fnt_moduloestudiantes(true);
                    break;
                case "2":
                    fnt_modulonotas(true);
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
    }
}
