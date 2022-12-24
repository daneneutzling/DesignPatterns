
package Visitor;

public class MainVisitor {
    public static void main (String [] args){
        Item[] itens = new Item []{
            new Computer(2000, "com1234" ), new Computer(14500, "com323"),
            new Printer(1000, 6, "HP 302x"), new Printer(950, 7, "epson 45")
        };
        int valorTotal = calcularPreco(itens);
        System.out.println("\n Valor toral: " + valorTotal);
    }
    private static int calcularPreco(Item[] items){
        iShoppingCart visitor = new ShoppingCart();
        int soma = 0;
        for(Item item:items){
           soma = soma +item.accept(visitor);
        }
        return soma;
    }
    
}
