package id.list;

public class PalindromeTest {
    public static void main(String[] args) {

        String originalText = "ABA";
        String reverseWord = "";

        for(int i = originalText.length()-1; i >= 0; i--) {
            reverseWord = reverseWord + originalText.charAt(i);
        }

        if(originalText.equalsIgnoreCase(reverseWord)) {
            System.out.println("Yes, this is palindrome");
        }else{
            System.out.println("No, this is not palinrome");
        }

    }

}
