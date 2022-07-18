import beans.Product;
import daos.DaoFactory;
import daos.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddProductServlet", urlPatterns = "/products/add")
public class AddProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Products productsDao = DaoFactory.getProductsDao();
        productsDao.insert(new Product(4, "SNK Neo Geo Pocket Color", 69.95));
        resp.sendRedirect("/products");
    }
}
