// Pacote do Código
package com.manocraft.utils.exception;

// Direitos Autorais:
// @MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// Importações Concretas Úteis do Java
import java.lang.Exception;
import java.lang.Throwable;

// Usada para Casos da Janela(Criada apartir do GLFW) não pode ser Criada
public class NullWindowException extends Exception
{
    // Cria uma Nova Instância para a Classe
    public NullWindowException(String message, Throwable cause)
    {
        // Chama o Construtor da Superclasse
        super(message, cause);
    }
}
