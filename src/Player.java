/**
 * Created by CMP on 2/8/14.
 */
public class Player {
    int number=0;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("I am guessing"+number);
    }
}
