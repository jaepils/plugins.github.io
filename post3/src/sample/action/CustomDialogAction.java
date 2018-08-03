package sample.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import sample.ui.dialog.SampleDialog;

public class CustomDialogAction extends AnAction {

    public CustomDialogAction() {
        super("CustomToolWindow");
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);

        final SampleDialog dlg = new SampleDialog();
        dlg.pack();

        dlg.setVisible(true);
    }
}
