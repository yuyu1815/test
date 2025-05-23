/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\025\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001BM\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\020\005\032\006\022\002\b\0030\006\022\n\020\007\032\006\022\002\b\0030\006\022\f\020\b\032\b\022\002\b\003\030\0010\006\022\016\b\002\020\t\032\b\022\002\b\003\030\0010\006¢\006\004\b\n\020\013J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\003HÆ\003J\r\020\026\032\006\022\002\b\0030\006HÆ\003J\r\020\027\032\006\022\002\b\0030\006HÆ\003J\017\020\030\032\b\022\002\b\003\030\0010\006HÆ\003J\017\020\031\032\b\022\002\b\003\030\0010\006HÆ\003JY\020\032\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\f\b\002\020\005\032\006\022\002\b\0030\0062\f\b\002\020\007\032\006\022\002\b\0030\0062\016\b\002\020\b\032\b\022\002\b\003\030\0010\0062\016\b\002\020\t\032\b\022\002\b\003\030\0010\006HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\037HÖ\001J\t\020 \032\0020!HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\025\020\005\032\006\022\002\b\0030\006¢\006\b\n\000\032\004\b\017\020\020R\025\020\007\032\006\022\002\b\0030\006¢\006\b\n\000\032\004\b\021\020\020R\027\020\b\032\b\022\002\b\003\030\0010\006¢\006\b\n\000\032\004\b\022\020\020R\027\020\t\032\b\022\002\b\003\030\0010\006¢\006\b\n\000\032\004\b\023\020\020¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecoration;", "", "backgroundHighlighter", "Lcom/intellij/openapi/editor/markup/RangeHighlighter;", "cornersHighlighter", "topInlay", "Lcom/intellij/openapi/editor/Inlay;", "bottomInlay", "commandToOutputInlay", "exitCodeInlay", "<init>", "(Lcom/intellij/openapi/editor/markup/RangeHighlighter;Lcom/intellij/openapi/editor/markup/RangeHighlighter;Lcom/intellij/openapi/editor/Inlay;Lcom/intellij/openapi/editor/Inlay;Lcom/intellij/openapi/editor/Inlay;Lcom/intellij/openapi/editor/Inlay;)V", "getBackgroundHighlighter", "()Lcom/intellij/openapi/editor/markup/RangeHighlighter;", "getCornersHighlighter", "getTopInlay", "()Lcom/intellij/openapi/editor/Inlay;", "getBottomInlay", "getCommandToOutputInlay", "getExitCodeInlay", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*     */ final class BlockDecoration
/*     */ {
/*     */   @NotNull
/*     */   private final RangeHighlighter backgroundHighlighter;
/*     */   @NotNull
/*     */   private final RangeHighlighter cornersHighlighter;
/*     */   @NotNull
/*     */   private final Inlay<?> topInlay;
/*     */   @NotNull
/*     */   private final Inlay<?> bottomInlay;
/*     */   @Nullable
/*     */   private final Inlay<?> commandToOutputInlay;
/*     */   @Nullable
/*     */   private final Inlay<?> exitCodeInlay;
/*     */   
/*     */   public BlockDecoration(@NotNull RangeHighlighter backgroundHighlighter, @NotNull RangeHighlighter cornersHighlighter, @NotNull Inlay<?> topInlay, @NotNull Inlay<?> bottomInlay, @Nullable Inlay<?> commandToOutputInlay, @Nullable Inlay<?> exitCodeInlay) {
/* 306 */     this.backgroundHighlighter = backgroundHighlighter;
/* 307 */     this.cornersHighlighter = cornersHighlighter;
/* 308 */     this.topInlay = topInlay;
/* 309 */     this.bottomInlay = bottomInlay;
/* 310 */     this.commandToOutputInlay = commandToOutputInlay;
/* 311 */     this.exitCodeInlay = exitCodeInlay; } @Nullable public final Inlay<?> getExitCodeInlay() { return this.exitCodeInlay; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final RangeHighlighter getBackgroundHighlighter() {
/*     */     return this.backgroundHighlighter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RangeHighlighter getCornersHighlighter() {
/*     */     return this.cornersHighlighter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Inlay<?> getTopInlay() {
/*     */     return this.topInlay;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Inlay<?> getBottomInlay() {
/*     */     return this.bottomInlay;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Inlay<?> getCommandToOutputInlay() {
/*     */     return this.commandToOutputInlay;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RangeHighlighter component1() {
/*     */     return this.backgroundHighlighter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RangeHighlighter component2() {
/*     */     return this.cornersHighlighter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Inlay<?> component3() {
/*     */     return this.topInlay;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Inlay<?> component4() {
/*     */     return this.bottomInlay;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Inlay<?> component5() {
/*     */     return this.commandToOutputInlay;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Inlay<?> component6() {
/*     */     return this.exitCodeInlay;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BlockDecoration copy(@NotNull RangeHighlighter backgroundHighlighter, @NotNull RangeHighlighter cornersHighlighter, @NotNull Inlay<?> topInlay, @NotNull Inlay<?> bottomInlay, @Nullable Inlay<?> commandToOutputInlay, @Nullable Inlay<?> exitCodeInlay) {
/*     */     Intrinsics.checkNotNullParameter(backgroundHighlighter, "backgroundHighlighter");
/*     */     Intrinsics.checkNotNullParameter(cornersHighlighter, "cornersHighlighter");
/*     */     Intrinsics.checkNotNullParameter(topInlay, "topInlay");
/*     */     Intrinsics.checkNotNullParameter(bottomInlay, "bottomInlay");
/*     */     return new BlockDecoration(backgroundHighlighter, cornersHighlighter, topInlay, bottomInlay, commandToOutputInlay, exitCodeInlay);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BlockDecoration(backgroundHighlighter=" + this.backgroundHighlighter + ", cornersHighlighter=" + this.cornersHighlighter + ", topInlay=" + this.topInlay + ", bottomInlay=" + this.bottomInlay + ", commandToOutputInlay=" + this.commandToOutputInlay + ", exitCodeInlay=" + this.exitCodeInlay + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.backgroundHighlighter.hashCode();
/*     */     result = result * 31 + this.cornersHighlighter.hashCode();
/*     */     result = result * 31 + this.topInlay.hashCode();
/*     */     result = result * 31 + this.bottomInlay.hashCode();
/*     */     result = result * 31 + ((this.commandToOutputInlay == null) ? 0 : this.commandToOutputInlay.hashCode());
/*     */     return result * 31 + ((this.exitCodeInlay == null) ? 0 : this.exitCodeInlay.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BlockDecoration))
/*     */       return false; 
/*     */     BlockDecoration blockDecoration = (BlockDecoration)other;
/*     */     return !Intrinsics.areEqual(this.backgroundHighlighter, blockDecoration.backgroundHighlighter) ? false : (!Intrinsics.areEqual(this.cornersHighlighter, blockDecoration.cornersHighlighter) ? false : (!Intrinsics.areEqual(this.topInlay, blockDecoration.topInlay) ? false : (!Intrinsics.areEqual(this.bottomInlay, blockDecoration.bottomInlay) ? false : (!Intrinsics.areEqual(this.commandToOutputInlay, blockDecoration.commandToOutputInlay) ? false : (!!Intrinsics.areEqual(this.exitCodeInlay, blockDecoration.exitCodeInlay))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockDecoration.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */