package transports.domain_entities;

import java.util.Date;
import java.util.List;

/**
 * This ADT represents a transport journey planned
 * with a list of routes, an interval of dates and a truck assigned
 * @see Truck
 * @see Route
 */
public class Transport {
    private List<Route> transportRoutes;
    private Date dateStart;
    private Date dateEnd;
    private Truck truck;

    /*
        -st least 1 null
        -dates incompatibles
     */
    /**
     * Instances a new transport with the data provided.
     * @param transportRoutes
     * @param dateStart
     * @param dateEnd
     * @param truck
     */
    public Transport(List<Route> transportRoutes, Date dateStart, Date dateEnd, Truck truck){

    }
}
