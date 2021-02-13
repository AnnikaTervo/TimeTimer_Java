
import java.util.TimerTask;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.geometry.* ; // Pos, Insets, Point2D, Orientation
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import static javafx.scene.paint.Color.BLACK;
import javafx.scene.text.Text;

//https://www.youtube.com/watch?v=cwJK_WpseKQ


public class TimeTimer extends Application {
        Stage window;
        Scene scene;
        Button button;
        Integer s;
        int minutes;
        private timer timer;
        TextField time;
        

        @Override
    public void start(Stage stage)
    {
        
        try{
            // Luo ensin näyttämö Stage, ja luo sinne Scene, Sceneen voi
            //lisätä vaikka hboxin johon labeleita
            
            // Näyttämö ja nimetään se
            window = stage;
            window.setTitle("TimeTimer");

            // tehdään tekstikenttä jossa kysytään aikaa
            TextField aika = new TextField();
            aika.setPrefWidth(200);
            aika.setMaxWidth(150);
            
            button = new Button("Aseta aika minuutteina");

            // Helpoimman kautta eli pane pystyyn
            BorderPane pane = new BorderPane();
            pane.setPadding(new Insets(20,20,20,20));
            
            pane.setTop(aika);
            pane.setLeft(button);
            Text time = new Text();
            //tekstin muuttaminen ajaksi
            button.setOnAction( e -> {
                Integer timeMinutes = Integer.valueOf(aika.getText());
                minutes = timeMinutes;
                //time.setText(s.toString());
              
            });                   
            
                       
            //time.setText("");
            pane.setBottom(time);
            scene = new Scene(pane, 300, 300);
            scene.setFill(BLACK);
            window.setScene(scene);
            window.show();
           
            
        }
        catch (Exception e){
            System.out.println("It didn't work");
        }
    }
     
     private void startTimer(int minutes)
    {
        timer.schedule(new TimerTask() {
        @Override
        public void run() {
            // nämä ei toiminut Jussi auta, sano et int cant be deferenced
           time.setText(minutes.toString());
            if (--minutes > 0) startTimer(minutes);
            }
        }, 60000);
    }
    
    
    
    
    public static void main( String[] command_line_parameters )
   {
      launch( command_line_parameters ) ;
   }

        
}