public class Product {
    private int id;
    private String productName;
    private int price;
    private int weight;
    private String color;
    private int productCount;

    public Product(int id ,int price, int weight,int productCount, String productName,String color){
        this.color = color;
        this.id = id;
        this.price = price;
        this.productCount = productCount;
        this.productName = productName;
        this.weight = weight;
    }
    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public int getWeight(){
        return weight;
    }
    public int getProductCount(){
        return productCount;
    }
    public String getProductName(){
        return productName;
    }
    public String getColor(){
        return color;
    }


    public void setPrice(int price){
        this.price = price;
    }
    public void setProductCount(int productCount){
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
