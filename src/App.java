import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

public class App extends Application { 

    static Stage stage1=new Stage();
    static Stage stage2=new Stage();

    public void start(Stage stage) throws IOException
    {
        Parent root1 = FXMLLoader.load(getClass().getResource("login.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("signup.fxml"));
        
        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);

        stage1.setScene(scene1);
        stage2.setScene(scene2);
        
        showLogin();
    }
    public static void showLogin()
    {
        stage1.show();
        stage1.setTitle("Login Page");
        stage2.hide();
    }   
    public static void showSignUp()
    {
        stage2.show();
        stage2.setTitle("Create Account");
        stage1.hide();
    }
     public static void main(String[] args) {
            launch(args);
    }
}