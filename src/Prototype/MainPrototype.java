package Prototype;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {
    public static void main(String[] args) {
        List<GeometricForm> formas     = new ArrayList<>();
        List<GeometricForm> copiaFormas = new ArrayList<>();

        Circle circulo = new Circle();
        circulo.x    = 10;
        circulo.y    = 20;
        circulo.raio = 15;
        circulo.cor  = "vermelho";
        formas.add(circulo);

        Circle anotherCircle = (Circle) circulo.clone();
        formas.add(anotherCircle);

        Rectangle retangulo = new Rectangle();
        retangulo.largura   = 10;
        retangulo.altura    = 20;
        retangulo.cor       = "azul";
        formas.add(retangulo);

        cloneAndCompare(formas, copiaFormas);
}

    public static void cloneAndCompare(List<GeometricForm> formas, List<GeometricForm> copiaFormas) {
        for (GeometricForm forma : formas) {
            copiaFormas.add(forma.clone());
        }

        for (int i = 0; i < formas.size(); i++) {
            if (formas.get(i) != copiaFormas.get(i)) {
                System.out.println(i + ": As formas são objetos diferentes!");
                if (formas.get(i).equals(copiaFormas.get(i))) {
                    System.out.println(i + ": E são identicos!");
                } else {
                    System.out.println(i + ": Mas não são identicos!");
                }
            } else {
                System.out.println(i + ": As formas dos objetos são identicas!");
            }
        }
    }
}