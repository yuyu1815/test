/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.foundation.GlobalMetrics;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"readFromLaF", "Lorg/jetbrains/jewel/foundation/GlobalMetrics;", "Lorg/jetbrains/jewel/foundation/GlobalMetrics$Companion;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nBridgeGlobalMetrics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeGlobalMetrics.kt\norg/jetbrains/jewel/bridge/theme/BridgeGlobalMetricsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,15:1\n169#2:16\n169#2:17\n*S KotlinDebug\n*F\n+ 1 BridgeGlobalMetrics.kt\norg/jetbrains/jewel/bridge/theme/BridgeGlobalMetricsKt\n*L\n11#1:16\n13#1:17\n*E\n"})
/*    */ public final class BridgeGlobalMetricsKt {
/*    */   @NotNull
/*    */   public static final GlobalMetrics readFromLaF(@NotNull GlobalMetrics.Companion $this$readFromLaF) {
/* 10 */     Intrinsics.checkNotNullParameter($this$readFromLaF, "<this>");
/* 11 */     float $this$dp$iv = DarculaUIUtil.BW.getUnscaled(); int $i$f$getDp = 0;
/*    */     
/* 13 */     $this$dp$iv = JBUI.CurrentTheme.List.rowHeight() / JBUIScale.scale(1.0F); $i$f$getDp = 0;
/*    */ 
/*    */     
/* 16 */     return new GlobalMetrics(Dp.constructor-impl($this$dp$iv), 
/* 17 */         Dp.constructor-impl($this$dp$iv), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\BridgeGlobalMetricsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */