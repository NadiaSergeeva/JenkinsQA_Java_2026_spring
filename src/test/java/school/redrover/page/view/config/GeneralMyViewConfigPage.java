package school.redrover.page.view.config;

import org.openqa.selenium.WebDriver;
import school.redrover.page.view.common.general.GeneralMyViewPage;

public class GeneralMyViewConfigPage extends BaseViewConfigPage<GeneralMyViewConfigPage, GeneralMyViewPage> {
    public GeneralMyViewConfigPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected GeneralMyViewConfigPage self() {
        return this;
    }

    @Override
    protected GeneralMyViewPage createViewPage() {
        return new GeneralMyViewPage(getDriver());
    }

    public GeneralMyViewPage clickSaveAndGoToGeneralMyView(){
        clickSaveAndGetViewPage();
        return new GeneralMyViewPage(getDriver());
    }
}
