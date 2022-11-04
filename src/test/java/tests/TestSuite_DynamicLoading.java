package tests;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class TestSuite_DynamicLoading extends BaseTestClass {

    @Test
    public void TC_DynamicLoading_001_ValidateHeaderText() {
        ActionHelper.openUrl(ConstantsVariableClass.DYNAMIC_LOADING_PAGE_URL);
        DynamicLoadingPage dynamicLoadingPage = DynamicLoadingPage.getInstance();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.waitForLoader();
        Assert.assertEquals(dynamicLoadingPage.getHeaderText(), "Hello World!");
    }

}
