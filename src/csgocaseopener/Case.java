/*
 * This class will return the weapon from each case
 */

package csgocaseopener;

/**
 *
 * @author lewhi7273
 */
public class Case {
    private int picked;
    //Define all cases
    public String Bravo(){
        //possible weapons in the case
        String possible[] = {"(*)Mac-10 Whitefish", "(*!*)Galil Chatterbox","(*)Mag-7 Heat","(*)XM1014 Black-Tie","(**)AK-47 Elite Build"};
        //pick a random weapon from the case, and if it is the legendary, excite the user
        picked = (int)(possible.length* Math.random());
        if(picked == 1){
            return ("WOOOOW!!! YOU GOT A LEGENDARY!!" + possible[picked]);
        }else{
        return possible[picked];
    }
    }
    public String Bloodhound(){
    String possible[] = {"(*)Mac-10 Heat", "(*!*)Galil Tsunami","(*)Mag-7 Silver","(*)XM1014 Flames","(**)AK-47 The Empress"};
        picked = (int)(possible.length* Math.random());
        if(picked == 1){
            return ("WOOOOW!!! YOU GOT A LEGENDARY!!" + possible[picked]);
        }else{
        return possible[picked];
}
    }
    public String Phoenix(){
        String possible[] = {"(*)Mac-10 Big Toes", "(*!*)Galil Crimson","(*)Mag-7 Tactics","(*)XM1014 Oxide","(**)AK-47 Flame Emperor"};
        picked = (int)(possible.length* Math.random());
        if(picked == 1){
            return ("WOOOOW!!! YOU GOT A LEGENDARY!!" + possible[picked]);
        }else{
        return possible[picked];
}
    }
    public String Vanguard(){
        String possible[] = {"(*)Mac-10 Angular", "(*!*)Galil Gunguan","(*)Mag-7 Johhny","(*)XM1014 Silver","(**)AK-47 Tragic"};
        picked = (int)(possible.length* Math.random());
        if(picked == 1){
            return ("WOOOOW!!! YOU GOT A LEGENDARY!!" + possible[picked]);
        }else{
        return possible[picked];
        
    }
    }
    public String Clutch(){
        String possible[] = {"(*)Mac-10 Instance", "(*!*)Galil Red Wave","(*)Mag-7 Police","(*)XM1014 Swat","(**)AK-47 Terrorist"};
        picked = (int)(possible.length* Math.random());
        if(picked == 1){
            return ("WOOOOW!!! YOU GOT A LEGENDARY!!" + possible[picked]);
        }else{
        return possible[picked];
}
}
}

