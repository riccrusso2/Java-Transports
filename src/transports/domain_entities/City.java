package transports.domain_entities;

/**
 * This ADT represents a city of a route which will be a stage of a possible route
 * linked to cityManager that will take care of manage a group of them according to a criteror
 *
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
