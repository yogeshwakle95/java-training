public class Demo{
    public static void main(String[] args){
        String s1="ABC";
        //string to obj
        char arr[];
        arr=s1.toCharArray();
        int i;
        for(i=0;i<arr.length;i=i+1){
            System.out.println(arr[i]);
        }
        //string to byte
        byte[] arr1;
        arr1=s1.getBytes();
        for(i=0;i<arr1.length;i=i+1){
            System.out.println(arr1[i]);
        }
    }
}