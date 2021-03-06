package threads.sinchronThread;

public class Caller implements Runnable {

    String msg;
    final CallMe target;
    Thread t;

    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target){
            target.call(msg);

        }
    }
}
