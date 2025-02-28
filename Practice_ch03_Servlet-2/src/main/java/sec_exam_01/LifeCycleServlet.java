package sec_exam_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LC")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycleServlet() {
    	System.out.println("생성자 호출");
    }
    
    //init()는 ctrl+space로 직접코딩
    //최초 한번
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 호출");
	}
	
	//destroy()는 ctrl+space로 직접코딩
	//서버 중지시 호출
	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}
}
