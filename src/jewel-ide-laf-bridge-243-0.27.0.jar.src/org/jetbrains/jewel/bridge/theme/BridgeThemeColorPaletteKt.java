/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import java.util.Map;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\b\004\032\n\020\b\032\0020\005*\0020\t\032\034\020\n\032\016\022\004\022\0020\f\022\004\022\0020\0040\0132\006\020\r\032\0020\fH\002\032\025\020\016\032\0020\0042\006\020\r\032\0020\fH\002¢\006\002\020\017\"\023\020\000\032\0070\001¢\006\002\b\002X\004¢\006\002\n\000\"\027\020\003\032\004\030\0010\004*\0020\0058F¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "windowsPopupBorder", "Landroidx/compose/ui/graphics/Color;", "Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "getWindowsPopupBorder", "(Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;)Landroidx/compose/ui/graphics/Color;", "readFromLaF", "Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette$Companion;", "readPaletteColors", "", "", "colorName", "readPaletteColor", "(Ljava/lang/String;)J", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nBridgeThemeColorPalette.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeThemeColorPalette.kt\norg/jetbrains/jewel/bridge/theme/BridgeThemeColorPaletteKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,87:1\n696#2:88\n*S KotlinDebug\n*F\n+ 1 BridgeThemeColorPalette.kt\norg/jetbrains/jewel/bridge/theme/BridgeThemeColorPaletteKt\n*L\n35#1:88\n*E\n"})
/*    */ public final class BridgeThemeColorPaletteKt {
/*    */   @NotNull
/* 10 */   private static final Logger logger = Logger.getInstance("BridgeThemeColorPalette"); static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance("BridgeThemeColorPalette"), "getInstance(...)"); }
/*    */    @Nullable
/*    */   public static final Color getWindowsPopupBorder(@NotNull ThemeColorPalette $this$windowsPopupBorder) {
/* 13 */     Intrinsics.checkNotNullParameter($this$windowsPopupBorder, "<this>"); return $this$windowsPopupBorder.lookup-ijrfgN4("windowsPopupBorder");
/*    */   } @NotNull
/*    */   public static final ThemeColorPalette readFromLaF(@NotNull ThemeColorPalette.Companion $this$readFromLaF) {
/* 16 */     Intrinsics.checkNotNullParameter($this$readFromLaF, "<this>"); Map<String, Color> gray = readPaletteColors("Gray");
/* 17 */     Map<String, Color> blue = readPaletteColors("Blue");
/* 18 */     Map<String, Color> green = readPaletteColors("Green");
/* 19 */     Map<String, Color> red = readPaletteColors("Red");
/* 20 */     Map<String, Color> yellow = readPaletteColors("Yellow");
/* 21 */     Map<String, Color> orange = readPaletteColors("Orange");
/* 22 */     Map<String, Color> purple = readPaletteColors("Purple");
/* 23 */     Map<String, Color> teal = readPaletteColors("Teal");
/* 24 */     long windowsPopupBorder = readPaletteColor("windowsPopupBorder");
/*    */     
/* 26 */     Map<String, Color> map1 = MapsKt.createMapBuilder(), $this$readFromLaF_u24lambda_u240 = map1; int $i$a$-buildMap-BridgeThemeColorPaletteKt$readFromLaF$rawMap$1 = 0;
/* 27 */     $this$readFromLaF_u24lambda_u240.putAll(gray);
/* 28 */     $this$readFromLaF_u24lambda_u240.putAll(blue);
/* 29 */     $this$readFromLaF_u24lambda_u240.putAll(green);
/* 30 */     $this$readFromLaF_u24lambda_u240.putAll(red);
/* 31 */     $this$readFromLaF_u24lambda_u240.putAll(yellow);
/* 32 */     $this$readFromLaF_u24lambda_u240.putAll(orange);
/* 33 */     $this$readFromLaF_u24lambda_u240.putAll(purple);
/* 34 */     $this$readFromLaF_u24lambda_u240.putAll(teal);
/* 35 */     long $this$isSpecified$iv = windowsPopupBorder; int $i$f$isSpecified-8_81llA = 0;
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
/* 88 */     if (($this$isSpecified$iv != 16L))
/*    */       $this$readFromLaF_u24lambda_u240.put("windowsPopupBorder", Color.box-impl(windowsPopupBorder)); 
/*    */     Map rawMap = MapsKt.build(map1);
/*    */     return new ThemeColorPalette(CollectionsKt.toList(gray.values()), CollectionsKt.toList(blue.values()), CollectionsKt.toList(green.values()), CollectionsKt.toList(red.values()), CollectionsKt.toList(yellow.values()), CollectionsKt.toList(orange.values()), CollectionsKt.toList(purple.values()), CollectionsKt.toList(teal.values()), rawMap);
/*    */   }
/*    */   
/*    */   private static final Map<String, Color> readPaletteColors(String colorName) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getUiDefaults : ()Ljavax/swing/UIDefaults;
/*    */     //   3: astore_1
/*    */     //   4: aload_1
/*    */     //   5: invokevirtual keySet : ()Ljava/util/Set;
/*    */     //   8: dup
/*    */     //   9: ldc '<get-keys>(...)'
/*    */     //   11: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   14: astore_2
/*    */     //   15: aload_0
/*    */     //   16: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   21: astore_3
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual length : ()I
/*    */     //   26: istore #4
/*    */     //   28: aload_2
/*    */     //   29: checkcast java/lang/Iterable
/*    */     //   32: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*    */     //   35: ldc java/lang/String
/*    */     //   37: invokestatic filterIsInstance : (Lkotlin/sequences/Sequence;Ljava/lang/Class;)Lkotlin/sequences/Sequence;
/*    */     //   40: aload_3
/*    */     //   41: <illegal opcode> invoke : (Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*    */     //   46: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*    */     //   49: iload #4
/*    */     //   51: <illegal opcode> invoke : (I)Lkotlin/jvm/functions/Function1;
/*    */     //   56: invokestatic mapNotNull : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*    */     //   59: invokestatic maxOrNull : (Lkotlin/sequences/Sequence;)Ljava/lang/Comparable;
/*    */     //   62: checkcast java/lang/Integer
/*    */     //   65: dup
/*    */     //   66: ifnull -> 75
/*    */     //   69: invokevirtual intValue : ()I
/*    */     //   72: goto -> 87
/*    */     //   75: pop
/*    */     //   76: new java/util/TreeMap
/*    */     //   79: dup
/*    */     //   80: invokespecial <init> : ()V
/*    */     //   83: checkcast java/util/Map
/*    */     //   86: areturn
/*    */     //   87: istore #5
/*    */     //   89: invokestatic createMapBuilder : ()Ljava/util/Map;
/*    */     //   92: astore #6
/*    */     //   94: aload #6
/*    */     //   96: astore #7
/*    */     //   98: iconst_0
/*    */     //   99: istore #8
/*    */     //   101: iconst_1
/*    */     //   102: istore #9
/*    */     //   104: iload #9
/*    */     //   106: iload #5
/*    */     //   108: if_icmpgt -> 201
/*    */     //   111: aload_3
/*    */     //   112: iload #9
/*    */     //   114: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*    */     //   119: astore #10
/*    */     //   121: aload_1
/*    */     //   122: aload #10
/*    */     //   124: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   127: astore #11
/*    */     //   129: aload #11
/*    */     //   131: instanceof java/awt/Color
/*    */     //   134: ifeq -> 145
/*    */     //   137: aload #11
/*    */     //   139: checkcast java/awt/Color
/*    */     //   142: goto -> 146
/*    */     //   145: aconst_null
/*    */     //   146: astore #12
/*    */     //   148: aload #12
/*    */     //   150: ifnonnull -> 170
/*    */     //   153: getstatic org/jetbrains/jewel/bridge/theme/BridgeThemeColorPaletteKt.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   156: aload_3
/*    */     //   157: iload #9
/*    */     //   159: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*    */     //   164: invokevirtual error : (Ljava/lang/String;)V
/*    */     //   167: goto -> 188
/*    */     //   170: aload #7
/*    */     //   172: aload #10
/*    */     //   174: aload #12
/*    */     //   176: invokestatic toComposeColor : (Ljava/awt/Color;)J
/*    */     //   179: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*    */     //   182: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   187: pop
/*    */     //   188: iload #9
/*    */     //   190: iload #5
/*    */     //   192: if_icmpeq -> 201
/*    */     //   195: iinc #9, 1
/*    */     //   198: goto -> 111
/*    */     //   201: nop
/*    */     //   202: aload #6
/*    */     //   204: invokestatic build : (Ljava/util/Map;)Ljava/util/Map;
/*    */     //   207: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #52	-> 0
/*    */     //   #53	-> 4
/*    */     //   #54	-> 15
/*    */     //   #55	-> 22
/*    */     //   #58	-> 28
/*    */     //   #59	-> 32
/*    */     //   #60	-> 35
/*    */     //   #61	-> 40
/*    */     //   #62	-> 49
/*    */     //   #66	-> 59
/*    */     //   #58	-> 65
/*    */     //   #66	-> 76
/*    */     //   #58	-> 87
/*    */     //   #57	-> 87
/*    */     //   #68	-> 89
/*    */     //   #69	-> 101
/*    */     //   #70	-> 111
/*    */     //   #71	-> 121
/*    */     //   #72	-> 148
/*    */     //   #73	-> 153
/*    */     //   #74	-> 167
/*    */     //   #77	-> 170
/*    */     //   #69	-> 188
/*    */     //   #79	-> 201
/*    */     //   #68	-> 202
/*    */     //   #68	-> 207
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   121	66	10	key	Ljava/lang/String;
/*    */     //   148	39	12	value	Ljava/awt/Color;
/*    */     //   104	97	9	i	I
/*    */     //   101	101	8	$i$a$-buildMap-BridgeThemeColorPaletteKt$readPaletteColors$1	I
/*    */     //   98	104	7	$this$readPaletteColors_u24lambda_u243	Ljava/util/Map;
/*    */     //   4	204	1	defaults	Ljavax/swing/UIDefaults;
/*    */     //   15	193	2	allKeys	Ljava/util/Set;
/*    */     //   22	186	3	colorNameKeyPrefix	Ljava/lang/String;
/*    */     //   28	180	4	colorNameKeyPrefixLength	I
/*    */     //   89	119	5	lastColorIndex	I
/*    */     //   0	208	0	colorName	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private static final boolean readPaletteColors$lambda$1(String $colorNameKeyPrefix, String it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return StringsKt.startsWith$default(it, $colorNameKeyPrefix, false, 2, null);
/*    */   }
/*    */   
/*    */   private static final Integer readPaletteColors$lambda$2(int $colorNameKeyPrefixLength, String it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     Intrinsics.checkNotNullExpressionValue(it.substring($colorNameKeyPrefixLength), "substring(...)");
/*    */     String afterName = it.substring($colorNameKeyPrefixLength);
/*    */     return StringsKt.toIntOrNull(afterName);
/*    */   }
/*    */   
/*    */   private static final long readPaletteColor(String colorName) {
/*    */     UIDefaults defaults = IntUiBridgeKt.getUiDefaults();
/*    */     String colorNameKey = "ColorPalette." + colorName;
/*    */     Object object = defaults.get(colorNameKey);
/*    */     (object instanceof Color) ? (Color)object : null;
/*    */     return (((object instanceof Color) ? (Color)object : null) != null) ? BridgeUtilsKt.toComposeColor((object instanceof Color) ? (Color)object : null) : Color.Companion.getUnspecified-0d7_KjU();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\BridgeThemeColorPaletteKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */