package view;

/**
 * Class Fornecedor
 */
public class Fornecedor {

  //
  // Fields
  //

  private int id;
  private String telefone;
  private String nome;
  
  //
  // Constructors
  //
  public Fornecedor () { };
  
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
   * Set the value of telefone
   * @param newVar the new value of telefone
   */
  public void setTelefone (String newVar) {
    telefone = newVar;
  }

  /**
   * Get the value of telefone
   * @return the value of telefone
   */
  public String getTelefone () {
    return telefone;
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

  //
  // Other methods
  //

}
