package POO;

import java.util.Calendar;

public final class Data {
  // atributos (ou propriedades)
  private int dia;
  private int mes;
  private int ano;
  
  // métodos
  // método construtor
  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }
  
  // método construtor
  public Data() {
    Calendar hoje = Calendar.getInstance();
 
    this.setDia(hoje.get(Calendar.DAY_OF_MONTH));
    this.setMes(hoje.get(Calendar.MONTH)+1);
    this.setAno(hoje.get(Calendar.YEAR));
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
   
  public int calculaIdade() {
    Data hj = new Data();
    
    int id;
    
    id = hj.getAno() - ano;
    if ((hj.getMes() < mes) || ((hj.getMes() == mes) && (hj.getDia() < ano)))
       id = id - 1; // ainda não fez aniversário no ano
    
    return(id);
  }
  
  public String nomeMes(boolean abreviado) {
    String meses[] = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
    if (abreviado)
       return(meses[mes].substring(0, 3));
    else return(meses[mes]);
  }
  
  public String mostrarData(int tipo) {
    switch (tipo) {
      case 0: return(dia + "/" + mes + "/" + ano);
      case 1: return(dia + "/" + nomeMes(true) + "/" + ano);
      default: return(dia + "/" + nomeMes(false) + "/" + ano);
    }
  }

}
