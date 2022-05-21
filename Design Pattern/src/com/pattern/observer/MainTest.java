package com.pattern.observer;

import com.pattern.observer.notify.EmailNotifier;
import com.pattern.observer.notify.YoutubeNotifier;

public class MainTest {
	public static void main(String arg[]) {
		VideoData videoData = new VideoData();

		new EmailNotifier(videoData);
		YoutubeNotifier youtubeNotifier= new YoutubeNotifier(videoData);

		videoData.setTitle("demos test observer!");
		
		videoData.deleteObserver(youtubeNotifier);
		
		videoData.setDescription("new descriptions");
	}
}
