package at.amir.game.firstgame.Aufgabe1_07;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    private float x, y;
    private float speed;
    private boolean linksnachrechts = true;

    public Rectangle(int x, int y, float speed, boolean linksnachrechts) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.linksnachrechts = linksnachrechts;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 20, 20);
    }

    @Override
    public void update(int delta) {
        if (linksnachrechts){
            this.x += (float) delta / this.speed;
            if (this.x > 800){
                this.x = 0;
            }
        }
        else{
            this.x -= (float) delta / this.speed;
            if (this.x < 0){
                this.x = 800;
            }
        }
    }
}
