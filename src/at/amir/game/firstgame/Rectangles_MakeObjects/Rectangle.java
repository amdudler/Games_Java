package at.amir.game.firstgame.Rectangles_MakeObjects;

import org.newdawn.slick.Graphics;

import java.awt.*;

public class Rectangle {
    private float x;
    private float y;
    private float speed;

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    public void update(int delta) {
        this.x += (float) delta / this.speed;
        if (this.x > 600) {
            this.x = 0;
        }
    }
}
