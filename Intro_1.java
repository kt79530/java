public class Intro_1{
 //스레드가 특별하게 관여하지 않는 한 먼저 출력
    public static void main(String[] args){

        String name = "kimkitae";
        int num = 1; //변수 타입을 쓰는 이유는 규칙에 맞게 하기 위함
        float myNum = 19.99f;
        char myChar = 'A'; //단일 문자는 ''
        boolean myB = true;
        /* 변수 자바스크립트와 다른점은 변수타입을 설정함 */
        System.out.println("Hello World");

        System.out.println(name);
        System.out.println(num);
        System.out.println(myNum);
        System.out.println(myChar);
        System.out.println(myB);
    }
}