import java.util.Scanner;

class Entry {
    String name;
    int score;

    public Entry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}

class ScoreBoard {
    int size, currentIdx;
    Entry[] entries;

    public ScoreBoard(int size) {
        this.size = size;
        this.entries = new Entry[size];

        this.currentIdx = 0;
    }

    public void addEntry(Entry e) {

        this.entries[this.currentIdx] = e;
        this.currentIdx++;
    }

    public void removeEntry(int index) {
        if (index >=0 && index < this.currentIdx) {

            for(int i=index; i<this.currentIdx; i++) {
                this.entries[i] = this.entries[i+1];
            }
            this.entries[this.currentIdx] = null;
            this.currentIdx--;
        }
    }

    public void updateEntry(int index, Entry e) {
        ;
    }

    public void display(){
        for(int i=0; i<this.size; i++) {
            if (this.entries[i] != null){
                String message = new String("Position: " + i + " Name: " + this.entries[i].getName() + " Score: " + this.entries[i].getScore());
                System.out.println(message);
            }
        }
    }
}

public class ScoreBoardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the scoreboard");
        int size = sc.nextInt();
        int option;
        ScoreBoard board = new ScoreBoard(size);

        System.out.println("Enter 1 to insert, 0 to remove and -1 to exit");
        option = sc.nextInt();

        while(option != -1) {
            if (option == 1) {
                System.out.println("Enter score");
                int score = sc.nextInt();

                sc.nextLine();   // skip the newline character

                System.out.println("Enter name");
                String name = sc.nextLine();

                board.addEntry(new Entry(name, score));
            } else {
                System.out.println("Enter index to remove");
                int idx = sc.nextInt();

                board.removeEntry(idx);
            }

            System.out.println("Enter 1 to insert, 0 to remove and -1 to exit");
            option = sc.nextInt();
        }

        board.display();
    }
}