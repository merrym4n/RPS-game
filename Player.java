public class Player {
    private int play = 0;
    private int win = 0;
    private int lose = 0;
    private int draw = 0;
    private int number = -1;
    private String name;

    public void init(String _name){
        this.name = _name;
    }

    public void insert(int _number){
        this.number = _number;
    }

    public int returnNumber(){
        return this.number;
    }

    public String returnName(){
        return this.name;
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
        System.out.println("You played " +  this.play + " games!");
        System.out.println(this.win + " Wins");
        System.out.println(this.draw + " Draws");
        System.out.println(this.lose + " Loses");
    }
}
