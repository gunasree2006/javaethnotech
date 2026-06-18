package generics.project;

public class item <T,U,V>{
    T name;
    U digit;
    V boo;
    item(T name,U digit,V boo){
        this.name=name;
        this.digit=digit;
        this.boo=boo;
    }

    public T getName() {
        return name;
    }

    public U getDigit() {
        return digit;
    }

    public V getBoo() {
        return boo;
    }
}
