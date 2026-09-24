public class pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int star = n/2+1;
        int space = -1;
        int row = 0;

        while (row < n) {
            int i = 0;
            while (i < star) {
                
                System.out.print("*");
                i++;
            }

            int j = 0;
            while (j < space) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            if(row==0 || row == n-1)
            {
                k=1;
            }
            while (k < star) {
                System.out.print("*");
                k++;
            }
            
            if (row < n / 2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

           System.out.println();
            row++;
        }
    }
}