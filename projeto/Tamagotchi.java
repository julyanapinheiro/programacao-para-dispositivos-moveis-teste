import java.util.Scanner;


public class Tamagotchi {

    public static void main(String[] args) {

    	/*o sistema vai receber do usuario os valores de fome, limpeza e energia, que sao tambem os valores maximos que essas variaveis podem atingir. Os diamantes e a idade devem ser inicializados com 0*/


    	int fome,limpeza,energia;
        int diamantes=0;
        int idade=0;
        int energiaMaxima,limpezaMaxima, fomeMaxima; 
        

        Scanner leitura =  new Scanner(System.in);/*receber valor do usuario*/
        int comando;
        System.out.println("Defina os valores de energia, fome e limpeza");
 
        
        energia=leitura.nextInt();
        fome= leitura.nextInt();
        limpeza=leitura.nextInt();
        
        energiaMaxima=energia;
        limpezaMaxima=limpeza;
        fomeMaxima=fome;
        
        /*A energia, limpeza e fome maxima vai ter os valores que foi digitado pelo usuario, porem essas nao sofrerao alteracoes durante a execucao do programa*/
        System.out.println("Energia Fome Limpeza Diamentes Idade");
        System.out.println("E:"+energia+"/"+energia+", F:"+fome+"/"+fomeMaxima+", L:"+limpeza+"/"+limpeza+", D:"+diamantes+", I:"+idade);
       
        System.out.println("O que você deseja fazer agora? Comandos");
        System.out.println("1-brincar, 2-dormir, 3-comer, 4-tomar banho, 5-mostrar, 6-fim");
        System.out.print("COMANDO: ");
        
        //Limpando o buffer do teclado
        do{
            if(energia>energiaMaxima){
                energia=energiaMaxima;
            }
            if(fome>fomeMaxima){
                fome=fomeMaxima;
            }
            if(limpeza>limpezaMaxima){
                limpeza=limpezaMaxima;
            }


            comando=leitura.nextInt();

            if(comando!=1&&comando!=2&&comando!=3&&comando!=4&&comando!=5&&comando!=6){

                System.out.println("Comando errado. Tente Novamente");
            }
            //mostrando as informações do bixinho
            if(comando==5){
                System.out.println("Energia Fome Limpeza Diamantes Idade");
                System.out.println("E:"+energia+"/"+energiaMaxima+", F:"+fome+"/"+fomeMaxima+", L:"+limpeza+"/"+limpezaMaxima+", D:"+diamantes+", I:"+idade);
            }
            // verifica se o usuario digitou 1-brincar, caso sim verifica se ainda tem energia,limpeza e fome suficiente, 
            /* se passar por todos os if, executa a ação de brincar, que diminui 2 na energia, 1 na fome e 3 na limpeza. Aumenta 1 diamante e 1 na idade.*/
            
            if(comando==1){
                if(energia<=0){
                    energia=0;
                    System.out.println("Falhou: O bixinho morreu");
                }else if(limpeza<=0){
                    limpeza=0;
                    System.out.println("Falhou: O bixinho morreu de sujeira");
                }else if(fome<=0){
                    fome=0;
                    System.out.println("Falhou: O bixinho morreu de fome");
                }else{
                    energia-=2;
                    fome-=1;
                    limpeza-=3;
                    diamantes++;
                    idade++;
                }

            }
            // verifica se o usuario digitou 3-comer, caso sim verifica se ainda tem energia,limpeza e fome suficiente, 
            /* se passar por todos os if, executa a ação de comer, que diminui 1 na energia, 2 na limpeza, aumenta 4 na fome e 1 na idade. O bixinho pode comer o tanto que quiser, mas a fome nao ultrapassa a fomemaxima */
            
            if(comando==3){
                if(energia<=0){
                    energia=0;
                    System.out.println("Falhou: O bixinho morreu");
                }else if(limpeza<=0){
                    limpeza=0;
                    System.out.println("Falhou: O bixinho morreu de sujeira");
                }else if(fome<=0){
                    fome=0;
                    System.out.println("Falhou: O bixinho morreu de fome");
                }else{
                    energia--;
                    limpeza-=2;
                    fome+=4;
                    idade++;
                    if(fome>fomeMaxima){
                        fome=fomeMaxima;
                    }
                }

            }
            // verifica se o usuario digitou 2-dormir, caso sim verifica se ainda tem energia,limpeza e fome suficiente, 
            /* se passar por todos os if, executa a ação de dormir, que diminui 1 na fome, aumenta a energia ate o maximo e a idade aumenta o numero de turnos que o PET dormiu */
            
            if(comando==2){
                if(energia<=0){
                    energia=0;
                    System.out.println("Falhou: O bixinho morreu");
                }else if(limpeza<=0){
                    limpeza=0;
                    System.out.println("Falhou: O bixinho morreu de sujeira");
                }else if(fome<=0){
                    fome=0;
                    System.out.println("Falhou: O bixinho morreu de fome");
                }else if(energiaMaxima-energia<5){
                   System.out.println("Falhou: O bichinho não está cansado");
               }else{
                   fome-=1;
                   idade+=(energiaMaxima-energia);
                   energia=energiaMaxima;
               }

            }
            //verifica se o usuario digitou 4, caso sim verifica se ainda tem energia,limpeza e fome suficiente
            /* se passar por todos os if, executa a ação de tomar banho, que aumenta a limpeza ao maximo e aumenta 2 na idade, diminui 3 na energia e 1 na fome */
            if(comando==4){
                if(energia<=0){
                    energia=0;
                    System.out.println("Falhou: O bixinho morreu");
                }else if(limpeza<=0){
                    limpeza=0;
                    System.out.println("Falhou: O bixinho morreu de sujeira");
                }else if(fome<=0){
                    fome=0;
                    System.out.println("Falhou: O bixinho morreu de fome");
                }else{
                    fome-=1;
                    energia-=3;
                    idade+=2;
                    limpeza=limpezaMaxima;
                }

            }
        }while(comando!=6);
        // continuara verificando enquanto o usuario nao digitar a opcao 6, que equivale ao fim do programa
        
        
        
    
        
        
    
    }
    
}
