package com.athensoft.test.entity;

public class News {
	private Long globalId;
	private String eventUUID;
	private String title;
	
	public Long getGlobalId() {
		return globalId;
	}
	public void setGlobalId(Long globalId) {
		this.globalId = globalId;
	}
	public String getEventUUID() {
		return eventUUID;
	}
	public void setEventUUID(String eventUUID) {
		this.eventUUID = eventUUID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "News [globalId=" + globalId + ", eventUUID=" + eventUUID + ", title=" + title + "]";
	}
	
	
}
