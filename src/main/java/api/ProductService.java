package api;

import Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Integer getCountProducts();
    Product getProductByProductName(String productName);
    boolean isProductOnWarehouse(String productName);
    boolean isProductExist(String productName);
    boolean isProductExist(int productId);

}
