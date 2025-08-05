public class Recursion_2{
    //스스로를 호출하는 것을 재귀함수라고 한다
    //아래에는 1부터 k까지 정수의 합을 재귀함수를 이용해서 계산한다
    public static void main(String[] args){
        int result = sum(10);
        //sum(10)을 result변수에 저장
        System.out.println(result);
    }
    //함수가 자기 자신을 호출하는 재귀함수를 아래에 만듦
    public static int sum(int k){
        if(k > 0){ 
            return k + sum(k-1);
            //10+9+8+7+6+5+4+3+2+1
            
        }else{ //반대로 0이면
            return 0;
            // 0 = false, 1 = true
        }
    }
}