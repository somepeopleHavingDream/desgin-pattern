package org.yangxin.desginpattern.pattern.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author yangxin
 * 2020/03/16 20:43
 */
@SuppressWarnings({"CommentedOutCode", "AlibabaRemoveCommentedCode", "CallToPrintStackTrace"})
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

    public AbstractVideo getVideo(Class<?> clazz) {
        AbstractVideo video = null;
        try {
            video = (AbstractVideo) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        } catch (
                InstantiationException
                | IllegalAccessException
                | ClassNotFoundException
                | NoSuchMethodException
                | InvocationTargetException e
        ) {
            e.printStackTrace();
        }

        return video;
    }
}
