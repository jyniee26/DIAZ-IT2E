package diaz.it2e;
import java.util.Scanner;

public class Execution {
    public void inputApplication(){
        Scanner sc = new Scanner(System.in);
        Implementor[] imp = new Implementor[100];
        
        System.out.print("Enter number of Applications: ");
        int app = sc.nextInt();
        
        for(int i = 0; i < app; i++){
            System.out.println("Enter details of application "+(i+1)+":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            System.out.print("Annual Family Income: ");
            double income = sc.nextDouble();
            System.out.print("Community Service Hours: ");
            int hours = sc.nextInt();
            
            String status = (!((gpa <= 3.5) && (income < 400000) && (hours >= 50))) ? "Denied" : "Approved";
            
            imp[i] = new Implementor();
            imp[i].addApplication(id, name, gpa, income, hours, status);
        }
        
        System.out.printf("%-5s %-5s %-5s %-10s %-5s %-10s\n","ID", "Name", "GPA", "Annual Income", "Service Hours", "Eligibility");
        
        for(int i = 0; i < app; i++){
            imp[i].viewApplication();
        }
    }
}
