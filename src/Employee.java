import java.io.*;

public class Employee implements Serializable {
    private int age;
    private String name;
    private float salary;
    public Employee(int age,String name,float salary){
        this.age =age;
        this.name=name;
        this.salary=salary;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age =age;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name =name;
    }
    public float getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public String toString(){
        String s = "姓名：" + name + "，年龄：" + age + "，工资：" + salary;
        return s;
    }
}
import java.io.*;
public class ObjectOutputTest{
    public static void main(String[] args) throws Exception{
        ObjectOutputTest test =new ObjectOutputTest();
        Employee em = new Employee(29,"james",4000f);
        test.WriteObj(em);
    }
    public void WriteObj(Object obj) throws Exception{
        FileOutputStream fo =null;
        ObjectOutputStream oos=null;
        fo =new FileOutputStream("D:\\obj.ini");
        oos =new ObjectOutputStream(fo);
        oos.writeObject(obj);
        oos.flush();
        oos.close();
        fo.close();
    }
}
public class ObjectInputTest{
    public static void main(String[] args) throws Exception {
        ObjectInputTest test =new ObjectInputTest();
        System.out.println(((Employee) test.ReadObj()).getName());

    }
    public Object ReadObj() throws Exception{
        FileInputStream fi =null;
        ObjectInputStream ois =null;
        Object obj =null;
        fi = new FileInputStream("D:\\obj.ini");
        ois =new ObjectInputStream(fi);
        obj =ois.readObject();
        ois.close();
        fi.close();
        return obj;
    }
}