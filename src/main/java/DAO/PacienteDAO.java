package DAO;

import Connection.ConnectionFactory;
import Model.Paciente;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PacienteDAO {
    public void novoPaciente(String nome, String endereco, int idade, boolean area_saude, int prioridade){
        String insert = "INSERT INTO PACIENTE(nome, idade, areaSaude, endereco, prioridade) "
                + "VALUES(?,?,?,?,?);";
      // Dados serão gravados nessa ordem de colunas no BD nome idade areaSaude, endereço, prioridade
        try {
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
    
    //Metodo para carregar lista de pacientes
        public List<Paciente> lerPacientes(){
        Connection conn = ConnectionFactory.obtemConexao();
        PreparedStatement pst = null;
        List<Paciente> pacientes = new ArrayList<>();
        String consulta = "SELECT * FROM paciente where areaSaude = false order by prioridade asc;";
        
        try {
            pst = conn.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
           
            
            while(rs.next()){
                Paciente paciente = new Paciente();
                
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setAreaSaude(rs.getBoolean("areaSaude"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setDataVacinacao(rs.getDate("dataVacinacao"));
                pacientes.add(paciente);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return pacientes;
    }
    //metodo para editar o campo de areaSaude
        
    public void updateAreaSaude(int id){
        //UPDATE NOME_DA_TABELA SET campo1 = valor1, campo2 = valor2
        String update = "UPDATE paciente SET areaSaude = 1,dataVacinacao= NOW() WHERE id = ? and areaSaude = false;";
        Connection conn = ConnectionFactory.obtemConexao();
        PreparedStatement pst = null;
        
        
        
        try {
            pst = conn.prepareStatement(update);
            Paciente paciente = new Paciente();
            
            Date dataAtual = paciente.getDataVacinacao();
//            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//            Date data = new Date();
//            String dataFormatada = formatador.format(data);
            
            pst.setInt(1, id);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Paciente Vacinado");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
