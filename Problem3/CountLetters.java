package Problem3;

import java.util.Scanner;

public class CountLetters {
public static void main(String[ ] args) {


int[ ] counts = new int[26];

Scanner scan = new Scanner(System.in);

//get word from user

System.out.print("Enter a single word (letters only, please): ");

String word = scan.nextLine( );

//convert to all upper case

word = word.toUpperCase( );

//count frequency of each letter in string
for (int i = 0; i < word.length(); i++) {
    //try-catch block to handle non-letter characters
    try {
        char ch = word.charAt(i);
        counts[ch - 'A']++;
    } catch (ArrayIndexOutOfBoundsException e) {
        char ch = word.charAt(i);
        //if statement to determine if unknown character is a space or not and to print it as "SPACE for ease of reading"
        if (ch == ' ') {
            System.out.println("Not a letter: space");
        }
        else {
            System.out.println("Not a letter: " + ch);
        }
    }
}


//print frequencies

System.out.println( );

for (int i=0; i < counts.length; i++)

if (counts [i] != 0)

System.out.println((char)(i +'A') + ": " + counts[i]);

scan.close();

}}