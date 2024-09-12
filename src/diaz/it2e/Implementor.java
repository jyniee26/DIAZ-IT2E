package diaz.it2e;

public class Implementor {
    
    int id, serviceHours;
    String name, status;
    double gpa, annualIncome;
    
    public void addApplication(int id, String name, double gpa, double income, int hours, String stats){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.annualIncome = income;
        this.serviceHours = hours;
        this.status = stats;
    }
    
    public void viewApplication(){
        System.out.printf("%-5d %-5s %-5.1f %-10.1f %-5d %-10s\n",id, name, gpa, annualIncome, serviceHours, status);
    }
}
