package transports.domain_entities;


import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;
import transports.exceptions.InvalidMeasureException;

/**
 * this class represent every good that is supported for  transports
 * @see GoodType
 * @see UnitMeasure
 */
public class Good {
    private String contentName;
    private GoodType goodType;
    private UnitMeasure unitMeasure;

    /**
     * @param contentName  represents name of the good
     * @param goodType represents type of the good
     * @param unitMeasure represents unit measure unit of the good
     * @throws InvalidMeasureException when goodType and unitMeasure are incompatible
     */
    public Good(String contentName, GoodType goodType, UnitMeasure unitMeasure) throws InvalidMeasureException{
        this.contentName = contentName;
        this.goodType = goodType;
        boolean isUnitValid = false;

        switch (unitMeasure){
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
            /*
            //la throws verrà gestita in seguito da un try_catch e nel caso verrà richiamato un unità di misura di default
             */
            throw new InvalidMeasureException(this.goodType,this.unitMeasure);
        }

        }

    public Good(GoodType goodType) {
        this.goodType = goodType;
    }


    public UnitMeasure getUnitMeasure() {
        return unitMeasure;
    }


    public void setUnitMeasure(UnitMeasure unitMeasure) {
        this.unitMeasure = unitMeasure;
    }



    public String getContentName() {
        return contentName;
    }


    public void setContentName(String contentName) {
        this.contentName = contentName;
    }



    public GoodType getGoodType() {
        return goodType;
    }


    public void setGoodType(GoodType goodType) {
        this.goodType = goodType;
    }
}

