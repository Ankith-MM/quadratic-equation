
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    int[] hoursWorked;
    int[] hourlyRate;
    int n;

    Employee(int n) {
        this.n = n;
        hoursWorked = new int[n];
        hourlyRate = new int[n];
    }
void details(Scanner sc) {
    System.out.println("Enter the Employee details:");
    System.out.print("Enter the Employee ID: ");
    empId = sc.nextInt();
    sc.nextLine(); 

    System.out.print("Enter the Employee Name: ");
    empName = sc.nextLine();

    for (int i = 0; i < n; i++) {
        System.out.print("Day " + (i + 1) + " - Working Hours: ");
        hoursWorked[i] = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Day " + (i + 1) + " - Hourly Rate: ");
        hourlyRate[i] = sc.nextInt();
        sc.nextLine(); 
    }
}


    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + " - Hours Worked: " + hoursWorked[i] + ", Hourly Rate: " + hourlyRate[i]);
        }
    }

    double calculateSalary() {
        double totalSalary = 0;
        for (int i = 0; i < n; i++) {
            totalSalary += hoursWorked[i] * hourlyRate[i];
        }
        return totalSalary;
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many days did the employee work? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Employee e = new Employee(n);
        e.details(sc);
        e.display();

        double salary = e.calculateSalary();
        if (salary == 0) {
            System.out.println("Employee was absent all the days.");
        } else {
            System.out.println("Total Salary: ₹" + salary);
        }

        sc.close();
    }
}
