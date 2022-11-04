package tests;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;

public class TestSuite_CheckBox extends BaseTestClass {

    @Test(description = "Check and uncheck boxes")
    public void TC_CheckBox_001_ValidateFunctionality_CheckUncheckBoxes() {
        ActionHelper.openUrl(ConstantsVariableClass.CHECKBOX_PAGE_URL);
        CheckBoxesPage checkBoxesPage = CheckBoxesPage.getInstance();
        checkBoxesPage.selectCheckBox1();
        checkBoxesPage.selectCheckBox2();
        Assert.assertTrue(checkBoxesPage.isCheckBox1Selected(), "Validate Check should be selected");
        checkBoxesPage.selectCheckBox1();
        checkBoxesPage.selectCheckBox2();
        Assert.assertFalse(checkBoxesPage.isCheckBox1Selected(), "Validate Check should not be selected");
    }
}