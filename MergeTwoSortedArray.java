import java.util.Scanner;
//Merge two sorted arrays without removing the duplicates
public class MergeTwoSortedArray {
    public static void Merge(int a1[],int a2[]){
        int length=a1.length+a2.length;
        int temp[]=new int[length];
        int i=0;int j=0,k=0;
        while (i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                temp[k++]=a1[i++];
            }
            else{
                temp[k++]=a2[j++];
            }
        }
        while(i<a1.length ){
            temp[k++]=a1[i++];
        }
        while (j<a2.length){
            temp[k++]=a2[j++];
        }
        System.out.println("Elements after sorting");
        for(int l=0;l<temp.length;l++){
            System.out.print(temp[l]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of hte first array");
        int len1=sc.nextInt();
        int arr1[]=new int[len1];

        System.out.println("Nter the values for a1");
        for(int i=0;i<len1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the length of the second array");
        int len2=sc.nextInt();
        int arr2[]=new int[len2];
        System.out.println("Nter the values for second array");
        for(int i=0;i<len2;i++){
            arr2[i]=sc.nextInt();
        }

        MergeTwoSortedArray.Merge(arr1,arr2);
    }
}
