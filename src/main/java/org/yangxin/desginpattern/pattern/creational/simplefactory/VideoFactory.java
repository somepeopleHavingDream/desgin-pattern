package org.yangxin.desginpattern.pattern.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yangxin
 * 2020/03/16 20:43
 */
public class VideoFactory {

//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        } else {
//            return null;
//        }
//    }

    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return video;
    }
}
