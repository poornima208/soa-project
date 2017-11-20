/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Poornima
 */
class UserHandler  {
    Connection conn = null ;
    PreparedStatement preparedStatement=null, preparedStatement1=null;
    ResultSet resultSet=null;
    ArrayList<Payment> vehicleList=null;
  
       
    public  double getPrice(String paymentId) {
    double price =0 ;
    conn = DatabaseConnection.getConnection();
    try{
        String sql= "select PaymentAmount from payments where PaymentID=?";
        preparedStatement= conn.prepareStatement(sql);
        preparedStatement.setString(1, paymentId);
        resultSet = preparedStatement.executeQuery();
        try{
            while(resultSet.next()){
                int i =1 ; 
                price = resultSet.getDouble("PaymentAmount");
                System.out.println(price);
                i++;
            }
        }
        catch(Exception x)
        {
            x.printStackTrace();       
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }        
        
    return price;
         
      
}
}
