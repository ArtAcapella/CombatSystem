import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Random rand = new Random();

    //ZAI MAIN STATS
    //"Street Smarts" "Book Smarts" "Quick" "Buff" "Tech" "Eyes" "Cool" "Luck" "Charm"
    //stats range from -5 to 10
    //public void zai {
    int ZaiSts = 4;
    int ZaiBoS = 4;
    int ZaiQck = 4;
    int ZaiBuf = 4;
    int ZaiTech = 4;
    int ZaiEyes = 4;
    int ZaiCool = 4;
    int ZaiLck = 4;
    int ZaiChrm = 4;
    int ZaiICE = 4;
    //}
    //Ace Main Stats
    int AceStS = 4;
    int AceBoS = 4;
    int AceQck = 4;
    int AceBuf = 4;
    int AceTech = 4;
    int AceEyes = 4;
    int AceCool = 4;
    int AceLck = 4;
    int AceChrm = 4;
    int AceICE = 4;

    //Goliath/Pilot Main Stats
    int PilStS = 4;
    int PilBoS = 4;
    int GolQck = 4;
    int GolBuf = 4;
    int GolTech = 4;
    int PilEyes = 4;
    int PolCool = 4;
    int PilLck = 4;
    int PilChrm = 4;
    int GolICE = 4;
    
    System.out.println("Fighting Goliath");

    boolean inCombat = true;
   // List<String> zaiMoves = new ArrayList<>();
   // List<String> aceMoves = new ArrayList<>();
    String[] moves = {"assess", "fight", "moves", "talk"};
    String[] zaiWeapons = {"viro dagger", "pistol", "rifle"};
    String[] aceWeapons = {"data knife", "EMP", "grenade"};
     String[] zaiMoves = {"trip", "climb", "grapple", "install", "target"};
     String[] aceMoves = {"hack", "melt ICE", "reinforce", "distract", "hide"};
     String[] aceHacks = {"overheat", "short_circ", "overide_cyber", "optric_kill", "reboot"};
    //zaiMoves.add("trip", "climb", "rifle", "grapple");
    //zaiMoves.add("viro dagger", "pistol", "rifle", "grapple");
    //zaiMoves.add("climb");
    //aceMoves.add("overide");
    List<String> goliathTargets = new ArrayList<>();

    System.out.println("The goliath, a hulking steel mech, cracks the stone as it moves forward. The pilot in the hull is covered by the steel plating, the only indication of their existence is the humanlike movements they pilot the mech with. It stops suddenly, and an electronic hissing sound penetrates your ears. Zai pushes you out of sight and peeks out from your hiding space to see the worst sight possible: the Goliath rushing twoards you both.");
    
    while (inCombat) {
      boolean zaiTurn = true;
      while (zaiTurn) {
        System.out.println(Arrays.toString(moves));
        System.out.println("Zai's Move:");
        String movesChoice = sc.nextLine();
        if (movesChoice.equalsIgnoreCase("assess")) {
          if (ZaiEyes + ZaiTech >= 5) {
          System.out.println("The Goliath's leg hydraulics are exposed and worn from constant use");
          goliathTargets.add("legJoint");
          } if (ZaiEyes + ZaiTech >= 7) {
          System.out.println("The Goliath's machine gun feed is hanging loose");
          goliathTargets.add("gunFeed");
          } if (ZaiEyes + ZaiTech >= 12) {
          System.out.println("The Goliath's processor is likely contained in the swiveling base. The rotor has been jacked up to allow it to move faster, leaving a shadowy sliver of an opening");
          goliathTargets.add("Processor");
          } if (ZaiEyes + ZaiTech >= 18) {
          System.out.println("The Goliath's hull an old ARIES model, designed to resist explosives. There should be suspession joints under those seams that will break with a good shot");
          goliathTargets.add("pilot");
          } else if (ZaiEyes + ZaiTech <= 4){
            System.out.println("I can't seem to get a read on this thing!");
          }
          System.out.println("Zai relays her observations to Ace");
        } if (movesChoice.equalsIgnoreCase("fight")) {
          
        } if (movesChoice.equalsIgnoreCase("moves")) {
          System.out.println(Arrays.toString(zaiMoves));
          String zMoveChoice = sc.nextLine();
          if (zMoveChoice.equalsIgnoreCase("trip")) {
            if (ZaiQck + ZaiBuf >= GolQck + GolBuf) { 
              //Make Enemy Prone
            } else if (ZaiQck + ZaiBuf <= GolQck + GolBuf) {
              //make Zai Prone
            }
          }if (zMoveChoice.equalsIgnoreCase("climb")) {
            if (ZaiQck + ZaiLck/3 >= GolQck) {
              //Zai climbs onto the goliath, making her future attacks easier and the goliaths attacks on her harder
            }
          }if (zMoveChoice.equalsIgnoreCase("grapple")) {
            
          }if (zMoveChoice.equalsIgnoreCase("install")) {
            
          }if (zMoveChoice.equalsIgnoreCase("target")) {
            
          }
          
        } if (movesChoice.equalsIgnoreCase("talk")) {
          
        } 
        zaiTurn = false;
      }
      boolean aceTurn = true;
      while (aceTurn) {
        System.out.println(Arrays.toString(moves));
        System.out.println("Ace's Move:");
        String movesChoice = sc.nextLine();
        if (movesChoice.equalsIgnoreCase("assess")) {
          if (AceEyes + AceTech >= 5) {
          System.out.println("The Goliath's leg hydraulics are exposed and worn from constant use");
          goliathTargets.add("legJoint");
          } if (AceEyes + AceTech >= 7) {
          System.out.println("The Goliath's machine gun feed is hanging loose");
          goliathTargets.add("gunFeed");
          } if (AceEyes + AceTech >= 12) {
          System.out.println("The Goliath's processor is likely contained in the swiveling base. The rotor has been jacked up to allow it to move faster, leaving a shadowy sliver of an opening");
          goliathTargets.add("Processor");
          } if (AceEyes + AceTech >= 18) {
          System.out.println("The Goliath's hull an old ARIES model, designed to resist explosives. There should be suspession joints under those seams that will break with a good shot");
          goliathTargets.add("pilot");
          } else if (AceEyes + AceTech <= 4){
            System.out.println("I can't seem to get a read on this thing!");
          }
        } if (movesChoice.equalsIgnoreCase("fight")) {
          System.out.println(Arrays.toString(aceWeapons));
          String weaponSelect = sc.nextLine();
          if (weaponSelect.equalsIgnoreCase("data knife")) {
            if (AceBuf + AceQck + (AceLck/3) >= GolQck + GolBuf){
              System.out.println("The Data Knife slides between the plates of the Goliath's Armor");
              //deal damage
              if (AceTech + rand.nextInt(6) + (AceLck/3) >= GolICE) {
                //This lowers the ICE of the target, making hack minigames easier and more effective
              } else {
                System.out.println("The Knife Couldn't Break Initial ICE");
              }
            }
          } if (weaponSelect.equalsIgnoreCase("emp")) {
            if (AceBuf + AceQck + (AceLck/3) >= GolQck + GolBuf){
              if (AceTech + AceQck + (AceLck/3) >= GolBuf + GolTech) {
                
              }
            }
          } if (weaponSelect.equalsIgnoreCase("grenade")) {
            if (AceTech + AceQck + (AceLck/3) >= GolBuf + GolQck) {
                
              }
          }
          
        } if (movesChoice.equalsIgnoreCase("moves")) {
          System.out.println(Arrays.toString(aceMoves));
          String aMovesChoice = sc.nextLine();
          if (aMovesChoice.equalsIgnoreCase("hack")) {
            System.out.println(Arrays.toString(aceHacks));
            String aHacksChoice = sc.nextLine();
            if (aHacksChoice.equalsIgnoreCase("")) {
              
            } if (aHacksChoice.equalsIgnoreCase("")) {
              
            } if (aHacksChoice.equalsIgnoreCase("")) {
              
            } if (aHacksChoice.equalsIgnoreCase("")) {
              
            } if (aHacksChoice.equalsIgnoreCase("")) {
              
            } if (aHacksChoice.equalsIgnoreCase("")) {
              
            }
          }if (aMovesChoice.equalsIgnoreCase("melt ICE")) {
            //requires a difficult minigame that can lower ICE down to 0, meaning that hacks will become supper effective and difficult hacks like "overide_cyberware" can be easily uploaded
          }if (aMovesChoice.equalsIgnoreCase("distract")) {
            
          }if (aMovesChoice.equalsIgnoreCase("hide")) {
            
          }if (aMovesChoice.equalsIgnoreCase("reinforce")) {
            
          }
        } if (movesChoice.equalsIgnoreCase("talk")) {
          
        } 
        aceTurn = false;
      }
      
    }
    
  }
}
