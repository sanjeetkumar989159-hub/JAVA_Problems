public class pattern20{
    public static void main(String[] args) {
        int n = 7;

        int row = 0;
        int space = n / 2;
        int star = 1;

        while (row < n) {

            // spaces
            int i = 0;
            while (i < space) {
                System.out.print(" ");
                i++;
            }

            // stars / hollow space
            int j = 0;
            while (j < star) {
                if (j == 0 || j == star - 1) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.println();

            if (row < n / 2) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }

            row++;
        }
    }
}