public class right_angle_pattern {
    public static void main(String[] args) {
        int n=5;
        int space =n-1;
        int row=0;
        while (row < n) {
            int i=0;
            while (i < space) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j <= row) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space--;
            row++;
        }
    }
}
