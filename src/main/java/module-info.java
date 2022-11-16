module com.benedikt.sn4ke {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.benedikt.sn4ke to javafx.fxml;
    exports com.benedikt.sn4ke;
}