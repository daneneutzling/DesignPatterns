package ChainOfResponsability;

class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor nextProcessor){

        super(nextProcessor);
    }

    public void processar(Number solicitacao) {
        if (solicitacao.getNumber() == 0) {
            System.out.println("ZeroProcessor : " + solicitacao.getNumber());
        } else {
            super.processar(solicitacao);
        }
    }
}