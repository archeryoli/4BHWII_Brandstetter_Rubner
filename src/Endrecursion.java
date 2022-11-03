public class Endrecursion {
    public static void main(String[] args) {
        System.out.println(faculty());
    }
    public static int faculty(){
        return multiplyFaculty(1, 17);
    }
    public static int multiplyFaculty(int product, int n){
        if(n == 1 || n == 0){
            return product;
        }
        return multiplyFaculty(product * n, n - 1);
    }
}
