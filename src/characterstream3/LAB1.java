
package characterstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB1 { //how to use stream
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt"); //create file data.txt and name Stream = output
            output.write("Hello World!");
            output.write(" Welcome to Java"); //write in stream but not harddisk (dont show in file yet)
            output.close(); //!!!
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileReader input = new FileReader("data.txt"); //connect file data.txt
            int ch;
            while((ch = input.read())!=-1){ //read lot of character have to create variable
                System.out.print((char)ch); //cast int to character
                }
            
            } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
