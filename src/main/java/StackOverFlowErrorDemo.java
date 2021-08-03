public class StackOverFlowErrorDemo {

    public static void main(String[] args) {
        recursiveMethod(2);
    }

    public static int recursiveMethod(int i) {
        return recursiveMethod(i);
    }
}
