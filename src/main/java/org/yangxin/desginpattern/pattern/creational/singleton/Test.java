package org.yangxin.desginpattern.pattern.creational.singleton;

import java.io.*;

/**
 * @author yangxin
 * 2020/03/11 20:35
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        EnumInstance newInstance = (EnumInstance) objectInputStream.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }
}
