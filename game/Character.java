package yjla.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
	private Scanner scanner = new Scanner(System.in);
	private String mName; // ĳ���� �̸�
	private int mLevel; // ĳ���� ����
	private String mJob; // ĳ���� ����
	private int mAttack_Power; // ĳ���� ���ݷ�
	private int mDefense_Power; // ĳ���� ����
	private int mHealth_Power; // ĳ���� ü��
	private int mMana_Power; // ĳ���� ����
	
	private ArrayList <Item> mItems; // ĳ���� ������ ����Ʈ
	private ArrayList <Skill> mSkills; // ĳ���� ��ų ����Ʈ
	
	public Character(String name) {
		this.mName = name;
		this.mLevel = 1;
		this.mJob = "�ʺ���";
		this.mItems = new ArrayList<Item>();
		this.mSkills = new ArrayList<Skill>();
		this.mAttack_Power = 100;
		this.mDefense_Power = 50;
		this.mHealth_Power = 500;
		this.mMana_Power = 100;
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
		System.out.println("HP : " + mHealth_Power);
		System.out.println("MP : " + mMana_Power + "\n");
		System.out.println("Attack : " + mAttack_Power);
		System.out.println("Defense : " + mDefense_Power + "\n");
	}
	
	public void getItem(String name, int amount, String type, String equipment_type, String reinforcement_type, 
			int reinforcement_level, int attack_power, int defense_power) {
		Item obj = new Item(name, amount, type, equipment_type, reinforcement_type, reinforcement_level, attack_power, defense_power);
		mItems.add(obj);
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
