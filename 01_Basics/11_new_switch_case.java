public class Main{
    public static void main(String args[]){
        String day = "Sunday";

        switch(day){
            case "Saturday" , "Sunday" -> {
                System.out.println("6am");
                System.out.println("Wake up early");
            }
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        // assign value inside switch statement
        int num = 4;
        String text = " "; 

        text = switch(num){
            case 1 -> "One"; 
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            default -> "Number is not between 1 to 5";
        };

        System.out.println(text);
    }
}