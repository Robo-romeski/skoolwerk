package MyInitial;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


/** Simple servlet used to test server. */
@WebServlet("/myfirstapp")
public class HelloServlet extends HttpServlet {
	private String message;
	public void init() throws ServletException{
		message = "Hello World";
	}
 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
	 int cols = 10;
	 int rows = 25;
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println(
 MyUtilities.HTMLHeaderInfo.headwithTitle("message") +
 //"<HEAD><TITLE>Hello</TITLE></HEAD>\n" +
 "<BODY BGCOLOR=\"#FDF5E6\">\n" +
 "<H1>Hello</H1>\n" +
 "</BODY></HTML>");
 }
}