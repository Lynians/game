package yjla.game;

import java.util.ArrayList;

public class Skill {
	
	private String mSkill_Name; // ��ų �̸�
	private String mJob; // ĳ���� ���� (��ų ��� ���� ����)
	private String mSkill_Type; // �нú�, ��Ƽ��, ��/����
	private String mItem_Description; // ��ų ����
	
	private int mSkill_Level; // ��ų ��ȭ ����
	private int mMinimum_Require_Level; // �ּ� �ʿ� ����
	private int mJob_Level; // ���� ���� (ex : �ü� 2�� ��ų)
	
	public Skill(String name, String type, String description, int require_Level, int job_Level, String job) {
		this.mSkill_Name = name;
		this.mSkill_Type = type;
		this.mItem_Description = description;
		this.mMinimum_Require_Level = require_Level;
		this.mJob_Level = job_Level;
		this.mJob = job;
		this.mSkill_Level = 0;
	}
}
