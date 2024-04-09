// os Blocos são Parte do Jogo, tendo 6 Faces e cada Face têm 4 Vertices
public class Block
{
    // o Nome do Bloco aqui
    private String blockName = "Blank Block";
    
    // a Resistência do Bloco ao Soco
    private int blockPunchResistence = 0;
    
    // o Determinador de se o Bloco está Atívo ou não
    private boolean blockIsActive = true;
    
    // Cria uma Nova Instância de Bloco
    public Block(String name, int punchResistence)
    {
        // Defina os Valores Antigos pelos Fornecidos no Construtor
        this.blockName = name;
        this.blockPunchResistence = punchResistence;
    }
    
    // Função para Destruir o Bloco
    public void destroy()
    {
        this.blockIsActive = false;
    }
    
    // Defina se o Bloco estará Ativo ou Inativo
    public boolean setActive(boolean value)
    {
        // Defina o Valor Antigo da Variavel para um Novo Valor
        this.blockIsActive = value;
        
        // Retorna o Novo Valor
        return value;
    }
    
    // Aplique Dano ao Bloco com o Soco
    public int damageThis(int damage)
    {
        // Defina o Valor Antigo da Variavel para o Novo Valor
        this.blockPunchResistence -= damage;
        
        // Retorne o Valor Fornecido
        return damage;
    }
}