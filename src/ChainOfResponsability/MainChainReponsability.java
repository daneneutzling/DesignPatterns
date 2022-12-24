package ChainOfResponsability;

public class MainChainReponsability {
    public static void main(String[] args) {
        Chain corrente = new Chain();

        corrente.process(new Number(90));
        corrente.process(new Number(-50));
        corrente.process(new Number(0));
        corrente.process(new Number(91));
    }
}