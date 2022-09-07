package classes;

public class Car{

    protected String licensePlate;
    private String model;
    private String brand;
    private Integer year;
    private Integer height;

    public Car(String licensePlate,
               String model,
               String brand,
               Integer year,
               Integer height){

        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.height = height;

               }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public Integer getYear(){
        return year;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    public Integer getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public void getLow(Integer cm){
        this.height = height - cm;
    }

}
