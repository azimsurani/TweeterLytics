package models;

import java.util.List;

public class TweetHashtagSearchResult {
	
	private String hashtag;
	
	private List<Tweet> tweets;
	

	public TweetHashtagSearchResult(String hashtag, List<Tweet> tweets) {
		this.hashtag = hashtag;
		this.tweets = tweets;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}

}