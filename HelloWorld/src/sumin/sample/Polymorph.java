package sumin.sample;

public class Polymorph {
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t.getPrice());
		System.out.println(t.getBonus());

		Computer com = new Computer();
		Radio r = new Radio();

		Buyer b = new Buyer();

		b.buy(t);
		b.buy(r);
		b.buy(com);

		System.out.println(b.getMoney());
		System.out.println(b.getBonusTotal());

		b.buy2(t);
		b.buy2(com);
		b.buy2(r);

		System.out.println(b.getMoney());
		System.out.println(b.getBonusTotal());
	}
}

class Item {
	private int price;
	private int bonus;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}

class Tv extends Item {
	public Tv() {
		setPrice(1500);
		setBonus(150);
	}
}

class Computer extends Item {
	public Computer() {
		setPrice(3500);
		setBonus(300);
	}
}

class Radio extends Item {
	public Radio() {
		setPrice(500);
		setBonus(50);
	}
}

class Buyer {
	private int money; // 총 구입금액
	private int bonusTotal; // 총 적립금

	public int getMoney() {
		return money;
	}

	public int getBonusTotal() {
		return bonusTotal;
	}

	// 상품 구매 기능
	public void buy(Tv tv) {
		money += tv.getPrice();
		bonusTotal += tv.getBonus();
	}

	public void buy(Computer com) {
		money += com.getPrice();
		bonusTotal += com.getBonus();
	}

	public void buy(Radio rad) {
		money += rad.getPrice();
		bonusTotal += rad.getBonus();
	}

	// 자식클래스 객체를 부모클래스 타입으로 변환
	// Tv, Computer, Radio ---> Item 으로 받을 수 있음
	public void buy2(Item i) {
		money += i.getPrice();
		bonusTotal += i.getBonus();
	}

}