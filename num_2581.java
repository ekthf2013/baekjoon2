import java.util.Scanner;

public class num_2581 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int sum = 0;
        int count;
        int min = 0;

        if(N==1)
            N++;
        for (int i = N; i < M+1; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 0) {
                sum += i;
                if (min < i && min == 0)
                    min = i;
            }
        }
        if(sum>0) {
            System.out.println(sum);
            System.out.println(min);
        }
        else System.out.println("-1");
    }
}
