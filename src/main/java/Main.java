
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i <= 11; i++) {
        if( i <= 0){
            System.out.print("*".repeat(((1))));
            System.out.println();
            System.out.print("*".repeat(((1))));
            System.out.print("-".repeat(((i))));
            System.out.print("*".repeat(((1))));
            System.out.println();
        }
        else{
            
            if( i < 10){
                System.out.print("*".repeat(((1))));
                System.out.print("-".repeat(((i))));
                System.out.print("*".repeat(((1))));
                 System.out.println();
            }
            else{
                 System.out.print("*".repeat(((i/2)+1)));
            }
    }
    }
  }
}