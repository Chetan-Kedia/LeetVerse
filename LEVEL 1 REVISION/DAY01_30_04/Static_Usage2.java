package static_usage;

public class StaticVariable {
    
    //static variable
    static int count = 0;

    // non-static variable
    int countInstance = 0;

    StaticVariable() {
        count++;
        countInstance++;
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable();

        System.out.println(s1.count);
        System.out.println(s1.countInstance);

        System.out.println(s2.count);
        System.out.println(s2.countInstance);

        System.out.println(StaticVariable.count);
        // System.out.println(StaticVariable.countInstance);
    }
}
