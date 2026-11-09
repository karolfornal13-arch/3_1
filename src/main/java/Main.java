
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 1; j++) {
            System.out.print("*".repeat(((10-i))));
            System.out.print(" ".repeat(((i*2)+1)));
            System.out.print("*".repeat(((10-i))));
        }

        System.out.println();
    }
      for (int k = 9; k > 0; k--) {
        for (int f = 0; f < 1; f++) {
            System.out.print("*".repeat(((10-k))));
            System.out.print(" ".repeat(((k*2)+1)));
            System.out.print("*".repeat(((10-k))));
        }

        System.out.println();
    }
  }
}