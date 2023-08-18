import java.util.Scanner;

public class SelectionSortDemo {
    public static void selectionSort(int array[],int length ){
        //selects the minimum element and swap the element
        for(int i=0;i<length;i++){
            int min=i;
            for(int j=i;j<length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
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
        SelectionSortDemo.selectionSort(array,length);
    }
}
