/*     */ package org.jetbrains.jewel.ui.painter.hints;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.math.MathKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\002\0326\020\000\032\0020\001*\0020\0022\022\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0050\0042\024\b\002\020\006\032\016\022\004\022\0020\005\022\004\022\0020\0050\004H\000\032(\020\007\032\0020\001*\0020\0022\006\020\b\032\0020\t2\022\020\n\032\016\022\004\022\0020\005\022\004\022\0020\0050\004H\002\032\032\020\013\032\004\030\0010\0052\006\020\f\032\0020\t2\006\020\r\032\0020\016H\002\032\032\020\017\032\004\030\0010\0052\006\020\020\032\0020\t2\006\020\r\032\0020\016H\002\032\032\020\021\032\0020\0222\022\020\023\032\016\022\004\022\0020\005\022\004\022\0020\0050\004¨\006\024"}, d2 = {"patchPalette", "", "Lorg/w3c/dom/Element;", "fill", "", "Landroidx/compose/ui/graphics/Color;", "stroke", "patchColorAttribute", "attrName", "", "pattern", "tryParseColor", "color", "alpha", "", "fromHexOrNull", "rawColor", "ColorBasedPaletteReplacement", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "paletteMap", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nColorBasedPaletteReplacement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorBasedPaletteReplacement.kt\norg/jetbrains/jewel/ui/painter/hints/ColorBasedPaletteReplacementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
/*     */ public final class ColorBasedPaletteReplacementKt
/*     */ {
/*     */   public static final void patchPalette(@NotNull Element $this$patchPalette, @NotNull Map<Color, Color> fill, @NotNull Map<Color, Color> stroke) {
/*  22 */     Intrinsics.checkNotNullParameter($this$patchPalette, "<this>"); Intrinsics.checkNotNullParameter(fill, "fill"); Intrinsics.checkNotNullParameter(stroke, "stroke"); patchColorAttribute($this$patchPalette, "fill", fill);
/*  23 */     patchColorAttribute($this$patchPalette, "stroke", stroke);
/*     */     
/*  25 */     NodeList nodes = $this$patchPalette.getChildNodes();
/*  26 */     int length = nodes.getLength();
/*  27 */     for (int i = 0; i < length; i++) {
/*  28 */       Node item = nodes.item(i);
/*  29 */       if (item instanceof Element) {
/*  30 */         patchPalette((Element)item, fill, stroke);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void patchColorAttribute(Element $this$patchColorAttribute, String attrName, Map pattern) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokeinterface getAttribute : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   7: astore_3
/*     */     //   8: aload_0
/*     */     //   9: aload_1
/*     */     //   10: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   15: invokeinterface getAttribute : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   20: astore #4
/*     */     //   22: aload_3
/*     */     //   23: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   26: aload_3
/*     */     //   27: checkcast java/lang/CharSequence
/*     */     //   30: invokeinterface length : ()I
/*     */     //   35: ifle -> 42
/*     */     //   38: iconst_1
/*     */     //   39: goto -> 43
/*     */     //   42: iconst_0
/*     */     //   43: ifeq -> 179
/*     */     //   46: aload #4
/*     */     //   48: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   51: aload #4
/*     */     //   53: invokestatic toFloatOrNull : (Ljava/lang/String;)Ljava/lang/Float;
/*     */     //   56: dup
/*     */     //   57: ifnull -> 66
/*     */     //   60: invokevirtual floatValue : ()F
/*     */     //   63: goto -> 68
/*     */     //   66: pop
/*     */     //   67: fconst_1
/*     */     //   68: fstore #5
/*     */     //   70: aload_3
/*     */     //   71: fload #5
/*     */     //   73: invokestatic tryParseColor : (Ljava/lang/String;F)Landroidx/compose/ui/graphics/Color;
/*     */     //   76: dup
/*     */     //   77: ifnull -> 86
/*     */     //   80: invokevirtual unbox-impl : ()J
/*     */     //   83: goto -> 88
/*     */     //   86: pop
/*     */     //   87: return
/*     */     //   88: lstore #6
/*     */     //   90: aload_2
/*     */     //   91: lload #6
/*     */     //   93: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   96: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   101: checkcast androidx/compose/ui/graphics/Color
/*     */     //   104: dup
/*     */     //   105: ifnull -> 114
/*     */     //   108: invokevirtual unbox-impl : ()J
/*     */     //   111: goto -> 116
/*     */     //   114: pop
/*     */     //   115: return
/*     */     //   116: lstore #8
/*     */     //   118: aload_0
/*     */     //   119: aload_1
/*     */     //   120: lload #8
/*     */     //   122: fconst_1
/*     */     //   123: fconst_0
/*     */     //   124: fconst_0
/*     */     //   125: fconst_0
/*     */     //   126: bipush #14
/*     */     //   128: aconst_null
/*     */     //   129: invokestatic copy-wmQWz5c$default : (JFFFFILjava/lang/Object;)J
/*     */     //   132: invokestatic toRgbaHexString-8_81llA : (J)Ljava/lang/String;
/*     */     //   135: invokeinterface setAttribute : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   140: lload #8
/*     */     //   142: invokestatic getAlpha-impl : (J)F
/*     */     //   145: fload #5
/*     */     //   147: fcmpg
/*     */     //   148: ifne -> 155
/*     */     //   151: iconst_1
/*     */     //   152: goto -> 156
/*     */     //   155: iconst_0
/*     */     //   156: ifne -> 179
/*     */     //   159: aload_0
/*     */     //   160: aload_1
/*     */     //   161: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   166: lload #8
/*     */     //   168: invokestatic getAlpha-impl : (J)F
/*     */     //   171: invokestatic valueOf : (F)Ljava/lang/String;
/*     */     //   174: invokeinterface setAttribute : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   179: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 0
/*     */     //   #37	-> 8
/*     */     //   #39	-> 22
/*     */     //   #39	-> 43
/*     */     //   #40	-> 46
/*     */     //   #41	-> 70
/*     */     //   #42	-> 90
/*     */     //   #43	-> 118
/*     */     //   #44	-> 140
/*     */     //   #45	-> 159
/*     */     //   #48	-> 179
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   70	109	5	alpha	F
/*     */     //   90	89	6	originalColor	J
/*     */     //   118	61	8	newColor	J
/*     */     //   8	172	3	color	Ljava/lang/String;
/*     */     //   22	158	4	opacity	Ljava/lang/String;
/*     */     //   0	180	0	$this$patchColorAttribute	Lorg/w3c/dom/Element;
/*     */     //   0	180	1	attrName	Ljava/lang/String;
/*     */     //   0	180	2	pattern	Ljava/util/Map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Color tryParseColor(String color, float alpha) {
/*  51 */     Intrinsics.checkNotNullExpressionValue(color.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String rawColor = color.toLowerCase(Locale.ROOT);
/*  52 */     if (StringsKt.startsWith$default(rawColor, "#", false, 2, null) && rawColor.length() - 1 <= 8) {
/*  53 */       return fromHexOrNull(rawColor, alpha);
/*     */     }
/*  55 */     return null;
/*     */   }
/*     */   
/*     */   private static final Color fromHexOrNull(String rawColor, float alpha) {
/*  59 */     int startPos = 
/*  60 */       StringsKt.startsWith$default(rawColor, "#", false, 2, null) ? 
/*  61 */       1 : (
/*  62 */       StringsKt.startsWith$default(rawColor, "0x", false, 2, null) ? 
/*  63 */       2 : 
/*     */       
/*  65 */       0);
/*     */     
/*  67 */     int length = rawColor.length() - startPos;
/*  68 */     Float float_ = Float.valueOf(alpha); float it = float_.floatValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     int $i$a$-takeIf-ColorBasedPaletteReplacementKt$fromHexOrNull$alphaOverride$1 = 0; it = ((Number)((!((it == 1.0F) ? 1 : 0)) ? float_ : null)).floatValue(); int $i$a$-let-ColorBasedPaletteReplacementKt$fromHexOrNull$alphaOverride$2 = 0;
/*     */     (!((it == 1.0F) ? 1 : 0)) ? float_ : null;
/*     */     Integer alphaOverride = (((!((it == 1.0F) ? 1 : 0)) ? float_ : null) != null) ? Integer.valueOf(MathKt.roundToInt(it * 'ÿ')) : null;
/*     */     switch (length) {
/*     */       case 3:
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos, startPos + 1), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 1, startPos + 2), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 2, startPos + 3), "substring(...)");
/*     */       case 4:
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos, startPos + 1), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 1, startPos + 2), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 2, startPos + 3), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 3, startPos + 4), "substring(...)");
/*     */       case 6:
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos, startPos + 2), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 2, startPos + 4), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 4, startPos + 6), "substring(...)");
/*     */       case 8:
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos, startPos + 2), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 2, startPos + 4), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 4, startPos + 6), "substring(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(rawColor.substring(startPos + 6, startPos + 8), "substring(...)");
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final PainterHint ColorBasedPaletteReplacement(@NotNull Map<Color, Color> paletteMap) {
/*     */     Intrinsics.checkNotNullParameter(paletteMap, "paletteMap");
/*     */     return paletteMap.isEmpty() ? (PainterHint)PainterHint.None : (PainterHint)new ColorBasedReplacementPainterSvgPatchHint(paletteMap);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\ColorBasedPaletteReplacementKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */