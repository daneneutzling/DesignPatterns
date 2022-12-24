
package Visitor;

public class Costumer {
    public static void main (String [] args){
        Item[] items = new Item []{
            new Computer(2000, "com1234" ), new Computer(14500, "com323"),
            new Printer (1000, 6, "HP 302x"), new Printer(950, 7, "epson 45")
        };
        int totalCost = calculatePrice(items);
        System.out.println("\nValor toral: " + totalCost);
    }
    private static int calculatePrice(Item[] items){
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for(Item item:items){
           sum = sum+item.accept(visitor);
        }
        return sum;
    }
    
}
