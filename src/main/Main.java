/**
 *Name : Tran Van Khoi
 *MSSV : HE130007
 *Email : khoitvhe130007@fpt.edu.vn
 *Lecturer : DuongTB
 */
package Main;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import view.MainFrame;

/**
 *
 * @author khoitvhe130007@fpt.edu.vn
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       MainFrame mainFrame = new MainFrame();
       mainFrame.setResizable(false);
       mainFrame.setLocationRelativeTo(null);
       mainFrame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
