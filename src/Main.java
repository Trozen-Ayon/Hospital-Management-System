import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    Button button;
//    public static void main(String[] args){
//        launch(args);
//    }
    /*due to some update, this doesn't work anymore so I
    had to create a new Launcher file to launch.*/

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Title");
        button = new Button();
        button.setText("Click!");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}