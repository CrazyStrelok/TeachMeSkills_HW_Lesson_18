package com.teachmeskills.test_props;

public class Thread extends java.lang.Thread {
    public Thread() {
    }

    public Thread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {

        for (int i = 1; i < 4; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
