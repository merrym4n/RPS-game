import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        Player computer = new Player();
        Player human = new Player();

        computer.init("computer");
        human.init("human");

        Menu.print();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");

        while(true){
            if(human.returnNumber() != -1)
                System.out.print("Enter the number : ");
            human.insert(scan.nextInt());
            computer.insert(randomGenerate.generate());
            game.printWhatItIs(human);
            if(human.returnNumber() != -1){
                game.printWhatItIs(computer);
                System.out.println("========== overall ==========");
                game.play(human, computer);
                System.out.println("========== ======= ==========");
            }
        }


    }
}
