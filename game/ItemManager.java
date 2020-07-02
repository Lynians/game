package yjla.game;

import java.util.HashMap;

public class ItemManager {
	private long mCurrentItemGUID = 100000000000L;
	
	private HashMap<Integer, String> mEquipItemMap = new HashMap<Integer, String>(); // 장비 아이템
	private HashMap<Integer, String> mEquipItemTypeMap = new HashMap<Integer, String>(); // 장비 아이템 분류
	private HashMap<Integer, String> mUseItemMap = new HashMap<Integer, String>(); // 소비 아이템
	
	public ItemManager() {
		initEquipItems();
		initUseItems();
	}

	private void initEquipItems() {
		mEquipItemMap.put(ItemDef.NEWBIE_SWORD, "초보자용 검");
		mEquipItemMap.put(ItemDef.WHITE_SHIRT, "흰색 셔츠");
		mEquipItemMap.put(ItemDef.BLUE_PANTS, "파란색 바지");
		initEquipType();
	}
	private void initEquipType() {
		mEquipItemMap.put(ItemDef.NEWBIE_SWORD, "한손검");
		mEquipItemMap.put(ItemDef.WHITE_SHIRT, "상의");
		mEquipItemMap.put(ItemDef.BLUE_PANTS, "하의");
	}
	private void initUseItems() {
		mUseItemMap.put(ItemDef.RED_POTION, "빨간 물약");
		mUseItemMap.put(ItemDef.BLUE_POTION, "파란 물약");

	}

	public long getGuid() {
		mCurrentItemGUID += 1;
		return mCurrentItemGUID;
	}

	public Item createItem(int itemCode, int itemCount) {
		Object itemNameObj = mEquipItemMap.get(itemCode);
		
		if (itemNameObj == null){
			itemNameObj = mUseItemMap.get(itemCode);
			if (itemNameObj == null)
				return null;
			Object itemTypeObj = mEquipItemTypeMap.get(itemCode);
			return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount, "장비", (String)itemTypeObj);
		}
		
		return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount, "소비", null);
	}
}
