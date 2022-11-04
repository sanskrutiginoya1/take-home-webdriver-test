package tests;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.ConstantsVariableClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class TestSuite_DragDrop extends BaseTestClass {

    @Test(description = "Drag and Drop")
    public void TC_DragDrop_001_ValidateFunctionality_DragDrop() {
        ActionHelper.openUrl(ConstantsVariableClass.DRAG_DROP_PAGE_URL);
        DragAndDropPage dragAndDropPage = DragAndDropPage.getInstance();
        dragAndDropPage.performDragAndDrop();
        Assert.assertTrue(dragAndDropPage.isTextChanged(), "Validate Text Change after Drag and Drop");
    }
}