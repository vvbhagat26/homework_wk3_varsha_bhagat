package homework_week3;

public class Prog14_PersonClass {
     String firstName;
     String lastName;
     int age;

    // Getter method for firstName
    public String getFirstName() {
        return firstName;
    }

    //method for last name
    public String getLastName() {
        return lastName;
    }

    //method for age
    public int getAge() {
        return age;
    }

    //setter method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //method for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //method for age
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    //teen
    public boolean isTeen() {
        return age > 12 && age < 20;
    }
    // Method to get the full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return ""; // Both fields are empty
        } else if (firstName.isEmpty()) {
            return lastName; // Only firstName is empty
        } else if (lastName.isEmpty()) {
            return firstName; // Only lastName is empty
        } else {
            return firstName + " " + lastName; // Both fields have values
        }
    }
    public static void main(String[] args) {
        Prog14_PersonClass person = new Prog14_PersonClass();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("First name: " + person.getFirstName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}







