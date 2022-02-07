public class IfElse {

    public static void displayHighScrorePosition(String player, int position){

        System.out.println(player+" managed to get into position "+position);


    }

    public static int calculateScore(int playerScore){
        if (playerScore>=1000){
            return 1;
        }
        else if(playerScore>=500 && playerScore<1000){
            return 2;
        }
        else if(playerScore>100 && playerScore<500){
            return 3;
        }else{
            return 4;
        }
    }
    /*

        int position=4;
            if (playerScore>=1000){
                position=1;
            }
            else if(playerScore>=500 && playerScore<1000){
                position= 2;
            }
            else if(playerScore>100 && playerScore<500){
                position= 3;
            }
            return position;
        }
        */
    public static void main(String[] args) {
        int hightScroreposition=calculateScore(500);
        displayHighScrorePosition("akshay", hightScroreposition);

        int high=calculateScore(1500);
        displayHighScrorePosition("onkar", high);
    }
}

