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
public class UpdateQuery {

	private Connection connection;
	
	public UpdateQuery(String dbName, String uname, String pwd) {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void doUpdate(Product product){
		//	Selecting from "column names" with spaces in it, e.g. "Product Type" - use the backtick to surround the column name.`
		String query = "UPDATE products SET SKU = ?, `Product Type`=?, Flavor =?, Cost=?, Price=?, Quantity=? WHERE groceryID=?";
		try {
			// create java preparedstatement using a sql update query
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, product.getSKU());
			ps.setString(2, product.getProductType());
			ps.setString(3, product.getFlavor());
			ps.setDouble(4, product.getCost());
			ps.setDouble(5, product.getPrice());
			ps.setInt(6, product.getQuantity());
			ps.setInt(7, product.getGroceryID());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
