/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error;
/*    */ import com.intellij.execution.ui.ConsoleViewContentType;
/*    */ import com.intellij.openapi.editor.colors.EditorColors;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*    */ import com.intellij.ui.components.ActionLink;
/*    */ import com.intellij.ui.components.JBLabel;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import javax.swing.JPanel;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorUtil;", "", "<init>", "()V", "createErrorComponent", "Ljavax/swing/JComponent;", "description", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorDescription;", "colorScheme", "Lcom/intellij/openapi/editor/colors/EditorColorsScheme;", "ej-core"})
/*    */ public final class TerminalPromptErrorUtil {
/*    */   @NotNull
/*    */   public final JComponent createErrorComponent(@NotNull TerminalPromptErrorDescription description, @NotNull EditorColorsScheme colorScheme) {
/* 16 */     Intrinsics.checkNotNullParameter(description, "description"); Intrinsics.checkNotNullParameter(colorScheme, "colorScheme"); JPanel panel = new JPanel((LayoutManager)ListLayout.Companion.horizontal$default(ListLayout.Companion, 0, null, null, 7, null));
/* 17 */     panel.setBorder((Border)JBUI.Borders.emptyTop(4));
/* 18 */     panel.setOpaque(false);
/*    */     
/* 20 */     JBLabel errorLabel = new JBLabel(description.getErrorText());
/* 21 */     errorLabel.setCopyable(true);
/* 22 */     errorLabel.setIcon(description.getIcon());
/* 23 */     errorLabel.setIconTextGap(JBUI.scale(6));
/* 24 */     colorScheme.getAttributes(ConsoleViewContentType.ERROR_OUTPUT_KEY); errorLabel.setForeground((colorScheme.getAttributes(ConsoleViewContentType.ERROR_OUTPUT_KEY) != null) ? colorScheme.getAttributes(ConsoleViewContentType.ERROR_OUTPUT_KEY).getForegroundColor() : null);
/* 25 */     panel.add((Component)errorLabel);
/*    */     
/* 27 */     String linkText = description.getLinkText();
/* 28 */     if (linkText != null) {
/* 29 */       ActionLink linkLabel = new ActionLink(linkText, description::createErrorComponent$lambda$0);
/* 30 */       colorScheme.getAttributes(EditorColors.REFERENCE_HYPERLINK_COLOR); linkLabel.setForeground((colorScheme.getAttributes(EditorColors.REFERENCE_HYPERLINK_COLOR) != null) ? colorScheme.getAttributes(EditorColors.REFERENCE_HYPERLINK_COLOR).getForegroundColor() : null);
/* 31 */       linkLabel.setBorder((Border)JBUI.Borders.emptyLeft(5));
/* 32 */       panel.add((Component)linkLabel);
/*    */     } 
/*    */     
/* 35 */     return panel;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final TerminalPromptErrorUtil INSTANCE = new TerminalPromptErrorUtil();
/*    */   
/*    */   private static final Unit createErrorComponent$lambda$0(TerminalPromptErrorDescription $description, ActionEvent it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     $description.onLinkClick();
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\error\TerminalPromptErrorUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */