public class Address {
    public String createAddress(String country){
        return String.format("Country: %s"+ country);
    }
    public String createAddress(String country, String city){
        return String. format("Country: %s, city: %s", country, city);
    }
    public String createAddress(String country, String city, String kodPocztowy, String street){
        return String.format("Country: %s, city: %s, kod pocztowy: %s, nazwa ulicy: %s", country, city, kodPocztowy, street);
    }
    public String createAddress(String country, String city, String kodPocztowy, String street, int numerMieszkania){
        return String.format("Country: %s, city: %s, kod pocztowy: %s, nazwa ulicy: %s, numer mieszkania %d", country, city, kodPocztowy, street, numerMieszkania);
    }
}
