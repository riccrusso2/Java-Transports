package transports.domain_entities;
import  transports.exceptions.NullinputException;
/**
 * This ADT represents a city of a route which will be a stage of the route
 *
 *
 */
public class City {
    private String name;
    private String province;
    private long cap;

    /**
     * Instances a new city with the data provided
     * @param name Represents the name of the city
     * @param province Represents the province of the city
     * @param cap Represents the zip code of the city
     * @throws NullinputException if at least one of the parameters is null
     */
    public City(String name, String province, long cap) throws NullPointerException {
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
