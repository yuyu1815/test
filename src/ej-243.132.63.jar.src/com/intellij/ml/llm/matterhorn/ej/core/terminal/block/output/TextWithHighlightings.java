/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\t\020\r\032\0020\003HÆ\003J\017\020\016\032\b\022\004\022\0020\0060\005HÆ\003J#\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "", "text", "", "highlightings", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getHighlightings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*    */ public final class TextWithHighlightings
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final List<HighlightingInfo> highlightings;
/*    */   
/*    */   public TextWithHighlightings(@NotNull String text, @NotNull List<HighlightingInfo> highlightings) {
/* 26 */     this.text = text; this.highlightings = highlightings; } @NotNull public final String getText() { return this.text; } @NotNull public final List<HighlightingInfo> getHighlightings() { return this.highlightings; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<HighlightingInfo> component2() {
/*    */     return this.highlightings;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextWithHighlightings copy(@NotNull String text, @NotNull List<HighlightingInfo> highlightings) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(highlightings, "highlightings");
/*    */     return new TextWithHighlightings(text, highlightings);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TextWithHighlightings(text=" + this.text + ", highlightings=" + this.highlightings + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     return result * 31 + this.highlightings.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TextWithHighlightings))
/*    */       return false; 
/*    */     TextWithHighlightings textWithHighlightings = (TextWithHighlightings)other;
/*    */     return !Intrinsics.areEqual(this.text, textWithHighlightings.text) ? false : (!!Intrinsics.areEqual(this.highlightings, textWithHighlightings.highlightings));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TextWithHighlightings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */