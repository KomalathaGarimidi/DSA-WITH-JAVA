import java.util.Scanner;

public class InsertionSortDemo {
    public static void SelectionSort(int array[],int length){
        int i=0;
        while(i<length){
            int j=i;
            while(j>0 && array[j-1]>array[j]){
               swap(array,j);
                j--;
            }
            i++;
        }
        print(array,length);
    }
    public static void swap(int array[],int j){
        int temp=array[j-1];
        array[j-1]=array[j];
        array[j]=temp;
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
        InsertionSortDemo.insertionSort(array,length);
    }
}
