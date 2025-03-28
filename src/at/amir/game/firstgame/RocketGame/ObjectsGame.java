package at.amir.game.firstgame.RocketGame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<at.amir.game.firstgame.RocketGame.Actor> actors;
    private Rocket rocket;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Rocket rocket = new Rocket();
        this.rocket = rocket;
        this.actors.add(rocket);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for(Actor actor : this.actors){
            actor.update(gameContainer, delta);
        }

    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for(Actor actor:this.actors){
            actor.render(graphics);
        }

    }


    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_SPACE){
            System.out.println("shoot");
            Cannonball cb = new Cannonball(this.rocket.getX(),this.rocket.getY());
            this.actors.add(cb);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("ObjectsGame"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}