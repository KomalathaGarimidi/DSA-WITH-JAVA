import java.util.Scanner;

public class BubbleSortAlgorithmDemo {
    public static void bubbleSort(int array[],int length){
        //compare with the adjacent element and swap
        boolean swap=false;
        for(int i=0;i<length-1;i++){
            swap=false;
            for(int j=0;j<length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=true;
                }
                if(swap==false){
                    break;
                }
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
        BubbleSortAlgorithmDemo.bubbleSort(array,length);
    }
}
