/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.io.PrintWriter;
import savethecity.SaveTheCity;

/**
 *
 * @author forev
 */
public class ErrorView {

    private static final PrintWriter errorfile = SaveTheCity.getOutFile();
    private static final PrintWriter logFile = SaveTheCity.getLogFile();

    public static void display(String className, String errorMessage) {

        errorfile.println(
                "-------------------------------------------------------"
                + "\n - ERROR - Please reenter a value within the parameters given " + errorMessage
                + "\n----------------------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
    }

}
