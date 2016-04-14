package base.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import poker.app.MainApp;
import base.Main;
import pokerBase.Action;
import pokerEnums.eAction;

public class ClientServerStartController {

 
	
	@FXML private TextField txtServerPort;
	@FXML private TextField txtClientPort;
	@FXML private TextField txtComputerName;

	private Main Main;
	
	public void setMainApp(Main Main) {
		this.Main = Main;
	}
	
	@FXML
	public void optServerClientSelected(ActionEvent event)
	{
		RadioButton rbServerClient = (RadioButton) event.getSource();
		switch (rbServerClient.getId().toString())
		{
		case "rbtnServer":
			txtServerPort.setDisable(!rbServerClient.isSelected());
			txtClientPort.setDisable(rbServerClient.isSelected());
			txtComputerName.setDisable(rbServerClient.isSelected());
			break;
		case "rbtnClient":
			txtServerPort.setDisable(rbServerClient.isSelected());
			txtClientPort.setDisable(!rbServerClient.isSelected());
			txtComputerName.setDisable(!rbServerClient.isSelected());
			
			break;
			
		}

	}


}
