
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
        setLocationRelativeTo(null);
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTPaciente = new javax.swing.JTable();
        PacienteVacinado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

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

        PacienteVacinado.setText("Paciente Vacinado");
        PacienteVacinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteVacinadoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JoaoT\\Documents\\DP\\Vacina.PNG")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Fila Vacinação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(PacienteVacinado)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(159, 159, 159)
                        .addComponent(PacienteVacinado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPaciente;
    // End of variables declaration//GEN-END:variables
}
