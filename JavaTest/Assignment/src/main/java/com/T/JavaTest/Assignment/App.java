package com.T.JavaTest.Assignment;

/* Main program which performs the communication between player1 and player2 */
public class App 
{
    public static void main( String[] args )
    {
    	Player p1 = new Player1(); //Object of player1
        Player p2 = new Player2(); //object of player2
        String temp = ""; //temp variable initiated to null 
        p1.sendMessage("abc"); //player 1 sending message abc to player2
        temp = p1.receiveMessage(); //temp variable has the message here
        System.out.println(p1.receiveMessage()); //Printing the message inside temp
        
        /*********************************************************************************
         this is where the functionality of communication between player 1
          and player two is implemented.
          
          Player 1 sends message. Player 2 receives it. He acknowledges and 
          sends back the message to player 1 with a counter.
          Player 1 then sends the acknowledgement received from player 2
          as a new message. This communication happens 10 times and counter is increasing 
          for every message communicated.
          
          Example :- abc message is sent from player 1 to player 2
          
          player 2 acknowledges it and sends back abc0 to player 1
          
          player 1 sends abc0 as second message to player 2 
          
          player 2 acknowledges this and the sends back abc01 to player1
          
          this continues for 10 increments in the counter as understood by requirement
        ****************************************************************************************/
        for(int i=0; i<10; i++)
        {  	
          p1.sendMessage(temp,i);   
          System.out.println("p1 sending message  " + temp);
          p2.sendMessage(temp,i);
          System.out.println("p2 received message content  "+p2.receiveMessage());
          temp =  p2.receiveMessage();
        }       
    }
}
