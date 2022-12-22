public class IfThenElse {
    public static void main (String[] args) {
        // Compare integer value
        int testValue = 1;

        // We don't change the variable in this example,
        // but here could be some code to define this variable.

        if (testValue <= 1) {
            System.out.println("The value is 1 or smaller");
        } else if (testValue == 2) {
            System.out.println("The value is 2");
        } else {
            System.out.println("The value is " + testValue);
        }

        // Compare strings
        String string1 = "Hello world";
        String string2 = "Hello" + " " + "world";
        String string3 = "Hello World";

        System.out.println("Are string1 and string2 equal? "
                + string1.equals(string2));
        System.out.println("Are string1 and string3 equal? "
                + string1.equals(string3));
        System.out.println("Are string1 and string3 equal ignoring the case? "
                + string1.equalsIgnoreCase(string3));

        if (string1.equalsIgnoreCase(string3)) {
            System.out.println("string1 and string3 are equal ignoring the case");
        }
    }
}