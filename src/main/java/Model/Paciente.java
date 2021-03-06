package Model;
import DAO.PacienteDAO;
import java.util.Date;

public class Paciente extends PacienteDAO{

    private String nome;
    private Date dataVacinacao;
    private String endereco;
    private int idade;
    private boolean areaSaude;
    private int id;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(Date dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getAreaSaude() {
        return areaSaude;
    }
    public String tableAreaSaude(){
        
        String tableAreaSaude = "Não";
        
        if(getAreaSaude()){
            tableAreaSaude = "Sim";
        }
        
        return tableAreaSaude;
    }

    public void setAreaSaude(boolean areaSaude) {
        this.areaSaude = areaSaude;
    }
    
    public void cadastroPaciente(String nome, String endereco, int idade){
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
        int prioridade = 4;
        
        if(idade >= 70){
            prioridade = 2;
        }else if(areaSaude){
            prioridade = 3;
        }else if(areaSaude && idade >= 70){
            prioridade = 1;
        }
        
        PacienteDAO pacienteDao = new PacienteDAO();
        
        pacienteDao.novoPaciente(nome, endereco, idade, areaSaude, prioridade);
    }
    
    public void vacinarPaciente(int id){
        PacienteDAO pacienteDao = new PacienteDAO();
        setDataVacinacao(dataVacinacao);
        pacienteDao.updateAreaSaude(id);
        
        
    }
    
}
