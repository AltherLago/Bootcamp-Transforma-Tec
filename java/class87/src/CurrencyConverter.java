public class CurrencyConverter {

    public Double converterBRLtoUSD(Double value){

        Double converterAmount = 0.0;

        try{
            if(value <= 0.0){
                throw new InvalidCurrencyValueException("Invalid Value");
            }else{
                converterAmount = value / 5.50;
            }
        }catch(InvalidCurrencyValueException e){
            System.out.println(e.getMessage());
        }

        return converterAmount;

    }
}
