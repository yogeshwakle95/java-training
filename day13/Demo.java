public class Demo{
    public static void main(String[] args){
    char ch='a';
    String s1="a";
    char[] arr={'A','B','C','D'};
    String s2=new String(arr);
    System.out.println(s2);
    byte[] arr1={97,98,99,100};
    String s3=new String(arr1);
    System.out.println(s3);
    String s4=new String(s3);
    System.out.println(s4);
}
}
