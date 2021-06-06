
package Model;
import DAO.LoginDAO;
import Telas.LoginTela;
import Telas.MenuAdm;
import java.util.Date;
import javax.swing.JOptionPane;
import Model.Login;
public class Usuario {
    private String nome, cpf, email, perfil, senha;
    private Date dataRegistro;
    private Login login;
    
    public Usuario(String nome, String senha, String cpf,Date dataRegistro,String email,String perfil){
        
        this.nome = nome;
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

    public void setSenha(Login login) {
        senha = login.getSenha();
        
        this.login = login;
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
}
