package;

// Importações Úteis
import javafx.application.Application;
import javafx.stage.Group;
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
		// Variaveis Locais Úteis
    	Group root = new Group();
    	Scene scene = new Scene(root, 200, 200);
		scene.colorFill(Color.BLACK);

		// Defina o Estágio e a Cena
		scene.setStage(stage);
		stage.show();
    }

	// a Função Principal
	public static void main(String[] args)
	{
		// Lance a Aplicação com Argumentos
		Application.launch(args);
	}
}
