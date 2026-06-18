package serialization_and_deserialization.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class main {
   public static void main(String []args) throws IOException {
        seriali s=new seriali(1,"sree");
        s.display();
        String path="C:\\Users\\Pulla\\IdeaProjects\\javaethnotech\\src\\serialization_and_deserialization\\serialization\\file1.txt";
        FileOutputStream fos=new FileOutputStream(path);//writing permission
        ObjectOutputStream oos=new ObjectOutputStream(fos);//converting into bytes
        oos.writeObject(s);
oos.close();
fos.close();
    }
}
