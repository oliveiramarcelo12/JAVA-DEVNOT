package EstruturaDecisaoIf;

import java.util.Scanner;

public class EstruturaDecisaoIf {
    Scanner sc = new Scanner(System.in);
    public void decisaoIf() {
        System.out.println("qual é o preço do Produto?");
        double precoProduto = sc.nextDouble();
        double percentualDesconto = 0.0;
        if (precoProduto>=200 && precoProduto<300) {
            // Estrutura de desisão if
            // Desconto para produtos de alto valor.
            percentualDesconto = 10.0;
            
        }
        if (precoProduto>=100 && precoProduto<200) { // Estrutura de desisão if
            // Desconto para produtos de alto valor.
            percentualDesconto = 5.0;
        }
        if (precoProduto>=300 && precoProduto<400) {
            percentualDesconto=15.0;
            
        }
        if (precoProduto>=400) {
            percentualDesconto=20.0;
            
        }
    
        // Regra de três
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto );

    }

}
