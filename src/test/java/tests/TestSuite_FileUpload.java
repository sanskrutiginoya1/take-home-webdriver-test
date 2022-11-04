package tests;
import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class TestSuite_FileUpload extends BaseTestClass {

    @Test
    public void TC_FileUpload_001_ValidateFunctionality_FileUpload() {
        ActionHelper.openUrl(ConstantsVariableClass.UPLOAD_PAGE_URL);
        FileUploadPage fileUploadPage = FileUploadPage.getInstance();
        fileUploadPage.chooseFileSendKeys(System.getProperty("user.dir") + "/some-file.txt");
        fileUploadPage.clickUpload();
        Assert.assertEquals(fileUploadPage.getHeaderText(), "File Uploaded!");
    }
}