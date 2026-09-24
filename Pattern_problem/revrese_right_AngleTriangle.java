
        public class revrese_right_AngleTriangle {
    public static void main(String[] args) {

        int n = 5;
        
        int row = n;

        while (row >= 1) {

            int column = 0;

            while (column < row) {
                System.out.print("* ");
                column++;
            }

            System.out.println();
            row--;
        }
    }
}