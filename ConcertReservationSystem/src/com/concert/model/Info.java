package com.concert.model;

public class Info {
/**
 * 공연예매 프로그램 공연정보 도메인 클래스
 * 1. playCode	: 공연 코드
 * 2. playName	: 공연 이름
 * 3. playDate	: 공연 날짜
 * 4. playStartTime	: 공연 시작 시간
 * 5. playFinishTime : 공연 종료 시간
 * 5. playFemaleActor	: 여자 주연 배우
 * 6. playMaleActor		: 남자 주연 배우
 */
	
//	공연정보 : playCode, playName, playDate,
//			playStartTime, playFinishTime, playFemaleActor,playMaleActor
//	1. play_001, 뮤지컬 더 리퍼, 6/12, 19:30 ~ 22:00, 문채원, 송중기
//	2. paly_002, 옥탑방 고양이,  6/19, 20:00 ~ 22:00, 남정은, 이경민
//	3. paly_003, 피카츄의 대모험, 6/26, 19:30 ~ 21:30, 소니아, 금랑
//	4. play_004, 낫아웃, 7/3. 20:00 ~ 22:30, 송이재, 정재광
//	5. play_005, 행복, 7/10, 19:30 ~ 21:30 김단율, 정영성
	
	/** 공연 코드 */
	private String playCode;
	/** 공연 이름 */
	private String playName;
	/** 공연 날짜 */
	private String playDate;
	/** 공연 시작 시간 */
	private String playStartTime;
	/** 공연 종료 시간 */
	private String playFinishTime;
	/** 여자 주연 배우 */
	private String playFemaleActor;
	/** 남자 주연 배우  */
	private String playMaleActor;

	

	/**기본생성자 */
	public Info() {
		super();
	}

	/**
	 * 공연정보 초기화 메서드
	 * @param playCode
	 * @param playName
	 * @param playDate
	 * @param playStartTime
	 * @param playFinishTime
	 * @param playFemaleActor
	 * @param playMaleActor
	 */
	public Info(String playCode, String playName, String playDate, String playStartTime, String playFinishTime,
			String playFemaleActor, String playMaleActor) {
		super();
		this.playCode = playCode;
		this.playName = playName;
		this.playDate = playDate;
		this.playStartTime = playStartTime;
		this.playFinishTime = playFinishTime;
		this.playFemaleActor = playFemaleActor;
		this.playMaleActor = playMaleActor;
	}


	/**
	 * @return the playCode
	 */
	public String getplayCode() {
		return playCode;
	}
	/**
	 * @param playCode the playCode to set
	 */
	public void setplayCode(String playCode) {
		this.playCode = playCode;
	}
	/**
	 * @return the playName
	 */
	public String getplayName() {
		return playName;
	}
	/**
	 * @param playName the playName to set
	 */
	public void setplayName(String playName) {
		this.playName = playName;
	}
	/**
	 * @return the playDate
	 */
	public String getplayDate() {
		return playDate;
	}
	/**
	 * @param playDate the playDate to set
	 */
	public void setplayDate(String playDate) {
		this.playDate = playDate;
	}
	/**
	 * @return the playStartTime
	 */
	public String getplayStartTime() {
		return playStartTime;
	}
	/**
	 * @param playStartTime the playStartTime to set
	 */
	public void setplayStartTime(String playStartTime) {
		this.playStartTime = playStartTime;
	}
	/**
	 * @return the playFinishTime
	 */
	public String getplayFinishTime() {
		return playFinishTime;
	}
	/**
	 * @param playFinishTime the playFinishTime to set
	 */
	public void setplayFinishTime(String playFinishTime) {
		this.playFinishTime = playFinishTime;
	}
	/**
	 * @return the playFemaleActor
	 */
	public String getplayFemaleActor() {
		return playFemaleActor;
	}
	/**
	 * @param playFemaleActor the playFemaleActor to set
	 */
	public void setplayFemaleActor(String playFemaleActor) {
		this.playFemaleActor = playFemaleActor;
	}
	/**
	 * @return the playMaleActor
	 */
	public String getplayMaleActor() {
		return playMaleActor;
	}
	/**
	 * @param playMaleActor the playMaleActor to set
	 */
	public void setplayMaleActor(String playMaleActor) {
		this.playMaleActor = playMaleActor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playCode == null) ? 0 : playCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Info other = (Info) obj;
		if (playCode == null) {
			if (other.playCode != null)
				return false;
		} else if (!playCode.equals(other.playCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(playCode);
		builder.append(", ");
		builder.append(playName);
		builder.append(", ");
		builder.append(playDate);
		builder.append(", ");
		builder.append(playStartTime);
		builder.append(", ");
		builder.append(playFinishTime);
		builder.append(", ");
		builder.append(playFemaleActor);
		builder.append(", ");
		builder.append(playMaleActor);
		return builder.toString();
	}

	
	
	
}
