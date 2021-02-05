package com.Cricinfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeCric {

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(linkText = "LiveScores")
	private WebElement LiveScores;

	@FindBy(linkText = "Series")
	private WebElement Series;

	@FindBy(linkText = "Teams")
	private WebElement Teams;

	@FindBy(linkText = "Features")
	private WebElement Features;

	@FindBy(linkText = "Videos")
	private WebElement Videos;

	@FindBy(linkText = "Stats")
	private WebElement Stats;

	public HomeCric(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void findLiveScores() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.LiveScores));
		this.LiveScores.click();
	}

	public void findSeries() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.Series));
		this.Series.click();
	}

	public void findTeams() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.Teams));
		this.Teams.click();
	}

	public void findFeatures() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.Features));
		this.Features.click();
	}

	public void findVideos() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.Videos));
		this.Videos.click();
	}

	public void findStats() {
		this.wait.until(ExpectedConditions.elementToBeClickable(this.Stats));
		this.Stats.click();
	}
}