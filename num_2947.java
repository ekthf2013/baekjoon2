import java.util.Scanner;

public class num_2947 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); //5개의 숫자를 배열에 저장
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    for (int num:arr) { //숫자 num을 arr가 비워질때까지 채워 넣는다.
                        System.out.print(num + " ");
                    }
                    System.out.println("");
                }
            }
        }
    }
}
