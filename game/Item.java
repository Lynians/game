package yjla.game;

import java.util.Random;

public class Item {
	private String mName; // ������ �̸�
	private int mAmount; // ������ ����
	private String mItemType; // ������ ���� (���, �Һ�, ��Ÿ, ��ġ ���..)
	private int mItemCode; // ������ �ڵ�
	private long mItemGUID; // ������GUID
	
	private String mEquipmentType; // ��� ���� (����, ����, ����, ����� ���..)
	private String mReinforcementType; // ��� ��ȭ Ÿ�� (�븻, ����, ����, ����ũ, �������� ��..)
	private int mReinforcementLevel; // ��ȭ ��ġ (ex : +2��)
	private int mAttackPower; // ���ݷ�
	private int mDefensePower; // ����
	
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getmAmount() {
		return mAmount;
	}
	public void setmAmount(int mAmount) {
		this.mAmount = mAmount;
	}
	public String getmItemType() {
		return mItemType;
	}
	public void setmItemType(String mItemType) {
		this.mItemType = mItemType;
	}
	public int getmItemCode() {
		return mItemCode;
	}
	public void setmItemCode(int mItemCode) {
		this.mItemCode = mItemCode;
	}
	public long getmItemGUID() {
		return mItemGUID;
	}
	public void setmItemGUID(long mItemGUID) {
		this.mItemGUID = mItemGUID;
	}
	public String getmEquipmentType() {
		return mEquipmentType;
	}
	public void setmEquipmentType(String mEquipmentType) {
		this.mEquipmentType = mEquipmentType;
	}
	public String getmReinforcementType() {
		return mReinforcementType;
	}
	public void setmReinforcementType(String mReinforcementType) {
		this.mReinforcementType = mReinforcementType;
	}
	public int getmReinforcementLevel() {
		return mReinforcementLevel;
	}
	public void setmReinforcementLevel(int mReinforcementLevel) {
		this.mReinforcementLevel = mReinforcementLevel;
	}
	public int getmAttackPower() {
		return mAttackPower;
	}
	public void setmAttackPower(int mAttackPower) {
		this.mAttackPower = mAttackPower;
	}
	public int getmDefensePower() {
		return mDefensePower;
	}
	public void setmDefensePower(int mDefensePower) {
		this.mDefensePower = mDefensePower;
	}
	
	public Item(String name, int itemCode, long itemGuid, int itemCount, String itemType, String equipmentType) {
		this.mName = name;
		this.mAmount = itemCount;
		this.mItemCode = itemCode;
		this.mItemGUID = itemGuid;
		this.mItemType = itemType;
		if(equipmentType == null)
			initEquipmentItem(equipmentType);
		else initUseItem();
		
	}
	private void initEquipmentItem(String equipmentType) {
		int randomNumber = (int) (Math.random()*3);
		if(randomNumber == 0) 
			this.mReinforcementType = "�븻";
		else if(randomNumber == 1) 
			this.mReinforcementType = "����";
		else if(randomNumber == 2) 
			this.mReinforcementType = "����ũ";
		this.mEquipmentType = equipmentType;
		this.mReinforcementLevel = 0;
	}
	private void initUseItem(){
		this.mReinforcementType = null;
		this.mReinforcementLevel = 0;
	}
	public static Item createItem(String name, int itemCode, long itemGuid, int itemCount, String itemType, String equipmentType) {
		return new Item(name, itemCode, itemGuid, itemCount, itemType, equipmentType);
	}
}
