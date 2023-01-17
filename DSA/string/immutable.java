// why strings are immutable/ why we can't modify string objects?Ans-for secuirity reason 

public class immutable {

    public static void main(String[] args) {
        String a ="Arjun";
        System.out.println(a);
        a="Aryan";
        System.out.println(a);
        // output:Arjun Aryan
//  cause of here we are not changing the object also we are create a object 

    }
    
}
