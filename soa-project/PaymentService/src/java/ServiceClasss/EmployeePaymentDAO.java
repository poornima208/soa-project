/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Poornima
 */
public class EmployeePaymentDAO {
    Connection conn=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
        String custid=null;
        EmployeePayment empPayment=new EmployeePayment();;
  
    public EmployeePayment getEmployeePayment(String EmployeeID) {
            conn=DatabaseConnection.getConnection();
		try
		{
			String sql="select * from emp_payments where EmployeeID=?";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, EmployeeID);
			resultSet=preparedStatement.executeQuery();
                        try {
                         while(resultSet.next()){
                            
                            empPayment.setPaymentID(resultSet.getString("PaymentID"));
                            empPayment.setEmployeeID(resultSet.getString("EmployeeID"));
                            empPayment.setPaymentAmount(resultSet.getInt("PaymentAmount"));
                            empPayment.setPaymentDate(resultSet.getString("PaymentDate"));
                            empPayment.setPaymenttype(resultSet.getString("Paymenttype"));
                           
                }
            }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}}
        catch(Exception e){
        e.printStackTrace();
    }    
                
		return empPayment;
		
      
}
    
}
