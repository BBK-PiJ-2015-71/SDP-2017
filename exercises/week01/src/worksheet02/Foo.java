package worksheet02;

/**
 * Created by User on 13/04/2017.
 */
public class Foo implements test{
    private String name="Adam";
    Foo(String name1){
        name=name1;
    }
    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
}
