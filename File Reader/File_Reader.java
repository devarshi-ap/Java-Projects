/*
*
*  @author dev
*  @since 2020-08-09
*
*  Program with instructions on how to read files using a File Class instance
*
*/

import java.io.File;
import java.util.Scanner;                 //to read file
import java.io.FileNotFoundException;     // to avoid error thrown & "throws FileNotFoundException" beside main class


public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        /*
        sample txt file url: http://textfiles.com/100/captmidn.txt
            save as file
                add file path [file properties/location] into [new File ("");]
        */


        File file = new File("/Users/Amit/Desktop/captmidn.txt");
        Scanner scan = new Scanner(file);


        //reads through the txt file line by line and prints it
        //until scan.hasNextLine() is false
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

        scan.close();
    }
}
