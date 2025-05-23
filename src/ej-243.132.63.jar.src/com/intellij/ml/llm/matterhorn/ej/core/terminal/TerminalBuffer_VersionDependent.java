/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.jediterm.terminal.model.StyleState;
/*    */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J&\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\n2\006\020\013\032\0020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/TerminalBuffer_VersionDependent;", "", "<init>", "()V", "createTerminalBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "initialWidth", "", "initialHeight", "styleState", "Lcom/jediterm/terminal/model/StyleState;", "maxHistoryLinesCount", "ej-core"})
/*    */ public final class TerminalBuffer_VersionDependent
/*    */ {
/*    */   @NotNull
/*    */   public final TerminalTextBuffer createTerminalBuffer(int initialWidth, int initialHeight, @NotNull StyleState styleState, int maxHistoryLinesCount) {
/* 14 */     Intrinsics.checkNotNullParameter(styleState, "styleState"); return new TerminalTextBuffer(initialWidth, initialHeight, styleState, maxHistoryLinesCount, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final TerminalBuffer_VersionDependent INSTANCE = new TerminalBuffer_VersionDependent();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\TerminalBuffer_VersionDependent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */