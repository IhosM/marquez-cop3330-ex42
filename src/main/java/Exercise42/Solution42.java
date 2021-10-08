/*
 *  UCF COP3330 Fall 2021 Assignment 42 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution42
{
    public static void main(String[] args)

    {
        Solution42 list = new Solution42();
        System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.println("--------------------------");
        list.programOutput("src/main/java/Exercise42/exercise42_input.txt");
    }

    public void programOutput(String filename)
    {
        try
        {
            File infile = new File(filename);
            Scanner scan = new Scanner(infile);

            while (scan.hasNext())
            {
                String str = scan.nextLine();
                String[] temp = str.split(",");
                System.out.printf("%-10s%-10s%-10s\n", temp[0], temp[1], temp[2]);
            }
        }
        catch (FileNotFoundException ex)
        {
                System.out.println("File not located.");
        }
    }
}
