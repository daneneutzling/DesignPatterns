
package Visitor;


public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    
    public int visit(Computer computer){
        int cost = 0;
        if(computer.getPrice() > 15000){
            cost = computer.getPrice() - 50;
        }
        else{
            cost = computer.getPrice();
        }
        System.out.println("---Computador--- SerialNumber: " + computer.getSerialNumber() + ", Valor: " + cost );
        return cost;
      }
    
    public int visit(Printer printer){
      int cost = printer.getPriceOfCartridge() * printer.getnoOfCartridge();
        System.out.println("---Impressora---  " + printer.getmodelNumber() + ", Valor: " + cost);
        return cost;
    }
    
}
