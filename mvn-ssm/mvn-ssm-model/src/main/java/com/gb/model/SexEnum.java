package com.gb.model;

public enum SexEnum {
	
	MALE(1,"��"),FEMALE(2,"Ů");
	
	
	private int value;
	private String note;
	
	private SexEnum(Integer value, String note) {
		this.value = value;
		this.note = note;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	/**
	 * ���ݴ����id�õ����id��Ӧ��ʵ���������أ���������ʱ����null
	 * @param id
	 * @return
	 */
	public static SexEnum getSexEnumById(int id) {
		for(SexEnum sex:SexEnum.values()) {
			if (sex.getValue() == id) {
				return sex;
			}
		}
		
		return null;
	}
	
	

}
