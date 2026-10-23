module app.projetojavafxalissongiovanna {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.projetojavafxalissongiovanna to javafx.fxml;
    exports app.projetojavafxalissongiovanna;
}