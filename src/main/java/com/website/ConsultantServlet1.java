package com.website;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ConsultantServlet1
 */
@WebServlet("/site")
public class ConsultantServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultantServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();

		    String page = request.getParameter("page");

		    if(page == null){
		        page = "home";
		    }

		    String color = "pink";

		    if(page.equals("services")){
		        color = "lightblue";
		    }
		    else if(page.equals("contact")){
		        color = "lightgreen";
		    }

		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Consultant Website</title>");

		    out.println("<style>");
		    out.println("body{background-color:"+color+"; font-family:Arial; text-align:center;}");
		    out.println("nav{background:black; padding:15px;}");
		    out.println("nav a{color:white; margin:20px; font-size:18px; text-decoration:none;}");
		    out.println("</style>");

		    out.println("</head>");
		    out.println("<body>");

		    out.println("<nav>");
		    out.println("<a href='site?page=home'>Home</a>");
		    out.println("<a href='site?page=services'>Services</a>");
		    out.println("<a href='site?page=contact'>Contact</a>");
		    out.println("</nav>");

		    if(page.equals("home")){
		        out.println("<h1>Welcome to My Consulting Business</h1>");
		        out.println("<p>I help companies grow and succeed.</p>");
		    }

		    else if(page.equals("services")){
		        out.println("<h1>Our Services</h1>");
		        out.println("<p>Business Strategy | IT Consulting | Startup Mentoring</p>");
		    }

		    else if(page.equals("contact")){
		        out.println("<h1>Contact Me</h1>");
		        out.println("<p>Email: consultant@email.com</p>");
		    }

		    out.println("</body>");
		    out.println("</html>");
 }		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
