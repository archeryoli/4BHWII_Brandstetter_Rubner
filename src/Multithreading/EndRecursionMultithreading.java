package Multithreading;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import Multithreading.Models.Threading;

public class EndRecursionMultithreading {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        List<Threading> threadList = new ArrayList<>();
        int amount = 8;
        int facultyOf = 1000000;
        for(int i = 0; i < amount; i++){
            Threading threading = new Threading(amount, facultyOf - i);
            threading.start();
            threadList.add(threading);
        }
        boolean done = false;
        while(true){
            for(Threading t: threadList){
                if(!t.getIsFinished()){
                    done = false;
                    break;
                }
                done = true;
            }
            if(done == true){
                break;
            }
        }
        final long endTime = System.currentTimeMillis();

        BigInteger prod = BigInteger.ONE;
        for(Threading t : threadList){
            prod = prod.multiply(t.getProduct());
        }
        System.out.println("Total execution time: " + (endTime - startTime));

        System.out.println(prod);     
    }
}
