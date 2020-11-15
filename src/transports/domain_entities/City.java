package transports.domain_entities;

/**
 * this class represents the cities that will form a route
 */
public class City {
    private String name;
    private String province;
    private int cap;


    /**
     * @param name represent the name of the city
     * @param province represent the province of the city
     * @param cap represent the cap of the city
     */
    public City(String name, String province, int cap) {
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

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }
}
