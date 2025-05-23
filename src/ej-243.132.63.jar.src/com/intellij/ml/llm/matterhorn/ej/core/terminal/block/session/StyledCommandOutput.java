/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\020 \n\002\030\002\n\002\b\017\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\004\b\t\020\nJ\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\005HÆ\003J\017\020\023\032\b\022\004\022\0020\b0\007HÆ\003J-\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\025\032\0020\0052\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\017\020\020¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "", "text", "", "commandEndMarkerFound", "", "styleRanges", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyleRange;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getText", "()Ljava/lang/String;", "getCommandEndMarkerFound", "()Z", "getStyleRanges", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ej-core"})
/*    */ public final class StyledCommandOutput
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   private final boolean commandEndMarkerFound;
/*    */   @NotNull
/*    */   private final List<StyleRange> styleRanges;
/*    */   
/*    */   public StyledCommandOutput(@NotNull String text, boolean commandEndMarkerFound, @NotNull List<StyleRange> styleRanges) {
/* 98 */     this.text = text; this.commandEndMarkerFound = commandEndMarkerFound; this.styleRanges = styleRanges; } @NotNull public final String getText() { return this.text; } public final boolean getCommandEndMarkerFound() { return this.commandEndMarkerFound; } @NotNull public final List<StyleRange> getStyleRanges() { return this.styleRanges; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.commandEndMarkerFound;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<StyleRange> component3() {
/*    */     return this.styleRanges;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StyledCommandOutput copy(@NotNull String text, boolean commandEndMarkerFound, @NotNull List<StyleRange> styleRanges) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(styleRanges, "styleRanges");
/*    */     return new StyledCommandOutput(text, commandEndMarkerFound, styleRanges);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "StyledCommandOutput(text=" + this.text + ", commandEndMarkerFound=" + this.commandEndMarkerFound + ", styleRanges=" + this.styleRanges + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.commandEndMarkerFound);
/*    */     return result * 31 + this.styleRanges.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof StyledCommandOutput))
/*    */       return false; 
/*    */     StyledCommandOutput styledCommandOutput = (StyledCommandOutput)other;
/*    */     return !Intrinsics.areEqual(this.text, styledCommandOutput.text) ? false : ((this.commandEndMarkerFound != styledCommandOutput.commandEndMarkerFound) ? false : (!!Intrinsics.areEqual(this.styleRanges, styledCommandOutput.styleRanges)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\StyledCommandOutput.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */