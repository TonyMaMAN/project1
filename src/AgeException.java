public class AgeException extends Exception{
    public AgeException(){
        super("年龄超过范围");
    }
    public AgeException(String message){
        super(message);
    }
}
public class People{
    private String name;
    private int age;
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getAge(){return age;}
    public void setAge(int age) throws AgeException{
        if(age<0||age>300)
            throw new AgeException();
        this.age =age;
    }

    public static void main(String[] args) {
        People p =new People();
        try {
            p.setAge(400);
        }catch (AgeException e){
            System.out.println("给age赋值错误："+e.getMessage());
        }
    }
}