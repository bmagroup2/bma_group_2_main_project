module com.shanin.bma_group_2_main_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shanin.bma_group_2_main_project to javafx.fxml;
    exports com.shanin.bma_group_2_main_project;
}