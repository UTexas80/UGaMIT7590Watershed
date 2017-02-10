package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.UpdateQuery;
import model.Product;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet(asyncSupported = true, description = "Controller which starts he actual product update to the database", urlPatterns = { "/updateProduct" })
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the form data and set up a Product object
		int groceryID = Integer.parseInt(request.getParameter("groceryID"));
		String sku = request.getParameter("sku");
		String productType = request.getParameter("productType");
		String flavor = request.getParameter("flavor");
		Double cost = Double.parseDouble(request.getParameter("cost"));
		Double price = Double.parseDouble(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		Product product = new Product();
		product.setGroceryID(groceryID);
		product.setSKU(sku);
		product.setProductType(productType);
		product.setFlavor(flavor);
		product.setCost(cost);
		product.setPrice(price);
		product.setQuantity(quantity);		
		
		// create an UpdateQuery object and use it to update the product
		UpdateQuery uq= new UpdateQuery("grocery", "root", "sesame");
		uq.doUpdate(product);
		
		// pass control on to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
