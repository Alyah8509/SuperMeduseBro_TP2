package ca.qc.bdeb.inf203.projetjavafx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Partie {
    //Controle meduse
    //plateformes
    //camera
    //compteur
    private ArrayList<Plateforme> plateformes = new ArrayList<>();
    private Color color;

    Partie() {

        for (int i = 0; i < 25; i++) {
            plateformes.add(new Plateforme(color));
        }
    }
    public void update(double dt) {
        for (var plateforme : plateformes)
            plateforme.update(dt);
    }

    public void draw(GraphicsContext context) {
        context.clearRect(0, 0, Main.WIDTH, Main.HEIGHT);
        for (var plateforme : plateformes)
            plateforme.draw(context);
    }
}
