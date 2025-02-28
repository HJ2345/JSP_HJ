package sec01_exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//javax.servlet패키지 예외 오류시 프로젝트 우클릭해서 build path -> libraries -> add external jars
//-> 톰캣폴더 내부의 ilb에서 jsp와 servlet 추가

/**
 * Servlet implementation class HelloWorld
 */

//URL 매핑코드가 @WebServlet어노테이션에 명기되어 있다.
//서블릿 파일이 되면 HttpServlet클래스를 자동으로 상속 받는다.
//@WebServlet("/Hwrold")//매핑 web.xml에서 지정한 매핑이 우선순위가 더 높다
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	//생성자
    public HelloWorld() {

    }

    // 여기서 2가지의 메서드 doGet(), doPost()인데, 이것은 이 서블릿 파일이 처리하는부분
    // 이 서블릿을 호출할때 클라이언트에서 요청이 들어올 때 get방식이냐, post방식이냐에 따라서 호출방법이 다름
    // 보통 용도는 doGet()은 폼을 그냥 출력하는 형태로 많이 사용됨, doPost()메서드는 데이터 가공이나 처리코드를 실행할때 사용됨
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		System.out.println("Hellow World");
 		System.out.println("doGet()");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hellow World");
 		System.out.println("doPost()");
	}
	//결론
	/*
	 * 1.jsp파일 : HTML파일내에 jsp코드를 넣는것 
	 * 2.servlet파일 : 자바파일이고, 아울러 반드시 매핑을 해서 사용해야 한다.
	 * 
	 */
}
