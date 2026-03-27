//public class StudentOverloading {
//}

// StudentDetails.java
public class StudentOverloading {

    // Method 1: Display student name
    public void displayInfo(String name) {
        System.out.println("Student Name: " + name);
    }

    // Method 2: Display student name and course (overloaded)
    public void displayInfo(String name, String course) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
    }

    // Method 3: Display name, course, and city (overloaded)
    public void displayInfo(String name, String course, String city) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
        System.out.println("Student City: " + city);
    }

    public static void main(String[] args) {
        StudentOverloading student = new StudentOverloading();

        // Calling different overloaded methods
        student.displayInfo("Alice");

        System.out.println();
        student.displayInfo("Bob", "Computer Science");
        System.out.println();
        student.displayInfo("Charlie", "Mechanical Engineering", "New York");
    }
}
