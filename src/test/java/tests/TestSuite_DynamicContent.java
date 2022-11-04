package tests;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicContentPage;

public class TestSuite_DynamicContent extends BaseTestClass {

    @Test(description = "Dynamic Content")
    public void TC_DynamicContent_001_ValidateFunctionality_DynamicContent() {
        ActionHelper.openUrl(ConstantsVariableClass.DYNAMIC_CONTENT_PAGE_URL);
        DynamicContentPage dynamicContentPage = DynamicContentPage.getInstance();
        String textBefore = dynamicContentPage.getTextOfContent();
        ActionHelper.refresh();
        String textAfter = dynamicContentPage.getTextOfContent();
        Assert.assertNotEquals(textBefore, textAfter, "Validate Text Change after Refresh");
        textBefore = dynamicContentPage.getTextOfContent();
        ActionHelper.refresh();
        textAfter = dynamicContentPage.getTextOfContent();
        Assert.assertNotEquals(textBefore, textAfter, "Validate Text Change after Refresh");
        textBefore = dynamicContentPage.getTextOfContent();
        ActionHelper.refresh();
        textAfter = dynamicContentPage.getTextOfContent();
        Assert.assertNotEquals(textBefore, textAfter, "Validate Text Change after Refresh");
    }


}