public class Recursion {
    public static void main(String[] args) {
        System.out.println(sumIterativ(6));
        System.out.println(sumRecursive(6));
    }
    public static int sumIterativ(int x){
        int sum = 0;
        for(int i = 0; i <= x; i++){
            sum += i;
        }
        return sum;
    }
    public static int sumRecursive(int x){
        if(x == 0){
            return 0;
        }
        return sumRecursive(x - 1) + x;
    }
}
