package ca.sait.calculator.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leila Nalivkina, Nick Hemmet
 */
public class AgeCalculatorServlet extends HttpServlet {
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//age is the name of input type in jsp file
		if (request.getParameter("age").isEmpty()) { 
			request.setAttribute("message", "You must give your current age");			
		} else  {
			try {
				String ageInput = request.getParameter("age");
				int age = Integer.parseInt(ageInput);

				int ageNextBday = age + 1;

				request.setAttribute("message", "You will be " + ageNextBday + " after your next birtday");
			} catch (NumberFormatException ex) {
				request.setAttribute("message", "You must enter a number");
			}
		}
		getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
	}
}
