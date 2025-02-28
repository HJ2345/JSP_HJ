package sec05_exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/choiceDog")
public class ChoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ChoiceServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		String[] number = request.getParameterValues("number");
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<table align='center'>");
		writer.println("<tr>");
		for(int i=0; i<number.length; i++) {
			
			writer.println("<td>");
			writer.println(number[i]);
			writer.println("</td>");
		}
		writer.println("</tr>");
		writer.println("</table>");
		
		writer.println("</body>");
		
		
		writer.println("</html>");
		
	}

}
