// o Pacote do Código
package com.manocraft.objects;

// Direitos Autorais:
// MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// Importações Estáticas Úteis do LWJGL
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.Callbacks.*;

// o Item é Criado e Registrado para poder Entrar no Jogo, tenha Certeza do Ícone do Item ter uma Resolução Baixa
// Normalmente, os Ícones são Criados numa Escala de 32 por 32 Pixels
public class Item
{
    // Váriaveis Úteis
    private String itemName;
    private Strind itemID;

    // Cria uma Nova Intância do Item
    public Item(String name, String identifier)
    {
        // Defina os Valores
        this.itemName = name;
        this.itemID = identifier;
    }

    // Obtenha e Retorna o Nome
    public void getItemName()
    {
        return itemName;
    }

    // Obtenha e Retorna o Identificador
    public void getItemID()
    {
        return itemID;
    }
}