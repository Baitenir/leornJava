package modifiers.task;

public class Country {
    String name;
    String people;
    int aynty;
    String language;

    public Country(String name, String people, int aynty, String language) {
        this.name = name;
        this.people = people;
        this.aynty = aynty;
        this.language = language;
    }

    public static Country getSquare (Country[] countries){
        int biggerSquare = 0;
        for (Country country : countries) {
            if (country.aynty > biggerSquare){
                biggerSquare = country.aynty;
                return country;
            }
        }
        return null;

    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", people='" + people + '\'' +
                ", aynty=" + aynty +
                ", language='" + language + '\'' +
                '}';
    }
}
