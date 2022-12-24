
package Visitor;

public class Printer implements Item {

    private final int valorCartucho;
    private final int semCartucho;
    private final String modelo;
    
    public Printer(int valorCartucho, int semCartucho, String modelo){
        this.valorCartucho = valorCartucho;
        this.semCartucho = semCartucho;
        this.modelo = modelo;
    }
    
    public int getValorCartucho(){
        return valorCartucho;
    }
    
    public int getSemCartucho(){
        return semCartucho;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    @Override
    public int accept(iShoppingCart visitor) {
   
    return visitor.visit(this);
        
    }
    
}
