package Lab5;

public class Program17 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = new String("Welcome to WTA Lab");

        System.out.println("String 1: " + s1);
        System.out.println("String 1 length: " + s1.length() + "\n");

        System.out.println("String 2: " + s2);
        System.out.println("String 2 length: " + s2.length() + "\n");

        System.out.println("String comparison function");

        if((s1.compareTo(s2)) == 0)
            System.out.println("String1 is equal to String2\n");
        else
            System.out.println("String1 is not Equal to String2\n");

        System.out.println("String Concatenation function");
        System.out.println(s1.concat(s2) + "\n");

        String s3 = "       Hello World " + "\n" + "Second Line text";
        System.out.println("String Trim function");
        System.out.println("Source String: " + s3);
        System.out.println("Result String: " + s3.trim() + "\n");

        System.out.println("String Lower case & Upper Case function");
        System.out.println("Source String: " + s1);
        System.out.println("String in Uppercase: " + s1.toUpperCase());
        System.out.println("String in Lowercase: " + s1.toLowerCase() + "\n");

        System.out.println("String Empty function");
        if(s1.isEmpty())
            System.out.println("String1 is Empty");
        else
            System.out.println("String1 is not Empty");

        System.out.println("\n\nChar at function");
        System.out.println("Source String: " + s1);
        System.out.println("Char at 3: " + s1.charAt(3) + "\n");

        char[] arr = new char[10];
        System.out.println("Get Chars function");
        System.out.println("Source String: " + s1);
        s1.getChars(6,11,arr,0);
        System.out.print("Get Chars from 6 to 11: ");
        for(char c:arr)
            System.out.print(c);

        System.out.println("\n\nTo Char Array function");
        System.out.println("Source String: " + s1);
        char[] dest = s1.toCharArray();
        for(char c:dest)
            System.out.print(c + " ");

        System.out.println("\n\nSubstring function");
        System.out.println("Source String: " + s1);
        System.out.println("Substring from 6 to 10: " + s1.substring(6,11) + "\n");

        System.out.println("String replace function");
        System.out.println("Source String: " + s1);
        System.out.println("Replacing l with $: " + s1.replace('l','$'));
    }
}
