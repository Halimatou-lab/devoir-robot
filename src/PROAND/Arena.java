	package PROAND;
	import java.util.Random;
	import java.util.Scanner;
	
	public class Arena extends Robot1 {
		public void fight (Robot1 robot2, Robot1 robot3) {
			if( robot2.isDead() ==false&& robot3.isDead()==false) {
				robot2.fire(robot3);
				while( robot3.isDead()==false) {
					robot3.fire(robot2);
				if(robot2.isDead()==false) {
					robot2.fire(robot3);
				}
				else {
					System.out.println( "Le robot vainqueur est"+ robot3.getNom());
				}
				}
				System.out.println ( "Le robot vainqueur est"+ robot2.getNom());
			}
			
				else {
					if(robot2.isDead()==true) {
						System.out.println ( "Le " + robot2.getNom() + "est deja mort");
						
					}
					
					else if(robot3.isDead()==true) {
						System.out.println ( "Le " + robot3.getNom() + "est deja mort");
					
				}
					else {
						System.out.println ("Les deux robots sont deja morts");
					}
				}
				
		}
			
		
	
	
		public static void main(String[] args) {
			Arena a = new Arena ();
			System.out.println(a);
			Arena obj = new Arena ();
			Arena obj2 = new Arena ();
			a.fight(obj, obj2);
			
		}
	
	}
