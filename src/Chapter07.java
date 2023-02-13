
public class Chapter07 {
    public static void main(String[] args) {
    	int distance = 89; //例として89で初期化。他の数値でも良い
    	if (distance <= 5) {
    		System.out.println("とても近いです");
    	} else if (distance <= 10) {
    		System.out.println("近いです");
    	} else if (distance <= 15) {
    		System.out.println("遠いです");
    	} else {
    		System.out.println("とても遠いです");
    	}
    	
    	String color = "green"; //例としてgreenで初期化。他の色でも良い
    	switch(color) {
    	 case "red" :
    	   System.out.println("赤信号です");
    	   break;
    	 case "yellow" :
    	   System.out.println("黄色信号です");
    	   break;
    	 default:
    	   System.out.println("信号の色ではありません");
    	}
    }
}
