/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgroups_again;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author lezama
 */
public class PuntoTinta {

    private final int x;
    private final int y;
    private final int tamano;
    private final Color color;
    private final Ellipse2D.Double shape;
    
    public PuntoTinta(Point pos, int tam, Color col){
        this.x = pos.x;
        this.y = pos.y;
        this.tamano = tam;
        this.color = col;
        this.shape = new Ellipse2D.Double(
                (double)(this.x - this.tamano/2), 
                (double)(this.y - this.tamano/2), 
                (double)(this.tamano),
                (double)(this.tamano));
    }
    
    public void draw (Graphics2D g2){
        g2.setColor(this.color);
        g2.setStroke(new BasicStroke(1.0f));
        g2.fill(this.shape);
    }

    public Point getPoint(){
        return new Point(this.x, this.y);
    }

    public Color getColor() {
        return this.color;
    }
    public int getTamano() {
        return this.tamano;
    }
}
