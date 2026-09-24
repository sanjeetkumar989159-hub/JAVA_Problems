

public class pattern14 {
    public static void main(String[] args) {
        /*
                *
              * *
            * * *
          * * * *
        * * * * *
          * * * *
            * * *
              * *
                *
        */
        int n=5;
        int row=0;
        int star=1;
        
        int space=n-1;
        while(row<n*2-1)
        {
            int i=0;
            while(i<space)
            {
                System.out.print("   ");
                i++;
            } 
            int j=0;
            while(j<star)
            {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            row++;
            if(row<n)
            {
                star++;
                space--;
            }
            else
            {
                star--;
                space++;
            }
        

    }
}
}