package yjla.game;

import java.util.HashMap;

public class ItemManager {
	private long mCurrentItemGUID = 100000000000L;
	
	private HashMap<Integer, String> mEquipItemMap = new HashMap<Integer, String>(); // ��� ������
	private HashMap<Integer, String> mEquipItemTypeMap = new HashMap<Integer, String>(); // ��� ������ �з�
	private HashMap<Integer, String> mUseItemMap = new HashMap<Integer, String>(); // �Һ� ������
	
	public ItemManager() {
		initEquipItems();
		initUseItems();
	}

	private void initEquipItems() {
		mEquipItemMap.put(ItemDef.NEWBIE_SWORD, "�ʺ��ڿ� ��");
		mEquipItemMap.put(ItemDef.WHITE_SHIRT, "��� ����");
		mEquipItemMap.put(ItemDef.BLUE_PANTS, "�Ķ��� ����");
		initEquipType();
	}
	private void initEquipType() {
		mEquipItemMap.put(ItemDef.NEWBIE_SWORD, "�Ѽհ�");
		mEquipItemMap.put(ItemDef.WHITE_SHIRT, "����");
		mEquipItemMap.put(ItemDef.BLUE_PANTS, "����");
	}
	private void initUseItems() {
		mUseItemMap.put(ItemDef.RED_POTION, "���� ����");
		mUseItemMap.put(ItemDef.BLUE_POTION, "�Ķ� ����");

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
			return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount, "���", (String)itemTypeObj);
		}
		
		return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount, "�Һ�", null);
	}
}
