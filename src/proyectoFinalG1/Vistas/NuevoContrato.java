package proyectoFinalG1.Vistas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import proyectoFinalG1.Data.Conexion;
import proyectoFinalG1.Data.ContratoData;
import proyectoFinalG1.Data.EmpleadoData;
import proyectoFinalG1.Data.InmuebleData;
import proyectoFinalG1.Data.InquilinoData;
import proyectoFinalG1.Modelos.Contrato;
import proyectoFinalG1.Modelos.Empleado;
import proyectoFinalG1.Modelos.Inmueble;
import proyectoFinalG1.Modelos.Inquilino;

/**
 *
 * @author Grupo 1
 */
public class NuevoContrato extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoContrato
     */
    private ContratoData cd;
    private EmpleadoData ed;
    private InmuebleData ind;
    private InquilinoData id;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Inmueble> listaInmuebles;
    private ArrayList<Inquilino> listaInquilino;

    ///// CONSTRUCTOR /////
    public NuevoContrato(Conexion conexion) {
        initComponents();
        cd = new ContratoData(conexion);
        ed = new EmpleadoData(conexion);
        ind = new InmuebleData(conexion);
        id = new InquilinoData(conexion);
        listaEmpleados = (ArrayList<Empleado>) ed.obtenerEmpleados();
        cargarComboEmpleados();
        listaInmuebles = (ArrayList<Inmueble>) ind.NoAlquilados();
        cargarComboInmuebles();
        listaInquilino = (ArrayList<Inquilino>) id.obtenerInquilino();
        cargarComboInquilino();
    }

    ///// METODOS /////
    private void cargarComboInmuebles() {
        Collections.sort(listaInmuebles, new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble t, Inmueble t1) {
                return t.getCodigoInmueble().compareTo(t1.getCodigoInmueble());
            }
        });
        for (Inmueble aux : listaInmuebles) {
            jCbInmuebles.addItem(aux);
        }
    }

    private void cargarComboEmpleados() {
        Collections.sort(listaEmpleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado t, Empleado t1) {
                return t.getApellido().compareTo(t1.getApellido());
            }
        });
        for (Empleado aux : listaEmpleados) {
            jCbEmpleados.addItem(aux);
        }
    }
    private void cargarComboInquilino() {
        Collections.sort(listaInquilino, new Comparator<Inquilino>() {
            @Override
            public int compare(Inquilino t, Inquilino t1) {
                return t.getApellido().compareTo(t1.getApellido());
            }
        });
        for (Inquilino aux : listaInquilino) {
            jCBInquilino.addItem(aux);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jdFechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCalInicio = new com.toedter.calendar.JCalendar();
        jCalFinalizacion = new com.toedter.calendar.JCalendar();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCbInmuebles = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jCbEmpleados = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        jBtnFirmar = new javax.swing.JButton();
        jDInicio = new com.toedter.calendar.JDateChooser();
        jDFinal = new com.toedter.calendar.JDateChooser();
        jCBInquilino = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 24)); // NOI18N
        jLabel1.setText("Nuevo Contrato");

        jLabel7.setText("Precio");

        jButton2.setText("Guardar y avisar al propietario");

        jButton1.setText("Nuevo Contrato");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha de finalización");

        jLabel5.setText("Inicio del Contrato");

        jLabel8.setText("Empleado");

        jLabel4.setText("Propiedad");

        jLabel3.setText("Inquilino");

        jLabel2.setText("Propietario");

        jLabel11.setText("Buscar Inmueble ");

        jCalInicio.setBackground(new java.awt.Color(204, 204, 204));

        jCalFinalizacion.setBackground(new java.awt.Color(204, 204, 204));

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nuevo Contrato");
        jLabel9.setToolTipText("Nuevo Contrato");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Seleccionar Inmueble por Codigo");

        jCbInmuebles.setBackground(new java.awt.Color(204, 204, 204));
        jCbInmuebles.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Seleccionar Empleado Vendedor");

        jCbEmpleados.setBackground(new java.awt.Color(204, 204, 204));
        jCbEmpleados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Seleccionar Nuevo Inquilino");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Fecha de Inicio del Contrato");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Fecha de Finalizacion del Contrato");

        jBtnSalir.setBackground(new java.awt.Color(204, 204, 204));
        jBtnSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnFirmar.setBackground(new java.awt.Color(204, 204, 204));
        jBtnFirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBtnFirmar.setText("Firmar Contrato");
        jBtnFirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFirmarActionPerformed(evt);
            }
        });

        jDInicio.setBackground(new java.awt.Color(204, 204, 204));
        jDInicio.setForeground(new java.awt.Color(255, 255, 255));
        jDInicio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jDFinal.setBackground(new java.awt.Color(204, 204, 204));
        jDFinal.setForeground(new java.awt.Color(255, 255, 255));
        jDFinal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jCBInquilino.setBackground(new java.awt.Color(204, 204, 204));
        jCBInquilino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCBInquilino.setForeground(new java.awt.Color(0, 0, 0));
        jCBInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBInquilinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jBtnFirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel10)
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jDInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jDFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCBInquilino, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCbInmuebles, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCbEmpleados, javax.swing.GroupLayout.Alignment.LEADING, 0, 308, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jCbInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jCbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jCBInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jDFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnFirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnFirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFirmarActionPerformed
        try{
            Inmueble inmueble = (Inmueble) jCbInmuebles.getSelectedItem();
        Empleado empleado = (Empleado) jCbEmpleados.getSelectedItem();
        Inquilino inquilino = (Inquilino)(jCBInquilino.getSelectedItem());
        Long cuil= inquilino.getCuil();
        inquilino = id.obetenerInquilinoPorCuil(cuil);

        SimpleDateFormat formatoFecha1 = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formatoFecha1.format(jDFinal.getDate());
        LocalDate fechFinal = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        SimpleDateFormat formatoFecha2 = new SimpleDateFormat("dd-MM-yyyy");
        String fecha2 = formatoFecha2.format(jDInicio.getDate());
        LocalDate fechInicio = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        LocalDate firma = LocalDate.now();

        Contrato contrato = new Contrato(fechInicio, fechFinal, firma, empleado, inquilino, inmueble, true);
        if (cd.crearContrato(contrato)) {
            JOptionPane.showMessageDialog(this, "Se Firmo el contrato con exito");
            jCbInmuebles.removeAllItems();
            listaInmuebles = (ArrayList<Inmueble>) ind.NoAlquilados();
            cargarComboInmuebles();
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Algun campo se encuentra vacio o con informacion erronea");
        }
        
    }//GEN-LAST:event_jBtnFirmarActionPerformed

    private void jCBInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBInquilinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnFirmar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Inquilino> jCBInquilino;
    private com.toedter.calendar.JCalendar jCalFinalizacion;
    private com.toedter.calendar.JCalendar jCalInicio;
    private javax.swing.JComboBox<Empleado> jCbEmpleados;
    private javax.swing.JComboBox<Inmueble> jCbInmuebles;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDFinal;
    private com.toedter.calendar.JDateChooser jDInicio;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento1;
    // End of variables declaration//GEN-END:variables
}
