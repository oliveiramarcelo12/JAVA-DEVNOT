package Operacoes.exercicioIfElse;

import java.util.Scanner;

public class exercicios {
    Scanner sc= new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Informe o valor1");
        int Valor1= sc.nextInt();
        System.out.println("Informe o valor2");
        int Valor2= sc.nextInt();
        if (Valor1> Valor2) {
            System.out.println("O maior valor é"+Valor1);


        }else if (Valor1<Valor2){
            System.out.println("O Maior Valor é"+Valor2);
        }
        else{
            System.out.println("Os Valores são Iguais");
        }
        
            
        }
        

     
        





        public void exercicio2() {
            System.out.println("Informe o Ano de Nascimento");
            int data1=sc.nextInt();
            int data2=2007;
            if (data1<=data2) {
                System.out.println("Ela  pode votar" );
                
                
            }
            else if (data1>=data2){
                System.out.println("Ela não pode votar");
            }
                

    
            
            
        
        }
        
        public void exercicio3() {
            System.out.println("Informe a Senha");
            int Senha1= sc.nextInt();
            int Senha2=1234;
            if (Senha1==Senha2) {
                System.out.println("Acesso Permitido");

                
            }
            else if (Senha1!=Senha2) {
                System.out.println("Acesso Negado");
                
            }
            
        }
       
        public void exercicio4() {
            System.out.println("Número de Maçãs");
            double numeroMacas= sc.nextDouble();
            double Valor1=0.25;
            double Valor2=0.30;
            double precoMacas=0.0;
           
            
            
            if (numeroMacas>=12) {
                precoMacas=numeroMacas*Valor1;
                 
            }
            else if(numeroMacas<=12){
               precoMacas=Valor2*numeroMacas;

            }
            System.out.println("Preço Final R$"+precoMacas);
            
                
            } 
            
            


            
    
            
        
       
        public void exercicio5() {
            System.out.println("Digite Um Número Inteiro");
            int Numero1=sc.nextInt();
            System.out.println("Digite Mais Um Número Inteiro");
            int Numero2=sc.nextInt();
            System.out.println("Digite O Ultimo Número Inteiro");
            int Numero3=sc.nextInt();

            

            
        }
        
         public void exercicio6(){
                    
                }
    
    
   
    
    


}
   