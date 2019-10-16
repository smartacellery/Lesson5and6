package Lesson5;

import java.awt.Color;
import java.awt.Graphics;
//import javax.swing.JPanel;


public class Face {

    private int xPos, yPos, diameter;
    private Color color;
    private Graphics g;
    private Boolean ishappy;

    public Face(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;

        this.g = g;
        diameter = 100;
        color = Color.red;
        ishappy= true;
    }

    public void draw() {
        drawHead();
        drawEyes();
        drawMouth();
    }

    public void drawHead() {
       // color = Color.red;
        g.setColor(color);
        g.fillOval(xPos, yPos, diameter, diameter);
        g.setColor(Color.black);
        g.drawOval(xPos, yPos, diameter, diameter);
    }

    public void drawEyes() {
        //c = Color.yellow;
        g.setColor(Color.yellow);
        g.fillOval(xPos + diameter/5, yPos + diameter/5, diameter / 4, diameter / 4);
        g.fillOval(xPos + (int)(2.75* diameter/5), yPos +diameter/5, diameter / 4, diameter / 4);
        g.setColor(Color.black);
         g.drawOval(xPos + (int)(diameter/5), yPos + diameter/5, diameter / 4, diameter / 4);
        g.drawOval(xPos +(int)(2.75*diameter/5), yPos +diameter/5, diameter / 4, diameter / 4);
        
    }

    public void drawMouth() {
        g.setColor(Color.black);
        g.drawLine( xPos +(int)(.3*diameter), yPos+(int)(.75*diameter), xPos+(int)(.7*diameter), yPos+(int)(.75*diameter));
        if (ishappy==true){
            g.drawLine( xPos+(int)(.3*diameter), yPos+(int)(.75*diameter), xPos+(int)(.25*diameter),yPos+(int)(.65*diameter));
            g.drawLine(xPos+(int)(.7*diameter),yPos+(int)(.75*diameter), xPos+(int)(.75*diameter), yPos+(int)(.65*diameter));}
        else{
            g.drawLine( xPos+(int)(.3*diameter), yPos+(int)(.75*diameter), xPos+(int)(.25*diameter),yPos+(int)(.85*diameter));
            g.drawLine(xPos+(int)(.7*diameter),yPos+(int)(.75*diameter), xPos+(int)(.75*diameter), yPos+(int)(.85*diameter));}
            
        
    }
    public void setcolorhead(Color colorhead){
    color=colorhead;    
    }
    
    public void toggleMood (){
        ishappy=!ishappy;
    }

    public void move(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xPos - 10, yPos - 10, diameter + 20, diameter + 20);
    }

   public void sizenew(int x) {
        diameter = x;
    }
    public void reset(){
        diameter = 100;
        xPos = 100;
        yPos = 100;
        //ishappy=true;
        color=Color.red;
    }
}


