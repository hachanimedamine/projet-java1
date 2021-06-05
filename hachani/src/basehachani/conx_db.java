package basehachani;
import java.sql.*;

public class conx_db {
	 
    Connection con;
    
    public conx_db(){
    	 String user="root";
    	 String pass="";
    	 String url = "jdbc:mysql://localhost:3306/hachanijava";
    	
      try{
          Class.forName("com.mysql.cj.jdbc.Driver"); 
      }catch(ClassNotFoundException e){
          
          System.err.println(e); 
      }
      try{
          

          con=DriverManager.getConnection(url,user,pass);
          
      }catch(SQLException e){
          System.err.println(e);
      }
    }
    public Connection obtenirconnexion(){
        return con;
    }
    
}



