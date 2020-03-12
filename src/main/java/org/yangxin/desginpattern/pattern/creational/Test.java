package org.yangxin.desginpattern.pattern.creational;

import java.io.*;

/**
 * @author yangxin
 * 2020/03/11 20:35
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//
//        System.out.println("program end");

        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) objectInputStream.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
    }
}
