public class factorial {

    public static int facts(int n){
        if (n==0) {
            return 1;
        }
        int fn=n*facts(n-1);
       
        return fn;

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(facts(num)); 
    }
}
