package ca.qc.bdeb.inf203.projetjavafx;

import javafx.scene.canvas.GraphicsContext;

public abstract class GameObject {
    protected double x, y;
    protected double vx, vy;
    protected double ax, ay;

    protected void updatePhysique(double dt) {
        vx += dt * ax;
        vy += dt * ay;

        x += dt * vx;
        y += dt * vy;
    }

    public void update(double dt) {
        updatePhysique(dt);
    }

    public abstract void draw(GraphicsContext context);

}
