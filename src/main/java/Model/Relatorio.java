package Model;

import DAO.RelatorioDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Relatorio {
    private int total1,total2,total3,total4;
    private int qtd1,qtd2,qtd3,qtd4;
    private String dataInicio;
    private String dataFim;

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    
    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    public int getTotal3() {
        return total3;
    }

    public void setTotal3(int total3) {
        this.total3 = total3;
    }

    public int getTotal4() {
        return total4;
    }

    public void setTotal4(int total4) {
        this.total4 = total4;
    }
    public int getQtd1() {
        return qtd1;
    }

    public void setQtd1(int qtd1) {
        this.qtd1 = qtd1;
    }

    public int getQtd2() {
        return qtd2;
    }

    public void setQtd2(int qtd2) {
        this.qtd2 = qtd2;
    }

    public int getQtd3() {
        return qtd3;
    }

    public void setQtd3(int qtd3) {
        this.qtd3 = qtd3;
    }

    public int getQtd4() {
        return qtd4;
    }

    public void setQtd4(int qtd4) {
        this.qtd4 = qtd4;
    }
    
//    public void converterData(String inicio, String fim){
////        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
////        LocalDate inicioLocalDate = LocalDate.parse(inicio, format);
////        LocalDate fimLocalDate = LocalDate.parse(inicio, format);   
//        
//        
//
//        //java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
//    }

    
    public void calculoMedia(String inicio, String fim){
        
        setDataInicio(inicio);
        setDataFim(fim);
        
        RelatorioDAO relDAO = new RelatorioDAO();
        System.out.println(getDataInicio());
        System.out.println(getDataFim());
        
        
        int soma1 = relDAO.primeiraSoma(inicio,fim);
        int qtd1 = relDAO.primeiraQuantidade(inicio,fim);
        if(qtd1 != 0){
          total1 = soma1/qtd1;
        }
        setTotal1(total1);
        setQtd1(qtd1);
        System.out.println("resultado 1 " + total1);
        
        int soma2 = relDAO.segundaSoma(inicio,fim);
        int qtd2 = relDAO.segundaQuantidade(inicio,fim);
        if(qtd2 != 0){
          total2 = soma2/qtd2;
        }
        setTotal2(total2);
        setQtd2(qtd2);
        System.out.println("resultado 2 " + total2);
        
        int soma3 = relDAO.terceiraSoma(inicio,fim);
        int qtd3 = relDAO.terceiraQuantidade(inicio,fim);
        if(qtd3 != 0){
          total3 = soma3/qtd3;
        }
        setTotal3(total3);
        setQtd3(qtd3);
        System.out.println("resultado 3 " + total3);
        
        int soma4 = relDAO.quartaSoma(inicio,fim);
        int qtd4 = relDAO.quartaQuantidade(inicio,fim);

        if(qtd4 != 0){
          total4 = soma4/qtd4;
        }
        setTotal4(total4);
        setQtd4(qtd4);
        System.out.println("resultado 4 " + total4);
        
        
    }



}
