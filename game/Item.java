package yjla.game;

public class Item {
	private String mName; // ������ �̸�
	private int mAmount; // ������ ����
	private String mType; // ������ ���� (���, �Һ�, ��Ÿ, ��ġ ���..)
	
	private String mEquipmentType; // ��� ���� (����, ����, ����, ����� ���..)
	private String mReinforcementType; // ��� ��ȭ Ÿ�� (�븻, ����, ����, ����ũ, �������� ��..)
	private int mReinforcementLevel; // ��ȭ ��ġ (ex : +2��)
	private int mAttackPower; // ���ݷ�
	private int mDefensePower; // ����
	
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
