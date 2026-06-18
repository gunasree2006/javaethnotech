package serialization_and_deserialization.serialization;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.ObjectInputStream;

public class deserial {
    static void main() throws IOException ,ClassNotFoundException{
        String path="C:\\Users\\Pulla\\IdeaProjects\\javaethnotech\\src\\serialization_and_deserialization\\serialization\\file1.txt";
        FileInputStream fis=new FileInputStream(path); //contain byte data
        ObjectInputStream ois=new ObjectInputStream(fis);//converts the byte data to object data
        seriali s=(seriali) ois.readObject(); //object data stored in seriali.java class
        s.display();
        ois.close();
        fis.close();
    }
}
