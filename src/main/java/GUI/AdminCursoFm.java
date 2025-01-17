/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.CursoDAO;
import Entities.Curso;
import Entities.Maestro;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jbran
 */
public class AdminCursoFm extends javax.swing.JFrame {

    /**
     * Creates new form AdministrarCurso
     */
    private CursoDAO cursoR;
    private Curso seleccionado;
    private Maestro usuario;

    public AdminCursoFm(Maestro usuario) {

        initComponents();
        cursoR = new CursoDAO();
        this.usuario = usuario;
        centrarPantalla();
        cargarCursos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spnUnidades = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminarCurso = new javax.swing.JButton();
        btnEditarCurso = new javax.swing.JButton();
        btnAgregarCurso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnConsultarAsistenciasNavegar = new javax.swing.JButton();
        btnAdminCursosNavegar = new javax.swing.JButton();
        btnAdminGruposNavegar = new javax.swing.JButton();
        btnImportAsistenciasNavegar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        LogOut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar cursos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 1, 12)); // NOI18N
        jLabel2.setText("Nombre curso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        txtNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCursoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, -1));

        jLabel4.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 1, 12)); // NOI18N
        jLabel4.setText("Unidades");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 80, -1));

        spnUnidades.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(spnUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cursos existentes"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Unidades"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 730, 420));

        btnEliminarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png"))); // NOI18N
        btnEliminarCurso.setText("Eliminar");
        btnEliminarCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnEliminarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, 80));

        btnEditarCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnEditarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help.png"))); // NOI18N
        btnEditarCurso.setText("Editar");
        btnEditarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 150, 80));

        btnAgregarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tips.png"))); // NOI18N
        btnAgregarCurso.setText("Agregar");
        btnAgregarCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 140, 80));

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

        btnAdminCursosNavegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Windows_View_Detail.png"))); // NOI18N
        btnAdminCursosNavegar.setText("Administrar Cursos");
        btnAdminCursosNavegar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnAdminCursosNavegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminCursosNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminCursosNavegarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdminCursosNavegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 90));

        btnAdminGruposNavegar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 470));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 500, -1));

        LogOut.setBackground(new java.awt.Color(255, 0, 51));
        LogOut.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 51, 51));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Security_Firewall_OFF.png"))); // NOI18N
        LogOut.setText("Cerrar sesión");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noted_note_pen_notebook_write_icon_193919 (2).png"))); // NOI18N
        jLabel5.setText("ASSISTANCER");
        jLabel5.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 102));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCursoActionPerformed
        seleccionado.setNombre(txtNombreCurso.getText());
        int unidades = (Integer) spnUnidades.getValue();
        seleccionado.setUnidades(unidades);
        if (txtNombreCurso.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Verifique que el nombre del curso no esté vacío");
        } else {
            cursoR.actualizar(seleccionado);
            cargarCursos();
        }

    }//GEN-LAST:event_btnEditarCursoActionPerformed

    private void btnAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCursoActionPerformed
        int unidades = (Integer) spnUnidades.getValue();
        if (txtNombreCurso.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Verifique que el nombre del curso no esté vacío");
        } else {
            cursoR.agregar(new Curso(txtNombreCurso.getText(), unidades, usuario));
            cargarCursos();
        }
    }//GEN-LAST:event_btnAgregarCursoActionPerformed

    private void btnConsultarAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAsistenciasNavegarActionPerformed
        this.dispose();
        new ConsultarAsistenciasFm(usuario).setVisible(true);
    }//GEN-LAST:event_btnConsultarAsistenciasNavegarActionPerformed

    private void btnAdminCursosNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCursosNavegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminCursosNavegarActionPerformed

    private void btnAdminGruposNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminGruposNavegarActionPerformed
        this.dispose();
        new AdminGrupos(usuario).setVisible(true);
    }//GEN-LAST:event_btnAdminGruposNavegarActionPerformed

    private void btnImportAsistenciasNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportAsistenciasNavegarActionPerformed
        this.dispose();
        new ImportarAsistenciasFm(usuario).setVisible(true);
    }//GEN-LAST:event_btnImportAsistenciasNavegarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccionar = jTable1.rowAtPoint(evt.getPoint());
        Long id = (Long) (jTable1.getValueAt(seleccionar, 0));
        Curso curso = cursoR.buscarPorId(id);
        this.seleccionado = curso;
        txtNombreCurso.setText(curso.getNombre());
        spnUnidades.setValue(curso.getUnidades());
    }//GEN-LAST:event_jTable1MouseClicked

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        this.dispose();
        new LoginGUI().setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        cargarCursos();
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnEliminarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCursoActionPerformed

        if (JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar este curso?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            cursoR.eliminar(seleccionado.getId());
            JOptionPane.showMessageDialog(null, "Curso eliminado");
            cargarCursos();
            System.out.println("eliminado");
        } else {
            System.out.println("Curso no eliminado");
        }
        
    }//GEN-LAST:event_btnEliminarCursoActionPerformed

    private void txtNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCursoActionPerformed

    private void cargarCursos() {
        List<Curso> cursos = this.cursoR.consultarCursos(txtBuscar.getText(), usuario.getId());
        if (cursos != null) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            for (Curso curso : cursos) {
                modelo.addRow(curso.toArray());
            }
        }
    }
   
    
    public static boolean validarNombre(String mNombre){
        boolean checkStatus=false;

        /*Verificamos que no sea null*/ 
        if(mNombre != null){
            /* 1ª Condición: que la letra inicial sea mayúscula*/
            boolean isFirstUpper=Character.isUpperCase(mNombre.charAt(0));

            /* 2ª Condición: que el tamaño sea >= 1 y <= 35*/
            int stringSize=mNombre.length();
            boolean isValidSize=(stringSize >= 1 && stringSize <= 35);

            /* 3ª Condición: que contenga al menos un espacio*/
            boolean isSpaced=mNombre.contains(" ");

            /* Verificamos que las tres condiciones son verdaderas*/
            checkStatus= ( (isFirstUpper==true)  && (isFirstUpper && isValidSize &&  isSpaced) );
        }
        /*Devolvemos el estado de la validación*/
        return checkStatus;
    }
    
    public void centrarPantalla() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JButton btnAdminCursosNavegar;
    private javax.swing.JButton btnAdminGruposNavegar;
    private javax.swing.JButton btnAgregarCurso;
    private javax.swing.JButton btnConsultarAsistenciasNavegar;
    private javax.swing.JButton btnEditarCurso;
    private javax.swing.JButton btnEliminarCurso;
    private javax.swing.JButton btnImportAsistenciasNavegar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spnUnidades;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombreCurso;
    // End of variables declaration//GEN-END:variables
}
