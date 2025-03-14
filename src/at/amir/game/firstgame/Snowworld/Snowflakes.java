package at.amir.game.firstgame.Snowworld;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Snowflakes implements Actor {
    public enum SIZE {BIG, MEDIUM, SMALL}

    ;;
    private float x, y;
    private int size;
    private float speed;
    private Random random;

    public Snowflakes(SIZE size) {
        this.random = new Random();
        if (size == SIZE.BIG) {
            this.size = 15;
            this.speed = 5;
        }

        if (size == SIZE.MEDIUM) {
            this.size = 10;
            this.speed = 10;
        }

        if (size == SIZE.SMALL) {
            this.size = 5;
            this.speed = 15;
        }

        setRandomPosition();

    }

    private void setRandomPosition() {
        this.x = this.random.nextInt(800);
        this.y = this.random.nextInt(600) - 600;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, this.size, this.size);
    }

    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            setRandomPosition();
        }
    }
}
