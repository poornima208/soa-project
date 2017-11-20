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
class PricingDAO {
Connection conn=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
        String custid=null;
        Pricing pricing=new Pricing();;
  
    public Pricing getPricingDetails(String priceId) {
        conn=DatabaseConnection.getConnection();
		try
		{
			String sql="select * from pricing where priceID=?";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, priceId);
			resultSet=preparedStatement.executeQuery();
                        try {
                         while(resultSet.next()){
                            
                            pricing.setLocationIDFrom(resultSet.getInt("locationIDFrom"));
                            pricing.setLocationIDTO(resultSet.getInt("locationIDTo"));
                            pricing.setLocationCodeFrom(resultSet.getString("locationCodeFrom"));
                            pricing.setLocationCodeTo(resultSet.getString("locationCodeTo"));
                            pricing.setLocationNameFrom(resultSet.getString("locationNameFrom"));
                            pricing.setLocationNameTo(resultSet.getString("locationNameTo"));
                            pricing.setCustomerID(resultSet.getString("customerID"));
                }
            }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}}
    catch(Exception e){
        e.printStackTrace();
    }    
                
		return pricing;
		
      
}
}
