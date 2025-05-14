class Main{
    public static void main(String args[]){
        int num1 = 7;
        int num2 = 5;
        
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(modulus);

        // num1 = num1 + 2;
        num1 += 2;
        num2++;

        System.out.println(num1);
        System.out.println(num2);
    }
}