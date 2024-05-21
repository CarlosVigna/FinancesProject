package view;

import java.util.*;


/**
 * Class Credito
 */
public class Credito {

  //
  // Fields
  //

  private int id;
  private double valor;
  private Date dtPag;
  private Receber recebimento;
  
  //
  // Constructors
  //
  public Credito () { };
  
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
   * Set the value of dtPag
   * @param newVar the new value of dtPag
   */
  public void setDtPag (Date newVar) {
    dtPag = newVar;
  }

  /**
   * Get the value of dtPag
   * @return the value of dtPag
   */
  public Date getDtPag () {
    return dtPag;
  }

  /**
   * Set the value of recebimento
   * @param newVar the new value of recebimento
   */
  public void setRecebimento (Receber newVar) {
    recebimento = newVar;
  }

  /**
   * Get the value of recebimento
   * @return the value of recebimento
   */
  public Receber getRecebimento () {
    return recebimento;
  }

  //
  // Other methods
  //

  /**
   */
  public void calculaSaldo()
  {
  }


}
