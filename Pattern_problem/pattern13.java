

public class pattern13 {
    public static void main(String[] args) {
//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 
//  *  *  *  *  * 
//  *  *  *  * 
//  *  *  * 
//  *  * 
//  * 
        int n=5;
        int row=0;
        int star=1;
        while(row<n*2-1)
        {
            int i=0;
            while(i<star)
            {
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            row++;
            if(row<n)
            {
                star++;
            }
            else
            {
                star--;
            }


        }
        
        }
    }
