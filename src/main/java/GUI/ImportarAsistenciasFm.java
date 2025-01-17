/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.AlumnoHasGrupoDAO;
import DAO.CursoDAO;
import DAO.GrupoDAO;
import Entities.Alumno_has_grupo;
import Entities.Curso;
import Entities.Grupo;
import Entities.Maestro;
import ObjetoNegocio.CsvImport;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jbran
 */
public class ImportarAsistenciasFm extends javax.swing.JFrame {

    private Maestro usuario;
    private CursoDAO cursoDao;
    private GrupoDAO grupos;
    private boolean csvImport;
    private CsvImport csv;
    
    /**
     * Creates new form ImportarAsistenciasFm
     */
    public ImportarAsistenciasFm(Maestro usuario) {
        initComponents();
        centrarPantalla();
        this.usuario = usuario;
        this.cursoDao = new CursoDAO();
        grupos = new GrupoDAO();
        csvImport = false;
        btnConfirmarAsistencias.setEnabled(false);
        csv = new CsvImport();
        cargarComboBoxCursos();
        cargarComboBoxGrupos();
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
        jLabel4 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

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

        getContentPane().add(panelAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 660, 420));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegar"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultarAsistenciasNavegar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnConsultarAsistenciasNavegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calendar.png"))); // NOI18N
        btnConsultarAsistenciasNavegar.setText("Consultar asistencias");
        btnConsultarAsistenciasNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarAsistenciasNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAsistenciasNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultarAsistenciasNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 90));

        btnAdminGruposNavegar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAdminGruposNavegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Control_Panel.png"))); // NOI18N
        btnAdminGruposNavegar.setText("Administrar Grupos");
        btnAdminGruposNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminGruposNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminGruposNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdminGruposNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 90));

        btnImportAsistenciasNavegar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnImportAsistenciasNavegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package.png"))); // NOI18N
        btnImportAsistenciasNavegar.setText("Importar asistencias");
        btnImportAsistenciasNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImportAsistenciasNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportAsistenciasNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnImportAsistenciasNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 90));

        btnAdminCursosNavegar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnAdminCursosNavegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Windows_View_Detail.png"))); // NOI18N
        btnAdminCursosNavegar.setText("Administrar Cursos");
        btnAdminCursosNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminCursosNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminCursosNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdminCursosNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, 470));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 0, 0));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Security_Firewall_OFF.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar sesión");
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 60));

        cbxGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 180, 50));

        jLabel1.setText("Seleccione un grupo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        cbxCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursosActionPerformed(evt);
            }
        });
        getContentPane().add(cbxCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 160, 50));

        jLabel2.setText("Seleccione un curso:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        btnBuscarArchivoEnMiPc.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnBuscarArchivoEnMiPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder_beige_explorer.png"))); // NOI18N
        btnBuscarArchivoEnMiPc.setText("BROWSE");
        btnBuscarArchivoEnMiPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArchivoEnMiPcActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarArchivoEnMiPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 170, 50));

        jLabel3.setText("Importar CSV");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        btnConfirmarAsistencias.setBackground(new java.awt.Color(153, 204, 0));
        btnConfirmarAsistencias.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnConfirmarAsistencias.setForeground(new java.awt.Color(0, 153, 0));
        btnConfirmarAsistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tips.png"))); // NOI18N
        btnConfirmarAsistencias.setText("Confirmar asistencias");
        btnConfirmarAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarAsistenciasActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 250, 60));

        jLabel4.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noted_note_pen_notebook_write_icon_193919 (2).png"))); // NOI18N
        jLabel4.setText("ASSISTANCER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 300, -1));

        lblStatus.setText("Estado: ");
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAsistenciasNavegarActionPerformed
    this.dispose();
    new ConsultarAsistenciasFm(usuario).setVisible(true);
    }//GEN-LAST:event_btnConsultarAsistenciasNavegarActionPerformed

    private void btnAdminGruposNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminGruposNavegarActionPerformed
        this.dispose();
        new AdminGrupos(usuario).setVisible(true);
    }//GEN-LAST:event_btnAdminGruposNavegarActionPerformed

    private void btnImportAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportAsistenciasNavegarActionPerformed

    }//GEN-LAST:event_btnImportAsistenciasNavegarActionPerformed

    private void btnAdminCursosNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCursosNavegarActionPerformed

        this.dispose();
        new AdminCursoFm(usuario).setVisible(true);

    }//GEN-LAST:event_btnAdminCursosNavegarActionPerformed

    private void btnBuscarArchivoEnMiPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArchivoEnMiPcActionPerformed
        cargarTabla();
        this.csvImport = true;
        listoConfirmar();
    }//GEN-LAST:event_btnBuscarArchivoEnMiPcActionPerformed

    private void btnConfirmarAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarAsistenciasActionPerformed
        
        Grupo grupoSel = (Grupo) cbxGrupos.getSelectedItem();
        lblStatus.setText("Estado: Verificando...");
        
        if(csv.verificarAlumnosCsv(grupoSel.getId())){
            lblStatus.setText("Estado: Generando asistencias...");
            csv.agregarAlumnosCsv(grupoSel);
        }
        lblStatus.setText("Estado: ");
        
        
    }//GEN-LAST:event_btnConfirmarAsistenciasActionPerformed

    private void cbxCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCursosActionPerformed
        cargarComboBoxGrupos();
        listoConfirmar();
    }//GEN-LAST:event_cbxCursosActionPerformed

    private void cargarTabla() {
        try {
            this.csv.CargarTabla(TableAlumnosCSV);
            System.out.println("Ya la cargué");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void listoConfirmar(){
        if (csvImport == true) {
            btnConfirmarAsistencias.setEnabled(true);
        }
    }
    
    private void cargarComboBoxCursos() {
        List<Curso> cursos = this.cursoDao.consultarCursos("", usuario.getId());
        cbxCursos.setModel(new DefaultComboBoxModel(cursos.toArray()));
    }

    private void cargarComboBoxGrupos() {
        Curso cursoSel = (Curso) cbxCursos.getSelectedItem();
        List<Grupo> grupos = this.grupos.consultarGrupos("", cursoSel.getId());
        cbxGrupos.setModel(new DefaultComboBoxModel(grupos.toArray()));
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel panelAlumnos;
    // End of variables declaration//GEN-END:variables
}
