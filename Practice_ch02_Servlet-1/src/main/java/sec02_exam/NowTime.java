package sec02_exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NowTime
 */
@WebServlet("/NowTime")
public class NowTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NowTime() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//문자셋 지정
		response.setContentType("text/html; charset = utf-8");
		      
		//PrintWriter 객체 생성 , out은 객체 이름
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>현재시간</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("지금 시간은");
		out.println(new Date());
		out.println("입니다.");
		out.println("</BODY>");
		out.println("</HTML>");
		
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
