
package Visitor;


public interface ShoppingCartVisitor {
 
    int visit(Computer computer);
    int visit (Printer printer);
    
}
