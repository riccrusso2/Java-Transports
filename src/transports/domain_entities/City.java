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
     * @param zip Represents the zip code of the city
     */
    public City(String name, String province, long cap) {
        this.name = name;
        this.province = province;
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public long getCap() {
        return cap;
    }

    public void setCap(long cap) {
        this.cap = cap;
    }
}
