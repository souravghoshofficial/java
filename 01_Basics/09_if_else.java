public class Demo{
    public static void main(String args[]){
        int x = 7;
        int age = 21;
        if(x > 10){
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }

        if(age < 18){
            System.out.println("Not and adult");
        }
        else if(age >= 18 && age < 60){
            System.out.println("Adult but not a senior citizen");
        }
        else{
            System.out.println("Senior Citizen");
        }
    }
}