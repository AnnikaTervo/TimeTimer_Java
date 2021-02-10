import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.geometry.* ; // Pos, Insets, Point2D, Orientation
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

//https://www.youtube.com/watch?v=cwJK_WpseKQ


public class TimeTimer extends Application {
        Stage window;
        Scene scene;
        Button button;
        String numero;
        

        @Override
    public void start(Stage stage)
    {
        window = stage;
        window.setTitle("TimeTimer");
        
    
        TextField aika = new TextField();
        aika.setPrefWidth(200);
        aika.setMaxWidth(200);
        button = new Button("Aseta aika minuutteina");
        
        
        BorderPane layout = new BorderPane();
        layout.setTop(aika);
        layout.setLeft(button);
        layout.setPadding(new Insets(20,20,20,20));
        
        button.setOnAction( e -> isInt(aika,aika.getText()));
        Text time = new Text();
        time.setText(numero);
        layout.setBottom(time);
        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }
    
    
    
    
    
    
    
    public static void main( String[] command_line_parameters )
   {
      launch( command_line_parameters ) ;
   }

    private void isInt(TextField aika, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
