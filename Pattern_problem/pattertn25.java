public class pattertn25 {
    
    public static void main(String[] args) {
        int n = 5;

        int num = 1;
        int space = n - 1;
        int star = 1;
        int row = 0;

        while(row < n){
            int i=0;
            while(i < space){
                System.out.print(" ");
                i++;
            }
            int j=0;
            while(j < star){
                System.out.print(num + "\t");
                num++;
                j++;
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }

        

        
    }
}

    


    

