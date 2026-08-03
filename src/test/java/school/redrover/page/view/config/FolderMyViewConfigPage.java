package school.redrover.page.view.config;

import org.openqa.selenium.WebDriver;
import school.redrover.page.view.common.folder.FolderMyViewPage;

public class FolderMyViewConfigPage extends BaseViewConfigPage<FolderMyViewConfigPage, FolderMyViewPage>{
    public FolderMyViewConfigPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected FolderMyViewConfigPage self() {
        return this;
    }

    @Override
    protected FolderMyViewPage createViewPage() {
        return new FolderMyViewPage(getDriver());
    }
}
