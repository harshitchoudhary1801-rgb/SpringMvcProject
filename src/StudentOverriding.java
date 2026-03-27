//public class StudentOverriding {
//}

// StudentDetails.java
// Superclass
class StudentDetails {

    public void m1(int a) {
        System.out.println("inside parent");

    }
}

// Subclass
class AdvancedStudent extends StudentDetails {

    // Overriding the displayInfo method
    @Override
    public void m1(int a) {
        System.out.println("inside child");
    }
}

// Main class
public class StudentOverriding {
    public static void main(String[] args) {
        // Using superclass
//        StudentDetails student1 = new StudentDetails();
//        student1.m1(12);


//        AdvancedStudent student2 = new AdvancedStudent();
//        student2.m1(13); // Calls overridden method

        //child class
        AdvancedStudent student2 = new AdvancedStudent();
        student2.m1(13); // Calls overridden method
    }
}
