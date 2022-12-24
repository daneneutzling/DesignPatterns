package Prototype;

public class Rectangle extends GeometricForm {
    public int largura;
    public int altura;
    public Rectangle() {}

    public Rectangle(Rectangle retangulo) {
        super(retangulo);
        if (retangulo != null) {
            this.largura = retangulo.largura;
            this.altura  = retangulo.altura;
        }
    }

    @Override
    public GeometricForm clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object objetoRetangulo) {
        if (!(objetoRetangulo instanceof Rectangle) || !super.equals(objetoRetangulo)) return false;
        Rectangle forma2 = (Rectangle) objetoRetangulo;
        return forma2.largura == largura && forma2.altura == altura;
    }
}