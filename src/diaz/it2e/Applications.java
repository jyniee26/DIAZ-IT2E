package diaz.it2e;

public class Applications {
    int id, serviceHours;
    String name;
    double gpa, annualIncome;
    
    public void addApplication(int id, String name, double gpa, double income, int hours){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.annualIncome = income;
        this.serviceHours = hours;
    }
    
    public void viewApplication(){
        System.out.printf("%-5d %-5s %-5.1f %-10.1f %-5d",id, name, gpa, annualIncome, serviceHours, stats);
}
