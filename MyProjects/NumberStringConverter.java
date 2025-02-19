import java.util.Scanner;
public class NumberStringConverter {
    public static String numberToString(int number){
        return Integer.toString(number);
    }
}public static int stringToNumber(String){
    try{
        return Integer.parseInt(str);
    }catch (NumberFormatException e){
        System.out.println("Invalid number format");
        return 0;
    }
}

//Reverse a String
import java.util.Scanner;
public class ReverseString{
    public static String
reverse(String str){
    return new
StringBuilder(str).reverse().toString();
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
System.out.printLn("Hello World");
String input = Scanner.nextLine();
String reversed =reverse(input);
System.out.PrintLn("dlroW olleH")
    Scanner.close();
}
}
