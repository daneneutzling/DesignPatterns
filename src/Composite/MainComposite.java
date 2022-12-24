package Composite;

import java.util.ArrayList;

public class MainComposite {
    public static void main(String[] args) {
        Project upgradePC = new Project(new ArrayList<iItem>());

        upgradePC.adicionarItem(new Product("RAM 256", 100));
        upgradePC.adicionarItem(new Product("RAM 512", 150));
        upgradePC.adicionarItem(new Product("PLACA DE VIDEO A4500", 2000));

        Project projetoServidor = new Project(new ArrayList<iItem>());
        projetoServidor.adicionarItem(new Product("RAM 1024", 250));
        projetoServidor.adicionarItem(new Product("RAM 1024", 250));
        projetoServidor.adicionarItem(new Product("PLACA DE VIDEO B8900", 4000));
        upgradePC.adicionarItem(projetoServidor);

        Project cabeamento = new Project(new ArrayList<iItem>());
        cabeamento.adicionarItem(new Product("CABO CAT 5E 500M", 1400));
        cabeamento.adicionarItem(new Product("CONECTORES RJ45 x 100", 1500));

        upgradePC.adicionarItem(cabeamento);

        System.out.println("Projeto avaliado no total de: R$ " + upgradePC.calcularPrecoFinal());
    }
}