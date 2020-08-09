import java.util.Scanner;

class NumbersThread extends Thread {

    public NumbersThread(int from, int to){

         while (from<=to){
             System.out.println(from);
             from++;
         }

    }

    @Override
    public void run() {
        super.run();
    }
}