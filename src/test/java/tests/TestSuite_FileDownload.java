package tests;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileDownloadPage;

import java.io.File;

public class TestSuite_FileDownload extends BaseTestClass {

    @Test
    public void TC_FileDownload_001_ValidateFunctionality_FileDownload() {
        ActionHelper.openUrl(ConstantsVariableClass.DOWNLOAD_PAGE_URL);
        FileDownloadPage fileDownloadPage = FileDownloadPage.getInstance();
        fileDownloadPage.clickLink();
        ActionHelper.goToSleep(5000);
        Assert.assertTrue(new File(System.getProperty("user.dir") + "/some-file.txt").exists(), "Check File Exist");
    }
}