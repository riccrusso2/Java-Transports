package transports.exceptions;
import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;

/**
this exception represents an error of imcompatible unit measure and good type
I.E. solid L

 */

public class InvalidMeasureException extends RuntimeException {
    private GoodType goodType;
    private  UnitMeasure unitMeasure;


    /**
     * @param goodType
     * @param unitMeasure
     * @see GoodType
     * @see  UnitMeasure
     */
    public InvalidMeasureException(GoodType goodType,UnitMeasure unitMeasure){
        super("good type selected(" + goodType.toString()+") and unit measure("+ unitMeasure.toString()+") are incompatible");
        this.goodType = goodType;
        this.unitMeasure= unitMeasure;
    }

    public GoodType getGoodType() {
        return goodType;
    }

    public UnitMeasure getUnitMeasure() {
        return unitMeasure;
    }
}
