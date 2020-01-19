package arenagamelatest;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import static javafx.geometry.Orientation.VERTICAL;
import javafx.geometry.Pos;
import javafx.scene.Group;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author aysuhan
 */
public class ArenaGameLatest extends Application {

    ListView<String> selectionList, selectedList;

    CharacterClass character = new CharacterClass();
    ArrayList<String> playerTeam = new ArrayList<>();
    ArrayList<String> enemyTeam = new ArrayList<>();
    ArrayList<CharacterClass> characterList = new ArrayList<>();
    CharacterClass cc;
    Mage mage;
    Druid druid;
    Paladin paladin;
    Warrior warrior;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Error message");
        alert.setHeaderText("You cannot exceed the number you specified in the character counter.");
        alert.setContentText("Close the window");

        VBox box_slider = new VBox();
        Label slider_label = new Label("You can select character count only once");
        Slider slider = new Slider();

        //javafx slider as an integer
        slider.valueProperty().addListener((obs, oldval, newVal)
                -> slider.setValue(newVal.intValue()));

        slider.setMin(2);
        slider.setMax(10);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(1);
        slider.setMinorTickCount(10);
        slider.setBlockIncrement(0.1f);
        slider.setSnapToTicks(true);
        box_slider.getChildren().addAll(slider_label, slider);
        box_slider.setAlignment(Pos.CENTER);

        HBox hbox1 = new HBox();
        Label charCount = new Label("Character Count:");
        Label lab = new Label();
        lab.textProperty().bind( // slider to label using textproperty
                Bindings.format(
                        "%.0f",
                        slider.valueProperty()
                )
        );

        hbox1.getChildren().addAll(charCount, lab);
        hbox1.setAlignment(Pos.CENTER);

        Button ok = new Button("OK");
        ok.setAlignment(Pos.CENTER);
        ok.setMaxWidth(35);

        List<String> enemyTeamList = new ArrayList<String>();
        enemyTeamList.add("Warrior");
        enemyTeamList.add("Paladin");
        enemyTeamList.add("Mage");
        enemyTeamList.add("Druid");

        VBox buttonBox = new VBox();
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(20);
        Button add = new Button(" ADD ");
        add.setMaxHeight(Double.MAX_VALUE);
        add.setMaxWidth(Double.MAX_VALUE);
        add.setDisable(true);
        Button delete = new Button("DELETE");
        buttonBox.getChildren().addAll(add, delete);

        VBox selection_box = new VBox();
        VBox selected_box = new VBox();
        HBox boxx = new HBox();
        Label selection_label = new Label("Class options");
        Label selected_label = new Label("Your team.You can choose upto:");
        Label txtArea = new Label();

        selectionList = new ListView<String>();
        selectedList = new ListView<String>();
        selectionList.getItems().addAll("Warrior", "Paladin", "Druid", "Mage");
        selectionList.prefHeight(60);
        selectedList.prefHeight(60);

        selection_box.getChildren().addAll(selection_label, selectionList);
        selection_box.setAlignment(Pos.CENTER);
        boxx.getChildren().addAll(selected_label, txtArea);
        selected_box.getChildren().addAll(boxx, selectedList);
        selected_box.setAlignment(Pos.CENTER);

        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(selection_box, buttonBox, selected_box);
        hbox2.setSpacing(20);
        hbox2.setAlignment(Pos.CENTER);

        Button goToArena = new Button("GO TO ARENA");
        goToArena.setMaxWidth(450);
        goToArena.setDisable(true);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(box_slider, hbox1, ok, hbox2, goToArena);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);

        ok.setOnAction((ActionEvent e)
                -> {
            character.setCharacterNumber((int) slider.getValue());
            txtArea.setText(character.getCharacterNumber().toString());
            add.setDisable(false);
        }
        );

        add.setOnAction((ActionEvent e)
                -> {
            Integer listSize = (selectedList.getItems().size() + 1);
            String selected = selectionList.getSelectionModel().getSelectedItem();
            if ((selected != null) && !(listSize > character.getCharacterNumber())) {
                selectedList.getItems().add(selected);
                playerTeam.add(selected);
                Random randomizer = new Random();
                String random = enemyTeamList.get(randomizer.nextInt(enemyTeamList.size()));
                enemyTeam.add(random);
            } else {
                alert.showAndWait();
            }
            if (listSize == character.getCharacterNumber()) {
                goToArena.setDisable(false);
            }

        }
        );
        delete.setOnAction(e
                -> {
            String selected = selectedList.getSelectionModel().getSelectedItem();

            if (selected != null) {
                selectedList.getItems().remove(selectedList.getSelectionModel().getSelectedItem());
            }

        }
        );

        goToArena.setOnAction((ActionEvent e)
                -> {

            VBox vBox = new VBox();
            FlowPane fPane = new FlowPane();
            FlowPane fPane2 = new FlowPane();
            FlowPane fPane3 = new FlowPane();

            /**
             * *********YourTeam**************************************************************************************************
             */
            StackPane stackPane;
            for (String chrctr : playerTeam) {
                stackPane = new StackPane();
                stackPane.setPrefHeight(80);
                stackPane.setPrefWidth(80);
                Button but = new Button();
                but.setPrefHeight(70);
                but.setPrefWidth(70);

                stackPane.getChildren().add(but);
                switch (chrctr) {
                    case "Warrior":
                        but.setStyle("-fx-background-color: RED;");
                        break;
                    case "Mage":
                        but.setStyle("-fx-background-color: PURPLE;");
                        break;
                    case "Druid":
                        but.setStyle("-fx-background-color: GREEN;");
                        break;
                    case "Paladin":
                        but.setStyle("-fx-background-color: YELLOW;");
                        break;
                    default:
                        break;
                }
                fPane.getChildren().add(stackPane);
            }
            TextArea area = new TextArea();
            area.setPrefHeight(100);
            area.setPrefWidth(700);
            fPane2.getChildren().add(area);

            /**
             * *********EnemyTeam**************************************************************************************************
             */
            StackPane stackPaneEnemy;
            for (String chrctr : enemyTeam) {
                stackPaneEnemy = new StackPane();

                stackPaneEnemy.setPrefHeight(80);
                stackPaneEnemy.setPrefWidth(80);
                Button but2 = new Button();
                but2.setPrefHeight(70);
                but2.setPrefWidth(70);
                stackPaneEnemy.getChildren().add(but2);
                switch (chrctr) {
                    case "Warrior":
                        but2.setStyle("-fx-background-color: RED;");
                        break;
                    case "Mage":
                        but2.setStyle("-fx-background-color: PURPLE;");
                        break;
                    case "Druid":
                        but2.setStyle("-fx-background-color: GREEN;");
                        break;
                    case "Paladin":
                        but2.setStyle("-fx-background-color: YELLOW;");
                        break;
                    default:
                        break;
                }

                fPane3.getChildren().add(stackPaneEnemy);
            }

            vBox.getChildren().addAll(fPane3, fPane2, fPane);
            Scene scene = new Scene(vBox);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        );

        Scene scene = new Scene(vbox, 700, 700);
        primaryStage.setTitle("Fighter Arena");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
