package filehandling;
import java.io.*;
import java.util.*;
public class filecreation
{
    static void main() throws IOException{
        System.out.println("starting my file");
        String path="C:\\Users\\Pulla\\IdeaProjects\\javaethnotech\\src\\filehandling\\test.txt";
        File f=new File(path);
        /*FileWriter fw=new FileWriter(f,true);//this will allow to give space
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hello iam sree ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        bw.write(input);
        bw.close();
        fw.close();
        */

        //file reading
        /*
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
       int Ch;
       int c=0;
       while((Ch=br.read())!=-1){
           System.out.print((char)Ch+" ");
           c++;
       }
        System.out.println("length of the file "+c);
 br.close();
        fr.close();
         */
        //reading code byte by byte
        File f2=new File("C:\\Users\\Pulla\\IdeaProjects\\javaethnotech\\src\\filehandling\\test1.txt");
FileInputStream fis1=new FileInputStream(f);
FileOutputStream fos2=new FileOutputStream(f2);
int ch;
while((ch=fis1.read())!=-1){
    System.out.println((char)ch);
    fos2.write(ch);
        }
fis1.close();
fos2.close();
    }
}
