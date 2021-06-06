package Model;

import DAO.LoginDAO;
import Telas.LoginTela;
import Telas.MenuAdm;
import Telas.TelaFilaVacinacao;
import javax.swing.JOptionPane;

public class Login {   
    private String senha,cpf;

    public Login(String cpf, String senha){
        this.cpf = cpf;
        this.senha = senha;
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
}

