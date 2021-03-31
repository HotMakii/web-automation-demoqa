package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/tool-tips")
public class ToolTipsPage extends WidgetsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By TOOL_TIPS_TITLE =text("Tool Tips");
  public static By HOVER_ME_TO_SEE_BUTTON =css("button[id='toolTipButton'");
  public static By HOVER_ME_TO_SEE_FIELD =css("input[id=toolTipTextField]");
  public static By CONTRARY =xpath("//*[@id='texToolTopContainer']/a[1]");
  // Might be necessary to use a specific xpath selector 
  public static By SECTION_11032 =xpath("//*[@id='texToolTopContainer']/a[2]");
  public static By BUTTON_TOOL_TIP =css("div[id='buttonToolTip']");
  public static By TEXT_FIELD_TOOL_TIP =css("div[id=textFieldToolTip]");
  public static By CONTRARY_TOOL_TIP =css("div[id=contraryTexToolTip]");
  public static By SECTION_TOOL_TIP =css("div[id=sectionToolTip]");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(TOOL_TIPS_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
