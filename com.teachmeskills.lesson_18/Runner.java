package com.teachmeskills.test_props;

public class Runner {
    public static void main(String[] args) {

    Prop property = new Prop();

        property.setProperties("1");
    Thread thread1 = new Thread(property.getName(), property.getPriority());
        System.out.println(thread1);

        property.setProperties("2");
    Thread thread2 = new Thread(property.getName(), property.getPriority());
        System.out.println(thread2);

        property.setProperties("3");
    Thread thread3 = new Thread(property.getName(), property.getPriority());
        System.out.println(thread3);

        thread2.start();
        thread3.start();
        thread1.start();

}
}
