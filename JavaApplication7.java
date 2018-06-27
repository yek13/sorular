/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int dizi [][]=new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                dizi[i][j]=k.nextInt();
            }
        }
        int enk=2^10,enb=0;
          for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 2; j++)
                {

                    if (dizi[i][j] > enb)
                    {
                        enb = dizi[i][j];
                    }
                    if (dizi[i][j] < enk)
                    {
                        enk = dizi[i][j];
                    }
                }
            }
          System.out.println("4.Değeri Giriniz:");
           int dizi1 [][]=new int[2][1];
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 1; j++)
                {
                    dizi1[i][j]=k.nextInt();
                }
            }
            
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 1; j++)
                {
                    if(dizi[i][j]<=enb && dizi[i][j]>=enk){
                        System.out.println("Dizimiz üçgen sınırı içindedir.");
                    }else{
                        System.out.println("Değildir.");
                    }
                }
            }
            
    }
    
}
