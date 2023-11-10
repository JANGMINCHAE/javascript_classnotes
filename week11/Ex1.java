package week11;

import java.util.ArrayList;

public class Ex1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
String[] lunch = new String[2];
lunch[0] = "떡볶이";
lunch[1] = "햄버거";
//lunch[2] = "짜장면";

for(int i = 0; i<lunch.length; i++)
System.out.println(lunch[i]);

ArrayList<String> al = new ArrayList<String>();
al.add("떡볶이2");
al.add("햄버거2");
al.add("짜장면2");

System.out.println(al.get(2));

for(int i = 0; i<al.size(); i++)
System.out.println(al.get(i));

}

}

