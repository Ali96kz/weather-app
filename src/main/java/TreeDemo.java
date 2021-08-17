import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeDemo {
    private List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {
        TreeDemo treeDemo = new TreeDemo();
        Tree tree = treeDemo.generate(15);
        treeDemo.valueByLevel(tree);

        String collect = treeDemo.integers.stream()
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining(","));

        System.out.println(collect);
    }

    public void valueByLevel(Tree tree) {
        if (!isLeaf(tree.r)) {
            integers.add(tree.a);
            valueByLevel(tree.r);
        } else {
            integers.add(tree.a);
        }

        if (!isLeaf(tree.l)) {
            integers.add(tree.a);
            valueByLevel(tree.l);
        } else {
            integers.add(tree.a);
        }
    }

    public boolean isLeaf(Tree node) {
        return node.r == null && node.l == null;
    }

    public Tree generate(int n) {
        return null;
    }
}
