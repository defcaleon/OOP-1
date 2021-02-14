package org.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Drawing Operations Test");
        stage.setScene(scene);

        Group root = new Group();

        Canvas canvas=new Canvas(640,480);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);
        drawing(gc);

        stage.setScene(new Scene(root));
        stage.show();


    }


    public static void main(String[] args) {
        launch();
    }


    private void drawing(GraphicsContext gc){

        gc.setStroke(Color.GOLD);
        gc.setFill(Color.BLUE);
        gc.setLineWidth(5);

        gc.setLineWidth(5);
        gc.strokeLine(50,200,150,200);


        gc.strokeRect(50, 50, 100, 100);

        gc.strokeArc(200,200,30,30,45,360,ArcType.OPEN);


        gc.strokePolygon(new double[]{50,100,50,100,50},new double[]{220,220,250,250,240},4);
        gc.strokePolyline(new double[]{300,400,400,500},new double[]{300,300,400,400},4);
    }

}