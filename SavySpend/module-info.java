module SavySpend {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.savyspend.model to javafx.fxml;
    exports com.savyspend.model;
}
