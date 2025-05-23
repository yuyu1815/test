/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.foundation.BorderColors;
/*    */ import org.jetbrains.jewel.foundation.GlobalColors;
/*    */ import org.jetbrains.jewel.foundation.OutlineColors;
/*    */ import org.jetbrains.jewel.foundation.TextColors;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002\032\n\020\000\032\0020\003*\0020\004\032\n\020\000\032\0020\005*\0020\006\032\n\020\000\032\0020\007*\0020\b¨\006\t"}, d2 = {"readFromLaF", "Lorg/jetbrains/jewel/foundation/GlobalColors;", "Lorg/jetbrains/jewel/foundation/GlobalColors$Companion;", "Lorg/jetbrains/jewel/foundation/BorderColors;", "Lorg/jetbrains/jewel/foundation/BorderColors$Companion;", "Lorg/jetbrains/jewel/foundation/TextColors;", "Lorg/jetbrains/jewel/foundation/TextColors$Companion;", "Lorg/jetbrains/jewel/foundation/OutlineColors;", "Lorg/jetbrains/jewel/foundation/OutlineColors$Companion;", "ide-laf-bridge"})
/*    */ public final class BridgeGlobalColorsKt {
/*    */   @NotNull
/*    */   public static final GlobalColors readFromLaF(@NotNull GlobalColors.Companion $this$readFromLaF) {
/* 14 */     Intrinsics.checkNotNullParameter($this$readFromLaF, "<this>"); return new GlobalColors(
/* 15 */         readFromLaF(BorderColors.Companion), 
/* 16 */         readFromLaF(OutlineColors.Companion), 
/* 17 */         readFromLaF(TextColors.Companion), 
/* 18 */         BridgeUtilsKt.retrieveColorOrUnspecified("Panel.background"), null);
/*    */   }
/*    */   @NotNull
/*    */   public static final BorderColors readFromLaF(@NotNull BorderColors.Companion $this$readFromLaF) {
/* 22 */     Intrinsics.checkNotNullParameter($this$readFromLaF, "<this>"); return new BorderColors(
/* 23 */         BridgeUtilsKt.toComposeColorOrUnspecified(JBColor.border()), 
/* 24 */         BridgeUtilsKt.toComposeColorOrUnspecified(DarculaUIUtil.getOutlineColor(true, true)), 
/* 25 */         BridgeUtilsKt.toComposeColorOrUnspecified(DarculaUIUtil.getOutlineColor(false, false)), null);
/*    */   }
/*    */   @NotNull
/*    */   public static final TextColors readFromLaF(@NotNull TextColors.Companion $this$readFromLaF) {
/* 29 */     Intrinsics.checkNotNullParameter($this$readFromLaF, "<this>");
/* 30 */     Intrinsics.checkNotNullExpressionValue(JBColor.foreground(), "foreground(...)"); return new TextColors(BridgeUtilsKt.toComposeColor(JBColor.foreground()), 
/* 31 */         BridgeUtilsKt.retrieveColorOrUnspecified("Label.selectedForeground"), 
/* 32 */         BridgeUtilsKt.retrieveColorOrUnspecified("Label.disabledForeground"), 
/* 33 */         BridgeUtilsKt.retrieveColorOrUnspecified("Label.infoForeground"), 
/* 34 */         BridgeUtilsKt.retrieveColorOrUnspecified("Label.errorForeground"), null);
/*    */   }
/*    */   @NotNull
/*    */   public static final OutlineColors readFromLaF(@NotNull OutlineColors.Companion $this$readFromLaF) {
/* 38 */     Intrinsics.checkNotNullParameter($this$readFromLaF, "<this>"); return new OutlineColors(
/* 39 */         BridgeUtilsKt.retrieveColorOrUnspecified("*.focusColor"), 
/* 40 */         BridgeUtilsKt.retrieveColorOrUnspecified("Component.warningFocusColor"), 
/* 41 */         BridgeUtilsKt.retrieveColorOrUnspecified("Component.errorFocusColor"), 
/* 42 */         BridgeUtilsKt.retrieveColorOrUnspecified("Component.inactiveWarningFocusColor"), 
/* 43 */         BridgeUtilsKt.retrieveColorOrUnspecified("Component.inactiveErrorFocusColor"), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\BridgeGlobalColorsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */