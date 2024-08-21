package tictactoe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author delro
 */
public class TicTacToe extends Application {
    
    private int turn =0;
    private static int board[][] = new int[3][3];
    
    @Override
    public void start(Stage primaryStage) 
    {
        //Initialize and set the Label for title and player
        Label title = new Label("Tic Tac Toe");
        Label player = new Label ("Player 1's move");
        
        int moves[][] = new int[3][3];
        
        
        
        //Image class and imageview for blankXO
        Image XO0 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo0 = new ImageView(XO0);
        xo0.setPreserveRatio(true);
        
        Image XO1 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo1 = new ImageView(XO1);
        xo1.setPreserveRatio(true);
        
        Image XO2 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo2 = new ImageView(XO2);
        xo2.setPreserveRatio(true);
        
        Image XO3 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo3 = new ImageView(XO3);
        xo3.setPreserveRatio(true);
        
        Image XO4 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo4 = new ImageView(XO4);
        xo4.setPreserveRatio(true);
        
        Image XO5 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo5 = new ImageView(XO5);
        xo5.setPreserveRatio(true);
        
        Image XO6 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo6 = new ImageView(XO6);
        xo6.setPreserveRatio(true);
        
        Image XO7 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo7 = new ImageView(XO7);
        xo7.setPreserveRatio(true);
        
        Image XO8 = new Image ("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\BlankXO.png");
        ImageView xo8 = new ImageView(XO8);
        xo8.setPreserveRatio(true);
        
        
       
        
        //Create 9 buttons for the images
        Button btn00 = new Button();
        btn00.setFocusTraversable(false);
        
        Button btn01 = new Button();
        btn01.setFocusTraversable(false);
        
        Button btn02 = new Button();
        btn02.setFocusTraversable(false);
        
        Button btn03 = new Button();
        btn03.setFocusTraversable(false);
        
        Button btn04 = new Button();
        btn04.setFocusTraversable(false);
        
        Button btn05 = new Button();
        btn05.setFocusTraversable(false);
        
        Button btn06 = new Button();
        btn06.setFocusTraversable(false);
        
        Button btn07 = new Button();
        btn07.setFocusTraversable(false);
        
        Button btn08 = new Button();
        btn08.setFocusTraversable(false);
        
        
        
        btn00.setGraphic(xo0);
        btn01.setGraphic(xo1);
        btn02.setGraphic(xo2);
        btn03.setGraphic(xo3);
        btn04.setGraphic(xo4);
        btn05.setGraphic(xo5);
        btn06.setGraphic(xo6);
        btn07.setGraphic(xo7);
        btn08.setGraphic(xo8);
        
        
        GridPane grid = new GridPane();
        grid.add(btn00, 0, 0);
        grid.add(btn01, 0, 1);
        grid.add(btn02, 0, 2);
        grid.add(btn03, 1, 0);
        grid.add(btn04, 1, 1);
        grid.add(btn05, 1, 2);
        grid.add(btn06, 2, 0);
        grid.add(btn07, 2, 1);
        grid.add(btn08, 2, 2);
        
        VBox vbox = new VBox (10, title, grid, player);
        vbox.setAlignment(Pos.CENTER);
        
       
        
         btn00.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) 
            {
             if (turn %2 ==0)
             {
                 btn00.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png"))); 
                 board[0][0] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
             else
             {
                 btn00.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                 board[0][0] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
             
             if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
             {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             
             
             btn00.setDisable(true);
            }
        });
        
        btn01.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) 
            {
                if (turn %2 ==0)
             {
                 btn01.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[0][1] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
                else 
             {
                 btn01.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                 board[0][1] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
             if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
            {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             
              btn01.setDisable(true);
            }
        });
        
        
       btn02.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) 
            {
               if (turn %2 ==0)
             {
                 btn02.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[0][2] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
             else
             {
                 btn02.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                board[0][2] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
                if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
                else if (checkWinner()==2)
              {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
              }
             
             btn02.setDisable(true);
            }
        });
        
        
        btn03.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event) 
            {
               if (turn %2 ==0)
             {
                 btn03.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[1][0] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
             else
             {
                 btn03.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                board[1][0] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
             if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
             {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             
             btn03.setDisable(true);
            }
        });
        
       
        btn04.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event) 
            {
               if (turn %2 ==0)
             {
                 btn04.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[1][1] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
             else
             {
                 btn04.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png"))); 
                 board[1][1] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
             if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
             {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             btn04.setDisable(true);
            }
        });
        
        
        btn05.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event) {
                if (turn %2 ==0)
             {
                 btn05.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[1][2] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
             else
             {
                 btn05.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                 board[1][2] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
             if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
             {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             btn05.setDisable(true);
            }
        });
        
       
        btn06.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event) {
                if (turn %2 ==0)
             {
                 btn06.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[2][0] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
             else
             {
                 btn06.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                 board[2][0] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
              if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
             {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             
             btn06.setDisable(true);
            }
        });
        
       
        btn07.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             if (turn %2 ==0)
             {
                 btn07.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[2][1] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
                 
             }
             else
             {
                 btn07.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                 board[2][1] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
             }
             if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
             {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             
             btn07.setDisable(true);
            }
        });
        
       
        btn08.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) 
            {
                if (turn %2 ==0)
             {
                 btn08.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\X.png")));
                 board[2][2] = 2;
                 turn =1;
                 player.setText("Player 2's Move");
             }
             else
             {
                 btn08.setGraphic(new ImageView(new Image("C:\\Users\\delro\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\O.png")));  
                 board[2][2] = 1;
                 turn =2;
                 player.setText("Player 1's Move");
                 
             }
             if (checkWinner()==1)
             {
                 player.setText("Player 2 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             else if (checkWinner()==2)
             {
                 player.setText("Player 1 Won!");
                 btn00.setDisable(true);
                 btn01.setDisable(true);
                 btn02.setDisable(true);
                 btn03.setDisable(true);
                 btn04.setDisable(true);
                 btn05.setDisable(true);
                 btn06.setDisable(true);
                 btn07.setDisable(true);
                 btn08.setDisable(true);
             }
             
             btn08.setDisable(true);
            }
        });
        
        
        
        
     
       
        Scene scene = new Scene(vbox);
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    //checking method here
    public static int checkWinner()
    {
        if (board[0][0] == board[0][1] && board[0][1]== board[0][2]&&board[0][2]==1)
        {
            return 1;
        }
        
        else if (board[1][0] == board[1][1] &&board[1][1]== board[1][2] && board[1][2]==1)
        {
            return 1;
        }
        else if (board[2][0] == board[2][1] && board[2][1]== board[2][2] && board[2][2]==1)
        {
            return 1;
        }
        else if (board[0][0]== board[1][0] && board[1][0] == board[2][0] && board[2][0]==1)
        {
            return 1;
        }
        else if (board[0][1] ==  board[1][1] &&  board[1][1] == board[2][1] && board[2][1]==1)
        {
            return 1;
        }
        else if (board[0][2]== board[1][2] && board[1][2]==board[2][2] && board[2][2]==1)
        {
            return 1;
        }
        else if (board[0][0]== board[1][1] && board[1][1]== board[2][2] && board[2][2]==1)
        {
            return 1;
        }
        else if (board[0][2]== board[1][1]  && board[1][1]==board[2][0] && board[2][0]==1)
        {
            return 1;
        }
        else if (board[0][0] == board[0][1] && board[0][1]== board[0][2]&&board[0][2]==2)
        {
            return 2;
        }
        
        else if (board[1][0] == board[1][1] &&board[1][1]== board[1][2] && board[1][2]==2)
        {
            return 2;
        }
        else if (board[2][0] == board[2][1] && board[2][1]== board[2][2] && board[2][2]==2)
        {
            return 2;
        }
        else if (board[0][0]== board[1][0] && board[1][0] == board[2][0] && board[2][0]==2)
        {
            return 2;
        }
        else if (board[0][1] ==  board[1][1] &&  board[1][1] == board[2][1] && board[2][1]==2)
        {
            return 2;
        }
        else if (board[0][2]== board[1][2] && board[1][2]==board[2][2] && board[2][2]==2)
        {
            return 2;
        }
        else if (board[0][0]== board[1][1] && board[1][1]== board[2][2] && board[2][2]==2)
        {
            return 2;
        }
        else if (board[0][2]== board[1][1]  && board[1][1]==board[2][0] && board[2][0]==2)
        {
            return 2;
        }
        else
        {
            return 0;
        }
        
     
    }
    
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
