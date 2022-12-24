package ChainOfResponsability;

class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor proximoProcessador){

        super(proximoProcessador);
    }

    public void processar(Number solicitacao) {
        if (solicitacao.getNumber() > 0) {
            System.out.println("Processo positivo : " + solicitacao.getNumber());
        } else {
            super.processar(solicitacao);
        }
    }
}
