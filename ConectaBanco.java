package A3;

import java.sql.*;
public class ConectaBanco {
    
    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_petshop";    
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                usuario,
                senha
            );
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
	public PreparedStatement prepareStatement(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}


