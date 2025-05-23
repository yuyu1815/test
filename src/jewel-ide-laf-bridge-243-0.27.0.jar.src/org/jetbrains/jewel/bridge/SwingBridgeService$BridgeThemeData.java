/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.unit.TextUnitKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.bridge.theme.IntUiBridgeKt;
/*    */ import org.jetbrains.jewel.foundation.theme.ThemeDefinition;
/*    */ import org.jetbrains.jewel.ui.ComponentStyling;
/*    */ import org.jetbrains.jewel.ui.component.TypographyKt;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0262\0020\001:\001\026B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "", "themeDefinition", "Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "componentStyling", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "<init>", "(Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;)V", "getThemeDefinition", "()Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "getComponentStyling", "()Lorg/jetbrains/jewel/ui/ComponentStyling;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ide-laf-bridge"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class BridgeThemeData
/*    */ {
/*    */   public BridgeThemeData(@NotNull ThemeDefinition themeDefinition, @NotNull ComponentStyling componentStyling) {
/* 52 */     this.themeDefinition = themeDefinition; this.componentStyling = componentStyling; } @NotNull public final ThemeDefinition getThemeDefinition() { return this.themeDefinition; } @NotNull public final ComponentStyling getComponentStyling() { return this.componentStyling; } @NotNull public final ThemeDefinition component1() { return this.themeDefinition; } @NotNull public final ComponentStyling component2() { return this.componentStyling; } @NotNull public final BridgeThemeData copy(@NotNull ThemeDefinition themeDefinition, @NotNull ComponentStyling componentStyling) { Intrinsics.checkNotNullParameter(themeDefinition, "themeDefinition"); Intrinsics.checkNotNullParameter(componentStyling, "componentStyling"); return new BridgeThemeData(themeDefinition, componentStyling); } @NotNull public String toString() { return "BridgeThemeData(themeDefinition=" + this.themeDefinition + ", componentStyling=" + this.componentStyling + ")"; } public int hashCode() { result = this.themeDefinition.hashCode(); return result * 31 + this.componentStyling.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof BridgeThemeData)) return false;  BridgeThemeData bridgeThemeData = (BridgeThemeData)other; return !Intrinsics.areEqual(this.themeDefinition, bridgeThemeData.themeDefinition) ? false : (!!Intrinsics.areEqual(this.componentStyling, bridgeThemeData.componentStyling)); } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData$Companion;", "", "<init>", "()V", "DEFAULT", "Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "getDEFAULT", "()Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "ide-laf-bridge"}) public static final class Companion
/*    */   {
/* 54 */     @NotNull public final SwingBridgeService.BridgeThemeData getDEFAULT() { return SwingBridgeService.BridgeThemeData.DEFAULT; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final ThemeDefinition themeDefinition; @NotNull private final ComponentStyling componentStyling; public static final int $stable = 8; @NotNull private static final BridgeThemeData DEFAULT; static { Companion $this$DEFAULT_u24lambda_u240 = Companion; int $i$a$-run-SwingBridgeService$BridgeThemeData$Companion$DEFAULT$1 = 0;
/* 55 */     TextStyle textStyle = TypographyKt.copyWithSize-Ce1Lr_4$default(TextStyle.Companion.getDefault(), TextUnitKt.getSp(13), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388606, null);
/* 56 */     TextStyle monospaceTextStyle = TextStyle.copy-p1EtxEg$default(textStyle, 0L, 0L, null, null, null, (FontFamily)FontFamily.Companion.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
/* 57 */     ThemeDefinition themeDefinition = 
/* 58 */       IntUiBridgeKt.createBridgeThemeDefinition(
/* 59 */         textStyle, 
/* 60 */         monospaceTextStyle, 
/* 61 */         monospaceTextStyle);
/*    */ 
/*    */     
/* 64 */     DEFAULT = new BridgeThemeData(
/* 65 */         themeDefinition, 
/* 66 */         IntUiBridgeKt.createBridgeComponentStyling(themeDefinition)); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\SwingBridgeService$BridgeThemeData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */