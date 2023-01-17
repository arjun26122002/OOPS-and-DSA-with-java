// comparison -ans: check if ref variables are pointing to same objects
public class comparison {
    public static void main(String[] args) {
        // String a= "Arjun";
        // String b="Arjun";
        // System.out.println(a==b);
        // // output:true

        String a= new String("Arjun");
        String b=new String("Arjun");
        System.out.println(a==b);
        // output:false,cause it will indicate outside of th pool
    }
}
