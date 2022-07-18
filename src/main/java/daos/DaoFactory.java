package daos;

public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProductsDAO();
        }
        return productsDao;
    }
}
