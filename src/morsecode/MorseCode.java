/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 21, 2020
 * Date last edited: February 22, 2020
 * Program title: SimpleEncryption.java
 * This program will translate a plain text input into
 * Morse code and display the code to the screen.
 */
package morsecode;

import javax.swing.JOptionPane;

public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating dataset for alphanumeric and punctual  
        // chars and their corresponding Morse code
        char[] alphanumeric = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?', '!', ':', '"', '='};
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", "..--.", "---...", ".-..-.", "-...-"};

        // Prompting user for input string
        String input = JOptionPane.showInputDialog("Enter a word/phrase which"
                + " you would like to convert to Morse code");

        // Ignoring lower and uppercase
        String inputLower = input.toLowerCase();

        // Creating Morse code output
        String output = "";
        
        // For every character of input
        for (int i = 0; i < inputLower.length(); i++) {
            // For every character of alphanumeric
            for (int j = 0; j < alphanumeric.length; j++) {
                // Adding corresponding morseCode String to output
                if (alphanumeric[j] == inputLower.charAt(i)) {
                    output += morseCode[j] + " ";
                }
            }
        }

        // Outputting Morse code
        JOptionPane.showMessageDialog(null, "The input: " + input 
                + " translated to Morse code is: " + output);
    }

}
