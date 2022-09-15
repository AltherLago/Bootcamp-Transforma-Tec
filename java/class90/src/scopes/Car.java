package scopes;

public class Car{

    private String model;
    
    protected Integer year;

    public Car(String model,
            Integer year){
        this.model = model;
        this.year = year;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setYear(Integer year){
        this.year= year;
    }

    public Integer getYear(){
        return year;
    }

}
