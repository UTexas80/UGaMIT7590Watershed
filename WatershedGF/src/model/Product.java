/**
 * 
 */
package model;

/**
 * @author gfalk
 *
 */
public class Product {
	private int groceryID;
	private String SKU;
	private String ProductType;
	private String Flavor;
	private Double Cost;
	private Double Price;
	private int Quantity;
	
	/**
	*
	 */
	public Product() {
		this.groceryID = 0;
		this.SKU = "0000000";
		this.ProductType = "No Product Type";
		this.Flavor = "No Flavor";
		this.Cost = (double) 0;
		this.Price = (double) 0;
		this.Quantity = 0;
	}

	
	/**
	 * @param groceryID
	 * @param sKU
	 * @param productType
	 * @param flavor
	 * @param cost
	 * @param price
	 * @param quantity
	 */
	public Product(int groceryID, String sKU, String productType, String flavor, Double cost, Double price,
			int quantity) {
		this.groceryID = groceryID;
		this.SKU = sKU;
		this.ProductType = productType;
		this.Flavor = flavor;
		this.Cost = cost;
		this.Price = price;
		this.Quantity = quantity;
	}


	/**
	 * @return the groceryID
	 */
	public int getGroceryID() {
		return groceryID;
	}


	/**
	 * @param groceryID the groceryID to set
	 */
	public void setGroceryID(int groceryID) {
		this.groceryID = groceryID;
	}


	/**
	 * @return the sKU
	 */
	public String getSKU() {
		return SKU;
	}


	/**
	 * @param sKU the sKU to set
	 */
	public void setSKU(String sKU) {
		SKU = sKU;
	}


	/**
	 * @return the productType
	 */
	public String getProductType() {
		return ProductType;
	}


	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		ProductType = productType;
	}


	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return Flavor;
	}


	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		Flavor = flavor;
	}


	/**
	 * @return the cost
	 */
	public Double getCost() {
		return Cost;
	}


	/**
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) {
		Cost = cost;
	}


	/**
	 * @return the price
	 */
	public Double getPrice() {
		return Price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		Price = price;
	}


	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return Quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [groceryID=" + groceryID + ", SKU=" + SKU + ", ProductType=" + ProductType + ", Flavor="
				+ Flavor + ", Cost=" + Cost + ", Price=" + Price + ", Quantity=" + Quantity + "]";
	}

}
