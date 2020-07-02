package yjla.game;

public class Skill {
	
	private String mSkillName; // ��ų �̸�
	private String mJob; // ĳ���� ���� (��ų ��� ���� ����)
	private String mSkillType; // �нú�, ��Ƽ��, ��/����
	private String mItemDescription; // ��ų ����
	
	private int mSkillLevel; // ��ų ��ȭ ����
	private int mMinimumRequireLevel; // �ּ� �ʿ� ����
	private int mJobLevel; // ���� ���� (ex : �ü� 2�� ��ų)
	
	public Skill(String name, String type, String description, int require_level, int job_level, String job) {
		this.mSkillName = name;
		this.mSkillType = type;
		this.mItemDescription = description;
		this.mMinimumRequireLevel = require_level;
		this.mJobLevel = job_level;
		this.mJob = job;
		this.mSkillLevel = 0;
	}
}
