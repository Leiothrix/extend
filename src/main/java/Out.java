/**
 * Created by adam on 2019/3/26 at 17:10.
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class Out implements C{

    @Override
    public void sayA(){
        System.out.println(i);
    }

    @Override
    public void sayB(){
        System.out.println(j);
    }

    @Override
    public void sayC(){
        System.out.println(k);
    }

    public static void main(String[] args){
        Out out = new Out();
        out.sayA();
        out.sayB();
        out.sayC();
    }

}
