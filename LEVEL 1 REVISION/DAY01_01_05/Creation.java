public class Creation {
    public static void main(String[] args) 
    {
        //Object 1
        Restaurant r1 = new Restaurant();
        r1.name = "Starbucks";
        r1.location = "Delhi";
        r1.rating = 4.2;
        r1.showDetails();

        //Object 2
        Restaurant r2 = new Restaurant("KFC", "Pune", 4.0);
        r2.showDetails();

    }
}
