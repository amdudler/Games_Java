package at.amir.game.firstgame.Rectangles_Lists;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++){
            Rectangle rectangle = new Rectangle(random.nextInt(600),random.nextInt(600),random.nextInt(50));
            this.actors.add(rectangle);
        }

        for (int i = 0; i < 50; i++){
            Circle circle = new Circle(random.nextInt());
            this.actors.add(circle);
        }

        for(int i = 0; i < 5; i++){
            Ellipse ellipse = new Ellipse(random.nextInt(800),random.nextInt(600));
            this.actors.add(ellipse);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for(Actor actor:this.actors){
            actor.update(delta);
        }

    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for(Actor actor:this.actors){
            actor.render(graphics);
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
