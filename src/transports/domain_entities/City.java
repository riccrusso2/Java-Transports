package transports.domain_entities;

/**
 * This ADT represents a city of a route
 */
public class City {
    private String name;
    private String province;
    private long cap;

    /**
     * @param name Represents the name of the city
     * @param province Represents the province of the city
     * @param cap Represents the zip code of the city
     */
    public City(String name, String province, long cap) {
        this.name = name;
        this.province = province;
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public String getProvince() { return province; }

    public long getCap() {
        return cap;
    }
}
