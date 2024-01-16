package game2024pakson9januari;

public class Player {
    //atribut
    String name;
    int speed;
    int damage;
    int armor;
    int healthpoin;
    
    //method
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
}
    void attack(String e){
        System.out.println(name +" is attack...");
        System.out.println("Damage: "+ damage);
    }
    void defend(){
        System.out.println(name +" defend");
        System.out.println("Armor: "+ armor);
    }
//method mengecek nilai 
boolean isDead(){
    if (healthpoin <= 0) return true;
    return false;
        
    }
   
    
}
