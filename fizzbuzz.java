import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        
        Scanner number=new Scanner(System.in);
        System.out.println("enter the number");
          
        int moon=number.nextInt();
        
        if (moon%3==0){
            System.out.println("fuzz");
        }
        else if(moon%5==0){
            System.out.println("buzz");
        }
        else if (moon%3==0 && moon%5==0){
            System.out.println("fizzbuzz");
        }
        else{
            System.out.println("not divisible by any of the numbers or both of them");
        }



    }
    
}
