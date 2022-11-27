package Day5program;

import java.util.Scanner;

public class VowelOrConsonant {
        public static void main(String[] args) {
            System.out.print("Enter the Alphabet: "+"\n");
            char alphabet;
            Scanner scan = new Scanner(System.in);
            alphabet = scan.next().charAt(0);
            scan.close();
            getVowelOrConsonant(alphabet);
        }
        public static void getVowelOrConsonant(char ch)
        {
            switch (ch) {
                //check lower case vowel letters
                case 'a':

                case 'e':

                case 'i':

                case 'o':

                case 'u':

                    //check upper case vowel letters
                case 'A':

                case 'E':

                case 'I':

                case 'O':

                case 'U':
                    System.out.println(ch + " is a vowel");
                    break;

                default:
                    if ((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
                        System.out.println(ch + " is a consonant");
                    } else {
                        System.out.println(ch + " is not a Alphabet");
                    }
                    break;
            }
        }
}
