package at.amir.game.firstgame.Aufgabe1_07;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {
    private float x;
    private float y;
    private float speed;
    private float diameter;
    private float growth;

    public Circle(float x, float y, float diameter) {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(20) + 20;
        this.growth = 0.01f;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(x - diameter, y - diameter, diameter * 2, diameter * 2);
    }

    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed;
        this.diameter += growth * delta;

        if (this.y > 600) {
            this.y = 0;
            this.diameter = 20;
        }
    }
}
