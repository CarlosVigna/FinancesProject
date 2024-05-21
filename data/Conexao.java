package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection con; //atributo
    public Connection getConexao(){
        return con;
    }
    public Conexao() throws ClassNotFoundException, SQLException {
        String url="";
        String driver="";
        String usuario="";
        String senha="";
        Class.forName(driver);
        con=DriverManager.getConnection(url, usuario, senha);
    }
}
