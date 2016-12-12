package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;

public class Controller {

    @FXML
    private Label quot;

    @FXML
    /**-----------------Redirection Vers Miss Fortune-----------------------------------*/
    public void ToFortune(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("Fortune.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @FXML
    /**-----------------Redirection Vers Menu Principale-----------------------------------*/
    public void ToGame(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("HomeGame.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @FXML
    /**-----------------Redirection Vers About-----------------------------------*/
    public void ToAbout(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("About.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @FXML
    /**---------------Methode du destin chosis :p */
    public void destiny(ActionEvent actionEvent) {
        int x =(int) (( Math.random() *(50))+1);
        if (x == 1) {
        quot.setText("Quand tout va bien on peut compter sur les autres\n , quand tout va mal on ne peut compter que sur \n sa famille.");
        }
        if (x == 2) {
        quot.setText("Il vaut mieux se disputer avec quelqu'un \n d'intelligent  que parler à un imbécile.");
        }
        if (x == 3) {
        quot.setText("En amour ,les mendiants et les rois \n sont égaux .");
        }
        if (x == 4) {
        quot.setText("Nul n'est parfait ici-bas ; le soleil \n lui même a ses  taches .");
        }
        if (x == 5){
        quot.setText("Le monde flatte l'éléphant et piétine\n la fourmi .");
        }
        if (x == 6){
        quot.setText("Qui peut entendre en silence ce qui lui\n déplaît ,il aura ce qui lui plaît .");
        }
        if(x == 7){
        quot.setText("La femme est la fleur de la terre .");
        }
        if(x == 8){
        quot.setText("A mauvaise fortune , il faut faire bonne \n mine .");
        }
        if (x==9){
        quot.setText("Qui a l'épée a la religion .");
        }
        if(x == 10){
        quot.setText("Qui a une femme auprés de soi vit paisiblement \n sous son toit .");
        }
        if(x == 11){
        quot.setText("La douleur d'aujourd'hui te rendra \n plus fort demain .");
        }
        if(x == 12){
        quot.setText("Attendez la nuit pour dire que \n le jour a été beau .");
        }
        if(x == 13){
        quot.setText("Vache du pauvre , fils du riche \n tous deux mortels .");
        }
        if(x == 14){
        quot.setText("Les plus belles choses ne coûtes \n rien .");
        }
        if(x == 15){
        quot.setText("Qui a des enfants ne mange pas les \n meilleurs morceaux .");
        }
        if(x == 16){
        quot.setText("A chaque malheur il existe pire .");
        }
        if(x == 17){
        quot.setText("Celui qui va lentement va surement\n,et celui qui va sûrement va loin.");
        }
        if(x == 18){
        quot.setText("Celui qui sait dit ce qu'il sait .");
        }
        if(x == 19){
        quot.setText("Belle population , population paresseuse .");
        }
        if(x == 20){
        quot.setText("L'adversaire trempe les hommes de coeur .");
        }
        if(x == 21){
        quot.setText("Il suffit d'une occasion pour faire d'un \n ange un démon .");
        }
        if(x == 22){
        quot.setText("On perd tout en voulant tout gagner .");
        }
        if(x == 23){
        quot.setText("Une parole du coeur tient chaud pendant trois\nhivers.");
        }
        if(x == 24){
        quot.setText("Un jour de loisir est un jour d'immortalité.");
        }
        if(x == 25){
        quot.setText("La parole doit être vêtue comme une déesse \n et s'élever comme un oiseau.");
        }
        if(x == 26){
        quot.setText("Si la barbe donnait la science ,les chevres seraient\ndocteur.");
        }
        if(x == 27){
        quot.setText("L'épreuve du courage n'est pas de mourir \n mais vivre .");
        }
        if(x == 28){
        quot.setText("Dieu ne pouvait être partout , alors il a \n crée la mère.");
        }
        if(x == 29){
        quot.setText("C'est par ses branches que l'homme révèle ses racines .");
        }
        if(x == 30){
        quot.setText("Fais du bien a ton corps pour que ton âme \n ait envie d'y rester.");
        }
        if(x == 31){
        quot.setText("On ne peut pas chasser le broillard avec \n un éventail.");
        }
        if(x == 32){
        quot.setText("Le secret du bonheur est de regarder chaque \n situation telle qu'elle est plutôt que \n de la regarder pour ce qu'elle devrait être.");
        }
        if(x == 33){
        quot.setText("Une année = 365 opportunités .");
        }
        if(x == 34){
        quot.setText("Lorsqu'un enfant apprend à marcher, il tombe\n 50 fois. Il ne se dit jamais à lui même :\n<<Peut-être que je ne suis pas fait pour ça.>>");
        }
        if(x == 35){
        quot.setText("Soit reconnaissant envers les gens qui re rendent \n heureux. Ils sont les jardiniers qui \n font fleurir ton âme .");
        }
        if(x == 36){
        quot.setText("On ne peut pas rattraper le temps perdu, mais on peut\n arrêter de perdre son temps .");
        }
        if(x == 37){
        quot.setText("Tu es le Maitre de ta vie et qu'importe ta prison \n TU AS LES CLEFS .");
        }
        if(x == 38){
        quot.setText("Rien ne t'emprisonne excepté tes pensées.\nRien ne te limite excepté tes peurs.\nRien ne te côntrole excepté tes croyances .");
        }
        if(x == 39){
        quot.setText("L'unique personne qui t'accompagne toute ta vie \n C'est toi-même \nPrend soin de toi ...");
        }
        if(x == 40){
        quot.setText("Si tu ne passes pas du temps de créer la vie \nque tu désires,Tu seras forncé de passer \n Beaucoup de temps à vivre une vie dont\n tu ne veux pas .");
        }
        if(x == 41){
        quot.setText("Toute porte de sortie est une porte d'entrée \n sur autre chose .");
        }
        if(x == 42){
        quot.setText("Ne laisse jamais personne juger ta vie et tes choix\ncar personne n'a traversé tes douleurs\ntes joies et encore moins tes peines .");
        }
        if(x == 43){
        quot.setText("Un jour, Tu te réveilleras et tu n'auras plus le temps\nde faire ce que tu voulais faire.\nFais-le donc maintenant .");
        }
        if(x == 44){
        quot.setText("La solitude vaut meiux que la mauvaise compagnie .");
        }
        if(x == 45){
        quot.setText("Nous devons apprendre à vivre ensemble comme des fréres\nsinon nous allons mourir tous ensemble \n Comme des idiots .");
        }
        if(x == 46){
        quot.setText("Celui qui accepte le mal sans lutter contre lui\n coopère avec lui .");
        }
        if(x == 47){
        quot.setText("Une injustice commise quelque part est une menace \n pour la justice dans le monde entier .");
        }
        if(x == 48){
        quot.setText("Tout les progrés sont précaires,et la solution \n d'un problème nous confronte à un autre problème .");
        }
        if(x == 49){
        quot.setText("Tant qu'on allume pas la cigarette ne tue pas\nC'est une métaphore .\ntu glisses le truc qui tue entre tes lèvres\nmais tu ne lui donne pas le pouvoir de te tuer.");
        }
        if(x==50){
        quot.setText("On se sert de l'avenir pour échapper au présent .");
        }
    }
}
