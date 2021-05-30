
package com.vacinaja.vacina;

public class Usuario {
    private String nome,senha, cpf, data_registro, email, perfil;


public Usuario() {
}
    public Usuario (String nome, String senha, String cpf,String data_registro,String email,String perfil){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.data_registro = data_registro;
        this.email = email;
        this.perfil = perfil;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the data_registro
     */
    public String getData_registro() {
        return data_registro;
    }

    /**
     * @param data_registro the data_registro to set
     */
    public void setData_registro(String data_registro) {
        this.data_registro = data_registro;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}