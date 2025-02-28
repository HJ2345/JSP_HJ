package sec04_exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 System.out.println("doGet()호출됨");
	 
	 //클라이언트가 요청한 파라메터 값들을 인코딩
	 request.setCharacterEncoding("utf-8");
	 //클라이언트에게서 넘어오는 id 비밀번호를 인코딩 설정후 출력스트림을 얻고 화면에 뿌린다.
	 String id = request.getParameter("id");
	 String passwd = request.getParameter("passwd");
	 
	 response.setContentType("text/html; charset=utf-8");
	 PrintWriter writer = response.getWriter();
	 writer.println("아이디 :" + id + "<br/>");
	 writer.println("비밀번호 :" + passwd + "<br/>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("doPost()호출됨");
		 
		 //클라이언트가 요청한 파라메터 값들을 인코딩
		 request.setCharacterEncoding("utf-8");
		 //클라이언트에게서 넘어오는 id 비밀번호를 인코딩 설정후 출력스트림을 얻고 화면에 뿌린다.
		 //id는 html에서 정의된 코드를 getParameter로 받아서 String으로 저장
		 String id = request.getParameter("id");
		 String passwd = request.getParameter("passwd");
		 
		 response.setContentType("text/html; charset=utf-8");
		 PrintWriter writer = response.getWriter();
		 writer.println("아이디 :" + id + "<br/>");
		 writer.println("비밀번호 :" + passwd + "<br/>");
		}
	}

