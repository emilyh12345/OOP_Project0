// Emily Haller CSCI 212-11E
package Project0.java;

import javax.swing.JOptionPane;

public class Project0 {
  public static void main(String[] args) {
    //initialize two variables to keep track of number of upper case e's and lower case e's
    int upperCaseECounter = 0; 
    int lowerCaseECounter = 0; 
    //create a string variable that will store the sentence the user will enter
    String inputWords; 
    //display message box to user to allow user to enter a sentence which is stored as inputWords variable
    inputWords = JOptionPane.showInputDialog(null, "Type in a sentence: "); 
    
    //loops through the program until user enters stop
    while(!inputWords.equalsIgnoreCase("STOP")){ 
        //traversing the string array to examine each letter until the end of the sentence
        for (int i = 0; i < inputWords.length(); i++){ 
            //checks if the character at each position in the array is a lower case e to keep track of lower case e counter
            if (inputWords.charAt(i) == 'e') lowerCaseECounter++; 
            //checks if the character at each position in the array is an upper case e to keep track of upper case e counter
            if (inputWords.charAt(i) == 'E') upperCaseECounter++; 
        }
        //display message to user to tell them the counter results
        JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowerCaseECounter + "\nNumber of upper case e's: " + upperCaseECounter); 
        //display new message box to user again to allow user to enter another sentence which will be stored as the new inputWords variable
        inputWords = JOptionPane.showInputDialog(null, "Type in a sentence: "); 
        //initialize counters to 0 again to restart the upper case and lower case count for users new input
        upperCaseECounter = 0; 
        lowerCaseECounter = 0;
    }
  }
}