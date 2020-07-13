module javafx.bundle.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    opens javafx.bundle.example to javafx.fxml;
    exports javafx.bundle.example;
}