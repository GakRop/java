import java.util.Arrays;

public class Yahtzee {
    public int rolls; public int dice1; public int dice2; public int dice3; public int dice4; public int dice5;
    
    public Yahtzee(int rolls, int dice1, int dice2, int dice3, int dice4, int dice5)
    {this.rolls = rolls; this.dice1 = dice1; this.dice2 = dice2; this.dice3 = dice3; this.dice4 = dice4; this.dice5 = dice5;}
    
    public String hands()
    {int[] hands = {this.dice1,this.dice2,this.dice3,this.dice4,this.dice5};
    Arrays.sort(hands);
    
        if(hands[0]==hands[1]&&hands[1]==hands[2]&&hands[2]==hands[3]&&hands[3]==hands[4])
        return "yahtzee";

        else if(hands[0]==hands[1]&&hands[1]==hands[2]&&hands[2]!=hands[3]&&hands[3]==hands[4])
        return "full house";
        
        else if(hands[0]==hands[1]&&hands[1]!=hands[2]&&hands[2]==hands[3]&&hands[3]==hands[4])
        return "full house";

        else if(hands[0]==6&&hands[1]==5&&hands[2]==4&&hands[3]==3&&hands[4]==2)
        return "large straight";
        
        else if(hands[0]==5&&hands[1]==4&&hands[2]==3&&hands[3]==2&&hands[4]==1)
        return "large straight";

        else if(hands[0]==hands[1]&&hands[1]==hands[2]&&hands[2]==hands[3]&&hands[3]!=hands[4])
        return "four of a kind";

        else if(hands[1]==hands[2]&&hands[2]==hands[3]&&hands[3]==hands[4]&&hands[0]!=hands[1])
        return "four of a kind";

        else if(hands[0]==hands[1]&&hands[1]==hands[2]&&hands[2]!=hands[3]&&hands[3]!=hands[4])
        return "three of a kind";

        else if(hands[0]!=hands[1]&&hands[1]==hands[2]&&hands[2]==hands[3]&&hands[3]!=hands[4])
        return "three of a kind";

        else if(hands[0]!=hands[1]&&hands[1]!=hands[2]&&hands[2]==hands[3]&&hands[3]==hands[4])
        return "three of a kind";

        else
        return "loser";}
}