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
class LocationsDAO {
Connection conn=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
        String locid =null;
        
  
    public String getLoc(int locationCode, String locName) {
        conn=DatabaseConnection.getConnection();
		try
		{
			String sql="SELECT locID FROM locations WHERE locName=? and locCode=?  ";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, locName);
                        preparedStatement.setInt(2, locationCode);
			resultSet=preparedStatement.executeQuery();
                        try {
                         while(resultSet.next()){
             
                locid = resultSet.getString("locID");
                
            }
                         
             }   
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}}
    catch(Exception e){
        e.printStackTrace();
    }  
                        
                
		return locid;
		
      
}
}