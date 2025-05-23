/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.LinkColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.LinkIcons;
/*    */ import org.jetbrains.jewel.ui.component.styling.LinkStyle;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icons.AllIconsKeys;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readLinkStyle", "Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeLink.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeLinkKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,64:1\n708#2:65\n696#2:66\n708#2:67\n696#2:68\n708#2:69\n696#2:70\n708#2:71\n696#2:72\n708#2:73\n696#2:74\n149#3:75\n149#3:76\n149#3:77\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeLink.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeLinkKt\n*L\n18#1:65\n18#1:66\n26#1:67\n26#1:68\n31#1:69\n31#1:70\n35#1:71\n35#1:72\n39#1:73\n39#1:74\n51#1:75\n53#1:76\n54#1:77\n*E\n"})
/*    */ public final class IntUiBridgeLinkKt {
/*    */   @NotNull
/*    */   public static final LinkStyle readLinkStyle() {
/* 18 */     long $this$takeOrElse_u2dDxMtmZc$iv = BridgeUtilsKt.retrieveColorOrUnspecified("Link.activeForeground"); int $i$f$takeOrElse-DxMtmZc = 0;
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
/* 65 */     long $this$isSpecified$iv$iv = $this$takeOrElse_u2dDxMtmZc$iv; int $i$f$isSpecified-8_81llA = 0;
/* 66 */     if (($this$isSpecified$iv$iv != 16L)) {  } else { int $i$a$-takeOrElse-DxMtmZc-IntUiBridgeLinkKt$readLinkStyle$normalContent$1 = 0; }
/* 67 */      long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("Link.activeForeground"); long l1 = BridgeUtilsKt.retrieveColorOrUnspecified("Link.disabledForeground"); int i = 0; long l2 = l1; int j = 0;
/* 68 */     if ((l2 != 16L)) {  } else { long l9 = normalContent; int $i$a$-takeOrElse-DxMtmZc-IntUiBridgeLinkKt$readLinkStyle$colors$1 = 0; long l10 = BridgeUtilsKt.retrieveColorOrUnspecified("Label.disabledForeground"); }
/* 69 */      l1 = BridgeUtilsKt.retrieveColorOrUnspecified("Link.pressedForeground"); i = 0; l2 = l1; j = 0;
/* 70 */     if ((l2 != 16L)) {  } else { long l11 = normalContent, l10 = l10, l9 = l9; int $i$a$-takeOrElse-DxMtmZc-IntUiBridgeLinkKt$readLinkStyle$colors$2 = 0; long l12 = BridgeUtilsKt.retrieveColorOrUnspecified("link.pressed.foreground"); }
/* 71 */      l1 = BridgeUtilsKt.retrieveColorOrUnspecified("Link.hoverForeground"); i = 0; l2 = l1; j = 0;
/* 72 */     if ((l2 != 16L)) {  } else { long l12 = l12, l11 = l11, l10 = l10, l9 = l9; int $i$a$-takeOrElse-DxMtmZc-IntUiBridgeLinkKt$readLinkStyle$colors$3 = 0; long l13 = BridgeUtilsKt.retrieveColorOrUnspecified("link.hover.foreground"); }
/* 73 */      l1 = BridgeUtilsKt.retrieveColorOrUnspecified("Link.visitedForeground"); i = 0; l2 = l1; j = 0;
/* 74 */     if ((l2 != 16L)) {  } else { long l13 = l13, l12 = l12, l11 = l11, l10 = l10, l9 = l9; int $i$a$-takeOrElse-DxMtmZc-IntUiBridgeLinkKt$readLinkStyle$colors$4 = 0; long l14 = BridgeUtilsKt.retrieveColorOrUnspecified("link.visited.foreground"); }
/* 75 */      DefaultConstructorMarker defaultConstructorMarker = null; long l3 = l14, l4 = l13, l5 = l12, l6 = l11, l7 = l10, l8 = l9; LinkColors colors = new LinkColors(l8, l7, l6, l5, l4, l3, defaultConstructorMarker); int $this$dp$iv = 4, $i$f$getDp = 0; $this$dp$iv = 4; $i$f$getDp = 0; $this$dp$iv = 16; $i$f$getDp = 0; $this$dp$iv = 16; $i$f$getDp = 0; return new LinkStyle(colors, new LinkMetrics(BridgeUtilsKt.retrieveArcAsCornerSizeOrDefault("ide.link.button.focus.round.arc", CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl($this$dp$iv))), 
/* 76 */           Dp.constructor-impl($this$dp$iv), DpKt.DpSize-YgX7TsA(
/* 77 */             Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)), null), new LinkIcons((IconKey)AllIconsKeys.General.INSTANCE.getChevronDown(), (IconKey)AllIconsKeys.Ide.INSTANCE.getExternal_link_arrow()), LinkUnderlineBehavior.ShowOnHover);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeLinkKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */