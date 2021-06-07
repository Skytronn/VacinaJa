package DAO;

import Connection.ConnectionFactory;
import Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PacienteDAO {
    public void novoPaciente(String nome, String endereco, int idade, boolean area_saude, int prioridade){
        String insert = "INSERT INTO PACIENTE(nome, idade, areaSaude, endereco, prioridade) "
                + "VALUES(?,?,?,?,?);";
      //nome idade areaSaude, endereço, prioridade
        System.out.println("PacienteDAO");
        try {
            System.out.println("Try");
            Paciente paciente = new Paciente();
            Connection conn = ConnectionFactory.obtemConexao();
            PreparedStatement pst = conn.prepareStatement(insert);
            
            pst.setString(1, nome);
            pst.setInt(2, idade);
            pst.setBoolean(3, paciente.getAreaSaude());
            pst.setString(4, endereco);
            pst.setInt(5, prioridade);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Paciente " + nome + " cadastrado com sucesso" + " e sua prioridade é: \n" + prioridade);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
