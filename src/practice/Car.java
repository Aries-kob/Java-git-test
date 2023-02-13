package practice;

public class Car {
    //燃費(km/L)
	public double fuelCost;
	//残量(L)
	public double fuelAmount;
	
	//コントラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	//moveメソッド
	//・"xx km 走ります"を出力
	//・残量を計算
	public void move(int km) {
		System.out.println(km + "km走ります");
		this.fuelAmount -= (km / fuelCost);
	}
	
	//fuelAmountを取得するメソッドを作成
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
