public class EnumSwitch {
    public static void main (String[] args) {
        // Define value based on an enum
        TEST_OPTIONS option = TEST_OPTIONS.TYPE_2;

        // Compare the value with the available options
        switch(option) {
            case TYPE_1:
                System.out.println("Do something specific for Type 1");
                break;
            case TYPE_2:
                System.out.println("Do something specific for Type 2");
                break;
            case TYPE_3:
                System.out.println("Do something specific for Type 3");
                break;
            default:
                System.out.println("No action defined for this type: " + option);
        }
    }

    enum TEST_OPTIONS {
        TYPE_1, TYPE_2, TYPE_3, TYPE_4, TYPE_5, UNKNOWN;
    }
}