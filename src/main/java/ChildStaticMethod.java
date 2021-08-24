import java.util.List;

public class ChildStaticMethod extends ParentStaticMethod {

    public static void test(List<Integer> integerList, User user) {
        System.out.println("child");
    }
}
