package generics.project;

public class main {
    public static void main(String args[]){
        content<String> c=new content<>();
        c.setName("Guna");
        System.out.println(c.getName());
        item <String,Double,Boolean> i=new item<>("apple",12.0,true);
        System.out.println(i.getName()+" "+i.getDigit()+" "+i.getBoo());
    }
}
