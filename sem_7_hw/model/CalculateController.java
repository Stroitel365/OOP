package sem_7_hw.model;

import sem_7_hw.logger.Log;
import sem_7_hw.model.lib.ComplexNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalculateController {
private final static Map<String, Calculable> operations = new HashMap<>();

static {
    operations.put("+", (a,b) -> ComplexNumber.add(a,b).toString());
    operations.put("-", (a,b) -> ComplexNumber.subtract(a,b).toString());
    operations.put("*", (a,b) -> ComplexNumber.multiply(a,b).toString());
    operations.put("/", (a,b) -> ComplexNumber.divide(a,b).toString());
}


    public static String Calculate(String operation, String firstRealValue, String firstImagineryValue,
                                             String secondRealValue, String secondImagineryValue){

        final Logger log = Log.log(CalculateController.class.getName());
    
        ComplexNumber firstNum = new ComplexNumber(Double.parseDouble(firstRealValue), Double.parseDouble(firstImagineryValue));  
        ComplexNumber secondNum = new ComplexNumber(Double.parseDouble(secondRealValue), Double.parseDouble(secondImagineryValue));
            if (operations.containsKey(operation))  {
                log.log(Level.INFO, "Уравнение:"+firstNum.toString()+operation+secondNum.toString()+"="+operations.get(operation).Calculate(firstNum, secondNum));
                return operations.get(operation).Calculate(firstNum, secondNum);
            }
            else throw new RuntimeException("Операция не поддерживается");
        }

}
