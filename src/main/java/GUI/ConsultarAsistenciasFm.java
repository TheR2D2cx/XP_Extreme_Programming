/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entities.Maestro;

/**
 *
 * @author Jbran
 */
public class ConsultarAsistenciasFm extends javax.swing.JFrame {

    private Maestro usuario;

    /**
     * Creates new form ConsultarAsistenciasFm
     */
    public ConsultarAsistenciasFm(Maestro usuario) {
        initComponents();
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnConsultarAsistenciasNavegar = new javax.swing.JButton();
        btnAdminGruposNavegar = new javax.swing.JButton();
        btnImportAsistenciasNavegar = new javax.swing.JButton();
        btnAdminCursosNavegar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreAlumnoConsultar = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegar"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultarAsistenciasNavegar.setText("Consultar asistencias");
        btnConsultarAsistenciasNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarAsistenciasNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAsistenciasNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultarAsistenciasNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 90));

        btnAdminGruposNavegar.setText("Administrar Grupos");
        btnAdminGruposNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminGruposNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminGruposNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdminGruposNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 90));

        btnImportAsistenciasNavegar.setText("Importar asistencias");
        btnImportAsistenciasNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImportAsistenciasNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportAsistenciasNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnImportAsistenciasNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 90));

        btnAdminCursosNavegar.setText("Administrar Cursos");
        btnAdminCursosNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminCursosNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminCursosNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdminCursosNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, 470));

        btnCerrarSesion.setText("Cerrar sesión");
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 60));

        jLabel1.setText("Seleccione un grupo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 170, 40));

        jLabel2.setText("Seleccione un curso:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 170, 40));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jButton1.setText("Buscar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 160));

        jButton2.setText("Generar reporte de asistencias");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 200, 40));

        jButton3.setText("Consultar por grupo");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 200, 30));

        jButton4.setText("Consultar por curso");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 200, 30));

        jButton5.setText("Consultar por unidad");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 200, 30));

        jLabel3.setText("Nombre alumno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));
        getContentPane().add(txtNombreAlumnoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 560, -1));

        jButton6.setText("Consultar por alumno");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 200, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asistencias"));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 880, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAsistenciasNavegarActionPerformed

    }//GEN-LAST:event_btnConsultarAsistenciasNavegarActionPerformed

    private void btnAdminGruposNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminGruposNavegarActionPerformed
        this.dispose();
        new AdminGrupos(usuario).setVisible(true);
    }//GEN-LAST:event_btnAdminGruposNavegarActionPerformed

    private void btnImportAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportAsistenciasNavegarActionPerformed
        this.dispose();
        new ImportarAsistenciasFm(usuario).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportAsistenciasNavegarActionPerformed

    private void btnAdminCursosNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCursosNavegarActionPerformed
        this.dispose();
        new AdminCursoFm(usuario).setVisible(true);
    }//GEN-LAST:event_btnAdminCursosNavegarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminCursosNavegar;
    private javax.swing.JButton btnAdminGruposNavegar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarAsistenciasNavegar;
    private javax.swing.JButton btnImportAsistenciasNavegar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNombreAlumnoConsultar;
    // End of variables declaration//GEN-END:variables
}
