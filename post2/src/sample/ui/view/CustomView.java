package sample.ui.view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;
import sample.ui.panel.SampleForm;

public class CustomView {

    public static CustomView getInstance(@NotNull Project project) {
        return project.getComponent(CustomView.class);
    }

    public void createContentPanel(@NotNull ToolWindow toolWindow) {
        SampleForm panel = new SampleForm();

        final Content content = ContentFactory.SERVICE.getInstance().createContent(panel.getMainPanel(), "", false);
        content.setCloseable(true);

        toolWindow.getContentManager().addContent(content);
    }
}
