
package Classes;
import DAO.UsuarioDAO;
import java.util.Date;

public class Usuario {
    private String nome,senha, cpf, email, perfil;
    private Date dataRegistro;


public Usuario() {
}
    public Usuario (String nome, String senha, String cpf,Date dataRegistro,String email,String perfil){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.dataRegistro = dataRegistro;
        this.email = email;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    public void Validacao(){
  
    }
}