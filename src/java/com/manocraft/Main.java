// Pacote do Código
package com.manocraft;

// Direitos Autorais:
// @MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// Importações Úteis
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

// Importações do Java Úteis
import java.nio.*;

// Importações Estáticas Úteis
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

// a Classe Principal para o Jogo
public class Main
{
    // o Manipulador da Janela
    private long window;
    
    // Chamado quando a Aplicação é Executada
    public void run()
    {
        // Inicializa o Jogo
        init();
        loop();
        
        // Libera a Callback de Janela e Desintegra-a
        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);

        // Termina o GLFW e Libera a Callback de Erro
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    // Chamado para Iniciar Ações
    public void init()
    {
        // Defina a Callback de Erro
        GLFWErrorCallback.createPrint(System.err).set();

        // Verifica se a Inicialização do GLFW Funcionou ou não
        if(!glfwInit)
        {
            // Lance uma Excessão se não Funcionou
            throw new illegalStateException("não é Possivel Inicializar o GLFW");
        }
    }

    // Chamado para Repetir Ações
    public void loop()
    {
        // Vazio por Enquanto...
    }
}
