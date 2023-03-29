package spel;
import java.util.Scanner;
public class kombat {


    static void slag(String [] args){
       spelet feet = new spelet();
       Scanner sex1=new Scanner(System.in); 
       boolean tur=true;
       boolean hm=feet.fien[0]>0&& feet.s_HP>0;
    //kombat startar
    int cool=(int) Math.floor(Math.random() * 10);
    double cola=(Math.random() *15)*0.3;
    boolean figs=true;
    while(figs){
   if(tur&& feet.s_HP>0){
        //atk();
        System.out.println("du attackerar!");
         System.out.println("fiende stats: "+feet.fien[0]+" "+feet.fien[1]+" "+feet.fien[2]+" "+feet.fien[3]+" "+feet.fien[4]);
//val för det du ska göra

System.out.println("1. offence \n 2. defence \n 3. magi"); int antsex=sex1.nextInt();
switch (antsex){
            case 1 -> {
                //gör skada du vet, ju högre, ju mer skada desto lägre chans att träffa                
                System.out.println("1. HÅRT \n 2. HÅRDARE\n 3. HÅRDAST");
                int allsex1=sex1.nextInt();
                switch(allsex1){
                    case 1 ->{
                        cola=Math.floor(cola);
                        if(cola==0){
                            System.out.println("missa L");
                        }
                        feet.fien[0]-=15*cola;
                        
                        
                    }
                    case 2 ->{
                        cola=Math.floor(cola);
                        if(cola==0){
                            System.out.println("missa L");
                        }
                        
                        feet.fien[0]-=30*cola;
                        
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
}

if(!tur&&feet.fien[0]>=1){
    
    //cool/=4;
    feet.s_HP-=cool;
    
    du();
    System.out.println(feet.s_HP+" "+cool);
    tur=true;
}
    
     if(feet.fien[0]<=0&&feet.s_HP>0){//fienden dör du lever
        System.out.println("du vann!    woo");
        figs=false;
}
    else if(feet.s_HP<=0&&feet.fien[0]>0){//du dör fienden lever
        System.out.println("""
                           sucks to suck
                            ass to ass
                           """);
        figs=false;
}}


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
static int skada(double cola){
    // jag ska flytta över vanliga skade systemet mot fienden till hit så den blir printad mycket mera smoothly(jag får inte tillräckligt betalt för detta!!!!!!!)
    kombat åsna = new kombat();
    cola=Math.floor(cola);
                        if(cola==0){
                            System.out.println("missa L");
                        }else if(false){
                            return (int) (15*cola);
                        }else if(true){
                            return (int)(30*cola);
                        }else{
                            return (int) 100;
                        }
                        
}

}
