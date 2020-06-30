package yjla.game;

public class Item {
	private String mName; // 아이템 이름
	private int mAmount; // 아이템 수량
	private String mType; // 아이템 종류 (장비, 소비, 기타, 설치 등등..)
	
	private String mEquipmentType; // 장비 종류 (무기, 상의, 하의, 목걸이 등등..)
	private String mReinforcementType; // 장비 강화 타입 (노말, 레어, 에픽, 유니크, 레전더리 등..)
	private int mReinforcementLevel; // 강화 수치 (ex : +2강)
	private int mAttackPower; // 공격력
	private int mDefensePower; // 방어력
	
	public Item(String name, int amount, String type, String equipment_type, String reinforcement_type, 
			int reinforcement_level, int attack_power, int defense_power) {
		this.mName = name;
		this.mAmount = amount;
		this.mType = type;
		this.mEquipmentType = equipment_type;
		this.mReinforcementType = reinforcement_type;
		this.mReinforcementLevel = 0;
		this.mAttackPower = attack_power;
		this.mDefensePower = defense_power;
	}
}
