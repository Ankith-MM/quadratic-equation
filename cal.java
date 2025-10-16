import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int n;
    Student (int n){
        this.n=n;
        credits=new int[n];
        marks=new int[n];
    }

   
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSubject " + (i + 1) + ":");
            System.out.print("Enter Credits: ");
            credits[i] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
    }

 
    int getGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0; 
    }

    
    double calculateSGPA() {
        int totalCredits = 0;
        int totalPoints = 0;

        for (int i = 0; i < n; i++) {
            int gradePoint = getGradePoint(marks[i]);
            totalCredits += credits[i];
            totalPoints += credits[i] * gradePoint;
        }

        return (double) totalPoints / totalCredits;
    }

    void displayDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("USN   : " + usn);
        System.out.println("Name  : " + name);

        System.out.println("\nSubject-wise details:");
        System.out.println("Sub\tCredits\tMarks\tGrade Point");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + credits[i] + "\t" + marks[i] + "\t" + getGradePoint(marks[i]));
        }

        double sgpa = calculateSGPA();
        System.out.printf("\nSGPA: %.2f\n", sgpa);
    }
}

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int n = sc.nextInt();
        Student s1 = new Student(n);
        s1.acceptDetails();
        s1.displayDetails();
    }
}
