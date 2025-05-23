/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error.TerminalPromptErrorDescription;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error.TerminalPromptErrorStateListener;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import com.intellij.openapi.util.Key;
/*    */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.ApiStatus.Internal;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bg\030\000 \"2\0020\001:\001\"J\b\020\031\032\0020\032H'J\022\020\033\032\0020\0322\b\020\034\032\004\030\0010\035H'J\030\020\036\032\0020\0322\006\020\037\032\0020 2\006\020!\032\0020\001H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0078gX¦\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\0020\0138gX¦\004¢\006\006\032\004\b\f\020\rR\024\020\016\032\0020\0178gX¦\004¢\006\006\032\004\b\020\020\021R$\020\024\032\0020\0232\006\020\022\032\0020\0238g@gX¦\016¢\006\f\032\004\b\025\020\026\"\004\b\027\020\030¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "Lcom/intellij/openapi/Disposable;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "getEditor", "()Lcom/intellij/openapi/editor/ex/EditorEx;", "promptState", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "getPromptState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "renderingInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "getRenderingInfo", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "commandStartOffset", "", "getCommandStartOffset", "()I", "value", "", "commandText", "getCommandText", "()Ljava/lang/String;", "setCommandText", "(Ljava/lang/String;)V", "resetChangesHistory", "", "setErrorDescription", "errorDescription", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorDescription;", "addErrorStateListener", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorStateListener;", "parentDisposable", "Companion", "ej-core"})
/*    */ @Internal
/*    */ public interface TerminalPromptModel extends Disposable {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   EditorEx getEditor();
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   TerminalPromptState getPromptState();
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   TerminalPromptRenderingInfo getRenderingInfo();
/*    */   
/*    */   @RequiresEdt
/*    */   int getCommandStartOffset();
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   String getCommandText();
/*    */   
/*    */   @RequiresEdt
/*    */   void setCommandText(@NotNull String paramString);
/*    */   
/*    */   @RequiresEdt
/*    */   void resetChangesHistory();
/*    */   
/*    */   @RequiresEdt
/*    */   void setErrorDescription(@Nullable TerminalPromptErrorDescription paramTerminalPromptErrorDescription);
/*    */   
/*    */   void addErrorStateListener(@NotNull TerminalPromptErrorStateListener paramTerminalPromptErrorStateListener, @NotNull Disposable paramDisposable);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/util/Key;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "getKEY", "()Lcom/intellij/openapi/util/Key;", "ej-core"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 53 */     private static final Key<TerminalPromptModel> KEY = Key.create("TerminalPromptModel"); @NotNull public final Key<TerminalPromptModel> getKEY() { return KEY; } static { Intrinsics.checkNotNullExpressionValue(Key.create("TerminalPromptModel"), "create(...)"); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */