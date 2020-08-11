class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        try {// Thread.currentThread().interrupt();
            while (!Thread.interrupted()) {
               // while (true) {
                    counter++;
                Thread.sleep(1000);
               // sleep(1000);
                //}
               // Thread.in
            }

        } catch (InterruptedException e) {
            System.out.println("It was interrupted");
        }


    }
}