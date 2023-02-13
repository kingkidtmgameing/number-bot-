package bot;

import java.util.Scanner;

public class numberBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) 
    {
        
        
        count();
        
    }

    

    static void count() 
    {
        System.out.println("please imput number");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) 
        {
            System.out.printf("%d!\n", i);
        }
    }

    

    
}//class end