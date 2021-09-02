import java.util.Arrays;
public class tongji{
    public static void main(String[] args){
        int length=(int)(Math.random()*51+50);//随机生成一个长度
        char[] strs=new char[length];
        for(int i=0;i<length;i++){
            char ch=(char)(Math.random()*26+97);//随机存入小写字母
            strs[i]=ch;
        }
        System.out.println(Arrays.toString(strs));
        char[] dic=new char[26];//创建一个从a到z的数组
        for(int i=0;i<dic.length;i++){
            dic[i]=(char)(i+97);
        }
        int[] counts=new int[26];//创建一个记录字母次数的数组
        for(int i=0;i<strs.length;i++){//判断字母出现次数
            for(int j=0;j<dic.length;j++){
                if(strs[i]==dic[j]){
                    counts[j]++;
                }
            }
        }
        for(int i=0;i<counts.length;i++){//打印字母和出现次数
            System.out.println(dic[i]+":"+counts[i]);
        }
    }
}
