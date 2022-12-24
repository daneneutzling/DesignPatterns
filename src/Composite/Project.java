package Composite;

import java.util.List;

public class Project implements iItem {
    private List<iItem> itemsProject;

    public Project(List<iItem> items) {
        this.itemsProject = items;
    }

    public void adicionarItem(iItem item) {
        this.itemsProject.add(item);
    }

    @Override
    public double calcularPrecoFinal() {
        double precoTotal = 0;
        for (iItem item : itemsProject){
            precoTotal += item.calcularPrecoFinal();
            System.out.println("Item: " + Product.getNameProduct() + ". Valor: R$ " + item.calcularPrecoFinal());
        }
        return precoTotal;
    }
}
