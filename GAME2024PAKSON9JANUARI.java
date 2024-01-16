
package game2024pakson9januari;

public class GAME2024PAKSON9JANUARI {

    public static void main(String[] args) {
        //buat objek
      Player hero = new Player();
      Player enemy = new Player();
      
      //mengisi atribut player
      hero.name = "Marvel";
      hero.speed = 60;
      hero.damage = 70;
      hero.armor = 80;
      hero.healthpoin = 100;
      
      enemy.name = "Julia";
      enemy.speed = 50;
      enemy.damage = 80;
      enemy.armor = 23;
      enemy.healthpoin = 100;
     
      //menjalankan
      hero.run();
      hero.attack(enemy.name);
      hero.defend();
      
      
        if (hero.isDead()|| enemy.isDead()) {
            System.out.println("! Game Over !");
        }
    }
    
}
