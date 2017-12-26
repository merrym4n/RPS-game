public class Player {
    private int game;
    private int play;
    private int win;
    private int lose;
    private int draw;
    private int number;
    private String name = new String();

    public Player(){
        game = 5;
        play = 0;
        win = 0;
        lose = 0;
        draw = 0;
        number = -1;
        name = new String ("merryman");
    }

    public void setName(String _name){ name = _name; }

    public void insert(int _number){
        number = _number;
    }

    public int returnPlay() { return play; }

    public int returnNumber(){
        return number;
    }

    public String returnName(){
        return name;
    }

    public void play(int _number){
        this.play++;
        if(_number == 1)
            this.win++;
        else if(_number == 0)
            this.draw++;
        else if(_number == -1)
            this.lose++;
    }

    public void overall(){
        System.out.println("You played " +  play + " games!");
        System.out.println(win + " Wins");
        System.out.println(draw + " Draws");
        System.out.println(lose + " Loses");
    }
}
