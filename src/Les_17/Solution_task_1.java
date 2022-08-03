package Les_17;

import java.util.Scanner;

public class Solution_task_1 {
    public static void main(String[] args) {
        String str, letter;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string - ");
        str = in.nextLine();
        System.out.print("Enter the letter you are looking for - ");
        letter = in.nextLine();
        in.close();
        char[] ch_letter = letter.toCharArray();
        if (letter.length() != 1) {
            System.out.println("Non-letter entered");
            System.exit(1);
        }
        else if (ch_letter[0]>=65 && ch_letter[0]<=90 || ch_letter[0]>=97 && ch_letter[0]<=122) {
            char[] char_str = str.toCharArray();
            for (int i = 0; i < char_str.length; i++)
                if(ch_letter[0] == char_str[i])
                    count++;
            System.out.println("Letter '" + ch_letter[0] + "' found in string = " + count);
        }
        else
            System.out.println("Invalid letter entered");
    }
}
