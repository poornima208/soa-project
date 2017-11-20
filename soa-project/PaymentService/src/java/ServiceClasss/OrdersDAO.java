/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClasss;

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
class OrdersDAO {
Connection conn=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
        String ordid=null;
        Orders order=new Orders();
    public Orders getOrderDetails(String custid, String empid) {
        conn=DatabaseConnection.getConnection();
		try
		{
			String sql="select * from orders where CustomerID=? and EmployeeID=?";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, custid);
                        preparedStatement.setString(2, empid);
			resultSet=preparedStatement.executeQuery();
                        try {
                         while(resultSet.next()){
                        order.setOrderID(resultSet.getString("OrderID"));
                        order.setOrderDate(resultSet.getDate("OrderDate"));
                        order.setTruckID(resultSet.getString("TruckID"));
                        order.setIsSpecial((resultSet.getString("isSPecial")));
                        order.setPurchaseOrderNumber(resultSet.getLong("PurchaseOrderNumber"));
                        order.setOrderTotalAmount((resultSet.getFloat("OrderTotalAmount")));
                        }
                            System.out.println(order.getOrderTotalAmount());
                        }
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
   
                
		return order;
		
      
}
}
