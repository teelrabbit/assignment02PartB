/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.awt.datatransfer.Clipboard;
import java.util.Scanner;

public final class ChatSession {

    //  Static Data Fields

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public ChatSession() {
    }

    public ChatSession(Club club, University university) {
    }

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    private void startChatSession() {
    }
    private void connectChatters() {
    }
    private void chat() {
    }
    private void runQuiz() {
    }
    private void stopChatSession() {
    }


    public void runChatSession() {
        System.out.println("2021/06/06 02:04:11 [0228 ms] PM PDT - Chat session started.");
        System.out.println("\nSF Giants: Welcome to the SAN FRANCISCO GIANTS!");
        System.out.println("-".repeat(70));
        //eeeeSystem.out.println(Config.getDefaultClub());
        System.out.printf("%-25s %-50s %n", getPhrase(10), Config.getDefaultClub());
        System.out.printf("%-25s %-50s %n", getPhrase(11), Club.Short_name);
        System.out.printf("%-25s %-50s %n", getPhrase(12), Club.Established);
        System.out.printf("%-25s %-50s %n", getPhrase(13), Color.Colors);
        System.out.printf("%-25s %-50s %n", getPhrase(14), Club.Ballpark);
        System.out.printf("%-25s %-50s %n", getPhrase(15), Club.World_series_titles);
        System.out.printf("%-25s %-50s %n", getPhrase(16), Club.NL_Pennants);
        System.out.printf("%-25s %-50s %n", getPhrase(17), Club.Division_titles);
        System.out.printf("%-25s %-50s %n", getPhrase(18), Club.Wild_cards);
        System.out.printf("%-25s %-50s %n", getPhrase(19), OwnerGroup.Owners);
        System.out.printf("%-25s %-50s %n", getPhrase(20), President.President);
        System.out.printf("%-25s %-50s %n", getPhrase(21), GeneralManager.Gen_manager);
        System.out.printf("%-25s %-50s %n", getPhrase(22), Manager.Manager);
        System.out.println("-".repeat(70));

        Scanner myObj = new Scanner(System.in); //taking usr input
        System.out.print("SF Giants: Your first name and last name, please: ");
         String user_name = myObj.nextLine().toUpperCase();

        Scanner myObj_2 = new Scanner(System.in); //taking usr input
        System.out.print("SF Giants: Your school email address, please: ");
        String user_mail = myObj.nextLine().toUpperCase();

        System.out.println(user_name + ": Welcome to my university!");
        System.out.println("-".repeat(70));
        System.out.println("\nSF Giants: Thank you. We are connecting you with our player...\n. . . . .");
        System.out.println("-".repeat(70));

        System.out.printf("%-25s %-50s %n", getPhrase(35), Player.player_Buaster);
        System.out.printf("%-25s %-50s %n", getPhrase(36), Club.Club);
        System.out.printf("%-25s %-50s %n", getPhrase(37), "ghrrr");
        System.out.printf("%-25s %-50s %n", getPhrase(38), GeneralManager.Gen_manager);
        System.out.printf("%-25s %-50s %n", getPhrase(39), GeneralManager.Gen_manager);
        System.out.printf("%-25s %-50s %n", getPhrase(40), GeneralManager.Gen_manager);
        System.out.printf("%-25s %-50s %n", getPhrase(41), GeneralManager.Gen_manager);
        System.out.println("-".repeat(70));

        /*




        static String Colors = "Orange, Black, Gold, Cream";
        static String Ballpark = "Oracle Park";
        static String World_series_titles = "8";
        static String NL_Pennants = "23";
        static String Division_titles = "8";
        static String Wild_cards = "3";
        static String Owners = "San Francisco Baseball Associates LLC";
        static String President = "Farhan Zaidi";
        static String Gen_manager = "Scott Harris";
        static String Manager = "Gabe Kapler";
        */
    }
    private String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getConfigPhrase(i);
    }

    //
    // Language
    //
}