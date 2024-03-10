import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/db_assignment";
    private static final String username = "root";
    private static final String password = "12345";

    public static List<Product> getProducts() throws SQLException, ClassNotFoundException {
        Class.forName(driverClassName);
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Product");
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String description = resultSet.getString("description");
            String sku = resultSet.getString("sku");
            double price = resultSet.getDouble("price");
            int categoryId = resultSet.getInt("category_id");
            int inventoryId = resultSet.getInt("inventory_id");
            int discountId = resultSet.getInt("discount_id");
            Timestamp createdAt = resultSet.getTimestamp("created_at");
            Timestamp modifiedAt = resultSet.getTimestamp("modified_at");
            Timestamp deletedAt = resultSet.getTimestamp("deleted_at");
            Product product = new Product(id, name, description, sku, price, categoryId, inventoryId, discountId, createdAt, modifiedAt, deletedAt);
            products.add(product);
        }
        resultSet.close();
        statement.close();
        connection.close();
        return products;
    }
}
