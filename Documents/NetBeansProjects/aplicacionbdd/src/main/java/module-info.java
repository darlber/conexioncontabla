module com.mycompany.aplicacionbdd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.mycompany.aplicacionbdd to javafx.fxml;
    exports com.mycompany.aplicacionbdd;
    
        
    
}
