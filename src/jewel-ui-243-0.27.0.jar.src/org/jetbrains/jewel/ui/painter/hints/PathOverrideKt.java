/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterHint;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\000\032\032\020\000\032\0020\0012\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¨\006\005"}, d2 = {"PathOverride", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "overrides", "", "", "ui"})
/*    */ public final class PathOverrideKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PainterHint PathOverride(@NotNull Map<String, String> overrides) {
/* 28 */     Intrinsics.checkNotNullParameter(overrides, "overrides"); return overrides.isEmpty() ? 
/* 29 */       (PainterHint)PainterHint.None : 
/*    */       
/* 31 */       (PainterHint)new PathOverrideImpl(overrides);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\PathOverrideKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */