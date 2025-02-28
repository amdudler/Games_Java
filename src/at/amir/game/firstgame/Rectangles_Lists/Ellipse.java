package at.amir.game.firstgame.Rectangles_Lists;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor{
    private float x,y;
    private float speed = 5;

    public Ellipse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,10);
    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/this.speed;
        this.x += (float)delta/this.speed;

        if(this.x > 800 || this.y > 600){
            this.y = 0;
        }
    }
}