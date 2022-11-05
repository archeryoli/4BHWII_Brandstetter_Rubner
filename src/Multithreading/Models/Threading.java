package Multithreading.Models;
import java.math.BigInteger;

public class Threading extends Thread {
    private int _amountOfThreads;
    private long _facultyOf;
    private BigInteger _prod;
    private boolean _finished;

    public void run() {
        faculty(BigInteger.ONE,_facultyOf);
    }
    private BigInteger faculty(BigInteger product, long lauf){
        if(lauf < 1){
            _prod = product;
            _finished = true;
            return product;
        }
        return faculty(product.multiply(BigInteger.valueOf(lauf)), lauf - _amountOfThreads);
    }
    public Threading(int threadCount, long facultyOf){
        super(null, null, "test", 1 << 30);

        _amountOfThreads = threadCount;
        _facultyOf = facultyOf;
    }
    public BigInteger getProduct(){
        return this._prod;
    }
    public boolean getIsFinished(){
        return this._finished;
    }
}
