/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

import java.awt.*;

/**
 *
 * @author RozyZzx
 */
public class Counter1 extends Panel{
    private long count = 0, maxValue = 20;
    private Label label;
    private String title;
    
    public Counter1(){
        setBackground(Color.black);
        setForeground(Color.white);
        label = new Label(title + ": " + count);
        add(label);
    }
    
    public void setMaxValue(long max){
        maxValue = max;
    }
    
    public long getMaxValue(){
        return maxValue;
    }
    
    public void setTitle(String title){
        this.title = title;
        label.setText(title + ": " + count);
    }
    
    public void increment(){
        if(count < maxValue){
            ++count;
            label.setText(title + ": " + count + " ");
        }
        else label.setText("!!");
    }
}
