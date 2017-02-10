/**
 * 
 */
package dbhelpers;
import dbhelpers.dao.ConnectionBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.WaterQuality;

/**
 * @author gfalk
 *
 */
public class DeleteQuery {

	// Query the DB to delete water quality data
	
	public void doDelete(String SampleDate){
		
		// set up a String to hold our query
		String query = "DELETE from water_quality WHERE SampleDate=?";

		// connect to the database
		Connection connection = ConnectionBuilder.connect();

		// create a PreparedStatement using our query string
		try {
			PreparedStatement ps = connection.prepareStatement(query);
		// fill in the PreparedStatement
			ps.setString(1, SampleDate);
		// execute the query
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		ConnectionBuilder.disconnect();
	}
	
	
	
}
