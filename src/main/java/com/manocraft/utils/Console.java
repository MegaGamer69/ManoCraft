// Pacote do Código
package com.manocraft.utils;

// Direitos Autorais:
// @MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// Importações Concretas Úteis do Java
import java.lang.Thread;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;

// Classe Responsável pelo Registro do Log
public class Console
{
    // Histórico de Mensagens
    private static List<String> msgHistory = new ArrayList<String>();

    // Construtor Privado(NÃO PODE SER CHAMADO EM HIPÓTESE ALGUMA)
    private Console()
    {
        // Nada por Aqui, por Enquanto
    }

    // Registre uma Mensagem no Log
    public static void register(String output)
    {
        msgHistory.add(output);
    }

    public static List<String> getMessage(int index){
        return msgHistory.get(index);
    }
}