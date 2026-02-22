class Human {
    void eat() {
        System.out.println("Human is eating");
    }

    void sleep() {
        System.out.println("Human is sleeping");
    }
}

class Doctor extends Human {
    void learnMedicines() {
        System.out.println("Doctor is learning medicines");
    }
}

class Engineer extends Human {
    void doDsa() {
        System.out.println("Engineer is practicing DSA");
    }
}

class Teacher extends Human {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Hiererchical {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Engineer e = new Engineer();
        Teacher t = new Teacher();

        d.eat();
        d.learnMedicines();

        e.sleep();
        e.doDsa();

        t.eat();
        t.teach();

        Human h=new Human();
        h.eat();
        h.sleep();
    }
}