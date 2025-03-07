package at.amir.game.firstgame.Aufgabe1_07;

import org.newdawn.slick.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//Programmiere das Beispiel aus den Videos nach!

//Mache folgende Adaptierungen
//Es gibt 10 Rectangles
//Es gibt 10 Circles
//Es gibt 10 Eclipsen (müssen wieder herinfliegen)

//Baue folgende Objekte dazu:
//Baue die Rectangles so um, damit man im Konstruktor angeben kann ob sie von links nach rechts oder umgekehrt fliegen.
//Die Circles sollen im laufe des Fluges wachsen - immer größer werden (der Durchmesser wächst)

public class Main extends BasicGame {
    private List<Actor> actors;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(800), random.nextInt(600), random.nextInt(50));
            this.actors.add(rectangle);
        }

        for (int i = 0; i < 11; i++) {
            Circle circle = new Circle(random.nextFloat(), random.nextFloat(), random.nextFloat());
            this.actors.add(circle);
        }

        for (int i = 0; i < 11; i++) {
            Eclipse eclipse = new Eclipse(random.nextInt(800), random.nextInt(600));
            this.actors.add(eclipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("07_Aufgabe1"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
