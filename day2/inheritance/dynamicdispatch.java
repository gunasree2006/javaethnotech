package objectorientedprogramming.inheritance;
/*
Dynamic method dispatch is the process where a call to an overridden method is resolved at runtime
using inheritance and parent reference pointing to child object.
 */
class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class  dynamicdispatch {

    public static void main(String[] args) {

        Vehicle v;          // parent reference

        v = new Car();      // child object
        v.start();          // Car's method called

        v = new Bike();     // another child object
        v.start();          // Bike's method called
    }
}

/*
🧠 Why This Is Dynamic Method Dispatch?
Point	Explanation
Inheritance	Car and Bike extend Vehicle
Overriding	start() method overridden
Reference	Vehicle v
Object	new Car(), new Bike()
Decision time	Runtime

➡ JVM checks object type, not reference type.

        🔹 One-Line Interview Answer

Dynamic method dispatch is the process where a call to an overridden method is resolved at runtime using inheritance and parent reference pointing to child object.

        🔹 Key Notes (Very Important)
Only works with overridden methods
Static methods are NOT dynamically dispatched
Enables runtime polymorphism

*/
/*
Dynamic method dispatch is the process where a call to an overridden method is resolved at runtime using inheritance and parent reference pointing to child object.

🔹 Key Notes (Very Important)
Only works with overridden methods
Static methods are NOT dynamically dispatched
Enables runtime polymorphism
 */