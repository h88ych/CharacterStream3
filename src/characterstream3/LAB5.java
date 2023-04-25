package characterstream3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {
    public static void main(String[] args) {
        
            InputStreamReader In = new InputStreamReader(System.in); //input
            BufferedReader input = new BufferedReader(In);
            
        try {
            System.out.print("Enter text = ");
            String name = input.readLine();
            System.out.println(name);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String kp = input.readLine();
            System.out.println(kp);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    } 
//            int age = (int) input.readLine();
//            System.out.println(age); //cant cast String to int

}
