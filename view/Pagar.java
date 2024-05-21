package view;

import java.util.Date;

/**
 * Class Pagar
 */
public class Pagar extends TipoDeDespesa{

  //
  // Fields
  //

  private int id;
  private String situacao;
  private Date dtVenc;
  private String historico;
  private double valor;
  private double liquidado;
  private TipoDeDespesa tipoDeDespesa;
  
  //
  // Constructors
  //
  public Pagar () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of situacao
   * @param newVar the new value of situacao
   */
  public void setSituacao (String newVar) {
    situacao = newVar;
  }

  /**
   * Get the value of situacao
   * @return the value of situacao
   */
  public String getSituacao () {
    return situacao;
  }

  /**
   * Set the value of dtVenc
   * @param newVar the new value of dtVenc
   */
  public void setDtVenc (Date newVar) {
    dtVenc = newVar;
  }

  /**
   * Get the value of dtVenc
   * @return the value of dtVenc
   */
  public Date getDtVenc () {
    return dtVenc;
  }

  /**
   * Set the value of historico
   * @param newVar the new value of historico
   */
  public void setHistorico (String newVar) {
    historico = newVar;
  }

  /**
   * Get the value of historico
   * @return the value of historico
   */
  public String getHistorico () {
    return historico;
  }

  /**
   * Set the value of valor
   * @param newVar the new value of valor
   */
  public void setValor (double newVar) {
    valor = newVar;
  }

  /**
   * Get the value of valor
   * @return the value of valor
   */
  public double getValor () {
    return valor;
  }

  /**
   * Set the value of liquidado
   * @param newVar the new value of liquidado
   */
  public void setLiquidado (double newVar) {
    liquidado = newVar;
  }

  /**
   * Get the value of liquidado
   * @return the value of liquidado
   */
  public double getLiquidado () {
    return liquidado;
  }

  /**
   * Set the value of tipoDeDespesa
   * @param newVar the new value of tipoDeDespesa
   */
  public void setTipoDeDespesa (TipoDeDespesa newVar) {
    tipoDeDespesa = newVar;
  }

  /**
   * Get the value of tipoDeDespesa
   * @return the value of tipoDeDespesa
   */
  public TipoDeDespesa getTipoDeDespesa () {
    return tipoDeDespesa;
  }

  //
  // Other methods
  //

}
