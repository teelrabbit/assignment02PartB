/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
import java.util.Scanner;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internationalization.
// - ResourceBundle is not required.
// - Other approaches to internationalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

public final class Language {
    //
    // Static Data Fields
    //    
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default
    // create a static varible language here so you can save the user language
    static String user_language;
    static String time_zone;
    // _______________________________________________________________________________
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Language() {
    }
    public Language(String language) {

        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }

    }

    private void populateEnglishPhrases() {
    }

    private void populateYourLanguagePhrases() {
    }

    private void populateSpanishPhrases() {
    }

    private void populateFrenchPhrases() {
    }

    private void populateChinesePhrases() {
    }

    private void populateAlienPhrases() {
    }

    public static void displayAppHeader() {
//    only display the OfficialAppHeader() from config.
        System.out.println(Config.getOfficialAppHeader());

    }

    public static Language setLanguagePreference() {
//      Here you want to prompt the user for the language
//      print Language
//      get userinput
//      save to global user_language
        Scanner myObj = new Scanner(System.in); //taking usr input
        System.out.print("Language: ");
        user_language = myObj.nextLine().toUpperCase(); //lang made


        return new Language();
    }

    public Object getLanguage() {
//        Create a new user_language object and return it
        Object get_lang = this.user_language;
        return get_lang;
    }

    public Object getUniversityPhrase(int i) {
        return Config.getDefaultUniversity();
    }

    public Object getClubPhrase(int i) {
        return Config.getDefaultClub();
    }

    public String getConfigPhrase(int i) {
//         create a switch to retrieve correct phrases
        switch(i){
            case 0: return "-".repeat(70);
            case 1: return "Language: ";
            case 2: return "Time Zone: ";
            case 3: return "Color Sequences: ";
            case 4: return "Standard Output Log: ";
            case 5: return "Standard Error Log:";
            case 6: return "Receipt Log: ";
            case 8: return "Default University: ";
            case 9: return "Default Club: ";
            default: return ""; // work on case 7

//             time zone 
//             color sequences
//             standard output and etc. Refer to example for correct label styling
        }
        //return null;
    }

    public String getGreetingPhrase(int i) {
        return null;
    }

    //
    // Static Methods
    //

    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //

    //
    // Language
    //
}
