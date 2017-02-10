package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.AddQuery;
import dbhelpers.UpdateQuery;
import model.Product;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(description = "Controller for adding a new product to the database", urlPatterns = { "/addProduct" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// get the form data and set up a Product object
		// int groceryID = Integer.parseInt(request.getParameter("groceryID"));
		String sku = request.getParameter("sku");
		String productType = request.getParameter("productType");
		String flavor = request.getParameter("flavor");
		Double cost = Double.parseDouble(request.getParameter("cost"));
		Double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));

		// set up a product object
		Product product = new Product();
		// product.setGroceryID(groceryID);
		product.setSKU(sku);
		product.setProductType(productType);
		product.setFlavor(flavor);
		product.setCost(cost);
		product.setPrice(price);
		product.setQuantity(quantity);		

		// set up an addQuery object
		AddQuery aq= new AddQuery("grocery", "root", "sesame");

		// pass the product to addQuery to add to the database
		aq.doAdd(product);

		// pass execution control to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
