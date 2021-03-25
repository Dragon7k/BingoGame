package sample;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;


import javax.swing.*;
import java.net.URL;
import java.util.*;
import java.util.Timer;


public class GameController {

    private static boolean isBingo;
    public Button FillPane;
    public Button BingoButton;
    public javafx.scene.layout.GridPane GridPane;
    public TextField textField ;
    public static int countOfLastElements=0;
    ArrayList<Integer> arrayList = new ArrayList<>(40);
    ArrayList<Integer> buttonsPos = new ArrayList<>();
    ArrayList<Button> buttons = new ArrayList<>(16);
    ArrayList<Button> bingoButtons = new ArrayList<>(16);
    public int[] el = {0, 5, 10, 15};


    public void FillNumberPane(ActionEvent actionEvent) {

        NUmber n = new NUmber();
        ArrayList<Integer> fillList = n.getList();

        Button first = new Button(fillList.get(0).toString());
        first.setMaxWidth(Double.MAX_VALUE);
        first.setMaxHeight(Double.MAX_VALUE);
        first.setFont(new Font(20));
        first.addEventFilter(ActionEvent.ACTION, eventHandler);
        GridPane.setHgrow(first, Priority.ALWAYS);
        GridPane.setVgrow(first, Priority.ALWAYS);

        Button second = new Button(fillList.get(1).toString());

        second.setMaxWidth(Double.MAX_VALUE);
        second.setMaxHeight(Double.MAX_VALUE);
        second.setFont(new Font(20));
        second.addEventFilter(ActionEvent.ACTION, eventHandler);
        GridPane.setHgrow(second, Priority.ALWAYS);
        GridPane.setVgrow(second, Priority.ALWAYS);

        Button third = new Button(fillList.get(2).toString());
        // растянем кнопку по горизонтали и вертикали
        third.setFont(new Font(20));
        third.addEventFilter(ActionEvent.ACTION, eventHandler);
        third.setMaxWidth(Double.MAX_VALUE);
        third.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(third, Priority.ALWAYS);
        GridPane.setVgrow(third, Priority.ALWAYS);


        Button fourth = new Button(fillList.get(3).toString());
        // кнопка заполняет все пространство ячейки
        fourth.setFont(new Font(20));
        fourth.addEventFilter(ActionEvent.ACTION, eventHandler);
        fourth.setMaxWidth(Double.MAX_VALUE);
        fourth.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(fourth, Priority.ALWAYS);
        GridPane.setVgrow(fourth, Priority.ALWAYS);
//////////

        Button five = new Button(fillList.get(4).toString());
        five.setMaxWidth(Double.MAX_VALUE);
        five.setMaxHeight(Double.MAX_VALUE);
        five.setFont(new Font(20));
        five.addEventFilter(ActionEvent.ACTION, eventHandler);
        GridPane.setHgrow(five, Priority.ALWAYS);
        GridPane.setVgrow(five, Priority.ALWAYS);

        Button six = new Button(fillList.get(5).toString());
        six.setFont(new Font(20));
        six.addEventFilter(ActionEvent.ACTION, eventHandler);
        six.setMaxWidth(Double.MAX_VALUE);
        six.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(six, Priority.ALWAYS);
        GridPane.setVgrow(six, Priority.ALWAYS);

        Button seven = new Button(fillList.get(6).toString());
        // растянем кнопку по горизонтали и вертикали
        seven.setFont(new Font(20));
        seven.addEventFilter(ActionEvent.ACTION, eventHandler);
        seven.setMaxWidth(Double.MAX_VALUE);
        seven.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(seven, Priority.ALWAYS);
        GridPane.setVgrow(seven, Priority.ALWAYS);

        Button eight = new Button(fillList.get(7).toString());
        // кнопка заполняет все пространство ячейки
        eight.setFont(new Font(20));
        eight.addEventFilter(ActionEvent.ACTION, eventHandler);
        eight.setMaxWidth(Double.MAX_VALUE);
        eight.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(eight, Priority.ALWAYS);
        GridPane.setVgrow(eight, Priority.ALWAYS);
/////////

        Button nine = new Button(fillList.get(8).toString());
        nine.setMaxWidth(Double.MAX_VALUE);
        nine.setMaxHeight(Double.MAX_VALUE);
        nine.setFont(new Font(20));
        nine.addEventFilter(ActionEvent.ACTION, eventHandler);
        GridPane.setHgrow(nine, Priority.ALWAYS);
        GridPane.setVgrow(nine, Priority.ALWAYS);

        Button ten = new Button(fillList.get(9).toString());

        ten.setMaxWidth(Double.MAX_VALUE);
        ten.setMaxHeight(Double.MAX_VALUE);
        ten.setFont(new Font(20));
        ten.addEventFilter(ActionEvent.ACTION, eventHandler);
        GridPane.setHgrow(ten, Priority.ALWAYS);
        GridPane.setVgrow(ten, Priority.ALWAYS);

        Button eleven = new Button(fillList.get(10).toString());
        // растянем кнопку по горизонтали и вертикали
        eleven.setFont(new Font(20));
        eleven.addEventFilter(ActionEvent.ACTION, eventHandler);
        eleven.setMaxWidth(Double.MAX_VALUE);
        eleven.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(eleven, Priority.ALWAYS);
        GridPane.setVgrow(eleven, Priority.ALWAYS);

        Button twelve = new Button(fillList.get(11).toString());
        // кнопка заполняет все пространство ячейки
        twelve.setFont(new Font(20));
        twelve.addEventFilter(ActionEvent.ACTION, eventHandler);
        twelve.setMaxWidth(Double.MAX_VALUE);
        twelve.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(twelve, Priority.ALWAYS);
        GridPane.setVgrow(twelve, Priority.ALWAYS);
/////////
        Button thirteen = new Button(fillList.get(12).toString());
        thirteen.setFont(new Font(20));
        thirteen.addEventFilter(ActionEvent.ACTION, eventHandler);
        thirteen.setMaxWidth(Double.MAX_VALUE);
        thirteen.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(thirteen, Priority.ALWAYS);
        GridPane.setVgrow(thirteen, Priority.ALWAYS);

        Button fourteen = new Button(fillList.get(13).toString());
        fourteen.setFont(new Font(20));
        fourteen.addEventFilter(ActionEvent.ACTION, eventHandler);
        fourteen.setMaxWidth(Double.MAX_VALUE);
        fourteen.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(fourteen, Priority.ALWAYS);
        GridPane.setVgrow(fourteen, Priority.ALWAYS);

        Button fifteen = new Button(fillList.get(14).toString());
        // растянем кнопку по горизонтали и вертикали
        fifteen.setFont(new Font(20));
        fifteen.addEventFilter(ActionEvent.ACTION, eventHandler);
        fifteen.setMaxWidth(Double.MAX_VALUE);
        fifteen.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(fifteen, Priority.ALWAYS);
        GridPane.setVgrow(fifteen, Priority.ALWAYS);

        Button sixteen = new Button(fillList.get(15).toString());
        // кнопка заполняет все пространство ячейки
        sixteen.setFont(new Font(20));
        sixteen.addEventFilter(ActionEvent.ACTION, eventHandler);
        sixteen.setMaxWidth(Double.MAX_VALUE);
        sixteen.setMaxHeight(Double.MAX_VALUE);
        GridPane.setHgrow(sixteen, Priority.ALWAYS);
        GridPane.setVgrow(sixteen, Priority.ALWAYS);


        GridPane.setGridLinesVisible(true);
        GridPane.add(first, 0, 0);
        GridPane.add(second, 1, 0);
        GridPane.add(third, 2, 0);
        GridPane.add(fourth, 3, 0);

        GridPane.add(five, 0, 1);
        GridPane.add(six, 1, 1);
        GridPane.add(seven, 2, 1);
        GridPane.add(eight, 3, 1);

        GridPane.add(nine, 0, 2);
        GridPane.add(ten, 1, 2);
        GridPane.add(eleven, 2, 2);
        GridPane.add(twelve, 3, 2);

        GridPane.add(thirteen, 0, 3);
        GridPane.add(fourteen, 1, 3);
        GridPane.add(fifteen, 2, 3);
        GridPane.add(sixteen, 3, 3);

        buttons.add(first);
        buttons.add(second);
        buttons.add(third);
        buttons.add(fourth);

        buttons.add(five);
        buttons.add(six);
        buttons.add(seven);
        buttons.add(eight);

        buttons.add(nine);
        buttons.add(ten);
        buttons.add(eleven);
        buttons.add(twelve);

        buttons.add(thirteen);
        buttons.add(fourteen);
        buttons.add(fifteen);
        buttons.add(sixteen);

        System.out.println(buttons.toString());




        for (int i = 1; i <= 40; i++) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        ThreadForText t = new ThreadForText();
        t.start();

    }

    EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {

        public void handle(ActionEvent e) {
            System.out.println("Hello World");
            bingoButtons.add((Button) e.getSource());
            Image imageOk = new Image("/form/ok.png", 50, 50, false, false);
            Button scr = (Button) e.getSource();
            scr.graphicProperty().setValue(new ImageView(imageOk));


        }
    };

    public void Bingo(ActionEvent actionEvent) {

        System.out.println("its a bingo time");
        for (Button s : bingoButtons) {
            System.out.println(s.getText());
        }
        for (Button g : buttons) {
            System.out.println(" he " + g.getText());
        }

        for (Button b : bingoButtons) {
            for (Button o : buttons) {
                if (b.equals(o)) {
                    buttonsPos.add(buttons.indexOf(o));
                }
            }
        }


        if (compareElements(el, buttonsPos)) {

            System.out.println("you win");
            JOptionPane.showMessageDialog(null, "Congratulations, you won",
                    "Congratulations",JOptionPane.ERROR_MESSAGE);

        } else {
            System.out.println("you lose");
            JOptionPane.showMessageDialog(null, "Sorry, you lose",
                    "Sorry",JOptionPane.ERROR_MESSAGE);
        }
        isBingo = true;
    }

    public boolean compareElements(int[] mas, ArrayList<Integer> arr) {
        int count = 0;
        boolean f=false;
        for (int i : mas) {
            for (int j : arr) {
                if (i == j) {
                    count++;
                }
            }
        }
        try {
            for (Button i : bingoButtons) {
                for (int j = 0; j < countOfLastElements; j++) {
                    if (i.getText().equals(String.valueOf(arrayList.get(j)))) {
                        System.out.println("true");
                        f=true;
                    } else {
                        System.out.println("false");
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            f=false;
        }

        if (count == 4 && f== true) {
            return true;
        } else {
            return false;
        }
    }

     class ThreadForText implements Runnable{
        private Thread thr;

        ThreadForText(){
            thr = new Thread(this, "Thread1.");
        }
        public void start() {
            System.out.println(arrayList.toString());
            thr.start(); // вызвать метод run()
        }
        @Override
        public void run() {
            try {
                while (!isBingo){
                for(int i =0;i<arrayList.size();i++){
                textField.setText(String.valueOf(arrayList.get(i)));
                countOfLastElements++;
                    System.out.println(countOfLastElements);
                Thread.sleep(5000);
                }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}





