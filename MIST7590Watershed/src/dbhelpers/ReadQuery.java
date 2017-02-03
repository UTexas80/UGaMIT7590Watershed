/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.monitoringPt;

/**
 * @author gfalk
 *
 */
public class ReadQuery {

	private Connection connection;
	private ResultSet results;
	
	public ReadQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
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
		String query = "select * from monitoring";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
			
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
				monitoringPt MonitoringPt = new monitoringPt();
				MonitoringPt.setSiteName(this.results.getString("siteName"));
				MonitoringPt.setSitePoint(this.results.getString("sitePoint"));
				MonitoringPt.setLatitude(this.results.getString("latitude"));
				MonitoringPt.setLongitude(this.results.getString("longitude"));
				MonitoringPt.setDescription(this.results.getString("description"));
				MonitoringPt.setSiteUse(this.results.getString("siteUse"));
				
				
				table +="<tr>";
//				table +="<td>";
//					product.getGroceryID();
//				table +="</td>";			
				table +="<td>";
				table += MonitoringPt.getSiteName();
				table +="</td>";
				table +="<td>";
				table += MonitoringPt.getSitePoint();
				table +="</td>";			
				table +="<td>";
				table += MonitoringPt.getLatitude();
				table +="</td>";			
				table +="<td>";
				table +=MonitoringPt.getLongitude();
				table +="</td>";
				table +="<td>";
				table += MonitoringPt.getDescription();
				table +="</td>";			
				table +="<td>";
				table += MonitoringPt.getSiteUse();
				table +="</td>";
				table +="<td>";
					table +="<a href=update?MonitoringPtID=" + MonitoringPt.getSiteName() + ">update </a>" + 
						    "<a href=delete?MonitoringPtID=" + MonitoringPt.getSiteName() + "> delete</a>";
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