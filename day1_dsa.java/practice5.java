import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
      Scanner sc = new Scanner(System.in);
      int num =sc.nextInt();
      
      if(num % 2 == 0){
        System.out.println("this is a sum number "+num);

      } 
      else{
        System.out.println("this is a odd number"+num);
      }
    }
}
