package sec_exam_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Servlet implementation class join_Servlet
 */
@WebServlet("/join")
public class join_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public join_Servlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()호출");
		//한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		//html의 form태그에서 클라이언트가 입력하고 정송한 값을 직접 request 내장객체 이용하여 메서드로 얻음
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//체크박스는 다중값이므로 String[]타입으로 리턴한다.
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		
		//위에 값들을 받아서 클라이언트애게 출력
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("이름 : " + name +"<br/>");
		writer.println("아이디 : " + id +"<br/>");
		writer.println("비밀번호 : " + pw +"<br/>");
		writer.println("취미 : " + Arrays.toString(hobby) +"<br/>");
		writer.println("전공 : " + major +"<br/>");
		writer.println("프로토콜 : " + protocol +"<br/>");
		writer.println("</body></html>");
		
		writer.close(); //스트림 닫기
		
	}

}
