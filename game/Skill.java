package yjla.game;

public class Skill {
	
	private String mSkillName; // 스킬 이름
	private String mJob; // 캐릭터 직업 (스킬 사용 직업 구분)
	private String mSkillType; // 패시브, 액티브, 온/오프
	private String mItemDescription; // 스킬 설명
	
	private int mSkillLevel; // 스킬 강화 레벨
	private int mMinimumRequireLevel; // 최소 필요 레벨
	private int mJobLevel; // 전직 레벨 (ex : 궁수 2차 스킬)
	
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
