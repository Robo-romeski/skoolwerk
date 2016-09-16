package servletBasics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class threeParams
 */
@WebServlet("/three-params")
public class threeParams extends HttpServlet {
	private String message;
	public void init() throws ServletException{
		message = "Hello World";
	}
 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println(
 MyUtilities.HTMLHeaderInfo.headwithTitle("message") +
 //"<HEAD><TITLE>Hello</TITLE></HEAD>\n" +
 "<BODY BGCOLOR=\"#FDF5E6\">\n" +
 "<H1>Hello</H1>\n" +
 "<UL>\n" +
 "<LI><B>param1</B>:"
 + request.getParameter("param1") + "\n" +
 "<LI><B>param2</B>:"
 + request.getParameter("param2") + "\n" +
 "<LI><B>param3</B>:"
 + request.getParameter("param3") + "\n" +
 "</UL>\n" +
 "</BODY></HTML>");
 }

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
	doGet(request, response);
}
}