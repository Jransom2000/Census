package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Census Class
 * @author Jon Ransom
 * @version 1.0
 */

public class Census {
    public static Surname[] loadCensusData(String fname) {
        int line = 0; // Keep track of lines of file we've read
        Surname[] namelist = new Surname[100];
        String censusData[];

        // TODO - Add code to read file and populate array of Surname objects

        /**
         *  try catch block for exceptions with while loop
         */
        int i = 0 ;
        try {
            Scanner inputFile = new Scanner (new File(fname));
            String content = inputFile.nextLine ();

            while (inputFile.hasNext() && line < 100)
            {

                content = inputFile.nextLine();

                censusData = content.split(",");
                try {
                    int rank = Integer.parseInt(censusData[1]);
                    int count = Integer.parseInt(censusData[2]);
                    double proportion = Double.parseDouble(censusData[3]);
                    Surname sn = new Surname (censusData[0], rank , count , proportion);
                    namelist [i] = sn;
                    line++ ;
                    i++;
                }
                catch(NumberFormatException nfe){
                    System.out.println("Data was not in the correct format");
                    return null;
                }

            }

        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("The file you specified could not be found");
        }



        return namelist;

    }
}