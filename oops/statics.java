//  The static member belongs to the class, not to objects of that class. i.e, when u create a variable static it will be globally constatnt
//  that means if u assigned some value in first object then it will effect the value in 2nd object as well.

// The static keyword is a non-access modifier in Java that is applicable for the following: 

// Blocks
// Variables
// Methods
// Classes

// *******************static variables***************************

package oops;

public class MainClass {

    public static void main(String[] args) {
        System.out.print("Hello I'm Monst!");
        person p1 = new person();
        p1.name = "ram";
        person.count = 1;

        person p2 = new person();
        p2.name = "again ram";
        p2.print();
    }
}

class person {
    String name;
    static int count;

    void print() {
        System.out.println("Aur loading " + name + " " + count);
    }
}
//Output --> Aur loading again ram 1 

// **********static block***********
// If you need to do the computation in order to initialize your static variables,
// you can declare a static block that gets executed exactly once, when the class is first loaded. 

  
class Test
{
    // static variable
    static int a = 10;
    static int b;
      
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
  
    public static void main(String[] args)
    {
       System.out.println("from main");
       System.out.println("Value of a : "+a);
       System.out.println("Value of b : "+b);
    }
}
// Output:-->
// Static block initialized.
// from main
// Value of a : 10
// Value of b : 40

// *********static method************
// Use the static variable for the property that is common to all objects.
//     For example, in class Student, all students share the same college name. Use static methods for changing static variables.

// Student class
class Student {
    String name;
    int rollNo;
  
    // static variable
    static String cllgName;
  
    // static counter to set unique roll no
    static int counter = 0;
  
    public Student(String name)
    {
        this.name = name;
  
        this.rollNo = setRollNo();
    }
  
    // getting unique rollNo
    // through static variable(counter)
    static int setRollNo()
    {
        counter++;
        return counter;
    }
  
    // static method
    static void setCllg(String name) { cllgName = name; }
  
    // instance method
    void getStudentInfo()
    {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
  
        // accessing static variable
        System.out.println("cllgName : " + cllgName);
    }
}
  
// Driver class
public class StaticDemo {
    public static void main(String[] args)
    {
        // calling static method
        // without instantiating Student class
        Student.setCllg("XYZ");
  
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
  
        s1.getStudentInfo();
        s2.getStudentInfo();
    }
}

// ********nested class*******
package oops;

public class MainClass {

    public static void main(String[] args) {
        System.out.print("Hello I'm Monst!");
        // person p1 = new person();
        person.inner p2 = new person().new inner();
        p2.move();
        person.Demo p1 = new person.Demo();
        p1.move2();
    }
}

class person {
    String name;
    static int count;

    static class Demo {
        // inner static class can acess outer static variable and can't access outer non
        // static variable
        void move2() {
            System.out.println("nahi chalra");
        }
    }

    class inner {
        int a, b;

        void move() {
            System.out.println("chalra");
        }
    }

    void print() {
        System.out.println("Aur lodu " + name + " " + count);
    }
}
