public interface IReadSaveData {
    public abstract void saveData(String data);
    public abstract String getData();
}
public class BusinessA{
    private IReadSaveData iReadSaveData;
    public IReadSaveData getiReadSaveData(){
        return iReadSaveData;
    }
public void setiReadSaveData(IReadSaveData iReadSaveData){
        this.iReadSaveData = iReadSaveData;
}
public BusinessA(IReadSaveData iReadSaveData){
        this.iReadSaveData = iReadSaveData;
}
public void saveData(String data){
     iReadSaveData.saveData(data);
}
public String readData(){
        return iReadSaveData.getData();
}
}
public class BusinessB{
    private IreadSaveData iReadSaveData;
    public IReadSaveData getiReadSaveData(){
        return iReadSaveData;
    }
    public void setiReadSaveData(IReadSaveData iReadSaveData){
        this.iReadSaveData = iReadSaveData;
    }
    public void savaData (String data){
        iReadSaveData.saveData(data);
    }
    public String readData(){
        return iReadSaveData.getData();
    }
}
public class ReadSaveTextFile implements IReadSaveData {
    public void saveData(String data) {
        System.out.println("将数据保存到了文本文件");
    }
    public String getData(){
        System.out.println("将文本文件中读取了数据");
        return null;
    }
}
public class ReadSaveWordFile implements IReadSaveData{
    public void saveData(String data){
        System.out.println("将数据保存到了word文件中");
    }
    public String getData(){
        System.out.println("从word文件中读取了数据");
        return null;
    }
}
public class TestReadSavaData{
    public static void main(String[] args) {
        BusinessA businessA =new BusinessA(new ReadSaveTextFile());
        businessA.saveData("保存到文本文件中");
        BusinessB businessB =new BusinessB(new ReadSaveWordFile());
        businessB.saveData("保存到word文件中");
    }
}