import java.math.BigInteger;

public class Threading extends Thread {
    private int _amountOfThreads;
    private long _facultyOf;
    private BigInteger _sum;
    private boolean _finished;

    public void run() {
        faculty(BigInteger.ONE,_facultyOf);
    }
    private BigInteger faculty(BigInteger product, long lauf){
        if(lauf <= 1){
            _sum = product;
            _finished = true;
            System.out.println("Thread " + getId() + " finished");
            return product;
        }
       // System.out.println("Thread " + this.getId() + " lauf: " + lauf);
        return faculty(product.multiply(BigInteger.valueOf(lauf)), lauf - _amountOfThreads);
    }
    public Threading(int threadCount, long facultyOf){
        _amountOfThreads = threadCount;
        _facultyOf = facultyOf;
    }
    public BigInteger getSum(){
        return this._sum;
    }
    public boolean getIsFinished(){
        return this._finished;
    }
}
