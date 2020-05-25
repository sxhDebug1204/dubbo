/**
 * @Author 苏晓虎
 * @Description:
 * @create 2020-05-15 12:09
 */
public class Person {
    public void printValue(int i,int j){

    }

    public void printValue(int i){

    }

}
class Teacher extends Person{
    public void printValue(){

    }
    public void printValue(int i){

    }

    public static void main(String[] args) {
        Person t = new Teacher();
        t.printValue(10);
    }
}
