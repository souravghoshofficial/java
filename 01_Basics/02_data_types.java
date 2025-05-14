// 2 types -> primitive and non-primitive or user-defined

// primitive -> 1.Integer(int)  2.Float(float)  3.Character(char)  4.Boolean(boolean)

// Integer -> byte (1 byte) , short (2 bytes) , int (4 bytes) , long (8 bytes)
// byte -> -2 ^ 7 to (2 ^ 7) - 1 == -128 to 127
// byte num = 10;
// short sh = 255; 
// long l = 8457l;  -> l signifies it is a long number;

// Float -> float (4 bytes) , double (8 bytes)
// In Java default value is double
// float can provide precision up to 6 to 7 decimal digits.
// double can provide precision up to 15 to 16 decimal digits
// double num = 5.6;
// float marks = 87.5;  // error: incompatible types: possible lossy conversion from double to float
// float marks = 87.5f; 

// Character - char -> 2 bytes
// Unicode
// char star = '*';

// Boolean -> boolean -> 1 byte
// In java only true or false , no 0 and 1;
// bool isCompleted = false;

class Main{
    public static void main(String args[]){
        byte by = 7;
        short sh = 255;
        int num = 1000;
        long l = 83473l;

        float fl = 5.6f;
        double d = 834.25;

        char star = '*';

        boolean isCompleted = false;
    }
}