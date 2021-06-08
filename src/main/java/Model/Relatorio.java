package Model;

import DAO.RelatorioDAO;

public class Relatorio {
    private int QuantidadeVacinado;
    private int dataInicio;
    private int dataFim;

    public int getQuantidadeVacinado() {
        return QuantidadeVacinado;
    }

    public void setQuantidadeVacinado(int QuantidadeVacinado) {
        this.QuantidadeVacinado = QuantidadeVacinado;
    }

    public int getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDataFim() {
        return dataFim;
    }

    public void setDataFim(int dataFim) {
        this.dataFim = dataFim;
    }
    
    public void calculoMedia(){
        int primeiraMedia;
        int segundaMedia;
        int terceiraMedia;
        int quartaMedia;
        
        RelatorioDAO relDAO = new RelatorioDAO();
        
        int soma1 = relDAO.primeiraSoma();
        int qtd1 = relDAO.primeiraQuantidade();
        
        int total1 = soma1/qtd1;
        
        int soma2 = relDAO.primeiraSoma();
        int qtd2 = relDAO.primeiraQuantidade();
        
        int total2 = soma2/qtd2;
        
        int soma3 = relDAO.primeiraSoma();
        int qtd3 = relDAO.primeiraQuantidade();
        
        int total3 = soma3/qtd3;
        
        int soma4 = relDAO.primeiraSoma();
        int qtd4 = relDAO.primeiraQuantidade();
        
        int total4 = soma4/qtd4;
        
        
        
    }
    
    
    
}
