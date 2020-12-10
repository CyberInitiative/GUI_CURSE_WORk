package sample.view;

import com.sun.webkit.Timer;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.Main;
import sample.model.Queue;
import sample.model.State;

public class Controller {
    @FXML
    private TableView<Process> tableView;
    @FXML
    private TableColumn<Process , Integer> ProcessIdCol;
    @FXML
    private TableColumn<Process , String> ProcessNameCol;
    @FXML
    private TableColumn<Process , Integer> ProcessTimeCol;
    @FXML
    private TableColumn<Process , Integer> ProcessMemoryCol;
    @FXML
    private TableColumn<Process , Integer> ProcessArrivalTimeCol;
    @FXML
    private TableColumn<Process , Integer> ProcessBurstTimeCol;
    @FXML
    private TableColumn<Process , State> ProcessStateCol;

    private Main main;

    public Controller(){
    }

    @FXML
    private void initialize(){

    }
}
