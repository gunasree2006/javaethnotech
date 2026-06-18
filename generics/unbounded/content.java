package generics.project;

public class content <T>{
    T name;
    public void setName(T name){
        this.name=name;
    }
public T getName(){
        return name;
    }
}
