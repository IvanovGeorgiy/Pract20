public class Main {
    public static void main(String[] args) {
//      Задание #2
        Common<Integer, Double, String> cm = new Common<Integer, Double, String>(1, 1.2,"Yes");
        System.out.println(cm.getClassFirst());
        System.out.println(cm.getClassSecond());
        System.out.println(cm.getClassThird());
        cm.setFirst(2);
        System.out.println(cm.getFirst());
        cm.setSecond(2.1);
        System.out.println(cm.getSecond());
        cm.setThird("No");
        System.out.println(cm.getThird());

        Integer[] mass = {1,2,3,4,5};
        MinMax<Integer> mm = new MinMax<Integer>(mass);
        System.out.println("Max: " + mm.GetMax());
        System.out.println("Min: " + mm.getMin());

        String[] mass1 = {"a", "b", "c", "d"};
        MinMax<String> mm1 = new MinMax<String>(mass1);
        System.out.println("Max: " + mm1.GetMax());
        System.out.println("Min: " + mm1.getMin());

        Integer x = 9;
        Double y = 1.5;
        Calculator.sum(x, y);
        Calculator.divide(x, y);
        Calculator.multiply(x, y);
        Calculator.subtraction(x, y);

    }
}