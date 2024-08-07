// Pacote do Código
package com.manocraft.objects;

// Direitos Autorais:
// @MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// Importações Estáticas Úteis do LWJGL
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.Callbacks.*;

// o Item é Criado e Registrado para poder Entrar no Jogo, tenha Certeza do Ícone do Item ter uma Resolução Baixa
// Normalmente, os Ícones são Criados numa Escala de 32 por 32 Pixels
public class Item
{
    // Váriaveis Úteis
    private String itemID;
    
    /**
     *  Cria uma Nova Intância do Item
     *  @param identifier Define o Identificador Único do Item
     */
    public Item(String identifier)
    {
        // Defina os Valores
        this.itemID = identifier;
    }

    // Obtenha e Retorna o Identificador
    public String getItemID()
    {
        return itemID;
    }
}
