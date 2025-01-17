import java.util.Scanner;

class Palindrome{
    String text;

    // constructor to initialize string
    public Palindrome(String text){
        this.text = text;
    }

    // check palindrome condition
    public boolean isPalindrome(){
        // initialize index variable start and end
        int start = 0;
        int end = text.length()-1;

        while(start <= end){
            if(text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input text
        String text = sc.next();

        // creating an object
        Palindrome palindrome = new Palindrome(text);

        // print whether the string is palindrome or not
        System.out.println("Is the given text palindrome? " + palindrome.isPalindrome());
    }
}
