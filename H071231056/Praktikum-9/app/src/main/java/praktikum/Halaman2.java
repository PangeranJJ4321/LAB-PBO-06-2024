package praktikum;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Halaman2 {

    private Stage stage;

    public Halaman2(Stage stage) {
        this.stage = stage;
    }

    public void showPanel() {
        
        Image foto = null;
        try {
            foto = new Image(getClass().getResourceAsStream("/images/Latar2.png"));
        } catch (Exception e) {
            System.out.println("Image not found. Please check the path.");
            return;
        }

        ImageView fotoBackground = new ImageView(foto);

        
        fotoBackground.setPreserveRatio(false);
        fotoBackground.setFitWidth(250);
        fotoBackground.setFitHeight(400);

        
        Rectangle kotak = new Rectangle(250, 150);
        kotak.setArcHeight(20);
        kotak.setArcWidth(20);
        kotak.setFill(Color.web("#000000", 0.5));

        
        Text text = new Text("Name: Jar\nEmail: jar4321@gmail.com\nPhone: 082393318287\nGithub: PangeranJJ4321");
        text.setFont(new Font("Arial", 16));
        text.setFill(Color.WHITE);

        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.BLACK);
        dropShadow.setOffsetX(3);
        dropShadow.setOffsetY(3);
        text.setEffect(dropShadow);

        
        StackPane stackTengah = new StackPane(kotak, text);
        stackTengah.setAlignment(Pos.CENTER);
        stackTengah.setPadding(new Insets(10));

        
        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: #90EE90; -fx-text-fill: black;");
        backButton.setTooltip(new Tooltip("Click to go back to the previous page"));
        backButton.setOnAction(e -> {
            Halaman1 hal1 = new Halaman1(stage);
            hal1.showPanel();
        });

        
        VBox vbox = new VBox(10, stackTengah, backButton);
        vbox.setAlignment(Pos.CENTER);

        
        StackPane stackPane = new StackPane(fotoBackground, vbox);
        stackPane.setAlignment(Pos.CENTER);

        
        Scene scene2 = new Scene(stackPane, 250, 400);

        
        scene2.widthProperty().addListener((observable, oldValue, newValue) -> {
            fotoBackground.setFitWidth((double) newValue);
        });
        scene2.heightProperty().addListener((observable, oldValue, newValue) -> {
            fotoBackground.setFitHeight((double) newValue);
        });

        stage.setScene(scene2);
        stage.setTitle("Contact Info");
        stage.setResizable(false);
        stage.show();
    }
}
