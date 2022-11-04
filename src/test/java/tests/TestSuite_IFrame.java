package tests;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframePage;

public class TestSuite_IFrame extends BaseTestClass {

    @Test
    public void TC_IFrame_001_Verify_IFrameMessageText() {
        ActionHelper.openUrl(ConstantsVariableClass.IFRAME_PAGE_URL);
        IframePage iframePage = IframePage.getInstance();
        iframePage.switchToFrame();
        Assert.assertEquals(iframePage.getText_TextBox(), "Your content goes here.");
    }
}