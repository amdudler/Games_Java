package at.amir.game.firstgame.Aufgabe1_07;

import org.newdawn.slick.Graphics;

public class Eclipse implements Actor {
    private float x, y;
    private float speed = 5;

    public Eclipse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 20);
    }

    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed;
        this.x += (float) delta / this.speed;

        if (this.x > 800 || this.y > 600) {
            this.y = 0;
            this.x = 0;
        }
    }
}
