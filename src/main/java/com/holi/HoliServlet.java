package com.holi;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Servlet implementation class HoliServlet
 */
@WebServlet("/playHoli")
public class HoliServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoliServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] colors = {"Red", "Blue", "Green", "Yellow", "Pink"};

        Random rand = new Random();
        String color = colors[rand.nextInt(colors.length)];

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>HoliColor</title>");

        out.println("<style>");
        out.println("body{font-family:Arial;text-align:center;background:#0f172a;color:white;margin-top:100px;}");
        out.println("h1{font-size:45px;}");
        out.println(".box{margin:auto;width:350px;padding:30px;border-radius:20px;background:#111827;box-shadow:0px 0px 20px rgba(0,0,0,0.5);}");
        out.println(".color{font-size:50px;font-weight:bold;color:"+color+";margin:20px;}");
        out.println("a{display:inline-block;margin-top:20px;padding:10px 25px;border-radius:25px;background:#2563eb;color:white;text-decoration:none;font-size:18px;}");
        out.println("a:hover{background:#1d4ed8;}");
        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='box'>");
        out.println("<h1>🎨 HAPPY HOLI!</h1>");
        out.println("<h3>Your color for today is:</h3>");
        out.println("<div class='color'>"+color+"</div>");
        out.println("<a href='playHoli'>Play Again</a>");
        out.println("</div>");

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
