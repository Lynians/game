package yjla.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
	private Scanner scanner = new Scanner(System.in);
	private String mName; // ĳ���� �̸�
	private int mLevel; // ĳ���� ����
	private String mJob; // ĳ���� ����
	private int mAttackPower; // ĳ���� ���ݷ�
	private int mDefensePower; // ĳ���� ����
	private int mHealthPower; // ĳ���� ü��
	private int mManaPower; // ĳ���� ����
	
	private ArrayList <Item> mItems; // ĳ���� ������ ����Ʈ
	private ArrayList <Skill> mSkills; // ĳ���� ��ų ����Ʈ
	private ItemManager mItemManager;
	
	public Character(String name) {
		this.mName = name;
		this.mLevel = 1;
		this.mJob = "�ʺ���";
		this.mItems = new ArrayList<Item>();
		this.mSkills = new ArrayList<Skill>();
		this.mAttackPower = 100;
		this.mDefensePower = 50;
		this.mHealthPower = 500;
		this.mManaPower = 100;
		initItems();
	}
	
	public void viewMenu(String name) {
		int selection = 0;
		while(selection != 4) {
			System.out.print("1. ĳ���� �ɷ�ġ \n2. ĳ���� ���� ������ \n3. ĳ���� ���� ��ų \n4. ���� \n�Է� : ");
			selection = scanner.nextInt();
			checkSelection(selection);
		}
	}
	
	public void checkSelection(int selection) {
		if(selection == 1) {
			viewCharacterStatus();
		}
		else if(selection == 2) {
			viewItemList();
		}
		else if(selection == 3) {
			
		}
		else if(selection == 4) {
			System.out.println("�����մϴ�.");
		}
	}
	
	public void viewCharacterStatus() {
		System.out.println("\n�̸� : " + mName);
		System.out.println("LV : " + mLevel);
		System.out.println("���� : " + mJob + "\n");
		System.out.println("HP : " + mHealthPower);
		System.out.println("MP : " + mManaPower + "\n");
		System.out.println("Attack : " + mAttackPower);
		System.out.println("Defense : " + mDefensePower + "\n");
	}
	
	public void viewItemList() {
		System.out.println("�̸�\t����\t����");
		System.out.println("--------------------------------------");
		for(Item itemlist : mItems) {
			System.out.println(itemlist.getmName() +"\t" + itemlist.getmItemType() +"\t" + itemlist.getmAmount());
		}
	}
	
	private void initItems() {
		createItem(ItemDef.BLUE_POTION, 1);
		createItem(ItemDef.WHITE_SHIRT, 1);
	}

	public boolean createItem(int itemCode, int itemCount) {
		mItems.add(mItemManager.createItem(itemCode, itemCount));
		return true;
	}

	public void addSkill(String name, String type, String description, int require_Level, int job_Level, String job) {
		Skill obj = new Skill(name, type, description, require_Level, job_Level, job);
		mSkills.add(obj);
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ĳ���� �Է� : ");
		String character_name = scanner.nextLine();
		Character new_character = new Character(character_name);
		new_character.viewMenu(character_name);
		scanner.close();
	}
}
