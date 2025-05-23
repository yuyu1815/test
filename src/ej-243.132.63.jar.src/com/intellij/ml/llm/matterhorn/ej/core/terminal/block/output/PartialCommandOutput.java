/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.StyleRange;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\025\b\b\030\0002\0020\001B5\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\006\020\n\032\0020\013¢\006\004\b\f\020\rJ\t\020\026\032\0020\003HÆ\003J\017\020\027\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\030\032\0020\bHÆ\003J\t\020\031\032\0020\bHÆ\003J\t\020\032\032\0020\013HÆ\003JA\020\033\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\b2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\034\032\0020\0132\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\bHÖ\001J\t\020\037\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\022\020\023R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\024\020\023R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\n\020\025¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;", "", "text", "", "styles", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyleRange;", "logicalLineIndex", "", "terminalWidth", "isChangesDiscarded", "", "<init>", "(Ljava/lang/String;Ljava/util/List;IIZ)V", "getText", "()Ljava/lang/String;", "getStyles", "()Ljava/util/List;", "getLogicalLineIndex", "()I", "getTerminalWidth", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ej-core"})
/*    */ public final class PartialCommandOutput {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final List<StyleRange> styles;
/*    */   private final int logicalLineIndex;
/*    */   private final int terminalWidth;
/*    */   private final boolean isChangesDiscarded;
/*    */   
/* 19 */   public PartialCommandOutput(@NotNull String text, @NotNull List<StyleRange> styles, int logicalLineIndex, int terminalWidth, boolean isChangesDiscarded) { this.text = text;
/* 20 */     this.styles = styles;
/* 21 */     this.logicalLineIndex = logicalLineIndex;
/* 22 */     this.terminalWidth = terminalWidth;
/* 23 */     this.isChangesDiscarded = isChangesDiscarded; } public final boolean isChangesDiscarded() { return this.isChangesDiscarded; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<StyleRange> getStyles() {
/*    */     return this.styles;
/*    */   }
/*    */   
/*    */   public final int getLogicalLineIndex() {
/*    */     return this.logicalLineIndex;
/*    */   }
/*    */   
/*    */   public final int getTerminalWidth() {
/*    */     return this.terminalWidth;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<StyleRange> component2() {
/*    */     return this.styles;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.logicalLineIndex;
/*    */   }
/*    */   
/*    */   public final int component4() {
/*    */     return this.terminalWidth;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.isChangesDiscarded;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PartialCommandOutput copy(@NotNull String text, @NotNull List<StyleRange> styles, int logicalLineIndex, int terminalWidth, boolean isChangesDiscarded) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(styles, "styles");
/*    */     return new PartialCommandOutput(text, styles, logicalLineIndex, terminalWidth, isChangesDiscarded);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "PartialCommandOutput(text=" + this.text + ", styles=" + this.styles + ", logicalLineIndex=" + this.logicalLineIndex + ", terminalWidth=" + this.terminalWidth + ", isChangesDiscarded=" + this.isChangesDiscarded + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     result = result * 31 + this.styles.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.logicalLineIndex);
/*    */     result = result * 31 + Integer.hashCode(this.terminalWidth);
/*    */     return result * 31 + Boolean.hashCode(this.isChangesDiscarded);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PartialCommandOutput))
/*    */       return false; 
/*    */     PartialCommandOutput partialCommandOutput = (PartialCommandOutput)other;
/*    */     return !Intrinsics.areEqual(this.text, partialCommandOutput.text) ? false : (!Intrinsics.areEqual(this.styles, partialCommandOutput.styles) ? false : ((this.logicalLineIndex != partialCommandOutput.logicalLineIndex) ? false : ((this.terminalWidth != partialCommandOutput.terminalWidth) ? false : (!(this.isChangesDiscarded != partialCommandOutput.isChangesDiscarded)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\PartialCommandOutput.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */