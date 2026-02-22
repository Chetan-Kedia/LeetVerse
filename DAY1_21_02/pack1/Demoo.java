// Defining all access modifiers
// File: Demo.java
package pack1;

public class Demoo {

    public int a = 10;        // public
    protected int b = 20;     // protected
    int c = 30;               // default
    private int d = 40;       // private

    public void show() {
        System.out.println("Public a = " + a);
        System.out.println("Protected b = " + b);
        System.out.println("Default c = " + c);
        System.out.println("Private d = " + d);
    }

    public static void main(String[] args) {
        Demoo ob = new Demoo();
        ob.show();
    }
}