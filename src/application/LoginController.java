package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField password;

    @FXML
    private TextField user;

    @FXML
    private Button valider;
    
    
    @FXML
    public void handleSubmitButtonAction(ActionEvent event) {
    	try {
      BufferedReader bf= new BufferedReader(new FileReader("D:\\fichiers\\in.txt"));
      String line;
     while ((line=bf.readLine())!=null) 
     {
  	   String [] s=line.split("/");
  	   if(s.length==2 && s[0].equals(user.getText())&&s[1].equals(password.getText()))
  	   {
  		   System.out.println("validee");
  		   return ;
  	   }
     }
     System.out.println("non validee");
     
  } catch (IOException e) {
      e.printStackTrace();
  }	
    	
}
}
