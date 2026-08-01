package school.redrover.page.view.common.base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import school.redrover.page.HomePage;
import school.redrover.page.view.config.BaseViewConfigPage;

public abstract class GeneralViewPage<T extends BaseViewConfigPage<?, ?>> extends BaseViewPage<T> {

    public GeneralViewPage(WebDriver driver) {
        super(driver);
    }


    @Step("Input description: '{textInput}'")
    public GeneralViewPage<T> inputDescription(String textInput) {
        getWait5().until(ExpectedConditions.visibilityOf(fieldDescription));
        fieldDescription.sendKeys(textInput);

        return this;
    }

    @Step("Clear description field")
    public GeneralViewPage<T> clearDescription() {
        getWait5().until(ExpectedConditions.elementToBeClickable(fieldDescription)).clear();

        return this;
    }

    @Step("Click 'Save' button")
    public HomePage clickSave() {
        getWait10().until(ExpectedConditions.visibilityOf(buttonSave)).click();
        getWait5().until(ExpectedConditions.elementToBeClickable(editDescription));

        return new HomePage(getDriver());
    }

    @Step("Click 'Cancel' button")
    public HomePage cancelButton() {
        buttonCancel.click();
        getWait5().until(ExpectedConditions.visibilityOf(descriptionMessage));

        return new HomePage(getDriver());
    }

    @Step("Click 'Preview' button")
    public GeneralViewPage<T> clickPreviewButton() {
        getWait5().until(ExpectedConditions.elementToBeClickable(previewButton)).click();

        return this;
    }

    @Step("Click 'Hide' preview button")
    public GeneralViewPage<T> clickHideButton() {
        getWait5().until(ExpectedConditions.visibilityOf(hidePreview)).click();
        return this;
    }

    @Step("Check if preview is displayed")
    public boolean isPreviewDisplayed() {
        return areaPreview.isDisplayed();
    }

    @Step("Check if 'Hide Preview' button is displayed")
    public boolean isHidePreviewButtonDisplayed() {
        return getWait5().until(ExpectedConditions.visibilityOf(hidePreview)).isDisplayed();
    }
}
