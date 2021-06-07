
package Model;
import DAO.UsuarioDAO;
import java.util.Date;
import Model.Login;
public class Usuario {
    private String nome, cpf, email, perfil, senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }  

    public void cadastrarUsuario(String nome, String cpf, String email, String perfil, String senha){
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setSenha(senha);
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        usuarioDao.gravarUsuario(nome, cpf, email, perfil, senha);
        
    }
}
