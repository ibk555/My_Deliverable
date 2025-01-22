import java.util.Scanner;

public class Book {
    int ISBN;
    String title;
    String author;
}

public static void collection(){
    Scanner s= new Scanner(System.in);
    int ch;
    do{
        System.out.println("ADD:");
        System.out.println("REMOVE:");
        System.out.println("Enter your choice:");
        ch=s.nextInt();
    }
    while(ch!=0);

    }

}