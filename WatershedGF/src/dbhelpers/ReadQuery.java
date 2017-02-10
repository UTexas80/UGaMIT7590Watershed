
/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbhelpers.dao.ConnectionBuilder;
import model.WaterQuality;

/**
 * @author gfalk
 *
 */
public class ReadQuery {

	private Connection connection;
	private ResultSet results;
	
	public ReadQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?verifyServerCertificate=false&useSSL=true";
		
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public void doRead(){
		// Connection connection = ConnectionBuilder.connect();
		String query = "select * from water_quality";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
			// ResultSet rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public String getHTMLTable(){
	String table ="";
	table+="<table border=1>";
	
	try {

		while(this.results.next()){
			WaterQuality waterQuality = new WaterQuality();			 
			waterQuality.setSampleDate(this.results.getString(1));
			System.out.println("Hello World!! " + this.results.getString(1));
			
			table +="<tr>";
/*			table +="<td>";
				this.results.getString(1);				
			table +="</td>";		
			
			table +="<td>";
			table += product.getSKU();
			table +="</td>";
			table +="<td>";
			table += product.getProductType();
			table +="</td>";			
			table +="<td>";
			table += product.getFlavor();
			table +="</td>";			
			table +="<td>";
			table +=product.getCost();
			table +="</td>";
			table +="<td>";
			table += product.getPrice();
			table +="</td>";			
			table +="<td>";
			table += product.getQuantity();
			table +="</td>";
*/			
			table +="<td>";
				table +="<a href=update?SampleDate=" + this.results.getString(1)	 + ">update</a>" + 
					    "<a href=delete?SampleDate=" + this.results.getString(1)	 + ">delete</a>";
			table +="</td>";	
			table +="</tr>";
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	table+="</table>";
	
	return table;
}
}