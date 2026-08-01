package school.redrover.page.view.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.redrover.page.view.common.folder.FolderGlobalViewPage;

public class FolderGlobalViewConfigPage extends BaseViewConfigPage<FolderGlobalViewConfigPage, FolderGlobalViewPage> {

    @FindBy(name = "proxiedViewName")
    private WebElement selectView;

    public FolderGlobalViewConfigPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected FolderGlobalViewConfigPage self() {
        return this;
    }

    @Override
    protected FolderGlobalViewPage createViewPage() {
        return new FolderGlobalViewPage(getDriver());
    }

    public FolderGlobalViewConfigPage selectView(){
        selectView.click();
        return self();
    }

    public FolderGlobalViewPage clickSave() {
        clickSaveAndGetViewPage();
        return new FolderGlobalViewPage(getDriver());
    }
}
