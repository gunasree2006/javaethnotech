package objectorientedprogramming.inheritance;
// Parent interface
interface Parent {
    void msg1();
}

// Child interface
interface Child {
    void msg2();
}

// Implementing multiple interfaces
class SecondChild implements Parent, Child {

    public void msg1() {
        System.out.println("this is the first msg of second class");
    }

    public void msg2() {
        System.out.println("this is the second msg of second class");
    }
}

// Main class
class multipleinheritance  {
    public static void main(String[] args){
        SecondChild sc = new SecondChild();

        sc.msg1(); // method call
        sc.msg2(); // method call
    }
}


