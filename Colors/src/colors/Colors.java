/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colors;

import java.awt.*;
import java.io.Serializable;

/**
 *
 * @author RozyZzx
 */
public class Colors extends Canvas implements Serializable{
    private Color color;
    private boolean rect;
    
    public Colors(){
        rect = false;
        setSize(200,100);
        change();
    }
    
    public boolean getRect(){
        return rect;
    }
    
    public void setRect(boolean flag){
        this.rect = flag;
        repaint();
    }
    
    public void change(){
        color = randomColor();
        repaint();
    }
    
    public void paint(Graphics g){
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        g.setColor(color);
        if(rect){
            g.fillRect(0, 0, w-1, h-1);
        }
        else{
            g.fillOval(0, 0, w-1, h-1);
        }
    }
    
    private Color randomColor(){
        return new Color(
                (int)(255 * Math.random()),
                (int)(255 * Math.random()),
                (int)(255 * Math.random())
        );
    }
}
