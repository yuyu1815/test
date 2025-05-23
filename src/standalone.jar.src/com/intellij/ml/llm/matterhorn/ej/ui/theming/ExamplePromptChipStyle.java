/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.theming;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0332\0020\001:\001\033B#\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\004\b\b\020\tJ\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\005HÆ\003J\t\020\022\032\0020\007HÆ\003J'\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\032HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;", "", "colors", "Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;", "metrics", "Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;Lorg/jetbrains/jewel/ui/icon/IconKey;)V", "getColors", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;", "getMetrics", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;", "getIconKey", "()Lorg/jetbrains/jewel/ui/icon/IconKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "standalone"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ExamplePromptChipStyle {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ExamplePromptChipColors colors;
/*    */   @NotNull
/*    */   private final ExamplePromptChipMetrics metrics;
/*    */   @NotNull
/*    */   private final IconKey iconKey;
/*    */   public static final int $stable = 8;
/*    */   
/* 16 */   public ExamplePromptChipStyle(@NotNull ExamplePromptChipColors colors, @NotNull ExamplePromptChipMetrics metrics, @NotNull IconKey iconKey) { this.colors = colors;
/* 17 */     this.metrics = metrics;
/* 18 */     this.iconKey = iconKey; } @NotNull public final ExamplePromptChipColors getColors() { return this.colors; } @NotNull public final ExamplePromptChipMetrics getMetrics() { return this.metrics; } @NotNull public final ExamplePromptChipColors component1() { return this.colors; } @NotNull public final ExamplePromptChipMetrics component2() { return this.metrics; } @NotNull public final IconKey component3() { return this.iconKey; } @NotNull public final ExamplePromptChipStyle copy(@NotNull ExamplePromptChipColors colors, @NotNull ExamplePromptChipMetrics metrics, @NotNull IconKey iconKey) { Intrinsics.checkNotNullParameter(colors, "colors"); Intrinsics.checkNotNullParameter(metrics, "metrics"); Intrinsics.checkNotNullParameter(iconKey, "iconKey"); return new ExamplePromptChipStyle(colors, metrics, iconKey); } @NotNull public final IconKey getIconKey() { return this.iconKey; }
/*    */   @NotNull public String toString() { return "ExamplePromptChipStyle(colors=" + this.colors + ", metrics=" + this.metrics + ", iconKey=" + this.iconKey + ")"; } public int hashCode() { result = this.colors.hashCode(); result = result * 31 + this.metrics.hashCode(); return result * 31 + this.iconKey.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ExamplePromptChipStyle))
/*    */       return false;  ExamplePromptChipStyle examplePromptChipStyle = (ExamplePromptChipStyle)other; return !Intrinsics.areEqual(this.colors, examplePromptChipStyle.colors) ? false : (!Intrinsics.areEqual(this.metrics, examplePromptChipStyle.metrics) ? false : (!!Intrinsics.areEqual(this.iconKey, examplePromptChipStyle.iconKey))); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\0058G¢\006\006\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle$Companion;", "", "<init>", "()V", "current", "Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;", "standalone"}) @SourceDebugExtension({"SMAP\nExamplePromptChipStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamplePromptChipStyle.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,75:1\n77#2:76\n*S KotlinDebug\n*F\n+ 1 ExamplePromptChipStyle.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle$Companion\n*L\n22#1:76\n*E\n"}) public static final class Companion
/*    */   {
/* 22 */     @Composable @JvmName(name = "getCurrent") @NotNull public final ExamplePromptChipStyle getCurrent(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1087064453); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1087064453, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.theming.ExamplePromptChipStyle.Companion.<get-current> (ExamplePromptChipStyle.kt:21)");  CompositionLocal compositionLocal = (CompositionLocal)ExamplePromptChipStyleKt.getJunieExamplePromptChipStyleProvider(); int $changed$iv = 6, $i$f$getCurrent = 0;
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
/* 76 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ExamplePromptChipStyle examplePromptChipStyle = (ExamplePromptChipStyle)object;
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd(); 
/*    */       $composer.endReplaceGroup();
/*    */       return examplePromptChipStyle; }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\theming\ExamplePromptChipStyle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */