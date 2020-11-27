package transports.managers;
import   transports.domain_entities.PeriodOccupied
import transports.domain_entities.Truck;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
        * This ADT is used to represent a manager for PeriodOccupied available
        * @see PeriodOccupied
        */

public class PeriodOccupiedManager {
    Collection<PeriodOccupied> container;


        /**
         *  creates a new instace of a manager of PeriodOccupied
         *
         */
        public PeriodOccupiedManager(){

        }

        /**
         * Checks if the truck provided exists in this manager
         * @param periodOccupied The period to search in this manager
         * @return true - if is in this manager, false - otherwise
         * @throws NullinputException if the input is null
         */
        private boolean existsPeriod(PeriodOccupied periodOccupied){
            return false;
        }



        /**
         * Takes care of adding a period,already instantiaded, in this manager
         * @param periodOccupied Represents a period object, already instantiated, to be added
         *@throws InvalidManagerInputException  already in
         * @throws NullinputException if the input is null
         */

        public void insert(PeriodOccupied periodOccupied){

        }



        /**
         * Takes care of removing the truck given
         * @param  periodOccupied  period object that will be removed from this manager
         * @throws InvalidManagerInputException or doesn't exist
         * @throws NullinputException if the input is null
         */

        public void remove(PeriodOccupied periodOccupied){


        }


        /**
         *it is based on the private  iterator method
         * @param n is the number of trucks you want
         * @return arrayList that contain n trucks you want
         *
         */
        public ArrayList<PeriodOccupied> getPeriodSupported(int n){

        }

        /**
         * @return a standard iterator over the good of this collection
         */
        private Iterator<PeriodOccupied> iterator(){
            Iterator res= new Iterator(this.container);
            return res;

        }

    }

}
