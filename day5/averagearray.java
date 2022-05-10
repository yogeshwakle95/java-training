//Write a Java program to calculate the average value of array elements.
class averagearray{
public static void main(String args[]){
int i;
int sum=0;
int[] array={1,2,3,4,5,6,7,8,9};
int length=array.length;
for(i=0;i<array.length;i++)
{
sum+=array[i];
}
double average = sum / length;
System.out.println("average of array "+average);
}
}
