package objectorientedprogramming.abstraction;
// abstraction is used when we need implement all child class and there is no way to exectes the child
//in abstraction all child classes should need not  to implement all the methods in parent
// we can skip some methods for some child classes so that this is not fully abstracted
//abstract method does not have any body
//the extend class it means child class should contain the abstract methods which are in a parent abstract class.

abstract class vehicles{
    void buy()

    {
        System.out.print("need to buy vehilcle");
    }
    void testing(){
        System.out.print("some vehicles need to test");
    }
    abstract void price(); //this is abstract method
}
abstract class car  extends vehicles{
    void buy(){
        System.out.println("buy the fortune car");
    }
    void testing(){
        System.out.println("testing car mileage is 6km per litre ");
    }
    void price(){
        System.out.println("car pice is 50000");
    }
}
abstract class bicycle extends vehicles{
    void buy(){
        System.out.println("buy the bicycle");
    }

    void price(){
        System.out.print("car pice is 50000");
    }
}
public class vehicle {
    public static void main(String args[]) {
        vehicles v1 = new car() {
        };
        vehicles v2=new bicycle() {

        };

    v1.buy();
    v1.price();
    v1.testing();
v2.buy();
v2.price();

        }
    }
//if there is a protected and private modifiers before methods no need to access in subclass or extend class.
//we cant create objects from abstract class in a main method.
/*we can create the constructors inside a abstract class,but dont give abstract constructorname , for
methods you should give abstract methodname; */
/* If the child class is also an abstract class then it is not neccessary to access all abstract
   methods which are in abstract parent class */
/* Draw back if the two abstract classes one parent and other child if child doesnot contain any method
   in parent but it has own abstract methods then the compiler doesnot rise any error. */