package transports.domain_entities;

import transports.exceptions.InvalidMeasureException
import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;

/**
 * This ADT represents a good supported for transports
 * linked to goodManager that will take care of manage a group of  them
 * each good is connected to a truck that transports it
 * @see GoodType
 * @see UnitMeasure
 */
public class Good {
    private String contentName;
    private GoodType goodType;
    private UnitMeasure unitMeasure;

    /**
     * Instances a new Good with the data provided
     * before instances a mew good check if areTypeAndUnitValid returns True,  otherwise do nothing
     * @param contentName Represents name of the good
     * @param goodType Represents type of the good
     * @param unitMeasure Represents the measure unit for the quantity of the good
     */

    public Good(String contentName, GoodType goodType, UnitMeasure unitMeasure) {
        /*
        this.contentName = contentName;
        this.goodType = goodType;
        boolean isUnitValid = false;
        */
    }

    /**
     * Checks if good type and unit of measure of good are compatible
     * @param goodType The good type
     * @param unitMeasure The unit of measure
     * @return true - if are compatible, false - otherwise
     * @throws InvalidMeasureException if return False,so good type and unit of measure of good are compatible
     */
    private boolean areTypeAndUnitValid(GoodType goodType, UnitMeasure unitMeasure)throws InvalidMeasureException{
        boolean isUnitValid = true;
        /*switch (unitMeasure){
            case GR:
            case KG:
                if(goodType==GoodType.SOLID||goodType==GoodType.WEED){
                    isUnitValid= true;
                }else{
                    isUnitValid= false;
                }
                break;
            case L:
            case MC:
                if(goodType==GoodType.LIQUID||goodType==GoodType.GASEOUS){
                    isUnitValid= true;
                }else{
                    isUnitValid= false;
                }
                break;
        }
        if(isUnitValid){
            this.unitMeasure = unitMeasure;

        }else{
            //la throws verrà gestita in seguito da un try_catch e nel caso verrà richiamato un unità di misura di default
            throw new InvalidMeasureException(this.goodType,this.unitMeasure);
        }*/
        return false;
    }

    public UnitMeasure getUnitMeasure() {
        return unitMeasure;
    }

    public String getContentName() {
        return contentName;
    }

    public GoodType getGoodType() {
        return goodType;
    }
}
