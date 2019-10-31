package pers.George.Lab2.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuLeeGayServlet
 */
public class AuLeeGayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AuLeeGayServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码 解决中文乱码问题
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//获取参数username
		String username = request.getParameter("username");
		
		//字符串数据集合
		ArrayList<String> messages = new ArrayList<String>();
		//把username也加进去
		messages.add(username);
		messages.add("我们遇到什么困难");
		messages.add("也不要怕");
		messages.add("微笑着面对它");
		messages.add("消除恐惧的最好办法");
		messages.add("就是微笑着面对");
		messages.add("坚持，才是胜利");
		messages.add("加油");
		messages.add("奥里给！！");
		
		//图片地址
		String imgURL ="/img/auleegay.png" ;
		
		//向request域中存储数据
		request.setAttribute("messages", messages);
		request.setAttribute("imgURL", imgURL);
		
		System.out.println("111");
		//请求转发到2.jsp
		request.getRequestDispatcher("./2.jsp").forward(request, response);
		
		
//		
//		String html="<!DOCTYPE html>\r\n" + 
//				"<html>\r\n" + 
//				"<head>\r\n" + 
//				"<meta charset=\"UTF-8\">\r\n" + 
//				"<title>Insert title here</title>\r\n" + 
//				"</head>\r\n" + 
//				"<body>\r\n" + 
//				"<div style=\"height:300px;width:400px;background-color:#9f8d7c;\"align='center'>\r\n"+ 
//				"	<h1><a href='#' onclick=\"javascript:alert('也不要怕');\">我们遇到什么困难</h1>\r\n" + 
//				"</div>\r\n" + 
//				"</body>\r\n" + 
//				"</html>";
//
//		response.getWriter().append(html);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
