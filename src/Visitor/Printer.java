
package Visitor;

public class Printer implements Item {

    private final int priceOfCartridge;
    private final int noOfCartridge;
    private final String modelNumber;
    
    public Printer (int priceOfCartridge, int noOfCartridge, String modelNumber){
        this.priceOfCartridge = priceOfCartridge;
        this.noOfCartridge = noOfCartridge;
        this.modelNumber = modelNumber;
    }
    
    public int getPriceOfCartridge(){
        return priceOfCartridge;
    }
    
    public int getnoOfCartridge(){
        return noOfCartridge;
    }
    
    public String getmodelNumber(){
        return this.modelNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
   
    return visitor.visit(this);
        
    }
    
}
