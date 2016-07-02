package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField HeightArea;
    public TextField WeightArea;
    public Button ButtonCalculate;
    public Label BmiLabel;
    public Label ResultLabel;


    public void buttonClick(){

        double height = Double.parseDouble(HeightArea.getText());
        double weight = Double.parseDouble(WeightArea.getText());
        double bmi = weight/(height*height);


        BmiLabel.setText(String.format("Your BMI is %.2f", bmi));

        if(bmi < 18.5){
            ResultLabel.setText("Underweight");
        }
        else if(bmi >= 18.5 && bmi < 25){
            ResultLabel.setText("Normal weight");
        }
        else if (bmi >= 25 && bmi <30){
            ResultLabel.setText("Overweight");
        }
        else if(bmi > 30){
            ResultLabel.setText("Obesity");
        }




    }



}
