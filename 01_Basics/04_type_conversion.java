// byte b = 127;
// int a = 255;
// b = a // error: incompatible types: possible lossy conversion from int to byte
// a = b // will work

// small value (data type) can be coverted into large value (data type) but the reverse is not true

// Type casting or explicit type conversion
// int a = 12 
// byte b = (byte)b;


// float f = 5.6f;
// int x = f;  // error: incompatible types: possible lossy conversion from float to int
// int x = (int)f;  -> 5 

// int a = 257;
// byte b = (byte)a;
// b = 257 % 256 = 1 
// range of b = 256 

// char to int
// char ch = 'a'
// int asciiValue = ch;  
// here 'a' has the ascii value of 97
// so asciiValue = 97;

// int to char (if it is in range)
// int semiColon = 59;
// char semicolon = (char)semiColon;  -> semicolon = ; as in ascii ; = 59
// System.out.println(semicolon); // ; 


class Main{
    public static void main(String args[]){
        byte b = 127;
        int a = 255;
        a = b;

        int num = 12;
        byte numInByte = (byte)num;
        System.out.println(numInByte);

        float f = 5.6f;
        int x = (int)f; 
        System.out.println(x);  // 5

        int num1 = 258;
        byte num2 = (byte)num1;     // 258 % 256 = 2
        System.out.println(num2);  // 2


        char ch = 'a';
        int asciiValue = ch;
        System.out.println(asciiValue);

        int semiColon = 59;
        char semicolon = (char)semiColon;
        System.out.println(semicolon);

        // type promotion
        byte first = 30;
        byte second = 10;
        int result = first * second;   // 300 ->  out of range of byte -> promoted to int
        System.out.println(result);
    }
}