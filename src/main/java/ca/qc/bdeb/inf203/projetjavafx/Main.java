package ca.qc.bdeb.inf203.projetjavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public static final double WIDTH = 350,HEIGHT = 480;
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        var scene = sceneAccueil();
        stage.setTitle("Super Méduse Bro");
        stage.setScene(scene);
        stage.show();
    }
    private Scene sceneAccueil(){
        var root = new StackPane();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext context = canvas.getGraphicsContext2D();
        context.setFill(Color.PURPLE);
        context.fillRect(0, 0, WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        ImageView imgView = new ImageView(new Image("accueil.png"));
        var jouer = new Button("Jouer!");
        var score = new Button("Meilleurs scores");
        var menuBouton = new VBox();
        menuBouton.getChildren().addAll(jouer, score);
        var menu = new VBox();
        menu.getChildren().addAll(imgView, menuBouton);
        root.getChildren().add(menu);
        menu.setAlignment(Pos.CENTER);
        menuBouton.setAlignment(Pos.CENTER);
        menuBouton.setSpacing(15);
        menu.setSpacing(30);
        jouer.setOnAction((e) -> {
            stage.setScene(sceneJeu());
        });
        score.setOnAction((e) -> {
            stage.setScene(sceneScore());
        });
        return scene;
    }
    private Scene sceneJeu(){
        var root=new Pane();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        Partie partie=new Partie();
        return scene;
    }
    private Scene sceneScore(){
        var root=new HBox();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        return scene;
    }
}
