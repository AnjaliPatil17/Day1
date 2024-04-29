
public class StringEquality {
    public static void main(String[] args) {
        // Two strings to compare
        String str1 = "Hello";
        String str2 = "hello";

        //using boolean Checking if the strings are equal or not
        boolean compare = str1==str2;
        System.out.println(compare);


        // using if else statement Checking if the strings are equal or not
        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
