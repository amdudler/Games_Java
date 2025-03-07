package at.amir.game.firstgame.Aufgabe1_07;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    private float x, y;
    private float speed;

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;
        if (this.x > 800) {
            this.x = 0;
        }
    }
}
