public class Main{
    public static void main(String args[]){
        int x = 5 ;
        int y = 6;

        boolean isFirstNumLesser = x < y;
        boolean isFirstNumGreater = x > y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;
        System.out.print("First num is less than second num : ");
        System.out.println(isFirstNumLesser);
        System.out.print("First num is greater than second num : "); 
        System.out.println(isFirstNumGreater);
        System.out.print("First and second num are equal : ");
        System.out.println(isEqual);
        System.out.print("First and second num  are not equal: "); 
        System.out.println(isNotEqual);
    }
}