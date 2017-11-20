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


/**
 *
 * @author Poornima
 */
class UserHandlerTransaction  {
    Connection conn = null ;
    PreparedStatement preparedStatement=null, preparedStatement1=null;
    ResultSet resultSet=null;
    ArrayList<Payment> vehicleList=null;
    Transaction transaction = null;
    Transaction getTransactionDetails(String transactionId, String orderId) {
        String empId = " "; 
        conn = DatabaseConnection.getConnection();
        try { 
            String sql = "Select * from transactions where transactionID = ? and OrderId = ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, transactionId);
            preparedStatement.setString(2, orderId);
            resultSet = preparedStatement.executeQuery();
            try{
                while(resultSet.next()){
                    int i = 1 ;
                    transaction = new Transaction();
                    transaction.setTransactionDate(resultSet.getString("transactionDate"));
                    transaction.setTransactionDescription(resultSet.getString("transactionDescription"));
                    transaction.setTransactionAmount(resultSet.getFloat("transactionAmount"));
                    transaction.setDriverPric(Float.parseFloat(resultSet.getString("driverPrc")));
                    transaction.setQuantity(resultSet.getInt("qty"));
                    transaction.setRate(Float.parseFloat(resultSet.getString("rate")));
                    transaction.setSurcharge(resultSet.getFloat("surcharge"));
                    transaction.setUnitPrice(Float.parseFloat(resultSet.getString("UnitPrice")));
                    i++;
                } 
            }
            catch(Exception x){
                x.printStackTrace();
            }
        }
          
        catch(Exception x){
            x.printStackTrace();
        }
           
                
         return transaction;
    }

    ArrayList<String> getAllTransaction() {
        ArrayList<String> al = new ArrayList<>();
        String truckNo ;
        
        conn = DatabaseConnection.getConnection();
        try{
            String s1 = "select truckNo from transactions ";
            preparedStatement = conn.prepareStatement(s1);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                transaction = new Transaction();
                truckNo = resultSet.getString("truckNo");
                al.add(truckNo);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}
