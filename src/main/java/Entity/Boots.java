package Entity;

public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;
    public Boots(int id ,int price, int weight,int productCount, String productName,String color,int size,boolean isNaturalSkin){
        super(id, price, weight, productCount, productName, color);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }



    public int getSize(){
        return size;
    }
    public boolean getIsNaturalSkin(){
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return "Entity.Boots{" +
                "size=" + size +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
