/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.koushik;
import cse.koushik.cpr2;
/**
 *
 * @author ramvi
 */
public class Splash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        splash1 s = new splash1();
        cpr2 f=new cpr2();
        s.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                s.load.setText(Integer.toString(i)+"%");
                s.loadingbar.setValue(i);
                if(i==100){
                    s.setVisible(false);
                    f.setVisible(true);
                }
            }
        }
        catch(Exception e){
        }
    }
    
}
