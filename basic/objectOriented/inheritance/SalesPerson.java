package basic.objectOriented.inheritance;

public class SalesPerson extends Employee{

    private double commisionPercentage;

    public void raiseCommisionPercentage(){
        if(commisionPercentage<.30){
            this.commisionPercentage=this.commisionPercentage * 1.2;
            System.out.println("Employee "+this.name+" commision is "+this.commisionPercentage);
        }
    }
    public SalesPerson(String name, double salary, int age, double commisionPercentage) {

        super(name, salary, age);
        this.commisionPercentage=commisionPercentage;
    }

    public double getCommisionPercentage() {
        return commisionPercentage;
    }

    public void setCommisionPercentage(double commisionPercentage) {
        this.commisionPercentage = commisionPercentage;
    }
}
