package transports.domain_entities;

import java.time.Duration;
import java.util.List;

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
     * @throws NullPointerException if at least one of the parameters is null
     */
    public Route(List<City> cities, int gg, int hh, int mm) throws NullPointerException {
    }

    public List<City> getCities() {
        return cities;
    }

    public Duration getDuration() {
        return duration;
    }
}