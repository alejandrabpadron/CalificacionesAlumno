package calificacionesalumno;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class AgregarCalificacion {
//Método que recibe los datos que envié desde el JFrame VentanaCalificaciones
    void agregar(String alumno, String asignatura, String calificacion, DefaultTableModel md, JTable tbl_calificaciones) {
        //Convierto a entero la calificacion porque es un String y necesito que sea entero para poder usarla en los condicionales siguientes
        int c = Integer.parseInt(calificacion);
        if (c < 5) {
            //Agrego los datos a mi vector String que almacena el registro de calificaciones
            String datos[] = {alumno, asignatura, calificacion, "Reprobó"};
            //Agrego una fila nueva a mi modelo y dicha fila contiene a datos
            md.addRow(datos);
        } else {
            String datos[] = {alumno, asignatura, calificacion, "Aprobó"};
            md.addRow(datos);
        }

    }

}
