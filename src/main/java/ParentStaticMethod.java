import java.util.ArrayList;
import java.util.List;

public class ParentStaticMethod {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        User user = new User();
        user.a = 2;
        test(integers, user);

        System.out.println(user.a);
    }

    public static void test(List<Integer> integerList, User user) {
        System.out.println("parent");
    }

    static class User {
        int a;
    }
}
