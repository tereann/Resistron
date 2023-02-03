module fr.simplon.tpihm {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.simplon.tpihm to javafx.fxml;
    exports fr.simplon.tpihm;
}