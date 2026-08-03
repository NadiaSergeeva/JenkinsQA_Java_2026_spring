package school.redrover.page.view.config;

import org.openqa.selenium.WebDriver;
import school.redrover.page.view.common.folder.FolderListViewPage;

public class FolderListViewConfigPage extends BaseListViewConfigPage<FolderListViewConfigPage, FolderListViewPage> {
    public FolderListViewConfigPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected FolderListViewConfigPage self() {
        return this;
    }

    @Override
    protected FolderListViewPage createViewPage() {
        return new FolderListViewPage(getDriver());
    }


}
