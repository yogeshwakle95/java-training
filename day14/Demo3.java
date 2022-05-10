public class Demo3{
    public static void main(String[] args) {
        StringBuffer sb;
        sb=new StringBuffer("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        sb.setCharAt(0,'h');
        System.out.println(sb);
        sb.append(10);
        sb.append(5.6);
        sb.append("Hi");
        System.out.println(sb);
    
        //delet
        sb.delete(1.7);
        System.out.println(sb);
        

        
    }
}