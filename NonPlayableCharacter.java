public class NonPlayableCharacter {
    private boolean playable = false;
    private boolean resting = true;
    private String name;
    private String action = "default";

    public NonPlayableCharacter(String name) {
        this.name = name;
    }

    public boolean isPlayable() {
        return playable;
    }

    public boolean isResting() {
        return resting;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public void talk() {
        if (!playable && !resting) {
            System.out.println(name + ": What a marvelous day!");
            resting = true;
            action = "default";
        }
    }

    public void move() {
        if (!playable && !resting) {
            // Insert functionality for moving
            // This will take several lines of code
        }
    }

    public void eat() {
        if (!playable && !resting) {
            // Insert functionality for eating
            // This will take several lines of code
        }
    }

    public void drink() {
        if (!playable && !resting) {
            // Insert functionality for drinking
            // This will take several lines of code
        }
    }

    public void function1() {
        // Do nothing or do something
    }

    public static void main(String[] args) {
        NonPlayableCharacter npc1 = new NonPlayableCharacter("Fred");
        if (!npc1.isPlayable()) {
            if (!npc1.isResting()) {
                switch (npc1.getAction()) {
                    case "talking":
                        npc1.talk();
                        break;
                    case "moving":
                        npc1.move();
                        break;
                    case "eating":
                        npc1.eat();
                        break;
                    case "drinking":
                        npc1.drink();
                        break;
                    default:
                        npc1.function1();
                        break;
                }
            }
        }
    }
}
