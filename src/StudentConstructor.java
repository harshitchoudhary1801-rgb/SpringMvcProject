//public class StudentConstructor {
//}

// StudentDetails.java
public class StudentConstructor {
    // Instance variables
    String name;
    int age;
    String course;

    // Constructor
    public StudentConstructor(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects using constructor
        StudentConstructor student1 = new StudentConstructor("Alice", 20, "Computer Science");
        StudentConstructor student2 = new StudentConstructor("Bob", 22, "Mechanical Engineering");

        // Displaying details
        student1.displayDetails();
        System.out.println(); // Blank line
        student2.displayDetails();
    }
}













