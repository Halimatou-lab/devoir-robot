	package PROAND;
	import java.util.Scanner;
	import java.util.Random;
		public class Robot1 {
			public String nom;
			int pv;
			
			Robot1(){
				this.nom="";
				this.pv=10;
			}
			
			public Robot1 (String nom ) {
				this.nom=nom;
				this.pv = 10;
				System.out.println("robot " +nom);
			}
			public String getNom() {
				return nom;
			}
			
			public int getPv() {
				return pv;
			}
			
			
			public void setPv(int pv) {
				this.pv = pv;
			}
		
			public void fire  (Robot1 x) {
				x.nom="foo";
				if(x.pv <= 0) {
					System.out.println("le Robot est deja mort");
				}
				
				else{
					x.pv -= 2;
					
					System.out.println(x.nom +" a ete touche par le robot " + this.nom);
					System.out.println("Au " + x.nom + " il reste " + x.pv+ " points de vie");
				}
			} 
			 
			public boolean isDead () {
				Robot1 x = new Robot1(); 
				if(x.getPv()<=0) {
					return true;
				}
					
				else {
					return false;
				
				}
				}
			public static void main(String[] args) {
				Robot1 A = new Robot1 ("bob");
				System.out.println(A);
				Robot1 obj = new Robot1 ();
				A.fire(obj);
				A.fire(obj);
				A.fire(obj);
				A.fire(obj);
				A.fire(obj);
				//obj.isDead(obj);
			
				
			}
}

