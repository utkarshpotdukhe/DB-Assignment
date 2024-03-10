import java.sql.Timestamp;

public class Product {
    private int id;
    private String name;
    private String description;
    private String sku;
    private double price;
    private int categoryId;
    private int inventoryId;
    private int discountId;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private Timestamp deletedAt;

    public Product(int id, String name, String description, String sku, double price, int categoryId, int inventoryId, int discountId, Timestamp createdAt, Timestamp modifiedAt, Timestamp deletedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sku = sku;
        this.price = price;
        this.categoryId = categoryId;
        this.inventoryId = inventoryId;
        this.discountId = discountId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.deletedAt = deletedAt;
    }

    // Getters and setters for the fields, if needed
}
