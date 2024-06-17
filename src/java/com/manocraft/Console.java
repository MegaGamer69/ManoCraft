// Pacote do Código
package com.manocraft;

// Direitos Autorais:
// @MegaGamer69
// 2024 ManoCraft

// Importações Concretas Úteis do Java
import java.nio.*;
import java.util.ArrayList;
import java.util.List;

// Importações Concretas Úteis do LWJGL
import org.lwjgl.glfw.GLFWCharCallback.*;
import org.lwjgl.glfw.GLFWKeyCallback.*;

// Classe Responsavel por Controlar o Console
public class Console
{
    // uma Lista de Histórico dos Comandos
    public List<String> commandHistory = new ArrayList<>();

    // uma Lista de Histórico das Mensagens
    public List<String> messageHistory = new ArrayList<>();

    // Determina a Visibilidade do Console
    public boolean visibility;

    // Define o Comando Atual
    public String command = "Console/> ";
    
    // Cria uma nova Instância do Console
    public Console(long window, boolean visible)
    {
        // Verifica se o Manipulador da Janela está Nula
        if(window == 0)
        {
            System.out.println("Não é Possivel usar o Console, o Manipulador da Janela não Está Definido");
        }
        
        // Defina a Visibilidade pelo Construtor
        this.visibility = visible;
    }

    // Escreve a Mensagem
    public void write(String message)
    {
        // Imprima a Mensagem
        System.out.print(message);

        // Coloque a Mensagem no Histórico
        MessageHistory.add(message);
        
        // Esvazie a Entrada de Comando
        this.command = "Console/> ";
    }

    // Mude a Visibilidade
    public void setVisibility(boolean value)
    {
        // Mude a Visibilidade para o Valor Atribuído
        this.visibility = value;
    }
}
