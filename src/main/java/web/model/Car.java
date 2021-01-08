package web.model;

public class Car {

    private String model;
    private String passport;
    private Integer cost;

    public Car() {}

    public Car(String model, String passport, Integer cost){
        this.model = model;
        this.passport = passport;
        this.cost = cost;
    }

    public String getModel() { return model;}
    public void setModel(String model) { this.model = model; }

    public String getPassport() { return passport; }
    public void setPassport(String passport) { this.passport = passport; }

    public Integer getCost() { return cost; }
    public void setCost(Integer cost) { this.cost = cost; }
}
