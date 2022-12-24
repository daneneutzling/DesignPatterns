
package Visitor;

public class Computer implements Item {

    private int valor;
    private String numeroDeSerie;
    Computer(int cost, String serialNumber){
        this.valor = cost;
        this.numeroDeSerie = serialNumber;
    }
    
    public int getValor(){
        return valor;
    }
    
    public String getNumeroDeSerie(){
        return numeroDeSerie;
    }
    
    @Override
    public int accept(iShoppingCart visitor) {
        return visitor.visit(this);
    }

    
}
