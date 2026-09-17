public class snake_pattern_2darray {
    public static void main(String[] args) {

        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
            
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } 
            else {
            
                for (int j = array[0].length-1 ; j >=0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}