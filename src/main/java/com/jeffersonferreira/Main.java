package com.jeffersonferreira;

import com.jeffersonferreira.candidatura.ProcessoSeletivo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();

        processoSeletivo.analisarCandidato(1900.0);
        processoSeletivo.analisarCandidato(2200.0);
        processoSeletivo.analisarCandidato(2000.0);

        processoSeletivo.selecaoCandidato();
        processoSeletivo.imprimirSelecionados();
        processoSeletivo.entrandoEmContato();
    }
}