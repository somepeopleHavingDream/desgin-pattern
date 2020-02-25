package org.yangxin.desginpattern.principle.dependenceinversion;

/**
 * @author yangxin
 * 2020/02/25 12:20
 */
public class Test {
    // v1
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//    }

    // v2
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new PythonCourse());
//    }

    // v3
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();
//    }

    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setICourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setICourse(new FECourse());
        geely.studyImoocCourse();
    }
}
