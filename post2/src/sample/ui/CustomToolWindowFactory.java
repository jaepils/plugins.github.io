package sample.ui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import org.jetbrains.annotations.NotNull;
import sample.ui.view.CustomView;

public class CustomToolWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        CustomView customView = CustomView.getInstance(project);
        customView.createContentPanel(toolWindow);
    }
}
