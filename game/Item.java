package yjla.game;

import java.util.Random;

public class Item {
	private String mName; // 아이템 이름
	private int mAmount; // 아이템 수량
	private String mItemType; // 아이템 종류 (장비, 소비, 기타, 설치 등등..)
	private int mItemCode; // 아이템 코드
	private long mItemGUID; // 아이템GUID
	
	private String mEquipmentType; // 장비 종류 (무기, 상의, 하의, 목걸이 등등..)
	private String mReinforcementType; // 장비 강화 타입 (노말, 레어, 에픽, 유니크, 레전더리 등..)
	private int mReinforcementLevel; // 강화 수치 (ex : +2강)
	private int mAttackPower; // 공격력
	private int mDefensePower; // 방어력
	
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
			this.mReinforcementType = "노말";
		else if(randomNumber == 1) 
			this.mReinforcementType = "레어";
		else if(randomNumber == 2) 
			this.mReinforcementType = "유니크";
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
