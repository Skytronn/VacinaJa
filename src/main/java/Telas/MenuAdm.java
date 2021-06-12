
package Telas;


public class MenuAdm extends javax.swing.JFrame {

  
    public MenuAdm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadastroPacienteButton = new javax.swing.JButton();
        cadastroUsuarioButton = new javax.swing.JButton();
        relatorioButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cadastroPacienteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastroPacienteButton.setForeground(new java.awt.Color(0, 102, 0));
        cadastroPacienteButton.setText("Cadastro de Paciente");
        cadastroPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroPacienteButtonActionPerformed(evt);
            }
        });

        cadastroUsuarioButton.setForeground(new java.awt.Color(0, 102, 0));
        cadastroUsuarioButton.setText("Cadastro de Usuario");
        cadastroUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuarioButtonActionPerformed(evt);
            }
        });

        relatorioButton.setForeground(new java.awt.Color(0, 102, 0));
        relatorioButton.setText("Relatorio");
        relatorioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JoaoT\\Documents\\DP\\Vacina.PNG")); // NOI18N
        jLabel1.setText("          Menu");

        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Consulta Usuarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(relatorioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(cadastroPacienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastroUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastroPacienteButton)
                .addGap(37, 37, 37)
                .addComponent(cadastroUsuarioButton)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(relatorioButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroPacienteButtonActionPerformed
       
    new CadastrarPaciente().setVisible(true);
     dispose();
    }//GEN-LAST:event_cadastroPacienteButtonActionPerformed

    private void cadastroUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuarioButtonActionPerformed
         new CadastrarUsuario().setVisible(true);
     dispose();
    }//GEN-LAST:event_cadastroUsuarioButtonActionPerformed

    private void relatorioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioButtonActionPerformed
         new TelaRelatorio().setVisible(true);
     dispose();
    }//GEN-LAST:event_relatorioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new TelaConsultaUsuario().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroPacienteButton;
    private javax.swing.JButton cadastroUsuarioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton relatorioButton;
    // End of variables declaration//GEN-END:variables
}
