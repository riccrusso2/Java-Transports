package transports.domain_entities;

import transports.exceptions.NullInputException;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * This ADT represents a route formed by a list of cities,
 * that a truck could go across
 */
public class Route {
    private List<City> cities;
    private Duration duration;

    /**
     *
     * Instances a new route composed by the cities given
     * and that has the mileage time specified
     * @param cities The list of cities that form the route
     * @param gg Integer number of days of the mileage time
     * @param hh Integer number of hours of the mileage time
     * @param mm Integer number of minutes of the mileage time
     * @throws NullInputException if the list passed is null
     *                            or if one of the cities in the list is null
     */
    public Route(List<City> cities, int gg, int hh, int mm) throws NullInputException {
        if(gg<=0 || mm<=0 || hh <=0)
            throw new NullInputException("The duration passed is invalid");
        if(cities == null)
            throw new NullInputException("The list of cities passed is null");
        if(cities.contains(null))
            throw new NullInputException("The list of cities passed is null");

        long seconds = (mm*60)+(hh*3600)+(gg*86400);
        this.cities = new Vector<City>(cities);
        this.duration = Duration.ofSeconds(seconds);
    }

    public Iterator<City> getCities() {
        return cities.iterator();
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Route){
            if(this == other)
                return true;
            Route otherRoute = (Route) other;
            return this.getDuration().equals(otherRoute.getDuration()) && isSameCities(otherRoute.getCities());
        }
        return false;
    }

    private boolean isSameCities(Iterator<City> cities){
        Iterator<City> itThisCities = this.getCities();
        while(itThisCities.hasNext() && cities.hasNext()) {
            if(!itThisCities.next().equals(cities.next())){
                return false;
            }
        }
        if(itThisCities.hasNext() || cities.hasNext()) {
            return false;
        }
        return true;
    }
}