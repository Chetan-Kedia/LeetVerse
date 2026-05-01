class Overloading{
    void print(int a){
        System.out.println("Integer: " + a);
    }
    void print(double d){
        System.out.println("Double: " + d);
    }
    void print(String str){
        System.out.println("String: " + str);
    }
    public static void main(String args[]){
        Overloading ob = new Overloading();
        ob.print(5);
        ob.print(3.14);
        ob.print("LeetVerse");
    }
}
