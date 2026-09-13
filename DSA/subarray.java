
public class subarray {
    public static void main(String[] args) {
      
        int[] arr = {1, 2, 3,4};
        int n = arr.length;
         int maxSum = Integer.MIN_VALUE;
        for(int i=0; i< n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                    System.out.print(arr[k]+" ");
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
                System.out.println("Sum: " + sum);
            }
            
            }
            System.out.println("Maximum sum of subarray: " + maxSum);
            
        }
     
    }
    
            