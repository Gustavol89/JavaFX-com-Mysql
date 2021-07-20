/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * 
 */
public class FXMLVboxMainController implements Initializable {
    
    @FXML
    private MenuItem menuitencadastorsclientes;
    @FXML
    private MenuItem menuitensprocessosvendas;
    @FXML
    private MenuItem menuitengraficosvendaspormes;
    @FXML
    private MenuItem menuitenrelatorioquantidadedeprodutos;
    @FXML
    private AnchorPane anchorPane;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
