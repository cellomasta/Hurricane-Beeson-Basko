/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import savethecity.model.Players;
import savethecity.model.Game;
import savetheciy.view.StartProgramView;

/**
 *
 * @author CHRIS
 */
public class SaveTheCity {

    private static Game currentGame = null;
    private static Players player = null;

    public static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SaveTheCity.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SaveTheCity.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SaveTheCity.inFile = inFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SaveTheCity.currentGame = currentGame;
    }

    public static Players getPlayer() {
        return player;
    }

    public static void setPlayer(Players player) {
        SaveTheCity.player = player;
    }

    public static void main(String[] args) throws IOException {
        try {
            SaveTheCity.inFile = new BufferedReader(new InputStreamReader(System.in));
            SaveTheCity.outFile = new PrintWriter(System.out, true);

            //open log file
            String filePath = "log.txt";
            SaveTheCity.logFile = new PrintWriter(filePath);
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
        } catch (Throwable te) {
            te.printStackTrace();
            System.out.println(te.getMessage());
        } finally {
            try {
                if (SaveTheCity.inFile != null) {
                    SaveTheCity.inFile.close();
                }

                if (SaveTheCity.outFile != null) {
                    SaveTheCity.outFile.close();
                }

                if (SaveTheCity.logFile != null) {
                    SaveTheCity.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
}
