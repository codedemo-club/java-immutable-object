import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableString {

    @Test
    void test() {
        String a = "codedemo.club";
        String b = a.replace("codedemo", "yunzhi");

        System.out.println(a);
        System.out.println(b);

        Assertions.assertEquals("codedemo.club", a);
        Assertions.assertEquals("yunzhi.club", b);
    }

    @Test
    void finalTest() {
        final String a = "codedemo.club";

        // 以下代码移除注释将发生编译错误
        // a = "yunzhi.club";
    }

    @Test
    void finalArrayListTest() {
        final List<String> strings = new ArrayList<>();
        Assertions.assertEquals(0, strings.size());

        // 你不能改变strings的引用值，否则将发生编译错误
        // strings = new ArrayList<>();

        // 但可以调用ArrayList的add方法来改变strings的状态
        strings.add("codedemo.club");
        Assertions.assertEquals(1, strings.size());
    }
}
