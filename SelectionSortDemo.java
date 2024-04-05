import java.util.Scanner;

public class InsertionSortDemo {
    public static void InsertionSort(int array[],int length ){
        //selects the minimum element and swap the element
        for(int i=0;i<length;i++){
            int min=i;
            for(int j=i+1;j<length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
          if(min!=i){
                int temp=array[min];
                array[min]=array[i];
                array[i]=temp;
          }
        }
        print(array,length);
    }
    public static void print(int array[],int length){
        System.out.println("printing the array elements after sorting");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
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
        InsertionSortDemo.InsertionSort(array,length);
    }
}
