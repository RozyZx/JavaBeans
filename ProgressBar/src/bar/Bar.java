/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import javax.swing.JProgressBar;

/**
 *
 * @author RozyZzx
 */
public class Bar extends JProgressBar{
    private long value1 = 0, value2 = 0;
    
    public Bar(){
        setMaximum((int)(value1 + value2));
        setStringPainted(true);
        updateText();
    }
    
    public void increment1(){
        ++value1;
        updateText();
    }
    
    public void increment2(){
        ++value2;
        updateText();
    }
    
    private void updateText(){
        long perc1, perc2, total = value1 + value2;
        if(total == 0){
            perc1 = 0;
            perc2 = 0;
        }
        else{
            perc1 = (value1 * 100) / total;
            perc2 = 100 - perc1;
        }
        setString(perc1 + "% | " + perc2 + "%");
        setMaximum((int)total);
        setValue((int)value1);
    }
}
