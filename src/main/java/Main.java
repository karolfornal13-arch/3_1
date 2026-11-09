
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 1; j++) {
            System.out.print(" ".repeat(((10-i))));
            System.out.print("*".repeat(((i*2)+1)));
        }

        System.out.println();
    }
  }
}