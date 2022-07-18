import beans.Product;
import daos.DaoFactory;
import daos.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowProductsServlet", urlPatterns = "/products")
public class ShowProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Products productsDao = DaoFactory.getProductsDao();
        List<Product> products = productsDao.all();
        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/products/index.jsp").forward(req, resp);
    }
}
