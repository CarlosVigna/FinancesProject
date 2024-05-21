package view;

import java.util.*;


/**
 * Class Debito
 */
public class Debito {

  //
  // Fields
  //

  private int id;
  private Date dtPag;
  private double valor;
  private Pagar pagar;
  
  //
  // Constructors
  //
  public Debito () { };
  
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
   * Set the value of pagar
   * @param newVar the new value of pagar
   */
  public void setPagar (Pagar newVar) {
    pagar = newVar;
  }

  /**
   * Get the value of pagar
   * @return the value of pagar
   */
  public Pagar getPagar () {
    return pagar;
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
