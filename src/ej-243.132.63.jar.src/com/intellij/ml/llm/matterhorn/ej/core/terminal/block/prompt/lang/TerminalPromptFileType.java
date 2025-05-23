/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.lang;
/*    */ 
/*    */ import com.intellij.openapi.fileTypes.LanguageFileType;
/*    */ import javax.swing.Icon;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.plugins.terminal.TerminalBundle;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\b\020\006\032\0020\005H\026J\b\020\007\032\0020\005H\026J\n\020\b\032\004\030\0010\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileType;", "Lcom/intellij/openapi/fileTypes/LanguageFileType;", "<init>", "()V", "getName", "", "getDescription", "getDefaultExtension", "getIcon", "Ljavax/swing/Icon;", "ej-core"})
/*    */ public final class TerminalPromptFileType
/*    */   extends LanguageFileType {
/*    */   @NotNull
/*    */   public static final TerminalPromptFileType INSTANCE = new TerminalPromptFileType();
/*    */   
/*    */   private TerminalPromptFileType() {
/* 18 */     super(TerminalPromptLanguage.INSTANCE); } @NotNull
/* 19 */   public String getName() { return "Terminal Prompt"; }
/*    */   @NotNull
/* 21 */   public String getDescription() { Intrinsics.checkNotNullExpressionValue(TerminalBundle.message("terminal.prompt.lang.description", new Object[0]), "message(...)"); return TerminalBundle.message("terminal.prompt.lang.description", new Object[0]); }
/*    */   @NotNull
/* 23 */   public String getDefaultExtension() { return "prompt"; } @Nullable
/*    */   public Icon getIcon() {
/* 25 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\lang\TerminalPromptFileType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */