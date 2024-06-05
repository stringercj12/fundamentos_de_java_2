package com.jeffersonferreira.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    public void selecaoCandidato() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = this.valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    public void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println("Imprimindo a lista de candidatos informando indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é o" + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    public void entrandoEmContato() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for (String candidato : candidatos) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do {
                atendeu = atender();
                continuarTentando = !atendeu;

                if (continuarTentando) {
                    tentativasRealizadas++;
                }else{
                    System.out.println("Contato realizado com sucesso");
                }
            } while (continuarTentando && tentativasRealizadas < 3);

            if(atendeu){
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
            }else{
                System.out.println("Não conseguimos contato com " + candidato + " número máximo de tentativas " + tentativasRealizadas + " realizadas.");
            }
        }
    }

    private double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    private boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
