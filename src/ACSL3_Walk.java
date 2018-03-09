import org.dalton.Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


@Assignment(assignment = "ACSL3-Walk")
public class ACSL3_Walk {

    /**
     * solve for a specific input
     * @param s the input
     * @return the output
     */
    static String solve(String s) {
        return s;
    }

    public static void main(String[] args) throws IOException {
        //declarations:
        String filein = "testdata";
        String fileout = "testdata-answers";
        Scanner scanin, scanout=null;

        try{
            scanin = new Scanner(new BufferedReader(new FileReader(filein)));
            scanout = new Scanner(new BufferedReader(new FileReader(fileout)));
        } catch(FileNotFoundException e) {
            //switch to regular terminal input
            scanin = new Scanner(System.in);
        }

        //main loop:
        while(scanin.hasNext()) {
            String answer = solve(scanin.nextLine());
            System.out.print(answer);
            System.out.print(scanout!=null && scanout.hasNext()?(answer.equals(scanout.nextLine())?" CORRECT":" INCORRECT"):"");
            System.out.println();
        }

        scanin.close();
        if(scanout!=null) scanout.close();
    }
}