import java.io.*;
public class Game
{
    public static void main(String args[])throws IOException
    {
        int i,ch,r,no,xc,xcc=0,yc,ycc=0,limit=1;
        String x,y;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        System.out.println("Enter name of player 1 ");
        x=in.readLine();
        System.out.println("Enter name of player 2 ");
        y=in.readLine();
        for(i=1; i<=3; i++)
        {
            xc=1;
            yc=1;
            limit*=10;
            System.out.println("Round "+i+", Range from 1-"+limit);
            r=(int)(Math.random()*limit);
            System.out.println(x+" plays now.");
            System.out.println("Enter number ");
            no=Integer.parseInt(in.readLine());
            while(no!=r)
            {
                if(no<r)
                {
                    System.out.println("Enter Higher Number");
                }
                if(no>r)
                {
                    System.out.println("Enter Lower Number");
                }
                no=Integer.parseInt(in.readLine());
                xc++;
            }
            if(no==r)
            {
                System.out.println("You got it...");
                System.out.println(x+" your trials are - "+xc);
            }
            System.out.println(y+" plays now.");
            r=(int)(Math.random()*limit);
            System.out.println("Enter number ");
            no=Integer.parseInt(in.readLine());
            while(no!=r)
            {
                if(yc==xc)
                {
                    System.out.println("You can't win now");
                    System.out.println("Number to be guessed was "+r);
                    yc++;
                    break;
                }
                if(no<r)
                {
                    System.out.println("Enter Higher Number");
                }
                if(no>r)
                {
                    System.out.println("Enter Lower Number");

                }
                no=Integer.parseInt(in.readLine());
                yc++;
            }
            if(no==r)
            {
                System.out.println("You got it...");
                System.out.println(y+" your trials are - "+yc);
            }
            if(xc>yc)
            {
                System.out.println(y+" is the winner for round "+i);
                ycc++;
            }
            else if(xc<yc)
            {
                System.out.println(x+" is the winner for round "+i);
                xcc++;
            }
            else
            {
                System.out.println("There is a tie between "+x+" and "+y+" for round "+i);
            }
        }
        if(xcc>ycc)
            System.out.println(x+" is the overall winner.");
        else if(ycc>xcc)
            System.out.println(y+" is the overall winner.");
        else
            System.out.println("Match tied");
        System.exit(0);
    }
}
