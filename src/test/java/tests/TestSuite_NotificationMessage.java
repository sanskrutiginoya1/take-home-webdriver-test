package tests;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;

import java.util.Arrays;
import java.util.List;

public class TestSuite_NotificationMessage extends BaseTestClass {

    @Test
    public void TC_NotificationMessage_001_Verify_AlertMessage() {
        ActionHelper.openUrl(ConstantsVariableClass.NOTIFICATION_PAGE_URL);
        NotificationMessagePage notificationMessagePage = NotificationMessagePage.getInstance();
        List<String> expectedMessages = Arrays.asList("Action successful",
                "Action unsuccesful, please try again", "Action Unsuccessful");
        notificationMessagePage.clickLink();
        System.out.println(notificationMessagePage.getFlashMessageText());
        Assert.assertTrue(expectedMessages.contains(notificationMessagePage.getFlashMessageText()),
                "Validate expected Error Message");
    }
}