/**
 * @Author Vinícius de Oliveira
 * @Version 1.0
 * @Since 01/06/2020 - 08:15
 * @Category Model
 */
public class Nadador {

    private String nome;
    private int idade;
    
    public Nadador() {
    }
    
    /**
     * construtor voltado para testes
     * @Param Nome recebido por construtor
     * @Param Idade recebida por construtor
     */
    public Nadador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * Return Retorna a classificação categórica do nadador sob sua faixa etária, 
     * se o mesmo está apto para o exercício do esporte
     */
    public String classificarNadador() {
        if(this.idade >= 18) {
          return "Categoria Adulto.";  
        } else if(this.idade >=11 && this.idade <=17) {
        return "Categoria Juvenil.";
        } else if(this.idade >=8 && this.idade <=10) {
        return "Categoria Infantil.";
    }
    
    return "Não está na faixa etária para ser nadador.";

  }
  
  @Override
  public String toString() {
      return "\nNome: " + this.getNome()
           + "\nIdade: " + this.getIdade()
           + "\nCategoria: " + this.classificarNadador();
  }
  
}