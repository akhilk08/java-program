import java.util.Scanner; 

class Employee { 
    int emp_id; 
    String emp_name;    
    int emp_salary;    
    String address; 

    Employee(int emp_id, String emp_name, int emp_salary, String address) {         
        this.emp_id = emp_id;         
        this.emp_name = emp_name;         
        this.emp_salary = emp_salary; 
        this.address = address; 
    } 
} 

class Teacher extends Employee { 
    String department; 
    String subject; 

    Teacher(int emp_id, String emp_name, int emp_salary, String address, String department, String subject) { 
        super(emp_id, emp_name, emp_salary, address); 
        this.department = department; 
        this.subject = subject; 
    } 

    void display() { 
        System.out.println("Employee id: " + this.emp_id); 
        System.out.println("Employee name: " + this.emp_name); 
        System.out.println("Employee salary: " + this.emp_salary); 
        System.out.println("Employee address: " + this.address); 
        System.out.println("Subject: " + this.subject); 
        System.out.println("Department: " + this.department); 
    } 
} 

public class Inheritance { 
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in); 
        Scanner s = new Scanner(System.in); 

        System.out.println("Enter the number of teachers:");         
        int n = sc.nextInt(); 
        sc.nextLine();  // consume the newline 

        Teacher[] teachers = new Teacher[n]; 

        for (int i = 0; i < n; i++) { 
            System.out.println("Enter the details of teacher " + (i + 1) + ":"); 

            System.out.print("Subject: "); 
            String subject = s.nextLine(); 

            System.out.print("Department: "); 
            String department = s.nextLine(); 

            System.out.print("Employee id: "); 
            int emp_id = sc.nextInt(); 
            sc.nextLine();  // consume the newline 

            System.out.print("Employee name: "); 
            String emp_name = s.nextLine(); 

            System.out.print("Salary: ");             
            int emp_salary = sc.nextInt();             
            sc.nextLine();  // consume the newline 

            System.out.print("Address: "); 
            String address = s.nextLine(); 

            teachers[i] = new Teacher(emp_id, emp_name, emp_salary, address, department, subject); 
        } 

        System.out.print("Enter the employee number to be searched: ");         
        int no = s.nextInt(); 

        boolean found = false;         
        for (Teacher teacher : teachers) {             
            if (teacher.emp_id == no) { 
                found = true;                 
                teacher.display(); 
                break; 
            } 
        } 

        if (!found) { 
            System.out.println("Employee not found"); 
        } 

        sc.close(); 
        s.close(); 
    } 
}
