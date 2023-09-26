public class Palindrome {

    public static void main(String[] args) {
	for (int i=0; i < args.length; i++) {
	    String s = args[i];
	    System.out.println("Input: " + s);
            System.out.println("Reversed: " + reverseString(s));
            System.out.println("Is Palindrome: " + isPalindrome(s));
            System.out.println("-------------------------------");
	}
    }
    
//create method
    public static String reverseString(String s) {
      StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    
    }
//create another method
    public static boolean isPalindrome(String s) {
    	String reversed = reverseString(s);
        return s.equalsIgnoreCase(reversed);
    }
    

}
