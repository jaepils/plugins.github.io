package sample.ui.view;

import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class CustomView {

    public static CustomView getInstance(@NotNull Project project) {
        return project.getComponent(CustomView.class);
    }
}
