//java实现字符串（数字、字母、汉字）的反向输出
//（1）使用String类的split（）方法对字符串进行分隔，分隔后返回与该字符串对应的字符串数组，然后逆序输出字符串数组中的每个元素，从而可以实现字符串的反向输出。2）使用String类的charAt（）方法通过字符串的索引值你想输出字符串中的每一个元素。



import java.util.Scanner;
public class chatAtReverse {
public static void main(String[] args) {
arrReverse();
Reverse();
}

private static  void arrReverse() {
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("1.请输入字符串：");
String text=sc.next();
int len=text.length();
String newstr="";
String[] split =text.split("");
for(int i=len;i>=0;i--){
newstr+=split[i];
}
System.out.println("1.反转后的字符串是：：");
System.out.println(newstr);
}





​

public static void Reverse() {

//System.out.println("请输入字符串：");

@SuppressWarnings("resource")

Scanner sc=new Scanner(System.in);

System.out.println("2.请输入字符串：");

String text=sc.next();

int len=text.length();

String newstr="";

for(int i=len-1;i>=0;i--){

newstr+=text.charAt(i);

}

System.out.println("2.反转后的字符串是：：");

System.out.println(newstr);

}

}
