package week11;


interface 전화기{
default void printLogo() {
System.out.println("**가톨릭대 폰**");
}
public void sendCall();
public void receiveCall();
}

interface 핸드폰 extends 전화기{
public void 문자보낸다();
public void 문자받는다();
}

interface 게임{
public void sendCall();
}

class CAL{
public int add(int x, int y) {
return x+y;
}
}

class 스마트폰 extends CAL implements 핸드폰, 게임{

@Override
public void sendCall() {
// TODO Auto-generated method stub
System.out.println("전화를 겁니다");
}

@Override
public void receiveCall() {
// TODO Auto-generated method stub
System.out.println("전화를 받습니다");
}

@Override
public void 문자보낸다() {
// TODO Auto-generated method stub
System.out.println("문자를 보냅니다");
}

@Override
public void 문자받는다() {
// TODO Auto-generated method stub
System.out.println("문자를 받습니다");
}
public void flash() {
System.out.println("찰칵");
}
}

public class SmartphoneTest {

public static void main(String[] args) {
// TODO Auto-generated method stub
스마트폰 a = new 스마트폰();
int add = a.add(1, 2);
System.out.println(add);
a.sendCall();
a.receiveCall();
a.flash();
a.printLogo();
}

}