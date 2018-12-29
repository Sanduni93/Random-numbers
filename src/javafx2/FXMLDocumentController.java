
package javafx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.util.Random;

public class FXMLDocumentController implements Initializable {
   @FXML
    private Label message;
   
   public void random(ActionEvent event){
    Random ran = new Random();
    int ran_num = ran.nextInt(100)+ 1;
    message.setText(Integer.toString(ran_num));
     System.out.println(ran_num);
      
   
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
}
