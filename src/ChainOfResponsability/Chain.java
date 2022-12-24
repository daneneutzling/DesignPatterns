package ChainOfResponsability;

public class Chain {
    Processor corrente;
    public Chain(){
        buildChain();
    }

    private void buildChain() {
        corrente = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }
    public void process(Number solicitation) {
        corrente.processar(solicitation);
    }
}

