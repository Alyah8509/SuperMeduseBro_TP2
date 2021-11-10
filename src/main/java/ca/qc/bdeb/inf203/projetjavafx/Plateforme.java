package ca.qc.bdeb.inf203.projetjavafx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Plateforme extends GameObject {
    public double r = 10;
    public Color color;
    public Plateforme(double x, double y, Color color) {
        this.x = x;
        this.y = y;

        // Vitesse de la balle (magnitude)
        var vitesse = 250;
        // Direction de sa vitesse
        var angle = Math.random() * 2 * Math.PI;

        vx = Math.cos(angle) * vitesse;
        vy = Math.sin(angle) * vitesse;

        this.color = color;
    }

    public Plateforme(Color color) {
        this(
                Math.random() * (Main.WIDTH - 2 * 10) + 10,
                Math.random() * (Main.HEIGHT - 2 * 10) + 10,
                color
        );
    }

    @Override
    public void update(double dt) {
        updatePhysique(dt);

        if (x < r || x > Main.WIDTH - r)
            vx *= -1;

        if (y < r || y > Main.HEIGHT - r)
            vy *= -1;

        x = Math.min(x, Main.WIDTH - r);
        x = Math.max(x, 0 + r);

        y = Math.min(y, Main.HEIGHT - r);
        y = Math.max(y, 0 + r);
    }

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(color);
        context.fillOval(x - r, y - r, r * 2, r * 2);
    }
}
