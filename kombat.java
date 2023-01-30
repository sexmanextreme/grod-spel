package spel;
import java.util.Scanner;
public class kombat {


    static void slag(String [] args){
       spelet feet = new spelet();
       Scanner sex1=new Scanner(System.in); 
       boolean tur;
    //kombat startar
    //check för att se om både du och fienden lever
    if(feet.fien[0]>0&& feet.s_HP>0){
        atk();
        System.out.println("du attackerar!");
         System.out.println("fiende stats: "+feet.fien[0]+" "+feet.fien[1]+" "+feet.fien[2]+" "+feet.fien[3]+" "+feet.fien[4]);
//val för det du ska göra
do{ System.out.println("1. offence \n 2. defence \n 3. magi"); int antsex=sex1.nextInt();
switch (antsex){
            case 1 -> {int cool=(int) Math.floor(Math.random() * 10);
                //gör skada du vet, ju högre, ju mer skada desto lägre chans att träffa
                atk();
                System.out.println("1. HÅRT \n 2. HÅRDARE\n 3. HÅRDAST");
                int allsex1=sex1.nextInt();
                switch(allsex1){
                    case 1 ->{
                        feet.fien[0]-=15;
                        
                    }
                    case 2 ->{
                        feet.fien[0]-=30;
                        
                    }
                    case 3 ->{
                        feet.fien[0]-=100;
                        
                    }
                }
            }
            case 2 -> {// ökar bara defence mellan två tal i en runda
 
            }
            case 3 -> {//utility attacker
                System.out.println("1. HÅRT\n2. HÅRDARE");
                int allsex2=sex1.nextInt();
                switch(allsex2){
                    case 1 ->{
                        feet.s_HP=0;
                        
                    }
                    case 2 ->{
                        
                        
                    }
                }
            }
            default -> {System.out.println("välj en annan");
            
            
            }
            
            
        }tur=false;
 System.out.println("fiende stats: "+feet.fien[0]+" "+feet.fien[1]+" "+feet.fien[2]+" "+feet.fien[3]+" "+feet.fien[4]);
}while(tur);
do{
    int cool=(int) Math.floor(Math.random() * 10);
    feet.s_HP-=cool/2;
    
    du();
    System.out.println(feet.s_HP);
    tur=true;
}while(!tur);
    }else if(feet.fien[0]==0){//fienden dör du lever
        System.out.println("du vann!    woo");
}
    else if(feet.s_HP<=0&&feet.fien[0]>0){//du dör fienden lever
        System.out.println("""
                           sucks to suck
                            ass to ass
                           """);
}
    
    
}
    static void atk(){
System.out.print
        
("""
 |-----------------------------------------------------------------------------------|
 |                                                                                   |
 |                                                                                   |
 |                                      (0)-(0)                                      |
 |                                     .-(___)-.                                     |
 |                                      _<   >_                                      |
 |                                      \\/   \\/                                      |
 |                                                                                   |
 |                                                                                   |
 |                                                                                   |
 |-----------------------------------------------------------------------------------|
 """);
}
static void du(){
    System.out.println("""
                       
                       fienden attackerar
                       
                       (•̀o•́)ง
                       """);
}
           

}
