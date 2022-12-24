package Visitor;

public class ShoppingCart implements iShoppingCart {
    public int visit(Computer pc){
        int preco = 0;
        if(pc.getValor() > 15000){
            preco = pc.getValor() - 50;
        } else {
            preco = pc.getValor();
        }
        System.out.println("---Computer--- Numero de serie: " + pc.getNumeroDeSerie() + ", Valor: " + preco);
        return preco;
      }
    
    public int visit(Printer printer){
      int preco = printer.getValorCartucho() * printer.getSemCartucho();
        System.out.println("---Impressora---  " + printer.getModelo() + ", Valor: " + preco);
        return preco;
    }
}