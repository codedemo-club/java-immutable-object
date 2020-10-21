public class Student {
    final private String name;

    // 声明属性时赋初值
    final private int age = 12;
    final private Clazz clazz;

    /**
     * 或在构造函数中为其赋值
     */
    public Student(String name, Clazz clazz) {
        this.name = name;

        // 此时Student是否为可变类取决于Clazz是否为可变类
        this.clazz = clazz;
    }


    public static class Clazz {

    }
}
