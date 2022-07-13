import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    private int count;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String reset = req.getParameter("reset");

        if (reset == null) {
            count++;
        } else {
            count = 0;
            res.sendRedirect("/count");
        }
        res.setContentType("text/html");
        // prints to client/browser
        PrintWriter out = res.getWriter();
        // prints to console
        System.out.println("Hello!");
        out.println("<h1>The page count is: " + count);
    }
}
