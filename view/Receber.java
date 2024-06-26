package view;

import java.util.Date;
import java.util.Scanner;

public class Receber {

  private int id;
  private Date dtVenc;
  private String historico;
  private double valor;
  private double liquidado;
  private String situacao;
  Credor credor;
  TipoDeRecebimento tipoDeRecebimento;

  Scanner teclado = new Scanner(System.in);

  public Receber() {
  }

  public Receber(int id, TipoDeRecebimento tipoDeRecebimento, String situacao, double liquidado, double valor, String historico, Date dtVenc) {
    this.id = id;
    this.tipoDeRecebimento = tipoDeRecebimento;
    this.situacao = situacao;
    this.liquidado = liquidado;
    this.valor = valor;
    this.historico = historico;
    this.dtVenc = dtVenc;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDtVenc() {
    return dtVenc;
  }

  public void setDtVenc(Date dtVenc) {
    this.dtVenc = dtVenc;
  }

  public String getHistorico() {
    return historico;
  }

  public void setHistorico(String historico) {
    this.historico = historico;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getLiquidado() {
    return liquidado;
  }

  public void setLiquidado(double liquidado) {
    this.liquidado = liquidado;
  }

  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public TipoDeRecebimento getTipoDeReceita() {
    return tipoDeRecebimento;
  }

  public void setTipoDeReceita(TipoDeRecebimento tipoDeRecebimento) {
    this.tipoDeRecebimento = tipoDeRecebimento;
  }

  public void cadastrar()
  {
   
    teclado.nextLine();
    System.out.println("Informe o ID do título a Receber: ");
    id = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Informe o Histórico : ");
    historico = teclado.nextLine();

  }

  public void cadastrar(Credor credor, TipoDeRecebimento tipoDeRecebimento) {
    this.credor = credor;
    this.tipoDeRecebimento = tipoDeRecebimento;

    teclado.nextLine();
    System.out.println("Informe o ID do título a Receber: ");
    id = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Informe o Histórico: ");
    historico = teclado.nextLine();
    System.out.println("Informe o Valor: ");
    valor = teclado.nextDouble();
    teclado.nextLine();
    System.out.println("Informe a Data de Vencimento (yyyy-MM-dd): ");
    dtVenc = java.sql.Date.valueOf(teclado.nextLine());
    System.out.println("Informe a Situação: ");
    situacao = teclado.nextLine();
    System.out.println("Informe o Valor Liquidado: ");
    liquidado = teclado.nextDouble();
    teclado.nextLine();
  }

  public String toString()
  {
    return  "Nome do Credor: " + credor.getNome() + " Telefone do Credor: " + credor.getTelefone() + " Tipo de Receita: "
            + tipoDeRecebimento.getNome() + " Tipo de Receita: " + tipoDeRecebimento.getNome() + "Valor: " + getValor() + "Data de vencimento: " + getDtVenc() + "Situação: " + getSituacao()
            + "Valor liquidado: " + getLiquidado();
  }


}
