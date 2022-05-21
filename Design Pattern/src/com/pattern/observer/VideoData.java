package com.pattern.observer;

public class VideoData extends Subject {

	private String title;
	private String description;
	private String fileName;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		videoDataChanged();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		videoDataChanged();
	}

	public String getFileName() {
		return fileName;

	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		videoDataChanged();
	}

	// ------------------
	public void videoDataChanged() {
		this.notifyObservers(this);
	}

}
