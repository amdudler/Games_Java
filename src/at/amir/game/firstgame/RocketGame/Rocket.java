package at.amir.game.firstgame.RocketGame;

import org.newdawn.slick.*;

public class Rocket implements Actor {
    private Image rocketImage;
    private float x,y;


    public Rocket() throws SlickException {
        Image tmp= new Image("testdata/Chiaotzu.png");
        this.rocketImage = tmp.getScaledCopy(200,300);
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics){
        rocketImage.draw(this.x,this.y);
    }

    @Override
    public void update (GameContainer gameContainer, int delta){
        if(gameContainer.getInput().isKeyDown(Input.KEY_D)){
            this.x++;
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_A)){
            this.x--;
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_W)){
            this.y--;
        }
        if(gameContainer.getInput().isKeyDown(Input.KEY_S)){
            this.y++;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}