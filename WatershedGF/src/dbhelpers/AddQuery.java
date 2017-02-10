/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Product;

/**
 * @author gfalk
 *
 */
public class AddQuery {

	public Connection connection;
	
	public AddQuery(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void doAdd(Product product){
		String query = "INSERT into products (groceryID, SKU, `Product Type`, Flavor, Cost, Price, Quantity) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
	
			ps.setInt(1, product.getGroceryID());
			ps.setString(2, product.getSKU());
			ps.setString(3, product.getProductType());
			ps.setString(4, product.getFlavor());
			ps.setDouble(5, product.getCost());
			ps.setDouble(6, product.getPrice());
			ps.setInt(7, product.getQuantity());

			
			ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
}
