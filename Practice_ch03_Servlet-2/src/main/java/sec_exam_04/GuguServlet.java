package sec_exam_04;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/gugu")
public class GuguServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GuguServlet() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		//getParameter()는 리턴타입이 String이므로 숫자(int)로 바꿔주는 코드(Integer.parseInt)
		int number = Integer.parseInt(request.getParameter("number"));
		
		writer.print("<table border=1 width = 800px align = center>");
		writer.print("<tr align = center bgcolor='#FFFF66'>");
		writer.print("<td colspan = 4>" + number + "단 출력</td>");
		
		for(int i=1; i<10; i++) {
			
			if(i % 2 == 0) {
				writer.print("<tr align=center bgcolor = '#ACFA58'>");
			}
			else {
				writer.print("<tr align = center bgcolor ='#81BEF7'>");
			}
			
			writer.print("<td width = 200px>" + number + "</td>");
			writer.print("<td width = 200px>" + i + "</td>");
			writer.print("<td width = 200px>" + number + "*" +i + "</td>");
			writer.print("<td width = 200px>" + number * i + "</td>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
