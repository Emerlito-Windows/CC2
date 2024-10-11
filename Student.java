// Define the Student class
public class Student {

    // Private attributes to demonstrate encapsulation
    private String studentID;
    private String name;
    private int age;
    private double gpa;

    // Constructor to initialize student attributes
    public Student(String studentID, String name, int age, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter for studentID
    public String getStudentID() {
        return studentID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for gpa
    public double getGpa() {
        return gpa;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Setter for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("----------------------------");
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create two Student objects using the constructor
        Student student1 = new Student("S333", "Juan Dela Cruz", 19, 3.5);
        Student student2 = new Student("S462", "Maria Mendoza", 18, 3.2);

        // Display details of both students using the displayStudentDetails method
        System.out.println("Details of Student 1:");
        student1.displayStudentDetails();

        System.out.println("Details of Student 2:");
        student2.displayStudentDetails();

        // Update GPA and age of the first student using setter methods
        student1.setGpa(3.9);
        student1.setAge(21);
        
        student2.setGpa(3.7);
        student2.setAge(20);

        // Display the updated details of student1
        System.out.println("Updated Details of Student 1:");
        student1.displayStudentDetails();

        System.out.println("Updated Details of Student 2:");
        student2.displayStudentDetails();
    }
}
