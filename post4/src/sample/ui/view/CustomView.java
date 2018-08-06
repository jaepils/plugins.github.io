package sample.ui.view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.tabs.JBTabs;
import com.intellij.ui.tabs.TabInfo;
import com.intellij.ui.tabs.impl.JBTabsImpl;
import org.jetbrains.annotations.NotNull;
import sample.ui.panel.SampleForm;

public class CustomView {

    private JBTabs myTabsPane;

    public static CustomView getInstance(@NotNull Project project) {
        return project.getComponent(CustomView.class);
    }

    public void createContentPanel(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        SampleForm panel = new SampleForm();

        TabInfo tab1 = new TabInfo(panel.getMainPanel());
        tab1.setText("tab1");

        myTabsPane = new JBTabsImpl(project);
        myTabsPane.addTab(tab1);

        final Content content = ContentFactory.SERVICE.getInstance().createContent(myTabsPane.getComponent(), "", false);
        content.setCloseable(true);

        toolWindow.getContentManager().addContent(content);
    }
}
