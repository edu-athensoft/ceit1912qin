package com.athensoft.test.entity;

import java.io.Serializable;

public class News implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4053926358562218768L;
	private Long globalId;
	private String eventUUID;
	private String title;
	
	public News(){
		
	}
	public News(Long globalId, String eventUUID, String title) {
		super();
		this.globalId = globalId;
		this.eventUUID = eventUUID;
		this.title = title;
	}
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
