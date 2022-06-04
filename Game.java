import java.util.Scanner;
	


/** Main CLass 
 * Initialization of all the variables used in the game.
 * Some of the variable were also assigned with their initial values
 * Contains all the methods of the program.
 * @author Rolph Rodgen Denusta
 * @version 1.0.0 June 4, 2022
*/
public class Game {
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	String name;
	int option;
	int choice;
	int hp;
	String weapon;
	int damage;
	int range;
	int max;
	int min;
	int enemy_max;
	int enemy_min;
	int enemy_hp;
	int enemy_range;
	int enemy_damage;
	int tchance = 3;
	int bchance = 1;
	int cfticket = 0;
	int enemy_killed = 0;


	/**
	 * Main method
	 * The game is initialized
	 * Calls the method intro
	 * No parameters
	 * No return
	 */
	public static void main(String[] args) {

		Game Raphtalia;
		Raphtalia = new Game();

		Raphtalia.intro();

	}


	/**
	 * Start of the game.
	 * asks for name
	 * returns none, but prints the name of the character and calls the role() method first and then the village() method 
	 */
	public void intro(){
		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Please enter your name: ");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

		name = myScanner.next();

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Hey there " + name + ". Welcome to our village Vinland!");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		role();
		village();

	}


	/**
	 * Most part of the game will involve this method
	 * The player will choose the location of his/her destination 
	 * The player can also check the stats of their character 
	 * Returns None, but calls one of the following methods:Tavern(), Blacksmith(), Castle(), House(), Creepy_Forest(), stats()
	 * depending on the value of the option variable
	 */
	public void village(){

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Please choose your destination or check your current stats(6):");
		System.out.println("1 Tavern");
		System.out.println("2 Blacksmith");
		System.out.println("3 Castle");
		System.out.println("4 House");
		System.out.println("5 Creepy forest");
		System.out.println("6 Check Stats");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

		option = myScanner.nextInt();

		if(option==1){
			Tavern();
		}
		else if(option==2){
			Blacksmith();
		}
		else if(option==3){
			Castle();
		}
		else if(option==4){
			House();
		}
		else if(option==5){
			Creepy_Forest();
		}
		else if(option==6){
			stats();
		}
		else{
			village();
		}	

		
	}


	/**
	 * Player chooses his/her role
	 * option is an integer variable which indicates the choice of the player
	 * returns none, but calls one of the following methods: Swodsman(), Shieldman(), Spearman().
	 * depends on the value of role
	 */
	public void role(){

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Choose your role:");
		System.out.println("1 Swrodsman");
		System.out.println("2 Shieldsman");
		System.out.println("3 Spearman");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

		option = myScanner.nextInt();

		if(option==1){
			Swordsman();
		}
		else if(option==2){
			Shieldsman();
		}
		else if(option==3){
			Spearman();
		}
		else{
			role();
		}

	} 

	
	/**
	 * Contains the stats of the swordsman role
	 * assigns values to the given parameters
	 * hp of the character; each role have different hp
	 * weapon is string which indicates the weapon of the character, each role have different weapon
	 * max is maximum damage that can be dealt by the character, each role have different max damage
	 * min is minimum damage that can be dealt by the character, each role have different min damage 
	 */
	public void Swordsman(){

		hp = 30;
		weapon = "sword";
		max = 20;
		min = 15;
		range = 1;

	}


	/**
	 * Contains the stats of the shieldsman role
	 * assigns values to the given parameters
	 * hp of the character; each role have different hp
	 * weapon is string which indicates the weapon of the character, each role have different weapon
	 * max is maximum damage that can be dealt by the character, each role have different max damage
	 * min is minimum damage that can be dealt by the character, each role have different min damage 
	 */
	public void Shieldsman(){

		hp = 40;
		weapon = "shield";
		max = 10;
		min = 5;

	}


	/**
	 * Contains the stats of the spearman role
	 * assigns values to the given parameters
	 * hp of the character; each role have different hp
	 * weapon is string which indicates the weapon of the character, each role have different weapon
	 * max is maximum damage that can be dealt by the character, each role have different max damage
	 * min is minimum damage that can be dealt by the character, each role have different min damage 
	 */
	public void Spearman(){

		hp = 25;
		weapon = "spear";
		max = 30;
		min = 10;

	}

	
	/**
	 * Prints the stats passed by the one of the roles methods(swordsman, shieldsman, spearman)
	 * hp of the character; each role have different hp
	 * weapon is string which indicates the weapon of the character, each role have different weapon
	 * max is maximum damage that can be dealt by the character, each role have different max damage
	 * min is minimum damage that can be dealt by the character, each role have different min damage
	 * can be accessed by pressing 6 when in the village
	 * calls the method village
	 */
		public void stats(){

			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("Name: " + name);
			System.out.println("HP:" + hp);
			System.out.println("Weapon:" + weapon);
			System.out.println("Damage:" + min+"-"+max);
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

			village();
		}
	

	/**
	 * Contains the stats of the bandit(a type of an enemy)
	 * assigns values to the given parameters
	 * enemy_hp is hp of the bandit; each type of enemy have different hp
	 * enemy_max is maximum damage that can be dealt by the bandit, each type of enemy have different max damage
	 * enemy_min is minimum damage that can be dealt by the bandit, each type of enemy have different min damage 
	 */
	public void Bandit(){

		enemy_hp = 35;
		enemy_max = 10;
		enemy_min = 5;
		

	}


	/**
	 * Contains the stats of the raider(a type of an enemy)
	 * assigns values to the given parameters
	 * enemy_hp is hp of the raider; each type of enemy have different hp
	 * enemy_max is maximum damage that can be dealt by the raider, each type of enemy have different max damage
	 * enemy_min is minimum damage that can be dealt by the raider, each type of enemy have different min damage
	 */
	public void Raider(){

		enemy_hp = 25;
		enemy_max = 7;
		enemy_min = 3;
		
	}



	/**
	 * Restores hp by 5 for up to 3 times
	 * tchance is the chances to access the benefits of the tavern 
	 * tchance minus 1
	 * can be accessed by pressing 1
	 * prints a line when hp is restored by 5
	 * prints a line when the tavern is closed
	 * calls the method village
	 */
	public void Tavern(){


		if(tchance > 0){

			hp+=5;
			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("You have improved your health by 5. You can now continue on your journey!");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			tchance = tchance - 1;
		}
		else{
			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("The tavern is closed. Please comeback in your next life.");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		}

		village();

	}


	/**
	 * Increments max and min damage by 5
	 * max maximum damage that can be dealt by the character
	 * min minimum damage that can be dealt by the character
	 * bchance chance to access the blacksmith(only 1 chance)
	 * max plus 3
	 * min plus 3
	 * bchance minus 1
	 * can be accessed by pressing 2
	 * prints a line when max and min damage are enhanced
	 * prints a line when the blacksmith can no longer be accessed
	 * calls the method village
	 */
	public void Blacksmith(){

		if(bchance == 1){

			max = max + 3;
			min = min + 3;
			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("You have enhanced your weapons. Hit them with all you've got!");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			bchance = bchance - 1;
		}
		else{
			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("You can only visit the blacksmith once.");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		}

		village();

	}


	/**
	 * Where the king resides and the Creepy_Forest can be unlocked here
	 * can be accessed by pressing 3
	 * answer either 1 yes or 2 no
	 * cfticket is the ticket to enter the Creepy_Forest
	 * if yes Creepy_Forest is unlucked
	 * if no the character will be escorted out from the castle
	 * cfticket will be assigned with 1 meaning the character can now enter the Creepy_Forest
	 * calls the method village
	 */
	public void Castle(){

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("King: Oh warrior! Will you help me save my daughter from a group of bandits?");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

		int answer;

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("1 Yes");
		System.out.println("2 No");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

		answer = myScanner.nextInt();

		if(answer == 2){

			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("King: Then you have no business here. Guards please escort this young warrior out of my castle.");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		}
		else if(answer == 1){

			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("King: Then please help us find my daughter somewhere in the creepy forest.");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			cfticket = 1;
		}
		else{
			Castle();
		}

		village();

	}

	/**
	 * House of the character
	 * choice on how to interact with he step sibling in the house
	 * There is actually only one choice and that is to ignore the step sibling
	 * Just an addition to the game to add some fun
	 */
	public void House(){

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Step-sister: Hey step sibling!");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("1 Ignore");

		choice = myScanner.nextInt();

		if(choice == 1){
		village();
		}
		else{
			House();
		}
	}


	/**
	 * Main mission of the game
	 * Fight three enemies(2 bandits and 1 raider) and save the princess
	 * choice is either to fight(1) or run(2)
	 * cfticket if it is 0 the character cannot enter and will return to the village, if it is 1 the character can enter
	 * enemy_killed is the number of enemies defeated
	 * lets the player choose to fight(1) the enemy or run(2) back to the village when enemy_killed is less than 3
	 * if enemy_killed is 3 then the princess is saved
	 */
	public void Creepy_Forest(){

		if(cfticket == 0){
			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println(" This is a scary forest and you are afraid to enter");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

			village();
		}else{

			if(enemy_killed == 0 || enemy_killed == 2){

				Bandit();

				System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
				System.out.println("You encountered a bandit!\n");
				System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

				System.out.println("1 Fight\n");
				System.out.println("2 Run\n");
				System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

				choice = myScanner.nextInt();

				if(choice == 1){
					fight();
				}
				else if(choice == 2){
					village();
				}
				else{
					Creepy_Forest();
				}
			}

			else if (enemy_killed == 1){

				Raider();

				System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
				System.out.println("You encountered a raider!\n");
				System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

				System.out.println("1 Fight\n");
				System.out.println("2 Run\n");
				System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

				choice = myScanner.nextInt();

					if(choice == 1){
						fight();
					}
					else if(choice == 2){
						village();
					}
					else{
						Creepy_Forest();
					}
			}
			else{
				System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
				System.out.println("You have saved the Princess! \n You are now a hero of Vinland!");
				System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");	
			}		
		}
	}
	
		
	/**
	 * Prints the current hp of the character and that of the enemy and provides choics to attack(1) or run(2)
	 * choice is either to attack(1) or run(2)
	 * name of the player
	 * hp is the current hp of the charcter
	 * enemy_hp is thecurrent hp of the enemy
	 */	
		public void fight(){

			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println(name + "'s HP:" + hp);
			System.out.println("Enemy's HP:" + enemy_hp);
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("\n 1 Attack");
			System.out.println("\n 2 Run");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

			choice = myScanner.nextInt();

			if(choice == 1){
				attack();
			}
			else if(choice == 2){
				village();
			}
			else{
				fight();
			}


		}
	

	/**
	 * Attack method
	 * damage random number between the max damage and min damage of the character
	 * enemy_hp current hp of the enemy
	 * hp is hp of the charcter
	 * the hp of the charcter minus the damage of the enemy 
	 * the hp of the enemy minus the damage of the charcter
	 * calls the fight method if the character is still alive even if the enemy is already dead
	 * calls the died method if the character's hp is less than 0
	 */
	public void attack(){

		damage = (int)Math.floor(Math.random()*(max-min+1)+min);

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("You attacked the enemy and dealt" + damage + "damage!");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

		enemy_hp = enemy_hp - damage;

		if(enemy_hp < 1){
			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("You have slain the enemy!");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

			enemy_killed += 1;
			Creepy_Forest();
		}
		else if(enemy_hp > 0){
			enemy_damage = (int)Math.floor(Math.random()*(enemy_max-enemy_min+1)+enemy_min);

			System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			System.out.println("The enemy attacked you and dealt" + enemy_damage + "damage!");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

			hp = hp - enemy_damage;
			if(hp < 1){
				died();
			}
			else{
				fight();	
			}
		}


	}


	/**
	 * Called by the attack method when the hp of the charcter is less than 0
	 * prints a line that indicates that the character is dead
	 */
	public void died(){

		System.out.println("\n/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Oh no you died!\nBetter luck next life!");
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
	}


}