package test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.EventHandler;

public class HelloController
{

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @FXML private TextField resultTextField;
//    @FXML private Button malButton;
//    @FXML private Button plusButton;
//    @FXML private Button geteiltButton;
//    @FXML private Button gleichButton;

    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;

    public void plus(){
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append("+").toString());
    }

    public void minus(){
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append("-").toString());
    }

    public void mal(){
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append("*").toString());
    }

    public void geteilt(){
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append("/").toString());
    }

    public void calculate(){
        String fieldCase = getTextFieldResults();
        if (fieldCase.contains("+")) {
            calcPlus();
        } else if (fieldCase.contains("-")) {
            calcMinus();
        } else if (fieldCase.contains("*")) {
            calcMal();
        } else if (fieldCase.contains("/")) {
            calcGeteilt();
        }
    }

    private void calcPlus() {
        String textFieldResult = getTextFieldResults();
        int index = textFieldResult.indexOf("+");
        String resultText = String.valueOf(Integer.valueOf(textFieldResult.substring(0, index-1)) +
                Integer.valueOf(textFieldResult.substring(index+1)));

        resultTextField.setText(resultText);
    }

    private void calcMinus() {
        String textFieldResult = getTextFieldResults();
        int index = textFieldResult.indexOf("-");
        String resultText = String.valueOf(Integer.valueOf(textFieldResult.substring(0, index-1)) -
                Integer.valueOf(textFieldResult.substring(index+1)));

        resultTextField.setText(resultText);
    }

    private void calcMal() {
        String textFieldResult = getTextFieldResults();
        int index = textFieldResult.indexOf("*");
        String resultText = String.valueOf(Integer.valueOf(textFieldResult.substring(0, index-1)) *
                Integer.valueOf(textFieldResult.substring(index+1)));

        resultTextField.setText(resultText);
    }

    private void calcGeteilt() {
        String textFieldResult = getTextFieldResults();
        int index = textFieldResult.indexOf("/");
        String resultText = String.valueOf(Integer.valueOf(textFieldResult.substring(0, index-1)) /
                Integer.valueOf(textFieldResult.substring(index+1)));

        resultTextField.setText(resultText);
    }

    public void clear(){
        resultTextField.clear();
    }

    public void selectedNumber1(){
        String result = button1.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber2(){
        String result = button2.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber3(){
        String result = button3.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber4(){
        String result = button4.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber5(){
        String result = button5.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber6(){
        String result = button6.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber7(){
        String result = button7.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber8(){
        String result = button8.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public void selectedNumber9(){
        String result = button9.getText();
        resultTextField.setText(new StringBuilder(getTextFieldResults()).append(result).toString());
    }

    public String getTextFieldResults(){
        return resultTextField.getText();
    }

}
