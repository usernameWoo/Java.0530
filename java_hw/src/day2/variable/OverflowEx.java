package day2.variable;

public class OverflowEx {

          public static void main(String[] args) {
        	  byte num = 127;
              ++num; //num
              //num에 1을 증가
        	  System.out.println(num); //오버플로우 발생
        	  num = -128;
        	  --num; // num에 1이 감소
        	  System.out.println(num); //언더플로우 발생

	}

}
