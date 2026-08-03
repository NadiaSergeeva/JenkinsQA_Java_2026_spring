package school.redrover.page.view.config;

import org.openqa.selenium.WebDriver;
import school.redrover.page.view.common.general.GeneralListViewPage;

public class GeneralListViewConfigPage extends BaseListViewConfigPage<GeneralListViewConfigPage, GeneralListViewPage> {
    public GeneralListViewConfigPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected GeneralListViewConfigPage self() {
        return this;
    }

    @Override
    protected GeneralListViewPage createViewPage() {
        return new GeneralListViewPage(getDriver());
    }

    public GeneralListViewPage clickSaveAngGoToGeneralListView() {
        clickSaveAndGetViewPage();
        return new GeneralListViewPage(getDriver());
    }
}
