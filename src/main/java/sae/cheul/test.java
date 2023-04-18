package sae.cheul;

public class test {
    public static void main(String[] args) {
        int a =12,b=5,sum=2;
        b *= a/=4;                //  = 수식이 같이 있을 경우 오른쪽 <- 부터 계산해 들어가야한다.  12/4  -> b= 5*3=15
        sum += ++a * b--/4;       //    (++a*b--) / 4  + sum(2)= sum =17
        System.out.printf("%d",sum);






    }
}
