/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\005"}, d2 = {"LocalPainterHintsProvider", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/painter/PainterHintsProvider;", "getLocalPainterHintsProvider", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ui"})
/*    */ public final class PainterHintsProviderKt
/*    */ {
/*    */   @NotNull
/* 37 */   private static final ProvidableCompositionLocal<PainterHintsProvider> LocalPainterHintsProvider = CompositionLocalKt.staticCompositionLocalOf(PainterHintsProviderKt::LocalPainterHintsProvider$lambda$0); @NotNull public static final ProvidableCompositionLocal<PainterHintsProvider> getLocalPainterHintsProvider() { return LocalPainterHintsProvider; } private static final PainterHintsProvider LocalPainterHintsProvider$lambda$0() {
/* 38 */     return CommonPainterHintsProvider.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterHintsProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */