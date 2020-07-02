package yjla.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
	private Scanner scanner = new Scanner(System.in);
	private String mName; // 캐릭터 이름
	private int mLevel; // 캐릭터 레벨
	private String mJob; // 캐릭터 직업
	private int mAttackPower; // 캐릭터 공격력
	private int mDefensePower; // 캐릭터 방어력
	private int mHealthPower; // 캐릭터 체력
	private int mManaPower; // 캐릭터 마나
	
	private ArrayList <Item> mItems; // 캐릭터 아이템 리스트
	private ArrayList <Skill> mSkills; // 캐릭터 스킬 리스트
	private ItemManager mItemManager;
	
	public Character(String name) {
		this.mName = name;
		this.mLevel = 1;
		this.mJob = "초보자";
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
			System.out.print("1. 캐릭터 능력치 \n2. 캐릭터 보유 아이템 \n3. 캐릭터 보유 스킬 \n4. 종료 \n입력 : ");
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
			System.out.println("종료합니다.");
		}
	}
	
	public void viewCharacterStatus() {
		System.out.println("\n이름 : " + mName);
		System.out.println("LV : " + mLevel);
		System.out.println("직업 : " + mJob + "\n");
		System.out.println("HP : " + mHealthPower);
		System.out.println("MP : " + mManaPower + "\n");
		System.out.println("Attack : " + mAttackPower);
		System.out.println("Defense : " + mDefensePower + "\n");
	}
	
	public void viewItemList() {
		System.out.println("이름\t종류\t수량");
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
		System.out.print("생성할 캐릭터 입력 : ");
		String character_name = scanner.nextLine();
		Character new_character = new Character(character_name);
		new_character.viewMenu(character_name);
		scanner.close();
	}
}
