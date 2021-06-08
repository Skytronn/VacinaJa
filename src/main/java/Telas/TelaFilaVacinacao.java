
package Telas;

import DAO.PacienteDAO;
import DAO.UsuarioDAO;
import Model.Paciente;
import Model.Usuario;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaFilaVacinacao extends javax.swing.JFrame {

    public TelaFilaVacinacao() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTPaciente.getModel();
        jTPaciente.setRowSorter(new TableRowSorter(modelo));
        
        readJTablePaciente();
    }
    
    public void readJTablePaciente(){
        DefaultTableModel modelo = (DefaultTableModel) jTPaciente.getModel();
        
        PacienteDAO paciente = new PacienteDAO();
        
        for(Paciente p: paciente.lerPacientes()){
            boolean saude = p.getAreaSaude();
//            Date data = new Date();
//            data = p.getDataVacinacao();
           
            
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getIdade(),
                p.getEndereco(),           
                p.tableAreaSaude()
            });
            
    }
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPaciente = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        PacienteVacinado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextPane1.setText("Fila de vacinacao");
        jTextPane1.setToolTipText("");
        jScrollPane1.setViewportView(jTextPane1);

        jTPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Idade", "Endereco", "Area da Saude"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTPaciente);
        if (jTPaciente.getColumnModel().getColumnCount() > 0) {
            jTPaciente.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        PacienteVacinado.setText("Paciente Vacinado");
        PacienteVacinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteVacinadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PacienteVacinado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PacienteVacinado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
                                
        new MenuAdm().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_VoltarActionPerformed

    private void PacienteVacinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteVacinadoActionPerformed
        int column = 0;
        int row = 0;
        String idPaciente = jTPaciente.getModel().getValueAt(row, column).toString();
        System.out.println(idPaciente);
        int id = Integer.parseInt(idPaciente);
        
        Paciente paciente = new Paciente();
        paciente.vacinarPaciente(id);
        dispose();
        new TelaFilaVacinacao().setVisible(true);
    }//GEN-LAST:event_PacienteVacinadoActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFilaVacinacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PacienteVacinado;
    private javax.swing.JButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPaciente;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
