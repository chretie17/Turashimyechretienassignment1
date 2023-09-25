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
        // Predefined username and password
        String validUsername = "chretien";
        String validPassword = "chretien";

        // User-entered username and password
        String enteredUsername = request.getParameter("username");
        String enteredPassword = request.getParameter("password");

        if (validUsername.equals(enteredUsername) && validPassword.equals(enteredPassword)) {
            // Authentication successful, redirect to a secured page
            response.sendRedirect("secured_page.jsp");
        } else {
            // Authentication failed, check if it's a "Forget Password" request
            String forgetPassword = request.getParameter("forgetPassword");
            if ("true".equals(forgetPassword)) {
                // Redirect to the "Forget Password" page (forgot.html)
                response.sendRedirect("forgot.html");
            } else {
                // Authentication failed, stay on the login page (login.html)
                response.sendRedirect("login.html");
            }
        }
    }
}
