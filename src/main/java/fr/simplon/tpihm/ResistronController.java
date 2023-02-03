
package fr.simplon.tpihm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.math.BigDecimal;

/**created with Intellij IDEA<br />
 * author : Ann, Pierre, Melanie <br />
 * Date : 03/02/2023 <br />
 * This is where we worked on the code.
 * */

public class ResistronController {

    @FXML
    private Label mLabelPageTitle;
    @FXML
    private ImageView mIconArrow;
    @FXML
    private Label mLabelDoThis;  //instructions

    //DECLARING BAND INDICATORS
    @FXML
    private Label mLabelB1;
    @FXML
    private Label mLabelB2;
    @FXML
    private Label mLabelB3;
    @FXML
    private Label mLabelB4;


    //DECLARING VARIABLES FOR RESISTOR DIAGRAM
    @FXML
    private Rectangle mShapeResistor;
    @FXML
    private Label colorFillB1;
    @FXML
    private Label colorFillB2;
    @FXML
    private Label colorFillB3;
    @FXML
    private Label colorFillB4;
    @FXML
    private Label mLabelValB1;
    @FXML
    private Label mLabelValB2;
    @FXML
    private Label mLabelValB3;
    @FXML
    private Label mLabelValB4;


    //DECLARING THE VARIABLES FOR BUTTON VALUES
    static int valueLine1;
    static int valueLine2;
    static double multiplier = 1;
    static double tolerance;

    //DECLARING THE BUTTONS IN BAND 1
    @FXML
    private Button bBlack1;
    @FXML
    private Button bBrown1;
    @FXML
    private Button bRed1;
    @FXML
    private Button bOrange1;
    @FXML
    private Button bYellow1;
    @FXML
    private Button bGreen1;
    @FXML
    private Button bBlue1;
    @FXML
    private Button bPurple1;
    @FXML
    private Button bGray1;
    @FXML
    private Button bWhite1;

    ////DEFINING THE ACTIONS OF THE BUTTONS IN BAND 1///

    /**
     * The following block of code is used to
     * Define the actions of the buttons in Band 1
     * Same codes are used for bands 2-4
     */
    @FXML
    void onbBlack1Action() {
        valueLine1 = 0;
        mLabelValB1.setText("0");
        colorFillB1.setBackground(Background.fill(Color.BLACK));
        display();
    }

    @FXML
    void onbBrown1Action() {
        valueLine1 = 10;
        mLabelValB1.setText("1");
        colorFillB1.setBackground(Background.fill(Color.BROWN));
        display();
    }

    @FXML
    void onbRed1Action() {
        valueLine1 = 20;
        mLabelValB1.setText("2");
        colorFillB1.setBackground(Background.fill(Color.RED));
        display();
    }

    @FXML
    void onbOrange1Action() {
        valueLine1 = 30;
        mLabelValB1.setText("3");
        colorFillB1.setBackground(Background.fill(Color.ORANGE));
        display();
    }

    @FXML
    void onbYellow1Action() {
        valueLine1 = 40;
        mLabelValB1.setText("4");
        colorFillB1.setBackground(Background.fill(Color.YELLOW));
        display();
    }

    @FXML
    void onbGreen1Action() {
        valueLine1 = 50;
        mLabelValB1.setText("5");
        colorFillB1.setBackground(Background.fill(Color.GREEN));
        display();
    }

    @FXML
    void onbBlue1Action() {
        valueLine1 = 60;
        mLabelValB1.setText("6");
        colorFillB1.setBackground(Background.fill(Color.BLUE));
        display();
    }

    @FXML
    void onbPurple1Action() {
        valueLine1 = 70;
        mLabelValB1.setText("7");
        colorFillB1.setBackground(Background.fill(Color.PURPLE));
        display();
    }

    @FXML
    void onbGray1Action() {
        valueLine1 = 80;
        mLabelValB1.setText("8");
        colorFillB1.setBackground(Background.fill(Color.GRAY));
        display();
    }

    @FXML
    void onbWhite1Action() {
        valueLine1 = 90;
        mLabelValB1.setText("9");
        colorFillB1.setBackground(Background.fill(Color.WHITE));
        display();
    }
    //DECLARING THE BUTTONS IN BAND 2
    @FXML
    private Button bBlack2;
    @FXML
    private Button bBrown2;
    @FXML
    private Button bRed2;
    @FXML
    private Button bOrange2;
    @FXML
    private Button bYellow2;
    @FXML
    private Button bGreen2;
    @FXML
    private Button bBlue2;
    @FXML
    private Button bPurple2;
    @FXML
    private Button bGray2;
    @FXML
    private Button bWhite2;

    //DECLARE THE VALUES OF BUTTONS IN BAND 2//
    @FXML
    void onbBlack2Action() {
        valueLine2 = 0;
        mLabelValB2.setText("0");
        colorFillB2.setBackground(Background.fill(Color.BLACK));
        display();
    }

    @FXML
    void onbBrown2Action() {
        valueLine2 = 1;
        mLabelValB2.setText("1");
        colorFillB2.setBackground(Background.fill(Color.BROWN));
        display();
    }

    @FXML
    void onbRed2Action() {
        valueLine2 = 2;
        mLabelValB2.setText("2");
        colorFillB2.setBackground(Background.fill(Color.RED));
        display();
    }

    @FXML
    void onbOrange2Action() {
        valueLine2 = 3;
        mLabelValB2.setText("3");
        colorFillB2.setBackground(Background.fill(Color.ORANGE));
        display();
    }

    @FXML
    void onbYellow2Action() {
        valueLine2 = 4;
        mLabelValB2.setText("4");
        colorFillB2.setBackground(Background.fill(Color.YELLOW));
        display();
    }

    @FXML
    void onbGreen2Action() {
        valueLine2 = 5;
        mLabelValB2.setText("5");
        colorFillB2.setBackground(Background.fill(Color.GREEN));
        display();
    }

    @FXML
    void onbBlue2Action() {
        valueLine2 = 6;
        mLabelValB2.setText("6");
        colorFillB2.setBackground(Background.fill(Color.BLUE));
        display();
    }

    @FXML
    void onbPurple2Action() {
        valueLine2 = 7;
        mLabelValB2.setText("7");
        colorFillB2.setBackground(Background.fill(Color.PURPLE));
        display();
    }

    @FXML
    void onbGray2Action() {
        valueLine2 = 8;
        mLabelValB2.setText("8");
        colorFillB2.setBackground(Background.fill(Color.GRAY));
        display();
    }

    @FXML
    void onbWhite2Action() {
        valueLine2 = 9;
        mLabelValB2.setText("9");
        colorFillB2.setBackground(Background.fill(Color.WHITE));
        display();
    }

    //DECLARING THE BUTTONS IN BAND 3//
    @FXML
    private Button bBlack3;
    @FXML
    private Button bBrown3;
    @FXML
    private Button bRed3;
    @FXML
    private Button bOrange3;
    @FXML
    private Button bYellow3;
    @FXML
    private Button bGreen3;
    @FXML
    private Button bBlue3;
    @FXML
    private Button bPurple3;
    @FXML
    private Button bGray3;
    @FXML
    private Button bWhite3;
    @FXML
    private Button bGold3;
    @FXML
    private Button bSilver3;


    //////DECLARE THE VALUES OF BUTTONS IN BAND 3///////
    @FXML
    void onbBlack3Action() {
        multiplier = 1;
        mLabelValB3.setText("1Ω");
        colorFillB3.setBackground(Background.fill(Color.BLACK));
        display();
    }

    @FXML
    void onbBrown3Action() {
        multiplier = 10;
        mLabelValB3.setText("10Ω");
        colorFillB3.setBackground(Background.fill(Color.BROWN));
        display();
    }

    @FXML
    void onbRed3Action() {
        multiplier = 100;
        mLabelValB3.setText("100Ω");
        colorFillB3.setBackground(Background.fill(Color.RED));
        display();
    }

    @FXML
    void onbOrange3Action() {
        multiplier = 1000;
        mLabelValB3.setText("1KΩ");
        colorFillB3.setBackground(Background.fill(Color.ORANGE));
        display();
    }

    @FXML
    void onbYellow3Action() {
        multiplier = 10000;
        mLabelValB3.setText("10KΩ");
        colorFillB3.setBackground(Background.fill(Color.YELLOW));
        display();
    }

    @FXML
    void onbGreen3Action() {
        multiplier = 100000;
        mLabelValB3.setText("100KΩ");
        colorFillB3.setBackground(Background.fill(Color.GREEN));
        display();
    }

    @FXML
    void onbBlue3Action() {
        multiplier = 1000000;
        mLabelValB3.setText("1MΩ");
        colorFillB3.setBackground(Background.fill(Color.BLUE));
        display();
    }

    @FXML
    void onbPurple3Action() {
        multiplier = 10000000;
        mLabelValB3.setText("10MΩ");
        colorFillB3.setBackground(Background.fill(Color.PURPLE));
        display();
    }

    @FXML
    void onbGray3Action() {
        multiplier = 100000000;
        mLabelValB3.setText("100MΩ");
        colorFillB3.setBackground(Background.fill(Color.GRAY));
        display();
    }

    @FXML
    void onbWhite3Action() {
        multiplier = 1000000000;
        mLabelValB3.setText("1GΩ");
        colorFillB3.setBackground(Background.fill(Color.WHITE));
        display();
    }

    @FXML
    void onbGold3Action() {
        multiplier = 0.1;
        mLabelValB3.setText("0.1Ω");
        colorFillB3.setBackground(Background.fill(Color.GOLD));
        display();
    }

    @FXML
    void onbSilver3Action() {
        multiplier = 0.01;
        mLabelValB3.setText("0.01Ω");
        colorFillB3.setBackground(Background.fill(Color.SILVER));
        display();
    }
    ///DECLARING THE BUTTONS IN BAND 3////
    @FXML
    private Button bBrown4;
    @FXML
    private Button bRed4;
    @FXML
    private Button bGreen4;
    @FXML
    private Button bBlue4;
    @FXML
    private Button bPurple4;
    @FXML
    private Button bGray4;

    @FXML
    private Button bGold4;
    @FXML
    private Button bSilver4;

    //////DECLARE THE VALUES OF BUTTONS IN BAND 4///////
    @FXML
    void onbBrown4Action() {
        tolerance = 1;
        mLabelValB4.setText("±1%");
        colorFillB4.setBackground(Background.fill(Color.BROWN));
        display();
    }

    @FXML
    void onbRed4Action() {
        tolerance = 2;
        mLabelValB4.setText("±2%");
        colorFillB4.setBackground(Background.fill(Color.RED));
        display();
    }

    @FXML
    void onbGreen4Action() {
        tolerance = 0.5;
        mLabelValB4.setText("±0.5%");
        colorFillB4.setBackground(Background.fill(Color.GREEN));
        display();
    }

    @FXML
    void onbBlue4Action() {
        tolerance = 0.25;
        mLabelValB4.setText("±0.25%");
        colorFillB4.setBackground(Background.fill(Color.BLUE));
        display();
    }

    @FXML
    void onbPurple4Action() {
        tolerance = 0.10;
        mLabelValB4.setText("±0.10%");
        colorFillB4.setBackground(Background.fill(Color.PURPLE));
        display();
    }

    @FXML
    void onbGray4Action() {
        tolerance = 0.05;
        mLabelValB4.setText("±0.05%");
        colorFillB4.setBackground(Background.fill(Color.GRAY));
        display();
    }

    @FXML
    void onbGold4Action() {
        tolerance = 5;
        mLabelValB4.setText("±5%");
        colorFillB4.setBackground(Background.fill(Color.GOLD));
        display();
    }

    @FXML
    void onbSilver4Action() {
        tolerance = 10;
        mLabelValB4.setText("±10%");
        colorFillB4.setBackground(Background.fill(Color.SILVER));
        display();
    }

    //DECLARING VARIABLES FOR DISPLAYING RESULTS

    @FXML
    private Label mLabelResult;
    @FXML
    private TextField mTextResult;
    @FXML
    private TextField mTextTol;
    @FXML
    private Label mLabelTol;
    @FXML
    private Label mLabelUnit;

    /** The display method is where the calculations happen.<br />
     * We convert Ohms to KOhms, MOhms, and GOhms using if/if else loop.<br />
     * We used Big Decimal to solve the issue of having too many zeros with some calculations.<br />
     * We assign fields to where we want the result to be displayed and
     * how they should be displayed.*/

    ///THE METHOD USED TO CALCULATE OHMS AND DISPLAY RESULTS///
    @FXML
    public void display() {
        BigDecimal value = BigDecimal.valueOf(valueLine1 + valueLine2).multiply(BigDecimal.valueOf(multiplier));
        //double value = (valueLine1 + valueLine2) * multiplier;
        String txttol = "±" + tolerance + "%";
        //String txtUnit = " ";
        String unit1 = " Ω";
        String unit2 = " kΩ";
        String unit3 = " MΩ";
        String unit4 = " GΩ";

        ///UNIT CONVERTER
        if (value.doubleValue() < 1000) {
            mLabelUnit.setText(unit1);
        } else if (value.doubleValue() < 1000000) {
            value = value.divide(BigDecimal.valueOf(1000));
            mLabelUnit.setText(unit2);
        } else if (value.doubleValue() < 1000000000) {
            value = value.divide(BigDecimal.valueOf(1000000));
            mLabelUnit.setText(unit3);
        } else {
            value = value.divide(BigDecimal.valueOf(1000000000));
            mLabelUnit.setText(unit4);
        }
        mTextResult.setText(" " + value);    //to display result in the textfield
        mTextResult.setEditable(false);     //to render textfield uneditable
        mTextTol.setText(" " + txttol);     //to display result in the textfield
        mTextTol.setEditable(false);        //to render textfield uneditable
        //mLabelValB1.setText(" " + valueLine1);
        //mLabelValB2.setText(" " + valueLine2);
        //mLabelValB3.setText();
        //mLabelValB4.setText(txttol);

    }
}