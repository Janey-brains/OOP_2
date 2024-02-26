import java.util.Scanner;

public class Game {
    private int health;
    private int score;

    public Game() {
        this.health = 100;
        this.score = 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Game Over!");
            // Implement game over logic
        }
    }

    public void increaseScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}

// Enemy class
public class Enemy {
    private int health;
    private int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void attack(Game player) {
        player.takeDamage(damage);
    }

    // Other methods for movement, etc.
}

// PowerUp class
public class PowerUp {
    private String type;

    public PowerUp(String type) {
        this.type = type;
    }

    public void applyEffect(Player player) {
        if (type.equals("health")) {
            player.heal();
        } else if (type.equals("score")) {
            player.increaseScore(50);
        }
    }
}

// Main game class
public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Enemy enemy = new Enemy(50, 10);
        PowerUp powerUp = new PowerUp("score");

        // Simulate gameplay
        enemy.attack(player);
        System.out.println("Player health: " + player.getHealth());

        powerUp.applyEffect(player);
        System.out.println("Player score: " + player.getScore());
    }
}
