package transports.domain_entities;
import transports.exceptions.NullInputException;
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
     * @throws NullInputException if at least one of the parameters is null
     */
    public City(String name, String province, long cap) throws NullInputException {
        if(name==null||province==null||cap<=0){
            throw new NullInputException("one of the parameters passed is null");
        }
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

    @Override
    public boolean equals(Object city) {
        if(city instanceof City){
            City city1 = (City) city;
           if(this.getName().equals(city1.getName()) && (this.getCap()==city1.getCap()) && (this.getProvince().equals(city1.getProvince()))){
               return true;
           }
        }
        return false;
    }

}
