import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class newcrud extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String validUsername = "chretien";
        String validPassword = "chretien";

        String enteredUsername = request.getParameter("username");
        String enteredPassword = request.getParameter("password");
try {
    if (validUsername.equals(enteredUsername) && validPassword.equals(enteredPassword)) {
        response.sendRedirect("forgot.html");
    } else {
        String forgetPassword = request.getParameter("forgetPassword");
        if ("true".equals(forgetPassword)) {
            response.sendRedirect("forgot.html");
            response.sendRedirect("login.html");
        }
    }
}
  

 catch (Exception e) {
	// TODO: handle exception
}

    }
}

    
