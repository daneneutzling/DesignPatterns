package Composite;

public class Product implements iItem {
    private static String nameProduct;
    private double valueProduct;

    public static String getNameProduct() {
        return nameProduct;
    }
    public Product(String nome, double preco) {
        this.nameProduct = nome;
        this.valueProduct = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return valueProduct;
    }
}
