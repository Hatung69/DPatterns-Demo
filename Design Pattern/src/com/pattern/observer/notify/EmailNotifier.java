package com.pattern.observer.notify;

import com.pattern.observer.Observer;
import com.pattern.observer.Subject;
import com.pattern.observer.VideoData;

public class EmailNotifier extends Observer {
	public EmailNotifier(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	protected void notifyChanges(Subject subject) {

		if (subject instanceof VideoData) {
			VideoData videoData = (VideoData) subject;
			System.out.println("Notify for alll user via EMAIL with new data: \n" + "\tName: " + videoData.getTitle()
					+ "\tDescription: " + videoData.getDescription() + "\tFileName: " + videoData.getFileName()+"\n");
			
		}
	};
}
