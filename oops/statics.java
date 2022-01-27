//  The static member belongs to the class, not to objects of that class. i.e, when u create a variable static it will be globally constatnt
//  that means if u assigned some value in first object then it will effect the value in 2nd object as well.



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
