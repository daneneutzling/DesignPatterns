package Prototype;

public class Circle extends GeometricForm {
    public int raio;
    public Circle() {}

    public Circle(Circle circulo) {
        super(circulo);
        if (circulo != null) {
            this.raio = circulo.raio;
        }
    }

    @Override
    public GeometricForm clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object objetoCirculo) {
        if (!(objetoCirculo instanceof Circle) || !super.equals(objetoCirculo)) return false;
        Circle forma2 = (Circle) objetoCirculo;
        return forma2.raio == raio;
    }
}