import java.util.Scanner;

public class Cupcake {
    
        public static void main(String[] args) {        
            Scanner scanner = new Scanner(System.in);
    
            int n = scanner.nextInt();
            int[] calories = new int[n];
            for (int i = 0; i < n; i++) {
                calories[i] = scanner.nextInt();
            }
    
            // Sort calories in descending order
            java.util.Arrays.sort(calories);
            long minMiles = 0;
            for (int j = 0; j < n; j++) {
                minMiles += (long) calories[n - 1 - j] * (1L << j); // c * 2^j
            }
    
            System.out.println(minMiles);
        }
        
    
}
