package transports.domain_entities;

import transports.exceptions.InvalidTypeMeasureException;
import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;
import transports.exceptions.NullInputException;

/**
 * This ADT represents a good supported for transports.
 * @see GoodType
 * @see UnitMeasure
 */
public class Good {
    private String contentName;
    private GoodType goodType;
    private UnitMeasure unitMeasure;

    /**
     * Instances a new Good with the data provided. Before that checks
     * if type and unit of measure are compatible otherwise assign the default unit of measure for that type:
     * SOLID    ---> KG
     * LIQUID    ---> L
     * GASEOUS  ---> L
     *
     * @param contentName Represents name of the good
     * @param goodType Represents type of the good
     * @param unitMeasure Represents the measure unit for the quantity of the good
     * @throws NullInputException if at least one of the parameters is null
     */
    public Good(String contentName, GoodType goodType, UnitMeasure unitMeasure)throws NullInputException {
        if (contentName == null || goodType == null || unitMeasure == null) {
            throw new NullInputException("one of the parameters is null");
        }
        try {
            areTypeAndUnitValid(goodType, unitMeasure);
            this.unitMeasure=unitMeasure;
        } catch (InvalidTypeMeasureException ex) {
            if (goodType == GoodType.SOLID) {
                this.unitMeasure = UnitMeasure.KG;

            } else if (goodType == GoodType.LIQUID) {
                this.unitMeasure = UnitMeasure.L;


            } else if (goodType == GoodType.GASEOUS) {
                this.unitMeasure = UnitMeasure.L;


            }

        }
        finally {
            this.contentName= contentName;
            this.goodType= goodType;
        }


    }

    /**
     * Checks if good type and unit of measure of a good are compatible
     *
     * @param goodType The good type
     * @param unitMeasure The unit of measure
     * @return true - if are compatible
     * @throws InvalidTypeMeasureException if are not compatible
     */
    private boolean areTypeAndUnitValid(GoodType goodType, UnitMeasure unitMeasure) throws InvalidTypeMeasureException {
        boolean isUnitValid = true;
        switch (unitMeasure){
            case GR:
            case KG:
                if(goodType==GoodType.SOLID){
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
        if(!isUnitValid){
            //la throws verrà gestita in seguito da un try_catch e nel caso verrà richiamato un unità di misura di default
            throw new InvalidTypeMeasureException(goodType,unitMeasure);
        }
        return isUnitValid;
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


    @Override
    public boolean equals(Object good) {
        if(good instanceof Good){
            Good good1 = (Good) good;
            if(this.getContentName().equals(good1.getContentName()) && (this.getGoodType().equals(good1.getGoodType())) && (this.getUnitMeasure().equals(good1.getUnitMeasure()))){
                return true;
            }
        }
        return false;
    }
}
