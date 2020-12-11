package transports;

import transports.domain_entities.Good;
import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;
import transports.exceptions.NullInputException;

public class TestClass {
    public static void main(String[] args) throws NullInputException {
        Good firts = new Good("ciao", GoodType.GASEOUS, UnitMeasure.MC);
        Good second = new Good("ciao", GoodType.GASEOUS, UnitMeasure.MC);
        System.out.println(firts.equals(second));
    }
}
