/*    */ package org.jetbrains.jewel.foundation;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\005"}, d2 = {"LocalGlobalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/foundation/GlobalColors;", "getLocalGlobalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "foundation"})
/*    */ public final class GlobalColorsKt
/*    */ {
/*    */   @NotNull
/* 49 */   private static final ProvidableCompositionLocal<GlobalColors> LocalGlobalColors = CompositionLocalKt.staticCompositionLocalOf(GlobalColorsKt::LocalGlobalColors$lambda$0); @NotNull public static final ProvidableCompositionLocal<GlobalColors> getLocalGlobalColors() { return LocalGlobalColors; } private static final GlobalColors LocalGlobalColors$lambda$0() {
/* 50 */     throw new IllegalStateException("No GlobalColors provided. Have you forgotten the theme?".toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\GlobalColorsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */