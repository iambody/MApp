package com.m.app.ui.module.test;

public class ContentModel {

	private int imageView;
	private String text;
	private tsns.DataBean f;
	public ContentModel(int imageView, String text) {
		super();
		this.imageView = imageView;
		this.text = text;
	}

	public int getImageView() {
		return imageView;
	}

	public void setImageView(int imageView) {
		this.imageView = imageView;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
