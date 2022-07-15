import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String address = req.getParameter("address");
        String[] toppings = req.getParameterValues("toppings");

        PrintWriter out = resp.getWriter();
        out.println(crust);
        out.println(sauce);
        out.println(size);
        if (toppings != null) {
            for (String topping : toppings) {
                out.println(topping);
            }
        }
        out.println(address);

    }
}
