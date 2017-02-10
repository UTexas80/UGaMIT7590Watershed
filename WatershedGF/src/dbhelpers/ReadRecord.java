/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Product;

/**
 * @author gfalk
 *
 */
public class ReadRecord {

	private Connection connection;
	private ResultSet results;
	
	private Product product = new Product();
	private int groceryID;	
	

public ReadRecord(String dbName, String uname, String pwd, int groceryID) {
	
	String url ="jdbc:mysql://localhost:3306/" + dbName;
	this.groceryID= groceryID;
	
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();								// setup the driver
		this.connection = DriverManager.getConnection(url, uname, pwd);
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}				
	
	}

	public void doRead(){
		String query = "select * from products where groceryID = ?";
	
	try {
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1, this.groceryID);
		
		this.results = ps.executeQuery();
		
		this.results.next();
		
		product.setGroceryID(this.results.getInt(1));
		product.setSKU(this.results.getString("SKU"));
		product.setProductType(this.results.getString("Product Type"));
		product.setFlavor(this.results.getString("Flavor"));
		product.setCost(this.results.getDouble("Cost"));
		product.setPrice(this.results.getDouble("Price"));
		product.setQuantity(this.results.getInt("Quantity"));
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
 
	public Product getProduct(){
		return this.product;
	}
	
}