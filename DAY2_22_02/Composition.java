package leetverse;

class Room {
    Room() {
        System.out.println("Room created");
    }
}
class House {
    Room r;   // strong ownership
    House() {
        r = new Room();   // created inside
    }
}
//HAS-A dependent
public class Composition {
    public static void main(String[] args) {
        House h = new House();
    }
}
