public class maximum_column {
    public static void main(String[] args) {
        int[][] array = {
            {5,1,9},
            {2,8,6},
            {7,4,3}
        };
        for(int i=0; i<array[0].length;i++){
            int max = 0;
            for(int j=0;j<array.length;j++){
                if(array[j][i] > max){
                    max = array[j][i];
                }
            }
            System.out.println(max);
        }
        

    }
}
    

