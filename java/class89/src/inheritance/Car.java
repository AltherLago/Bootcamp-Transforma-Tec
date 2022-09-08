package inheritance;

public class Car extends Vehicle{

    private String color;
    private Double price;

    public Car(String model,
               String brand,
               String color,
               Double price){

        super(model, brand);

        this.color = color;
        this.price = price;
    
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    
    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

}
