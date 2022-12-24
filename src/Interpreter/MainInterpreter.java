package Interpreter;

import java.util.ArrayList;

public class MainInterpreter {
    public static void main(String[] args) {
        ArrayList<RomanNumber> interpretadores = new ArrayList<RomanNumber>();
        interpretadores.add(new FourDecimalDigit());
        interpretadores.add(new ThreeDecimalDigits());
        interpretadores.add(new TwoDecimalDigits());
        interpretadores.add(new OneDecimalDigit());

        String numeroRomano = "XX";
        Context contexto = new Context(numeroRomano);
        for (RomanNumber numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }

        System.out.println(numeroRomano + " = "
                + Integer.toString(contexto.getOutputData()));
    }
}