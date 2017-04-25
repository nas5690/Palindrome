import java.util.Scanner;

public class Palindrome
{
   public static boolean isPalindrome(String stringToTest) 
   {
    String workingCopy = removeJunk(stringToTest);
    String reversedCopy = reverse(workingCopy);

    return reversedCopy.equalsIgnoreCase(workingCopy);
   }

  protected static String removeJunk(String string) 
  {
    int i, len = string.length();
    StringBuffer dest = new StringBuffer(len);
    char c;

    for (i = (len - 1); i >= 0; i--) 
    {
      c = string.charAt(i);
      if (Character.isLetterOrDigit(c)) 
      {
        dest.append(c);
      }
    }

    return dest.toString();
  }

  protected static String reverse(String string) 
  {
    StringBuffer sb = new StringBuffer(string);
    return sb.reverse().toString();
  }

  public static void main(String[] args) 
  {
    String string;
    Scanner word = new Scanner(System.in);
    System.out.println("Enter word to see if it is a palindrome: ");
    string = word.next();
    System.out.println("Word entered was: " + string);

    System.out.println();
    System.out.print("Is " + string + " a palindrome?");
    System.out.println();

    if (isPalindrome(string)) 
    {
      System.out.println("Yes, it IS a palindrome.");
    } 
    else 
    {
      System.out.println("No, it is NOT a palindrome!");
    }
  }
}
