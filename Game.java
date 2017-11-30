public class Game {

    public void printWhatItIs(Player _playerA){
        if(_playerA.returnNumber() == 1) {
            System.out.println(_playerA.returnName() + " : Rock!");
        }
        else if(_playerA.returnNumber() == 2) {
            System.out.println(_playerA.returnName() + " : Paper!");
        }
        else if(_playerA.returnNumber() == 3) {
            System.out.println(_playerA.returnName() + " : Scissors!");
        }
        else {
            System.out.print("Reenter the number : ");
            _playerA.insert(-1);
        }
    }

    public void play(Player _human, Player _computer){
        if(_human.returnNumber() == _computer.returnNumber()){
            System.out.println("Draw");
            _human.play(0);
            _computer.play(0);
        }
        else if((_human.returnNumber() + 1) % 3 == _computer.returnNumber()){
            System.out.println("Lose");
            _human.play(-1);
            _computer.play(1);
        }
        else{
            System.out.println("Win");
            _human.play(1);
            _computer.play(-1);
        }
        _human.overall();
    }
}

// 1 < 2
// 2 < 3
// 3 < 1