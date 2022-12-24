
package Visitor;

public class Computer implements Item {

    private int cost;
    private String serialNumber;
    Computer(int cost, String serialNumber){
        this.cost = cost;
        this.serialNumber = serialNumber;
    }
    
    public int getPrice(){
        return cost;
    }
    
        public String getSerialNumber(){
        return serialNumber;
    }
    
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    
}
