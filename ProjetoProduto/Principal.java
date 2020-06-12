class Principal {

    public static void main (String args[]) {
    
    Produto produto = new Produto();
    
    produto.descricao = "Cursinho EAD do Cury";
    produto.fornecedor = "Cury Corporation";
    produto.valorCusto = 5000;
    produto.quantidade = 3987;
    
    System.out.println("Fornecedor: "+produto.fornecedor
                       +"\nDescrição: " +produto.descricao
                       +"\nValor custo: "+produto.valorCusto
                       +"\nQuantidade: "+produto.quantidade
    );
    
    System.out.println("Valor em estoque: " +produto.calcularValorEmEstoque()+" R$");
    System.out.println("Adicionar 65%: "+produto.adicionar65Porcento());
    System.out.println("Adicionar qualquer porcentagem: "+produto.adicionarQualquerPorcentagemAoCusto(20));
    
    }

}