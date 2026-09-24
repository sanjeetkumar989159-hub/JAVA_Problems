public class pattern34 {
    public static void main(String[] args) {

        int n = 7;
        int row = 1;

        while (row <= n) {

            int i = 0;

            while (i < n) {

                if (i < n - row) {
                    System.out.print("1 ");
                } else {
                    System.out.print(row + " ");
                }

                i++;
            }

            System.out.println();
            row++;
        }
    }
}