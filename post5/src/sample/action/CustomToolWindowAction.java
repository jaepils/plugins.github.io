package sample.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;

public class CustomToolWindowAction extends AnAction {

    public CustomToolWindowAction() {
        super("CustomToolWindow");
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);

        ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow("CustomToolWindow");
        if (window != null && window.isAvailable()) {
            window.activate(null);
        }
    }
}
