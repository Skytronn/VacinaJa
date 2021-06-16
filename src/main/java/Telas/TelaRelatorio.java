
package Telas;

import Model.Relatorio;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.ImageIcon;


public class TelaRelatorio extends javax.swing.JFrame {

   
    public TelaRelatorio() {
        initComponents();
        DefaultTableModel modelo1 = (DefaultTableModel) jTableMedia.getModel();
        jTableMedia.setRowSorter(new TableRowSorter(modelo1));
        setLocationRelativeTo(null);
        
       // DefaultTableModel modelo2 = (DefaultTableModel) jTableQuantidade.getModel();
       // jTableQuantidade.setRowSorter(new TableRowSorter(modelo2));
        
           
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Dia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        diaFim = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMedia = new javax.swing.JTable();
        Mes = new javax.swing.JTextField();
        Ano = new javax.swing.JTextField();
        MesFim = new javax.swing.JTextField();
        AnoFim = new javax.swing.JTextField();
        painelImagemFundo1 = new Telas.PainelImagemFundo();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Relatório de media de vacinação");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Escolha o período ");

        Dia.setForeground(new java.awt.Color(0, 102, 0));
        Dia.setText("Dia");
        Dia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dia.setName("ano"); // NOI18N
        Dia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DiaFocusLost(evt);
            }
        });
        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("até");

        diaFim.setForeground(new java.awt.Color(0, 102, 0));
        diaFim.setText("Dia");
        diaFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                diaFimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                diaFimFocusLost(evt);
            }
        });
        diaFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaFimActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jTableMedia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Idade  >= 90", "70 ≤ Idade < 90", "70 > idade >= 50", "Idade < 50"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableMedia);

        Mes.setForeground(new java.awt.Color(0, 102, 0));
        Mes.setText("Mês");
        Mes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MesFocusLost(evt);
            }
        });
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });

        Ano.setForeground(new java.awt.Color(0, 102, 0));
        Ano.setText("Ano");
        Ano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AnoFocusLost(evt);
            }
        });
        Ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoActionPerformed(evt);
            }
        });

        MesFim.setForeground(new java.awt.Color(0, 102, 0));
        MesFim.setText("Mês");
        MesFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MesFimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MesFimFocusLost(evt);
            }
        });
        MesFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesFimActionPerformed(evt);
            }
        });

        AnoFim.setForeground(new java.awt.Color(0, 102, 0));
        AnoFim.setText("Ano");
        AnoFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AnoFimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AnoFimFocusLost(evt);
            }
        });
        AnoFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoFimActionPerformed(evt);
            }
        });

        painelImagemFundo1.setImg(new ImageIcon("src/main/java/Imagens/Relatorio.png"));

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(diaFim, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(MesFim, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(155, 155, 155)
                                            .addComponent(Mes)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AnoFim, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(Ano))
                                    .addGap(71, 71, 71))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(99, 99, 99)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Consultar)
                            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(201, 201, 201))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                         
        new MenuAdm().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaActionPerformed

    private void diaFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaFimActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        String diaI = Dia.getText();
        String MesI = Mes.getText();
        String AnoI = Ano.getText();
        
        String diaF = diaFim.getText();
        String mesF = MesFim.getText();
        String anoF = AnoFim.getText();
        
        String Inicio = AnoI + "-" + MesI + "-" + diaI;//"2020-06-07";
        String Fim = anoF + "-" + mesF + "-" + diaF;//"2030-06-07";
        
        Relatorio rel = new Relatorio();
        rel.calculoMedia(Inicio, Fim);

        int media1 = rel.getTotal1();
        int media2 = rel.getTotal2();
        int media3 = rel.getTotal3();
        int media4 = rel.getTotal4();
                
        System.out.println(rel.getTotal1());
        System.out.println(rel.getTotal2());
        System.out.println(rel.getTotal3());
        System.out.println(rel.getTotal4());
        
        readjTableMedia(media1,media2,media3,media4);
        //readjTableQuantidade(qtd1,qtd2,qtd3,qtd4); 
        
    }//GEN-LAST:event_ConsultarActionPerformed

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesActionPerformed

    private void AnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoActionPerformed

    private void MesFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesFimActionPerformed

    private void AnoFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoFimActionPerformed

    private void DiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DiaFocusGained
        if(Dia.getText().equals("Dia")){
            Dia.setText("");
            Dia.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_DiaFocusGained

    private void DiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DiaFocusLost
        if(Dia.getText().equals("")){
            Dia.setText("Dia");
            Dia.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_DiaFocusLost

    private void MesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MesFocusGained
        if(Mes.getText().equals("Mes")){
            Mes.setText("");
            Mes.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_MesFocusGained

    private void MesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MesFocusLost
        if(Mes.getText().equals("")){
            Mes.setText("Mes");
            Mes.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_MesFocusLost

    private void AnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnoFocusGained
        if(Ano.getText().equals("Ano")){
            Ano.setText("");
            Ano.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_AnoFocusGained

    private void AnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnoFocusLost
        if(Ano.getText().equals("")){
            Ano.setText("Ano");
            Ano.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_AnoFocusLost

    private void diaFimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diaFimFocusGained
        if(diaFim.getText().equals("Dia")){
            diaFim.setText("");
            diaFim.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_diaFimFocusGained

    private void diaFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diaFimFocusLost
        if(diaFim.getText().equals("")){
            diaFim.setText("Dia");
            diaFim.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_diaFimFocusLost

    private void MesFimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MesFimFocusGained
        if(MesFim.getText().equals("Mes")){
            MesFim.setText("");
            MesFim.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_MesFimFocusGained

    private void MesFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MesFimFocusLost
        if(MesFim.getText().equals("")){
            MesFim.setText("Mes");
            MesFim.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_MesFimFocusLost

    private void AnoFimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnoFimFocusGained
        if(AnoFim.getText().equals("Ano")){
            AnoFim.setText("");
            AnoFim.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_AnoFimFocusGained

    private void AnoFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnoFimFocusLost
        if(AnoFim.getText().equals("")){
            AnoFim.setText("Ano");
            AnoFim.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_AnoFimFocusLost

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano;
    private javax.swing.JTextField AnoFim;
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField Dia;
    private javax.swing.JTextField Mes;
    private javax.swing.JTextField MesFim;
    private javax.swing.JTextField diaFim;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMedia;
    private Telas.PainelImagemFundo painelImagemFundo1;
    // End of variables declaration//GEN-END:variables

    private void readjTableMedia(int media1,int media2,int media3,int media4) {
         DefaultTableModel modelo1 = (DefaultTableModel) jTableMedia.getModel();
         
         Relatorio r = new Relatorio();

         modelo1.addRow(new Object[]{
                media1,
                media2,
                media3,
                media4
            });
         
    }

//    private void readjTableQuantidade(int qtd1,int qtd2,int qtd3,int qtd4) {
//         DefaultTableModel modelo2 = (DefaultTableModel) jTableMedia.getModel();
//         
//         Relatorio r = new Relatorio();
//
//         modelo2.addRow(new Object[]{
//                qtd1,
//                qtd2,
//                qtd3,
//                qtd4
//            });
//    }
}
