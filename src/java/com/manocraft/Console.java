// Pacote do Código
package com.manocraft;

// Direitos Autorais:
// @MegaGamer69
// 2024 ManoCraft

// Importações Concretas Úteis do Java
import java.nio.*;
import java.util.ArrayList.*;
import java.util.List.*;

// Importações Estáticas ùteis do LWJGL
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWCharCallback.*;
import static org.lwjgl.glfw.GLFWKeyCallback.*;

// Classe Responsavel por Controlar o Console
public class Console
{
    // uma Lista de Histórico dos Comandos
    public List<String> commandHistory = new ArrayList<>();

    // uma Lista de Histórico das Mensagens
    public List<String> messageHistory = new ArrayList<>().

    // Determina a Visibilidade do Console
    public boolean visibility = false;

    // Define o Comando Atual
    public String command = "Console/> ";
    
    // Cria uma nova Instância do Console
    public Console(long window, boolean visible = false)
    {
        // Verifica se o Manipulador da Janela está Nula
        if(window == null)
        {
            System.out.println("Não é Possivel usar o Console, o Manipulador da Janela não Está Definido");
        }
        
        // Defina a Visibilidade pelo Construtor
        this.visibility = visible;
    }

    // Escreve a Mensagem
    public void write(String message)
    {
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
