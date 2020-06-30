package yjla.game;

import java.util.ArrayList;

public class Skill {
	
	private String mSkill_Name; // 스킬 이름
	private String mJob; // 캐릭터 직업 (스킬 사용 직업 구분)
	private String mSkill_Type; // 패시브, 액티브, 온/오프
	private String mItem_Description; // 스킬 설명
	
	private int mSkill_Level; // 스킬 강화 레벨
	private int mMinimum_Require_Level; // 최소 필요 레벨
	private int mJob_Level; // 전직 레벨 (ex : 궁수 2차 스킬)
	
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
