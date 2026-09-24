public class hollow_square_star_pattern{
    public static void main(String[] args) {

        int n = 5;
        int row = 1;

        while (row <= n) {

            int column = 1;

            while (column <= n) {

                if (row == 1 || row == n || column == 1 || column == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                column++;
            }

            System.out.println();
            row++;
        }
    }
}