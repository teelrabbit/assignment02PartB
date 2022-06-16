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

    //
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
        System.out.println("debug test ");
        //Greeting.generateSFGiantsCard();getLanguage
        System.out.println(Config.getOfficialAppHeader());
        //Language(lang);
        System.out.println("Language: " + Config.getDefaultLanguage());
        System.out.println("Time Zone: " + Config.getDefaultTimeZone());

        Scanner myObj = new Scanner(System.in); //taking usr input
        System.out.print("Enter Language: ");
        String lang = myObj.nextLine(); //lang made

    }

    public static Language setLanguagePreference() {
        return new Language();
    }

    public Object getLanguage() {

        return new Language();
    }

    public Object getUniversityPhrase(int i) {
        return null;
    }

    public Object getClubPhrase(int i) {
        return null;
    }

    public String getConfigPhrase(int i) {
        return "1";
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