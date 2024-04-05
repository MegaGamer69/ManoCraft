// Importações Úteis
import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Scene;

// Direitos Autorais:
// @MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// a Classe Principal para o Jogo
public class Main extends Application
{
    @Override
    // a Função Inicial
    public void start(Stage stage)
    {
        // Chama a Função Inicial da Superclasse
        super.start();
        
		// Variaveis Locais Úteis
    	Group root = new Group();
    	Scene scene = new Scene(root, 200, 200);
        Color color = new Color();

        // Altere a Cor da Cena
		scene.setFill(color.BLACK);

		// Defina o Estágio e a Cena
		stage.setScene(scene);
		stage.show();
    }

	// a Função Principal
	public static void main(String[] args)
	{
		// Lance a Aplicação com Argumentos
		Application.launch(args);
	}
}
