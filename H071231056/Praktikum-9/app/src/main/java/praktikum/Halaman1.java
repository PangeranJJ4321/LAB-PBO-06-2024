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

public class Halaman1 {

    private Stage stage;

    public Halaman1(Stage stage) {
        this.stage = stage;
    }

    public void showPanel() {
        
        Image foto = null;
        try {
            foto = new Image(getClass().getResourceAsStream("/images/Latar1.png"));
        } catch (Exception e) {
            System.out.println("Image not found. Please check the path.");
            return;
        }

        ImageView fotoBackground = new ImageView(foto);

       
        fotoBackground.setPreserveRatio(false);
        fotoBackground.setFitWidth(250);
        fotoBackground.setFitHeight(400);

        
        Rectangle kotak = new Rectangle(200, 80);
        kotak.setArcHeight(20);
        kotak.setArcWidth(20);
        kotak.setFill(Color.web("#000000", 0.5));

        
        Text text = new Text("Hello, I'm Jar! Click for\nmore info!");
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

        
        Button moreInfoButton = new Button("More Info");
        moreInfoButton.setStyle("-fx-background-color: #90EE90; -fx-text-fill: black;");
        moreInfoButton.setTooltip(new Tooltip("Click to go to the next page"));
        moreInfoButton.setOnAction(e -> {
            Halaman2 hal2 = new Halaman2(stage);
            hal2.showPanel();
        });

        
        VBox vbox = new VBox(10, stackTengah, moreInfoButton);
        vbox.setAlignment(Pos.CENTER);

        
        StackPane stackPane = new StackPane(fotoBackground, vbox);
        stackPane.setAlignment(Pos.CENTER);

        
        Scene scene1 = new Scene(stackPane, 250, 400);

       
        scene1.widthProperty().addListener((observable, oldValue, newValue) -> {
            fotoBackground.setFitWidth((double) newValue);
        });
        scene1.heightProperty().addListener((observable, oldValue, newValue) -> {
            fotoBackground.setFitHeight((double) newValue);
        });

        stage.setScene(scene1);
        stage.setTitle("Login");
        stage.setResizable(false);
        stage.show();
    }
}
