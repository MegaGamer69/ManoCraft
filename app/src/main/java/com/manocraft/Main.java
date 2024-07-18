// Pacote do Código
package com.manocraft;

// Direitos Autorais:
// @MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// Importações Concretas Úteis do LWJGL
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

// Importações Concretas Úteis do Java
import java.nio.*;

// Importações Concretas Úteis do ManoCraft
import com.manocraft.utils.exception.NullWindowException;

// Importações Estáticas Úteis do LWJGL
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

    // Cria uma Nova Instância da Classe Principal
    public Main()
    {
        // Nada por Aqui, por Enquanto
    }
    
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
        if(!glfwInit())
        {
            // Lance uma Excessão se não Funcionou
            throw new IllegalStateException("não é Possivel Inicializar o GLFW");
        }
        
        // Configure o GLFW
        glfwWindowHint(GLFW_DECORATED, GLFW_TRUE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE);
        
        // Cria uma Janela
        window = glfwCreateWindow(800, 600, "ManoCraft", 0, 0);
        
        // Verifique se a Janela foi Criada
        if(window == NULL)
        {
            // Lançar a Excessão se não Funcionar
            throw new NullWindowException("Não foi Possivel Criar a Janela", null);
        }
        
        // Torne o Contexto do OpenGL Atual
        glfwMakeContextCurrent(window);
        
        // Habilita a Sincronização Vertical
        glfwSwapInterval(1);
        
        // Torne a Janela Vísivel
        glfwShowWindow(window);
        
        // Inicia o OpenGL
        GL.createCapabilities();
    }

    // Chamado para Repetir Ações
    public void loop()
    {
        // Loop para Ações Contínuas
        while(!glfwWindowShouldClose(window))
        {
            // Limpe os Buffers do GL
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            // Troque os Buffers do GLFW
            glfwSwapBuffers(window);

            // Faça um Poll de Eventos do GLFW
            glfwPollEvents();
        }

        GLFW.glfwTerminate();
    }

    // Função Estática para Ações Iniciais
    public static void main(String[] args)
    {
        // Váriavel Principal para Instância
        Main main = new Main();
        
        // Chame a Função de Execução
        main.run();
    }
}
