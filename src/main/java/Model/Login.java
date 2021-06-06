package Model;

import DAO.UsuarioDAO;
import Telas.LoginTela;
import Telas.MenuAdm;
import Telas.TelaFilaVacinacao;
import javax.swing.JOptionPane;

public class Login {   
    private String senha,cpf,perfil;

    public Login(String cpf, String senha, String perfil){
        this.cpf = cpf;
        this.senha = senha;
        this.perfil = perfil;
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

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
        public boolean Validacao(){
        UsuarioDAO UserDAO = new UsuarioDAO();
        LoginTela Tlogin = new LoginTela();
        if(UserDAO.check(cpf, senha)){
            new MenuAdm().setVisible(true);
            return true;
            
        }else{
            JOptionPane.showMessageDialog(null, "Login Invalido");
            return false;
        }
    }
}

