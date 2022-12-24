package Interpreter;

public abstract class RomanNumber {
    public void interpretar(Context contexto) {
        if (contexto.getInputData().length() == 0) {
            return;
        }
        if (contexto.getInputData().startsWith(nine())) {
            AddValueOutputData(contexto, 9);
            consumeTwoInputData(contexto);

        } else if (contexto.getInputData().startsWith(four())) {
            AddValueOutputData(contexto, 4);
            consumeTwoInputData(contexto);

        } else if (contexto.getInputData().startsWith(five())) {
            AddValueOutputData(contexto, 5);
            consumeOneInputData(contexto);
        }
        while (contexto.getInputData().startsWith(one())) {
            AddValueOutputData(contexto, 1);
            consumeOneInputData(contexto);
        }
    }

    private void consumeOneInputData(Context contexto) {
        contexto.setInputData(contexto.getInputData().substring(1));
    }

    private void consumeTwoInputData(Context contexto) {
        contexto.setInputData(contexto.getInputData().substring(2));
    }

    private void AddValueOutputData(Context contexto, int numero) {
        contexto.setOutputData(contexto.getOutputData() + (numero * multiplier()));
    }

    public abstract String one();

    public abstract String four();

    public abstract String five();
    public abstract String nine();
    public abstract int multiplier();
}