package objectorientedprogramming.encapsulation;


/* encapsulation is wrapping of data ,methods in a single unit it encapsulate
(objects,class,static final ,access modifiers and all methods */

//implementing the encapsulation with accessmodifiers
//private variable can be access in others classes with getters and setters

 class accessModi{
    public int a=10;
    private int b=20;
    protected int c=25;  // can access outside of the package with using inheritance in that package
    int d=30;
    public int getB(){
        return b;
    }
    public int setB(int b){
        this.b=b;
return b;
    }

}

class access1 extends accessModi {
    void printdata() {
        System.out.println(a);
        System.out.println(getB());
        System.out.println(c);
        System.out.println(d);
    }
}


public class encapwithaccessmodifiers {
       public static void main(String args[]) {
           access1 acc = new access1();
           acc.printdata();

       }
   }
