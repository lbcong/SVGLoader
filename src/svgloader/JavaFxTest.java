/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svgloader;

/**
 *
 * @author Thanh
 */

	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class JavaFxTest extends Application {
	
	public void start(Stage primaryStage) {
		try {
			
			Application.Parameters params = getParameters();
                        java.util.List<String> pl = params.getRaw();
                        SVGLoader loader = null;
	
			
			Pane  pane = new Pane();
			
			
			Parent root = new Pane(pane);												
			Scene scene = new Scene(root);			
			primaryStage.setScene(scene);			
			primaryStage.setTitle("Test Window");		
			primaryStage.show();
                  
                        if(pl.isEmpty())
                            loader = new SVGLoader("C:/test/Linux.svg");
                        else
                            loader = new SVGLoader(pl.get(0));	
			long start = System.currentTimeMillis();
                        pane.getChildren().addAll(loader.loadSVG());
			long end = System.currentTimeMillis();
			System.out.println("Total time: "+(end-start) + " milisecs");
                  			
		} catch(Exception e) {		
		}
		
	}
	public static void main(String[] args) {
		
		launch(args);
		
	}
}