/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\007\032\b\022\004\022\0020\0060\bR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "getErrorCheckers", "", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/* 13 */   private static final ExtensionPointName<ErrorChecker> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.ejErrorChecker"); @NotNull
/*    */   public final List<ErrorChecker> getErrorCheckers() {
/* 15 */     return EP_NAME.getExtensionList();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\ErrorChecker$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */