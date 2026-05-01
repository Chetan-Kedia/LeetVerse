class Restaurant {
    String name;
    String location;
    double rating;

     // default constructor
    Restaurant() {
        System.out.println("Restaurant created");
    }

    // parameterized constructor
    Restaurant(String name, String location, double rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    void showDetails() {
        System.out.println(name+" "+location+" "+rating);
    }
}
