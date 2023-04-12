import java.math.BigInteger;

public class Endrecursion {
    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();
        System.out.println(faculty(10000));

        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime));
    }
    public static BigInteger faculty(int value){
        return multiplyFaculty(BigInteger.valueOf(1), value);
    }
    public static BigInteger multiplyFaculty(BigInteger product, int n){
        if(n == 1 || n == 0){
            return product;
        }
        return multiplyFaculty(product.multiply(BigInteger.valueOf(n)), n - 1);
    }
}
