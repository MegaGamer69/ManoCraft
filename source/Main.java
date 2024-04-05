package;

// Importações Úteis
import javafx.graphics.application.*;
import javafx.stage.*;
import javafx.scene.*;

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
    }

	// a Função Principal
	private static void main(String[] args)
	{
		// Lance a Aplicação com Argumentos
		Application.launch(args);
	}
}
