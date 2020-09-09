/* Spiral Pattern
 1  2  3  4 5 
16 17 18 19 6 
15 24 25 20 7 
14 23 22 21 8 
13 12 11 10 9 

 */
package Patterns;
public class Pattern4 {
	public static void main(String[] args) {
	int arr[][]=new int[5][5];
    int n=5;
    int row,col,value=1;
    int left,right,upper,lower;
    left=0;
    right=n-1;
    upper=0;
    lower=n-1;
    while(true)
    {
        for(col=left;col<=right && value<=n*n;col++)
            arr[upper][col]=value++;
        upper++;
        for(row=upper;row<=lower && value<=n*n;row++)
            arr[row][right]=value++;
        right--;
        for(col=right;col>=left && value<=n*n;col--)
            arr[lower][col]=value++;
        lower--;
        for(row=lower;row>=upper && value<=n*n;row--)
            arr[row][left]=value++;
        left++;
        if(value>n*n)
            break;
    }
    for(row=0;row<n;row++)
    {
        for(col=0;col<n;col++)
        	System.out.print(arr[row][col]+" ");
        System.out.println();
    }
}
}
