package ChainOfResponsability;

class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor proximoProcessador){
        super(proximoProcessador);
    }

    public void processar(Number solicitacao) {
        if (solicitacao.getNumber() < 0) {
            System.out.println("Processador Negativo : " + solicitacao.getNumber());
        } else {
            super.processar(solicitacao);
        }
    }
}