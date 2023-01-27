package spel;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
public class spelet {
    kombat slag = new kombat();
            
        int s_HP=100; int s_ATKs=15; int s_ATKm=33; int s_ATKh=45; int s_DEF=10; int s_MAN=8; int s_SPD=10;
        int[] s_atk={s_ATKs,s_ATKm,s_ATKh};
        int[] fien={100,15,30,45,10};
        int[] fiende0=new int[5];
        int[] fiende1=new int[5];
        int[] fiende2=new int[5];
        int[] fiende3=new int[5];
    public static void main(String[] args){
        spelet sexig = new spelet();
        

        //int[] spelare={s_HP,s_atk,s_DEF,s_MAN,s_SPD};
  
        Scanner sex=new Scanner(System.in); 
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_ORANGE = "\u001B[33m";
        System.out.println(ANSI_GREEN +"""
                         Gröna grodan hoppar dig i famnen
                        
                                       _   _
	                              (.)_(.)
	                           _ (   _   ) _
	                          / \\/`-----'\\/ \\
	                        __\\ ( (     ) ) /__
	                        )   /\\ \\._./ /\\   (
	                         )_/ /|\\   /|\\ \\_(
                          tryck på enter för att fortsätta"""+ANSI_RESET);
        sex.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("vi ber å tappra äventyrare vad är ert namn"+ ANSI_ORANGE);
        String namn=sex.nextLine();
        System.out.println("tappre "+namn +" ge oss er längd och vikt!");
        int lngd=sex.nextInt();
        int vikt=sex.nextInt();
        /*String kropp;
        int[] t_trait={50,0,0,0,0,0,-5};
        int[] strait={-20,0,0,0,0,0,10};
        if(lngd>vikt) { kropp="smaling";
        s_HP+=t_trait[0]; s_SPD+=t_trait[6];
        } else { kropp="tjock";
        s_HP+=strait[0]; s_SPD+=strait[6];
        }
        
        System.out.println("din kroppstyp har automatiskt satts som "+ kropp);
        */
        
        
        //System.out.println(namn+" vad är din klass?!");
        kombat.slag(args);
    
    }

}