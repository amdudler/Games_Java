package at.amir.game.firstgame.Aufgabe1_07;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {
    private float x;
    private float y;
    private float speed;
    private int diameter;

    public Circle(float y) {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(20) + 20;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            this.y = 0;
        }
    }
}
