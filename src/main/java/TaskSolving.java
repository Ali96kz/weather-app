import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskSolving {

    public static void main(String[] args) {
        Stack<TreeNode> stack = new Stack<>();
        TaskSolving taskSolving = new TaskSolving();
        Tree generate = taskSolving.generate(2);

        taskSolving.traverse(generate);
    }

    public void traverse(Tree root) {
        Queue<Tree> treeQueue = new LinkedList<>();

        treeQueue.add(root);

        while(!treeQueue.isEmpty()) {
            Tree tree = treeQueue.poll();
            System.out.println(tree.value);

            if(tree.r != null) {
                treeQueue.add(tree.r);
            }
            if(tree.l != null) {
                treeQueue.add(tree.l);
            }
        }
    }

    public Tree generate(int n) {
        Tree root = new Tree(1);

        root.r = new Tree(2);
        root.l = new Tree(3);

        root.r.r = new Tree(4);
        root.r.l = new Tree(5);

        root.l.r = new Tree(6);
        root.l.l = new Tree(7);

        return root;
    }
}
