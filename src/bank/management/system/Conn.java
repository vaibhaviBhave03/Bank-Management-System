
package bank.management.system;
import java.sql.*;


public class Conn {
    //step 1 : create connection
    
    Connection c;
    Statement s ;
public Conn() {
    try{
        
        //driver register
         Class.forName("com.mysql.cj.jdbc.Driver"); 
        
      
        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Vb@9082586309");
        s=c.createStatement();
        
    }
        catch (Exception e){
            System.out.println(e);
            
    }
    
}   
    
    
}
