public class WrapperConversionDemo {
    public static void main(String[] args) {
        int basicInt = 10;
        Integer objFromBasic = basicInt;
        System.out.println("i) Basic type to Object: " + objFromBasic);

        Integer objInt = 20;
        int basicFromObj = objInt;
        System.out.println("ii) Object to Basic type: " + basicFromObj);

        int number = 30;
        String strFromBasic = Integer.toString(number);
        System.out.println("iii) Basic type to String: " + strFromBasic);

        String numericStr = "123";
        Integer objFromStr = Integer.valueOf(numericStr);
        System.out.println("iv) String to Numeric Object: " + objFromStr);

        Integer objectNum = 456;
        String strFromObject = objectNum.toString();
        System.out.println("v) Object to String: " + strFromObject);
    }
}
