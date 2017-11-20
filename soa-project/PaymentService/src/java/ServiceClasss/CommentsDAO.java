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
class CommentsDAO {
Connection conn=null;
	PreparedStatement preparedStatement, preparedStatement2=null;
	ResultSet resultSet, resultSet2=null;
        String ordid, commentid=null;
        Comments comment= null;
  
    public Comments getCommentDetails(String priceid) {
        conn=DatabaseConnection.getConnection();
		try
		{
			String sql="select * from comments where commentID=?";
			preparedStatement=conn.prepareStatement(sql);
                        preparedStatement.setString(1, priceid);
			resultSet=preparedStatement.executeQuery();
                        try {
                         while(resultSet.next()){
                int i =1 ; 
                comment= new Comments();
                    comment.setCommentTime(resultSet.getString("commentTime"));
                    comment.setCommentDate(resultSet.getString("commentDate"));
                    comment.setCommentType(resultSet.getString("commentType"));
                i++;
            }
                        }
                        catch(Exception e){
                          e.printStackTrace();
                }
                        }
    catch(Exception e){
        e.printStackTrace();
    }  
                        
                
		return comment;
		
      
}
}
