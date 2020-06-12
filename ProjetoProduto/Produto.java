class Produto {

    String descricao;
    String fornecedor;
    double valorCusto;
    int quantidade;
    
    public double calcularValorEmEstoque() {
        return this.valorCusto * this.quantidade;
    }
    
    public double adicionar65Porcento() {
        return this.valorCusto * 1.65;
    }
    
    public double adicionarQualquerPorcentagemAoCusto(double valorPorcentagem) {
        return this.valorCusto + (valorPorcentagem/100) * this.valorCusto;
    }
    
}