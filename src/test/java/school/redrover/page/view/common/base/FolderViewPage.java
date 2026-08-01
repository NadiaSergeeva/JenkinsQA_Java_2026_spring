package school.redrover.page.view.common.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import school.redrover.page.components.ViewSideMenuComponent;
import school.redrover.page.view.config.BaseViewConfigPage;

public abstract class FolderViewPage<T extends BaseViewConfigPage<?,?>> extends BaseViewPage<T>{

    public FolderViewPage(WebDriver driver) {
        super(driver);
    }


    public ViewSideMenuComponent<FolderViewPage<T>> getSideMenu() {
        return new ViewSideMenuComponent<>(getDriver(), this);
    }

    public FolderViewPage<T> addDescription(String expectedDescription) {
        editDescription.click();
        getWait5().until(ExpectedConditions.visibilityOf(fieldDescription)).sendKeys(expectedDescription);

        return this;
    }

    public String getTextPreview() {
        linkPreview.click();
        return getWait10().until(ExpectedConditions.visibilityOf(areaPreview)).getText();
    }

    public FolderViewPage<T> clickSubmitButton() {
        buttonSave.click();
        return this;
    }

    public String getDescriptionText() {
        return getWait10().until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(descriptionMessage))).getText();
    }

    public FolderViewPage<T> editDescription(String newDescriptionText) {
        editDescription.click();

        WebElement descriptionField = getWait5().until(ExpectedConditions.visibilityOf(fieldDescription));
        descriptionField.clear();
        descriptionField.sendKeys(newDescriptionText);

        return this;
    }

    public FolderViewPage<T> clickCancelButton() {
        buttonCancel.click();
        return this;
    }
}
