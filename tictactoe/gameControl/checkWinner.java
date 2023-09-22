private void checkWinner() {
    //Checking every condition of tic-tac-toe game
    //Check Horizontally
    if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "") {
      win = true;
    }
  
    //Check Horizontally
    else if (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText() && btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != "") {
      win = true;
    }
  
    //Check Horizontally
    else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != "") {
      win = true;
    }
  
    //Check Vertically
    else if (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText() && btn1.getText() != "" && btn4.getText() != "" && btn7.getText() != "") {
      win = true;
    }
  
    //Check Vertically
    else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && btn2.getText() != "" && btn5.getText() != "" && btn8.getText() != "") {
      win = true;
    } else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && btn3.getText() != "" && btn6.getText() != "" && btn9.getText() != "") {
      win = true;
    }
  
    //Check Diagonally
    else if (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText() && btn1.getText() != "" && btn5.getText() != "" && btn9.getText() != "") {
      win = true;
    }
  
    //Check Diagonally
    else if (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText() && btn3.getText() != "" && btn5.getText() != "" && btn7.getText() != "") {
      win = true;
    } else {
      win = false;
    }
  
    if (win) {
      lbl.setText("Hurray! Player " + letter + " wins!");
      btn1.setEnabled(false);
      btn2.setEnabled(false);
      btn3.setEnabled(false);
      btn4.setEnabled(false);
      btn5.setEnabled(false);
      btn6.setEnabled(false);
      btn7.setEnabled(false);
      btn8.setEnabled(false);
      btn9.setEnabled(false);
  
    } else if (!win && count == 9) {
      lbl.setText("The game ended in a tie.");
      btn1.setEnabled(false);
      btn2.setEnabled(false);
      btn3.setEnabled(false);
      btn4.setEnabled(false);
      btn5.setEnabled(false);
      btn6.setEnabled(false);
      btn7.setEnabled(false);
      btn8.setEnabled(false);
      btn9.setEnabled(false);
    }
  }