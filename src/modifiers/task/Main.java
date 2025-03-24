package modifiers.task;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Kyrgyzstan", "7 million", 19951, "Kyrgyz");
        Country country2 = new Country("Japon", "20 m", 150000, "Japon");
        Country country3 = new Country("Swiderland", "15 m", 120000, "Swider");
        Country[] countries = new Country[] {country1, country2, country3};


        System.out.println("The bigger square: ");
        System.out.println(Country.getSquare(countries));
        country1.toString();
    }




}
