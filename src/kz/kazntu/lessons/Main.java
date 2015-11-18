package kz.kazntu.lessons;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World!");
        Button button = new Button("Click Me!") ;
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane pane = new StackPane() ;
        pane.getChildren().add(button) ;
        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
