/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.theming;
/*    */ 
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\"\020\005\032\0020\0022\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\f"}, d2 = {"JunieExamplePromptChipStyleProvider", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;", "getJunieExamplePromptChipStyleProvider", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ExamplePromptChipStyle", "isDark", "", "metrics", "Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "standalone"})
/*    */ public final class ExamplePromptChipStyleKt {
/*    */   @NotNull
/* 12 */   public static final ProvidableCompositionLocal<ExamplePromptChipStyle> getJunieExamplePromptChipStyleProvider() { return JunieExamplePromptChipStyleProvider; } @NotNull
/* 13 */   private static final ProvidableCompositionLocal<ExamplePromptChipStyle> JunieExamplePromptChipStyleProvider = CompositionLocalKt.staticCompositionLocalOf(ExamplePromptChipStyleKt::JunieExamplePromptChipStyleProvider$lambda$0); private static final ExamplePromptChipStyle JunieExamplePromptChipStyleProvider$lambda$0() { throw new IllegalStateException("CompositionLocal ExamplePromptChipStyle not provided".toString()); }
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
/*    */   @NotNull
/*    */   public static final ExamplePromptChipStyle ExamplePromptChipStyle(boolean isDark, @NotNull ExamplePromptChipMetrics metrics, @NotNull IconKey iconKey) {
/* 31 */     Intrinsics.checkNotNullParameter(metrics, "metrics"); Intrinsics.checkNotNullParameter(iconKey, "iconKey"); return new ExamplePromptChipStyle(
/* 32 */         isDark ? ExamplePromptChipColors.Companion.getDARK() : ExamplePromptChipColors.Companion.getLIGHT(), 
/* 33 */         metrics, 
/* 34 */         iconKey);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\theming\ExamplePromptChipStyleKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */