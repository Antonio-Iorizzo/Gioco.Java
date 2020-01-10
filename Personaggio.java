import java.util.Random;

class Personaggio{

    private int life;
    private int power;
    private String name;
    private Random r;

    public  Personaggio(String name){
        this.name=name;
        this.power=10;
        this.life=100;
        this.r=new Random();
    }

    public int hit(int power){
    this.life=this.life-(1+this.r.nextInt(power));
        return this.life;
    }

    public int getlife(){
        return this.life;
    }

    public int getpower(){
        return this.power;
    }

    public String getname(){
        return this.name;
    }

    public int isAlive(){
        int a;
        if(this.life<=0){
            a=0;
            System.out.printf("%s's dead after ",this.name);
        }else{
            a=1;
        }
        return a;
    }

}