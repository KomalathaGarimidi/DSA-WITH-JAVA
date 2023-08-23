import java.util.Scanner;
public class MergeSort {
    public static void conqure(int array[],int low,int mid,int high){
        int left=low;//pointer for left array
        int right=mid+1;// pointer for right array
        int temp[]=new int[array.length];//temporary array to store the elements after sort and merge.
        int k=low;//pointer to temp array
        while(left<=mid && right<=high){//check the elements of both right and left arrays
            if(array[left]<=array[right]){
                temp[k]=array[left];//coping the left array element to temp
                left++;
            }
            else{
                temp[k]=array[right];// coping the right array element to temp
                right++;
            }
            k++;
        }
        while(left<=mid){ //if the elements of right array will be completed and still left array contains elements
            //then copy the left array elments to temp.
            temp[k]=array[left];
            k++;
            left++;
        }
        while(right<=high){//if the elements of left array will be completed and still right array contains elements
            //then copy the right array elments to temp.
            temp[k]=array[right];
            k++;
            right++;
        }
            for(int i=low;i<=high;i++){//copy the temp array elemnts to original array
                array[i]=temp[i];
         }
    }
    static void divide(int array[],int low,int high){
        if(low>=high){// base condition for the recurrsive call of this method.
            return;
        }
        if(low<high){
            int mid=low+(high-low)/2; // caluculate the mid value
            //we can caluclate mid like this also ==>  mid=(low+high)/2;
            //if the array having a large no.of values the if we do like that there is a chance to mid
            //value to go out of int range.int has only particular range
            divide(array,low,mid);//recurssive call to divide method
            //it will call divide method itself recursively from low to mid until and unless it will reach the
            //basecondition.
            //divide() divides the array every time it will divide the array into two halves left and right.
            divide(array,mid+1,high);
            //recurrsive call to divide() from mid+1 to high
            //it will also call the divide() until and unless it reaches the base condition
            conqure(array,low,mid,high);//call to conqure method.
            //it will merge the left and right arrays every time when it will be called.
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=sc.nextInt();
        int array[]=new int[length];
        System.out.println("Enter the values for array");
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Printing the accepted elements brfore sorting");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        MergeSort.divide(array,0,length-1);//call to divide method
        System.out.println("Printing the elements after sorting");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
