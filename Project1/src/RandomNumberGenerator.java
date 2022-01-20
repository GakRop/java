import java.util.Random;
public class RandomNumberGenerator {
    public static void main( String args[] ) {
    
    int min_for_rolls = 1;
    int max_for_rolls = 1000;
    int rolls = (int)Math.floor(Math.random()*(max_for_rolls-min_for_rolls+1)+min_for_rolls);    
    
    int number_of_yahtzee = 0;
    int number_of_full_house = 0;
    int number_of_large_straight = 0;
    int number_of_four_of_a_kind = 0;
    int number_of_three_of_a_kind = 0;
    int number_of_loser = 0;
    
    int times = rolls;
    
    while (times > 0)
    
    {int min = 1;
    int max = 6;
    int dice_0 = (int)Math.floor(Math.random()*(max-min+1)+min);
    int dice_1 = (int)Math.floor(Math.random()*(max-min+1)+min);
    int dice_2 = (int)Math.floor(Math.random()*(max-min+1)+min);
    int dice_3 = (int)Math.floor(Math.random()*(max-min+1)+min);
    int dice_4 = (int)Math.floor(Math.random()*(max-min+1)+min);
    
    Yahtzee ya = new Yahtzee(rolls, dice_0, dice_1, dice_2, dice_3, dice_4);
    String hands = ya.hands();
   
    times = times - 1;
    
    switch(hands){
        case "yahtzee":
            number_of_yahtzee = number_of_yahtzee + 1;
            break;
        
        case "full house":
            number_of_full_house = number_of_full_house + 1;
            break;
        
        case "large straight":
            number_of_large_straight = number_of_large_straight + 1;
            break;
            
        case "four of a kind":
            number_of_four_of_a_kind = number_of_four_of_a_kind + 1;
            break;
            
        case "three of a kind":
            number_of_three_of_a_kind = number_of_three_of_a_kind + 1;
            break;
            
        case "loser":
            number_of_loser = number_of_loser + 1;
            break;}
    }
    Probabilityofyhtzee py = new Probabilityofyhtzee(rolls, number_of_yahtzee);
    double yahtzee_percent = py.pycalc();
    
    Probabilityoffullhouse pf = new Probabilityoffullhouse(rolls, number_of_full_house);
    double full_house_percent = pf.pfcalc();
    
    Probabilityoflargestraight ps = new Probabilityoflargestraight(rolls, number_of_large_straight);
    double large_straight_percent = ps.pscalc();
    
    Probabilityoffourofakind p4 = new Probabilityoffourofakind(rolls, number_of_four_of_a_kind);
    double four_of_a_kind_percent = p4.p4calc();
    
    Probabilityofthreeofakind p3 = new Probabilityofthreeofakind(rolls, number_of_three_of_a_kind);
    double three_of_a_kind_percent = p3.p3calc();
    
    Probabilityofloser pl = new Probabilityofloser(rolls, number_of_loser);
    double loser_percent = pl.plcalc();
    
    System.out.println("Number of Rolls: "+rolls);
    System.out.println("-------------------------------------");
    System.out.println("Number of Yahtzees: " + number_of_yahtzee);
    System.out.println("Yahtzee percent: " + yahtzee_percent + "%");
    System.out.println("\n");    
    System.out.println("Number of full houses: " + number_of_full_house);
    System.out.println("Full house percent: " + full_house_percent + "%");
    System.out.println("\n");   
    System.out.println("Number of large straights: " + number_of_large_straight);
    System.out.println("Large straight percent: " + large_straight_percent + "%");
    System.out.println("\n");    
    System.out.println("Number of four of a kinds: " + number_of_four_of_a_kind);
    System.out.println("Four of a kind percent: " + four_of_a_kind_percent + "%");
    System.out.println("\n");    
    System.out.println("Number of three of a kinds: " + number_of_three_of_a_kind);
    System.out.println("Three of a kind percent: " + three_of_a_kind_percent + "%");
    System.out.println("\n");    
    System.out.println("Number of losers: " + number_of_loser);
    System.out.println("Loser percent: " + loser_percent + "%");
    System.out.println("\n");
    }
}

//NumberFormat formatter = new DecimalFormat("#0.00");     
//System.out.println(formatter.format(4.0));