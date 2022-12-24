package Prototype;

import java.util.Objects;

public abstract class GeometricForm {
    public int x;
    public int y;
    public String cor;
    public GeometricForm() {}

    public GeometricForm(GeometricForm FormaGeometrica) {
        if (FormaGeometrica != null) {
            this.x = FormaGeometrica.x;
            this.y = FormaGeometrica.y;
            this.cor = FormaGeometrica.cor;
        }
    }

    public abstract GeometricForm clone();

    @Override
    public boolean equals(Object ObjectGeometricForm) {
        if (!(ObjectGeometricForm instanceof GeometricForm)) return false;
        GeometricForm forma2 = (GeometricForm) ObjectGeometricForm;
        return forma2.x == x && forma2.y == y && Objects.equals(forma2.cor, cor);
    }
}
