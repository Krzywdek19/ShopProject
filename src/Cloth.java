public class Cloth extends Product{
    private String size;
    private String material;

    public Cloth(int id, int price, int weight, int productCount, String productName, String color ,String size,String material) {
        super(id, price, weight, productCount, productName, color);
        this.size = size;
        this.material = material;
    }
    public String getSize(){
        return size;
    }
    public String getMaterial(){
        return  material;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
