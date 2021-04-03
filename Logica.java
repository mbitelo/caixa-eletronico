import java.util.Scanner;
public class Logica{
    
    int nota[] = new int[7];
    
    public void Logica(){
    System.out.println("\fQuanto deseja sacar?");
    Scanner Valor = new Scanner(System.in);
    int Saque = Valor.nextInt();
    while (Saque >= 100 ){
           Saque = Saque-100;
           nota[0]++;
        }
    while(Saque>=50){
           Saque = Saque-50;
           nota[1]++;
        }
    while(Saque>=20){
           Saque = Saque-20;
           nota[2]++;
        }
    while (Saque>=10){
           Saque = Saque-10;
           nota[3]++;
        }
    while (Saque>=5){
           Saque = Saque-5;
           nota[4]++;
        }
    while (Saque>=2){
           Saque = Saque-2;
           nota[5]++;
        }
    while (Saque>=1){
           Saque = Saque-1;
           nota[6]++;
    }
    }
    // uma linha em branco
    // outra linha em branco    
    public String Nota100(){
       if (nota[0] > 1){ return nota[0]+" notas de 100, ";} else if (nota[0] > 0){ return nota[0]+" nota de 100, ";} else { return "nenhuma nota de 100, "; }
    }
    public String Nota50(){
       if (nota[1] > 0){ return nota[1]+" nota de 50, ";} else { return "nenhuma nota de 50, "; }
    }
    public String Nota20(){
       if (nota[2] > 1){ return nota[2]+" notas de 20, ";} else if (nota[2] > 0){ return nota[2]+" nota de 20, ";} else { return "nenhuma nota de 20, "; } 
    }
    public String Nota10(){
       if (nota[3] > 0){ return nota[3]+" nota de 10, ";} else { return "nenhuma nota de 10, "; } 
    }
    public String Nota5(){
       if (nota[4] > 0){ return nota[4]+" nota de 5, ";} else { return "nenhuma nota de 5, "; } 
    }
    public String Nota2(){
       if (nota[5] > 1){ return nota[5]+" notas de 2, ";} else if (nota[5] > 0){ return nota[5]+" nota de 2, ";} else { return "nenhuma nota de 2, "; } 
    }
    public String Nota1(){
       if (nota[6] > 0){ return nota[6]+" nota de 1, ";} else { return "nenhuma nota de 1."; } 
    }
    
    public String Escreve(){
       return "\nVocê receberá "+Nota100()+Nota50()+Nota20()+Nota10()+Nota5()+Nota2()+Nota1();
    }
  }
  

