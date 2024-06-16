package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int fn=Integer.parseInt(req.getParameter("fn"));
		int sn=Integer.parseInt(req.getParameter("sn"));
		
		
		int sum=(int)req.getAttribute("s");
		int mul=fn*sn;
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>sum:"+sum+",multiplication:"+mul+"</h1>");
	}

}
