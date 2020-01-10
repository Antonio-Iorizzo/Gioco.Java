import java.util.Scanner;

class Gioco{
    public static void main(String[] args){

        Scanner tastiera=new Scanner(System.in);
        String s;
        System.out.printf("Insert Hero's name:\n");
        s=tastiera.nextLine();
        Personaggio SB=new Personaggio(s);
        Personaggio GB=new Personaggio("LINK");
        int a;
        System.out.printf("%s's life:%d\n",SB.getname(),SB.getlife());
        System.out.printf("%s's life:%d\n",GB.getname(),GB.getlife());
           a=0;
        do{
         
            SB.hit(GB.getpower());
            System.out.printf("%s's life:%d\n",SB.getname(),SB.getlife());

            GB.hit(SB.getpower());
            System.out.printf("%s's life:%d\n",GB.getname(),GB.getlife());
            a=a+1;
        }while(SB.isAlive()==1&&GB.isAlive()==1);

        System.out.printf("%d round",a);
        System.out.printf(" \nTHE END");
    }
}