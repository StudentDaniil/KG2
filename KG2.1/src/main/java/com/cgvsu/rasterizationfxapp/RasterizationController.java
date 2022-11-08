package com.cgvsu.rasterizationfxapp;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;

import com.cgvsu.rasterization.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class RasterizationController {

    @FXML
    AnchorPane anchorPane;
    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {
        anchorPane.prefWidthProperty().addListener((ov, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue()));
        anchorPane.prefHeightProperty().addListener((ov, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue()));

        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 500, 50, Color.BLACK);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 0, 0, Color.BLACK);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 400, 50, Color.BLACK);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 400, 400, Color.BLACK);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 600, 300, Color.BLACK);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 300, 300, Color.BLACK);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 100, 600, Color.BLACK);
        Rasterization.drawLine(canvas.getGraphicsContext2D(), 400, 300, 600, 600, Color.BLACK);


//
//        canvas.getGraphicsContext2D().strokeLine(400, 300, 500, 50);
//        canvas.getGraphicsContext2D().strokeLine(50, 50, 0, 0);
//        canvas.getGraphicsContext2D().strokeLine(50, 0, 50, 50);


//        Rasterization.drawLine(canvas.getGraphicsContext2D(), 200, 30,0 , 800, Color.BLACK);
    }

}