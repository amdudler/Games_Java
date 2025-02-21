package at.amir.game.firstgame.firsttask;

import org.newdawn.slick.*;

public class Aufgabe_1_Objects extends BasicGame {

    private float xrect;
    private float yrect;
    private float speedrect;

    private float xoval;
    private float yoval;
    private float speedoval;

    private float xcirc;
    private float ycirc;
    private float speedcirc;

    private boolean movingDownCirc = true;
    private boolean movingRightOval = true;
    private boolean movingRightRect = true;
    private boolean movingDownRect = false;
    private boolean movingUpRect = false;
    private boolean movingLeftRect = false;


    public Aufgabe_1_Objects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.ycirc = 49;
        xcirc = 0;
        this.speedcirc = 2.0f;

        yoval = 0;
        this.xoval = 99;
        this.speedoval = 2.5f;

        this.xrect = 199;
        this.yrect = 99;
        this.speedrect = 2.5f;


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (movingDownCirc) {
            this.ycirc += (float) delta / this.speedcirc;

            if (this.ycirc > 500) {
                movingDownCirc = false;
            }
        } else {
            this.ycirc -= (float) delta / this.speedcirc;

            if (this.ycirc < 50) {
                movingDownCirc = true;
            }
        }

        if (movingRightOval) {
            this.xoval += (float) delta / this.speedoval;

            if (this.xoval > 500) {
                movingRightOval = false;
            }
        } else {
            this.xoval -= (float) delta / this.speedoval;

            if (this.xoval < 100) {
                movingRightOval = true;
            }
        }

        if (movingRightRect) {
            this.xrect += (float) delta / this.speedrect;

            if (this.xrect > 600) {
                movingRightRect = false;
                movingDownRect = true;
            }
        }

        if (movingDownRect) {
            this.yrect += (float) delta / this.speedrect;

            if (this.yrect > 450) {
                movingDownRect = false;
                movingLeftRect = true;
            }
        }

        if (movingLeftRect) {
            this.xrect -= (float) delta / this.speedrect;

            if (this.xrect < 200) {
                movingUpRect = true;
                movingLeftRect = false;
            }
        }

        if (movingUpRect) {
            this.yrect -= (float) delta / this.speedrect;

            if (this.yrect < 100) {
                movingUpRect = false;
                movingRightRect = true;
            }
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawOval(xcirc, ycirc, 50, 50, 50);
        graphics.drawOval(xoval, yoval, 75, 30, 50);
        graphics.drawRect(xrect, yrect, 75, 75);
        graphics.drawString("Hello you!", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Aufgabe_1_Objects("Objects"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
