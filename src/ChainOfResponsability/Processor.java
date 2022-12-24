package ChainOfResponsability;

abstract class Processor {
    private Processor proximoProcessador;
    public Processor(Processor proximoProcessador){

        this.proximoProcessador = proximoProcessador;
    }

    public void processar(Number solicitacao){
        if(proximoProcessador != null)
            proximoProcessador.processar(solicitacao);
    }
}