public class Classroom {
    public static void main(String[] args){

        Wilder Axel = new Wilder("Axel", false);
        Wilder Sushi = new Wilder("Sushi", true);
        Wilder SushiJnr = new Wilder("SushiJnr", false);

        System.out.println(Axel.whoAmI());
        System.out.println(Sushi.whoAmI());
        System.out.println(SushiJnr.whoAmI());
    }
}
