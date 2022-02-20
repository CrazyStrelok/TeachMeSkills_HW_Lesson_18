package com.teachmeskills.test_props;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {
    private String name;
    private int priority;

    public Prop(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public Prop() {
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setProperties(String item) {

        Properties appProps = new Properties();

        try (FileInputStream fis = new FileInputStream("C:\\com.teachmeskills.lesson_18\\resources\\app.properties")) {
            appProps.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.name = appProps.getProperty("threadNameT" + item);
        this.priority = Integer.parseInt(appProps.getProperty("threadPriorityT" + item));

    }
}
