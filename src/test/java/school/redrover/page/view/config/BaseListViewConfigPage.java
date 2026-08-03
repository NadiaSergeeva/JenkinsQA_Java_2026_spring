package school.redrover.page.view.config;

import org.openqa.selenium.WebDriver;
import school.redrover.page.view.common.base.BaseViewPage;

public abstract class BaseListViewConfigPage<T extends BaseListViewConfigPage<T,V>, V extends BaseViewPage<T>> extends BaseViewConfigPage<T,V>{

    public BaseListViewConfigPage(WebDriver driver) {
        super(driver);
    }

    // clickTask
    // addFilter
    // addColumn
}
