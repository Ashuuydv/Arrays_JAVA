import java.util.Scanner;
public class maxinArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = read.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = read.nextInt();
        }

        int max = nums[0];

        for(int i = 0; i < n; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
