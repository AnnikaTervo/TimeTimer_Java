
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.* ;
import javafx.scene.paint.Color;
import javafx.scene.text.Text ;
import javafx.scene.layout.HBox;

public class TimeTimer extends Application 
{
    public int hours;
    public int minutes;
    public int seconds;
    
    //https://harmoniccode.blogspot.com/2017/10/simple-countdown-timer.html
    @Override public void init() {
        
        
    
    
    }

    
    @Override
    public void start (Stage stage){
        
        
        stage.setTitle("TimeTimer.java");
        BorderPane border = new BorderPane();
        
        //border.setTop();
        Scene scene = new Scene(border, 400, 250);
        
        
        
        
        stage.setScene(scene);
        stage.show();
    }
    
        
   


    public static void main(String[] command_line_parameters) {
        launch( command_line_parameters ) ;
    }

    

   
    
}
