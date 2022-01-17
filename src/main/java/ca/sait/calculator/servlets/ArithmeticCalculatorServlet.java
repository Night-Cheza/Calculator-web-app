package ca.sait.calculator.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leila Nalivkina
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
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

		String button = request.getParameter("calc");
		int result;
		int numOne;
		int numTwo;
		String first;
		String second ;

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("plus")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						result = numOne + numTwo;

						request.setAttribute("message", "Result: " + result);
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("minus")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						if (numOne < numTwo) {
							result = numTwo - numOne;
							request.setAttribute("message", "Result: " + "-" +  result);
						} else {
							result = numOne - numTwo;
							request.setAttribute("message", "Result: " + result);
						}
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("multi")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						result = numTwo * numOne;

						request.setAttribute("message", "Result: " + result);
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("modul")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						result = numOne % numTwo;

						request.setAttribute("message", "Result: " + result);
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
	}
}
