package sample.ui.view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.JBSplitter;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.tabs.JBTabs;
import com.intellij.ui.tabs.TabInfo;
import com.intellij.ui.tabs.impl.JBTabsImpl;
import org.jetbrains.annotations.NotNull;
import sample.ui.panel.SampleForm;

public class CustomView {

    private JBSplitter mySplitter;

    public static CustomView getInstance(@NotNull Project project) {
        return project.getComponent(CustomView.class);
    }

    public void createContentPanel(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        SampleForm panel1 = new SampleForm();
        SampleForm panel2 = new SampleForm();

        mySplitter = new JBSplitter(true);
        mySplitter.setFirstComponent(panel1.getMainPanel());
        mySplitter.setSecondComponent(panel2.getMainPanel());

        final Content content = ContentFactory.SERVICE.getInstance().createContent(mySplitter, "", false);
        content.setCloseable(true);

        toolWindow.getContentManager().addContent(content);
    }
}
