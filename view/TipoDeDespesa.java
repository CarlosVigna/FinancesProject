package view;

/**
 * Class TipoDeDespesa
 */
public class TipoDeDespesa extends Fornecedor{

  //
  // Fields
  //

  private int id;
  private String nome;
  private Fornecedor fornecedor;
  
  //
  // Constructors
  //
  public TipoDeDespesa () { };
  
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
   * Set the value of nome
   * @param newVar the new value of nome
   */
  public void setNome (String newVar) {
    nome = newVar;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  public String getNome () {
    return nome;
  }

  /**
   * Set the value of fornecedor
   * @param newVar the new value of fornecedor
   */

}
