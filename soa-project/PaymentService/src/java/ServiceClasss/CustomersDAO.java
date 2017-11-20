/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

/**
 *
 * @author Poornima
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Poornima
 */
class CustomersDAO {
Connection conn=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
        String custid =null;
        
  
     public String getCust(String BusinessName,String Country) {
        conn=DatabaseConnection.getConnection();
		try
		{
			String sql="SELECT CustomerID FROM customer WHERE BusinessName=? and Country=?;";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, BusinessName);
                        preparedStatement.setString(2, Country);
			resultSet=preparedStatement.executeQuery();
                        System.out.println("Hi");
                        try {
                         while(resultSet.next()){
             
                         custid = resultSet.getString("customerID");
                            System.out.println(custid+"hi hi hi");  
            }
                         
             }   
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}}
    catch(Exception e){
        e.printStackTrace();
    }  
                        
                
		return custid;
		
      
}
}