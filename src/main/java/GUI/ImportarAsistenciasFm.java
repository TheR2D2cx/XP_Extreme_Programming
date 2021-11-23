/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entities.Maestro;
import ObjetoNegocio.CsvImport;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Jbran
 */
public class ImportarAsistenciasFm extends javax.swing.JFrame {

    private Maestro usuario;
    
    /**
     * Creates new form ImportarAsistenciasFm
     */
    public ImportarAsistenciasFm(Maestro usuario) {
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

        panelAlumnos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAlumnosCSV = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnConsultarAsistenciasNavegar = new javax.swing.JButton();
        btnAdminGruposNavegar = new javax.swing.JButton();
        btnImportAsistenciasNavegar = new javax.swing.JButton();
        btnAdminCursosNavegar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        cbxGrupos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbxCursos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarArchivoEnMiPc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmarAsistencias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos"));

        TableAlumnosCSV.setBorder(new javax.swing.border.MatteBorder(null));
        TableAlumnosCSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Asistencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableAlumnosCSV);

        javax.swing.GroupLayout panelAlumnosLayout = new javax.swing.GroupLayout(panelAlumnos);
        panelAlumnos.setLayout(panelAlumnosLayout);
        panelAlumnosLayout.setHorizontalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        panelAlumnosLayout.setVerticalGroup(
            panelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(panelAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 660, 420));

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

        cbxGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 180, 50));

        jLabel1.setText("Seleccione un grupo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        cbxCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 160, 50));

        jLabel2.setText("Seleccione un curso:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        btnBuscarArchivoEnMiPc.setText("BROWSE");
        btnBuscarArchivoEnMiPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArchivoEnMiPcActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarArchivoEnMiPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 170, 50));

        jLabel3.setText("Importar CSV");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        btnConfirmarAsistencias.setBackground(new java.awt.Color(153, 204, 0));
        btnConfirmarAsistencias.setForeground(new java.awt.Color(0, 153, 0));
        btnConfirmarAsistencias.setText("Confirmar asistencias");
        getContentPane().add(btnConfirmarAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 250, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAsistenciasNavegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarAsistenciasNavegarActionPerformed

    private void btnAdminGruposNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminGruposNavegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminGruposNavegarActionPerformed

    private void btnImportAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportAsistenciasNavegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportAsistenciasNavegarActionPerformed

    private void btnAdminCursosNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCursosNavegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminCursosNavegarActionPerformed

    private void btnBuscarArchivoEnMiPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArchivoEnMiPcActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnBuscarArchivoEnMiPcActionPerformed

    private void cargarTabla(){
        CsvImport csv = new CsvImport();
        try {
            csv.CargarTabla(TableAlumnosCSV);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   
    public void centrarPantalla() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAlumnosCSV;
    private javax.swing.JButton btnAdminCursosNavegar;
    private javax.swing.JButton btnAdminGruposNavegar;
    private javax.swing.JButton btnBuscarArchivoEnMiPc;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfirmarAsistencias;
    private javax.swing.JButton btnConsultarAsistenciasNavegar;
    private javax.swing.JButton btnImportAsistenciasNavegar;
    private javax.swing.JComboBox<String> cbxCursos;
    private javax.swing.JComboBox<String> cbxGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAlumnos;
    // End of variables declaration//GEN-END:variables
}
