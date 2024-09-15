import java.util.Arrays;
import java.util.Scanner;
public class ArrayMax{
public static void main(String[] args){
System.out.println("Size");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
System.out.println("Enter array elements");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Array Elements Are: ");
System.out.println(Arrays.toString(a));

int res =max(a);
System.out.println(res);
}
public static int max(int[] a){
int max=a[0];
for(int i=1;i<=a.length-1;i++){
if(max<a[i]){
max=a[i];
}
}
 return max;
}


}