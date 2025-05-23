/*     */ package org.jetbrains.jewel.bridge;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.foundation.shape.CornerSizeKt;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.style.BaselineShift;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextGeometricTransform;
/*     */ import androidx.compose.ui.text.style.TextIndent;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*     */ import com.intellij.openapi.editor.colors.impl.EditorColorsManagerImpl;
/*     */ import com.intellij.ui.JBColor;
/*     */ import com.intellij.util.ui.JBDimension;
/*     */ import com.intellij.util.ui.JBFont;
/*     */ import com.intellij.util.ui.JBInsets;
/*     */ import com.intellij.util.ui.JBValue;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.Insets;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import javax.swing.UIManager;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000¬\001\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\007\n\002\020 \n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\004\n\002\030\002\n\000\032\017\020\003\032\0020\004*\0020\005¢\006\002\020\006\032\021\020\007\032\0020\004*\004\030\0010\005¢\006\002\020\006\032\035\020\b\032\0020\0042\006\020\t\032\0020\n2\006\020\013\032\0020\004¢\006\004\b\f\020\r\032-\020\b\032\0020\0042\006\020\t\032\0020\n2\006\020\016\032\0020\0172\006\020\013\032\0020\0042\006\020\020\032\0020\004¢\006\004\b\021\020\022\032\020\020\023\032\004\030\0010\0042\006\020\t\032\0020\n\032\023\020\024\032\0020\0042\006\020\t\032\0020\n¢\006\002\020\025\032%\020\026\032\b\022\004\022\0020\0040\0272\022\020\030\032\n\022\006\b\001\022\0020\n0\031\"\0020\n¢\006\002\020\032\0325\020\033\032\0020\034*\b\022\004\022\0020\0040\0272\b\b\002\020\035\032\0020\0362\b\b\002\020\037\032\0020\0362\b\b\002\020 \032\0020!¢\006\004\b\"\020#\032!\020$\032\0020%2\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010%¢\006\004\b&\020'\032\023\020(\032\0020%2\006\020\t\032\0020\n¢\006\002\020)\032\032\020*\032\0020+2\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010+\032\n\020,\032\0020+*\0020-\032\n\020,\032\0020+*\0020.\032\017\020/\032\00200*\00201¢\006\002\0202\032\017\020/\032\00200*\00203¢\006\002\0204\032\016\0205\032\002062\006\020\t\032\0020\n\032\026\0207\032\002062\006\020\t\032\0020\n2\006\020\013\032\00206\032\037\0208\032\002062\022\020\030\032\n\022\006\b\001\022\0020\n0\031\"\0020\n¢\006\002\0209\032I\020:\032\0020;2\006\020<\032\0020\n2\n\b\002\020=\032\004\030\0010\n2\b\b\002\020>\032\0020?2\b\b\002\020@\032\0020\0172\b\b\002\020A\032\0020B2\b\b\002\020C\032\0020?¢\006\004\bD\020E\032G\020:\032\0020;2\006\020\t\032\0020\n2\b\b\002\020F\032\0020\0042\b\b\002\020>\032\0020?2\b\b\002\020@\032\0020\0172\b\b\002\020A\032\0020B2\b\b\002\020C\032\0020?¢\006\004\bG\020H\032\034\020M\032\0020?*\0020?2\006\020N\032\0020\036H\002¢\006\004\bO\020P\032\034\020Q\032\0020?*\0020?2\006\020N\032\0020\036H\002¢\006\004\bR\020P\032\020\020S\032\0020T2\006\020U\032\0020TH\000\032\b\020V\032\0020\017H\000\032\b\020W\032\0020\nH\000\032\006\020X\032\0020Y\"\023\020\000\032\0070\001¢\006\002\b\002X\004¢\006\002\n\000\"\025\020I\032\0020%*\0020J8F¢\006\006\032\004\bK\020L¨\006Z"}, d2 = {"logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "toComposeColor", "Landroidx/compose/ui/graphics/Color;", "Ljava/awt/Color;", "(Ljava/awt/Color;)J", "toComposeColorOrUnspecified", "retrieveColor", "key", "", "default", "retrieveColor-4WTKRHQ", "(Ljava/lang/String;J)J", "isDark", "", "defaultDark", "retrieveColor-0YGnOg8", "(Ljava/lang/String;ZJJ)J", "retrieveColorOrNull", "retrieveColorOrUnspecified", "(Ljava/lang/String;)J", "retrieveColorsOrUnspecified", "", "keys", "", "([Ljava/lang/String;)Ljava/util/List;", "createVerticalBrush", "Landroidx/compose/ui/graphics/Brush;", "startY", "", "endY", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "createVerticalBrush-8A-3gB4", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "retrieveIntAsDp", "Landroidx/compose/ui/unit/Dp;", "retrieveIntAsDp-3F_vd3o", "(Ljava/lang/String;Landroidx/compose/ui/unit/Dp;)F", "retrieveIntAsDpOrUnspecified", "(Ljava/lang/String;)F", "retrieveInsetsAsPaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "toPaddingValues", "Ljava/awt/Insets;", "Lcom/intellij/util/ui/JBInsets;", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Ljava/awt/Dimension;", "(Ljava/awt/Dimension;)J", "Lcom/intellij/util/ui/JBDimension;", "(Lcom/intellij/util/ui/JBDimension;)J", "retrieveArcAsCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "retrieveArcAsCornerSizeOrDefault", "retrieveArcAsCornerSizeWithFallbacks", "([Ljava/lang/String;)Landroidx/compose/foundation/shape/CornerSize;", "retrieveTextStyle", "Landroidx/compose/ui/text/TextStyle;", "fontKey", "colorKey", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "bold", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "size", "retrieveTextStyle-tD9LlGs", "(Ljava/lang/String;Ljava/lang/String;JZIJ)Landroidx/compose/ui/text/TextStyle;", "color", "retrieveTextStyle-WdJyH8Q", "(Ljava/lang/String;JJZIJ)Landroidx/compose/ui/text/TextStyle;", "dp", "Lcom/intellij/util/ui/JBValue;", "getDp", "(Lcom/intellij/util/ui/JBValue;)F", "minus", "delta", "minus-eAf_CNQ", "(JF)J", "plus", "plus-eAf_CNQ", "scaleDensityWithIdeScale", "Landroidx/compose/ui/unit/Density;", "sourceDensity", "isNewUiTheme", "lafName", "retrieveEditorColorScheme", "Lcom/intellij/openapi/editor/colors/EditorColorsScheme;", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nBridgeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeUtils.kt\norg/jetbrains/jewel/bridge/BridgeUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 JewelBridgeException.kt\norg/jetbrains/jewel/bridge/JewelBridgeExceptionKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 9 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,227:1\n11165#2:228\n11500#2,3:229\n1734#3,3:232\n149#4:235\n149#4:238\n149#4:239\n149#4:240\n159#4:241\n132#4:243\n149#4:245\n169#4:258\n16#5:236\n16#5:237\n20#5:247\n16#5:253\n72#6:242\n72#6:244\n72#6:246\n1#7:248\n265#8:249\n251#8:250\n265#8:254\n251#8:255\n147#9,2:251\n108#9,2:256\n*S KotlinDebug\n*F\n+ 1 BridgeUtils.kt\norg/jetbrains/jewel/bridge/BridgeUtilsKt\n*L\n62#1:228\n62#1:229,3\n73#1:232,3\n80#1:235\n104#1:238\n113#1:239\n119#1:240\n127#1:241\n134#1:243\n142#1:245\n196#1:258\n83#1:236\n94#1:237\n149#1:247\n176#1:253\n130#1:242\n135#1:244\n145#1:246\n163#1:249\n163#1:250\n186#1:254\n186#1:255\n163#1:251,2\n186#1:256,2\n*E\n"})
/*     */ public final class BridgeUtilsKt {
/*     */   @NotNull
/*  41 */   private static final Logger logger = Logger.getInstance("JewelBridge"); static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance("JewelBridge"), "getInstance(...)"); }
/*     */    public static final long toComposeColor(@NotNull Color $this$toComposeColor) {
/*  43 */     Intrinsics.checkNotNullParameter($this$toComposeColor, "<this>"); return ColorKt.Color($this$toComposeColor.getRed(), $this$toComposeColor.getGreen(), $this$toComposeColor.getBlue(), $this$toComposeColor.getAlpha());
/*     */   } public static final long toComposeColorOrUnspecified(@Nullable Color $this$toComposeColorOrUnspecified) {
/*  45 */     return ($this$toComposeColorOrUnspecified != null) ? toComposeColor($this$toComposeColorOrUnspecified) : Color.Companion.getUnspecified-0d7_KjU();
/*     */   } public static final long retrieveColor-4WTKRHQ(@NotNull String key, long default) {
/*  47 */     Intrinsics.checkNotNullParameter(key, "key"); retrieveColorOrNull(key); return (retrieveColorOrNull(key) != null) ? retrieveColorOrNull(key).unbox-impl() : default;
/*     */   }
/*     */   
/*  50 */   public static final long retrieveColor-0YGnOg8(@NotNull String key, boolean isDark, long default, long defaultDark) { Intrinsics.checkNotNullParameter(key, "key"); retrieveColorOrNull(key); return (retrieveColorOrNull(key) != null) ? retrieveColorOrNull(key).unbox-impl() : (isDark ? defaultDark : default); } @Nullable
/*     */   public static final Color retrieveColorOrNull(@NotNull String key) {
/*  52 */     Intrinsics.checkNotNullParameter(key, "key"); JBColor.namedColorOrNull(key); return (JBColor.namedColorOrNull(key) != null) ? Color.box-impl(toComposeColor((Color)JBColor.namedColorOrNull(key))) : null;
/*     */   }
/*     */   public static final long retrieveColorOrUnspecified(@NotNull String key) {
/*  55 */     Intrinsics.checkNotNullParameter(key, "key"); Color color = retrieveColorOrNull(key);
/*  56 */     if (color == null) {
/*  57 */       logger.debug("Color with key \"" + key + "\" not found, fallback to 'Color.Unspecified'");
/*     */     }
/*  59 */     return (color != null) ? color.unbox-impl() : Color.Companion.getUnspecified-0d7_KjU();
/*     */   }
/*     */   @NotNull
/*  62 */   public static final List<Color> retrieveColorsOrUnspecified(@NotNull String... keys) { Intrinsics.checkNotNullParameter(keys, "keys"); String[] arrayOfString1 = keys; int $i$f$map = 0;
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
/* 228 */     String[] arrayOfString2 = arrayOfString1; Collection<Color> destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 229 */     for (b = 0, i = arrayOfString2.length; b < i; ) { Object item$iv$iv = arrayOfString2[b];
/* 230 */       Object object1 = item$iv$iv; Collection<Color> collection = destination$iv$iv; int $i$a$-map-BridgeUtilsKt$retrieveColorsOrUnspecified$1 = 0; collection.add(Color.box-impl(retrieveColorOrUnspecified((String)object1))); }
/* 231 */      return (List<Color>)destination$iv$iv; }
/*     */   @NotNull public static final Brush createVerticalBrush-8A-3gB4(@NotNull List $this$createVerticalBrush_u2d8A_u2d3gB4, float startY, float endY, int tileMode) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$this$createVerticalBrush'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokeinterface isEmpty : ()Z
/*     */     //   12: ifeq -> 33
/*     */     //   15: new androidx/compose/ui/graphics/SolidColor
/*     */     //   18: dup
/*     */     //   19: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   22: invokevirtual getTransparent-0d7_KjU : ()J
/*     */     //   25: aconst_null
/*     */     //   26: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   29: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   32: areturn
/*     */     //   33: aload_0
/*     */     //   34: invokeinterface size : ()I
/*     */     //   39: iconst_1
/*     */     //   40: if_icmpne -> 65
/*     */     //   43: new androidx/compose/ui/graphics/SolidColor
/*     */     //   46: dup
/*     */     //   47: aload_0
/*     */     //   48: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   51: checkcast androidx/compose/ui/graphics/Color
/*     */     //   54: invokevirtual unbox-impl : ()J
/*     */     //   57: aconst_null
/*     */     //   58: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   61: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   64: areturn
/*     */     //   65: aload_0
/*     */     //   66: checkcast java/lang/Iterable
/*     */     //   69: astore #4
/*     */     //   71: iconst_0
/*     */     //   72: istore #5
/*     */     //   74: aload #4
/*     */     //   76: instanceof java/util/Collection
/*     */     //   79: ifeq -> 99
/*     */     //   82: aload #4
/*     */     //   84: checkcast java/util/Collection
/*     */     //   87: invokeinterface isEmpty : ()Z
/*     */     //   92: ifeq -> 99
/*     */     //   95: iconst_1
/*     */     //   96: goto -> 163
/*     */     //   99: aload #4
/*     */     //   101: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   106: astore #6
/*     */     //   108: aload #6
/*     */     //   110: invokeinterface hasNext : ()Z
/*     */     //   115: ifeq -> 162
/*     */     //   118: aload #6
/*     */     //   120: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   125: astore #7
/*     */     //   127: aload #7
/*     */     //   129: checkcast androidx/compose/ui/graphics/Color
/*     */     //   132: invokevirtual unbox-impl : ()J
/*     */     //   135: lstore #8
/*     */     //   137: iconst_0
/*     */     //   138: istore #10
/*     */     //   140: lload #8
/*     */     //   142: aload_0
/*     */     //   143: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   146: checkcast androidx/compose/ui/graphics/Color
/*     */     //   149: invokevirtual unbox-impl : ()J
/*     */     //   152: invokestatic equals-impl0 : (JJ)Z
/*     */     //   155: ifne -> 108
/*     */     //   158: iconst_0
/*     */     //   159: goto -> 163
/*     */     //   162: iconst_1
/*     */     //   163: ifeq -> 185
/*     */     //   166: new androidx/compose/ui/graphics/SolidColor
/*     */     //   169: dup
/*     */     //   170: aload_0
/*     */     //   171: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   174: checkcast androidx/compose/ui/graphics/Color
/*     */     //   177: invokevirtual unbox-impl : ()J
/*     */     //   180: aconst_null
/*     */     //   181: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   184: pop
/*     */     //   185: getstatic androidx/compose/ui/graphics/Brush.Companion : Landroidx/compose/ui/graphics/Brush$Companion;
/*     */     //   188: aload_0
/*     */     //   189: fload_1
/*     */     //   190: fload_2
/*     */     //   191: iload_3
/*     */     //   192: invokevirtual verticalGradient-8A-3gB4 : (Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;
/*     */     //   195: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 6
/*     */     //   #70	-> 33
/*     */     //   #73	-> 65
/*     */     //   #232	-> 74
/*     */     //   #233	-> 99
/*     */     //   #73	-> 140
/*     */     //   #233	-> 155
/*     */     //   #234	-> 162
/*     */     //   #73	-> 163
/*     */     //   #75	-> 185
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   140	15	10	$i$a$-all-BridgeUtilsKt$createVerticalBrush$1	I
/*     */     //   137	18	8	it	J
/*     */     //   127	35	7	element$iv	Ljava/lang/Object;
/*     */     //   74	89	5	$i$f$all	I
/*     */     //   71	92	4	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   0	196	0	$this$createVerticalBrush_u2d8A_u2d3gB4	Ljava/util/List;
/*     */     //   0	196	1	startY	F
/*     */     //   0	196	2	endY	F
/*     */     //   0	196	3	tileMode	I }
/*     */   public static final float retrieveIntAsDpOrUnspecified(@NotNull String key) { float f; Intrinsics.checkNotNullParameter(key, "key"); try { f = retrieveIntAsDp-3F_vd3o$default(key, null, 2, null); }
/*     */     catch (JewelBridgeException <unused var>) { f = Dp.Companion.getUnspecified-D9Ej5fM(); }
/* 235 */      return f; } public static final float retrieveIntAsDp-3F_vd3o(@NotNull String key, @Nullable Dp default) { Intrinsics.checkNotNullParameter(key, "key"); Object rawValue = UIManager.get(key); if (rawValue instanceof Integer) { int $this$dp$iv = ((Number)rawValue).intValue(), $i$f$getDp = 0; return Dp.constructor-impl($this$dp$iv); }  if (default != null)
/* 236 */       return default.unbox-impl();  String type$iv = "Int"; int $i$f$keyNotFound = 0; throw new JewelBridgeException.KeyNotFoundException(key, type$iv); }
/*     */   @NotNull public static final PaddingValues retrieveInsetsAsPaddingValues(@NotNull String key, @Nullable PaddingValues default) { Intrinsics.checkNotNullParameter(key, "key"); if (UIManager.getInsets(key) == null || toPaddingValues(UIManager.getInsets(key)) == null) { toPaddingValues(UIManager.getInsets(key)); if (default == null) { String type$iv = "Insets"; int $i$f$keyNotFound = 0; throw new JewelBridgeException.KeyNotFoundException(key, type$iv); }  }
/* 238 */      return toPaddingValues(UIManager.getInsets(key)); } @NotNull public static final PaddingValues toPaddingValues(@NotNull Insets $this$toPaddingValues) { Intrinsics.checkNotNullParameter($this$toPaddingValues, "<this>"); int $this$dp$iv = $this$toPaddingValues.left, $i$f$getDp = 0; $this$dp$iv = $this$toPaddingValues.top; $i$f$getDp = 0; $this$dp$iv = $this$toPaddingValues.right; $i$f$getDp = 0; $this$dp$iv = $this$toPaddingValues.bottom; $i$f$getDp = 0; return ($this$toPaddingValues instanceof JBInsets) ? toPaddingValues((JBInsets)$this$toPaddingValues) : PaddingKt.PaddingValues-a9UjIt4(Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); } @NotNull public static final PaddingValues toPaddingValues(@NotNull JBInsets $this$toPaddingValues) { Intrinsics.checkNotNullParameter($this$toPaddingValues, "<this>"); int $this$dp$iv = ($this$toPaddingValues.getUnscaled()).left, $i$f$getDp = 0; $this$dp$iv = ($this$toPaddingValues.getUnscaled()).top; $i$f$getDp = 0; $this$dp$iv = ($this$toPaddingValues.getUnscaled()).right; $i$f$getDp = 0; $this$dp$iv = ($this$toPaddingValues.getUnscaled()).bottom; $i$f$getDp = 0;
/* 239 */     return PaddingKt.PaddingValues-a9UjIt4(Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); } public static final long toDpSize(@NotNull Dimension $this$toDpSize) { Intrinsics.checkNotNullParameter($this$toDpSize, "<this>"); int $this$dp$iv = $this$toDpSize.width, $i$f$getDp = 0; $this$dp$iv = $this$toDpSize.height; $i$f$getDp = 0;
/* 240 */     return ($this$toDpSize instanceof JBDimension) ? toDpSize((JBDimension)$this$toDpSize) : DpKt.DpSize-YgX7TsA(Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); } public static final long toDpSize(@NotNull JBDimension $this$toDpSize) { Intrinsics.checkNotNullParameter($this$toDpSize, "<this>"); float scaleFactor = JBUIScale.scale(1.0F); double $this$dp$iv = $this$toDpSize.width2d() / scaleFactor; int $i$f$getDp = 0; $this$dp$iv = $this$toDpSize.height2d() / scaleFactor; $i$f$getDp = 0;
/* 241 */     return DpKt.DpSize-YgX7TsA(Dp.constructor-impl((float)$this$dp$iv), Dp.constructor-impl((float)$this$dp$iv)); } @NotNull public static final CornerSize retrieveArcAsCornerSize(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key"); float f = retrieveIntAsDp-3F_vd3o$default(key, null, 2, null); int other$iv = 2, $i$f$div-u2uoSUM = 0;
/* 242 */     return CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl(f / other$iv)); } @NotNull public static final CornerSize retrieveArcAsCornerSizeOrDefault(@NotNull String key, @NotNull CornerSize default) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(default, "default"); float intValue = retrieveIntAsDpOrUnspecified(key); float $this$isUnspecified$iv = intValue; int $i$f$isUnspecified-0680j_4 = 0;
/* 243 */     if (Float.isNaN($this$isUnspecified$iv))
/* 244 */       return default;  int other$iv = 2, $i$f$div-u2uoSUM = 0; return CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl(intValue / other$iv)); } @NotNull public static final CornerSize retrieveArcAsCornerSizeWithFallbacks(@NotNull String... keys) { Intrinsics.checkNotNullParameter(keys, "keys"); byte b; int i; for (b = 0, i = keys.length; b < i; ) { String key = keys[b]; Object rawValue = UIManager.get(key); if (rawValue instanceof Integer)
/* 245 */       { int $this$dp$iv = ((Number)rawValue).intValue(), $i$f$getDp = 0; float cornerSize = Dp.constructor-impl($this$dp$iv); int other$iv = 2, $i$f$div-u2uoSUM = 0;
/* 246 */         return CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl(cornerSize / other$iv)); }  b++; }
/* 247 */      List list = ArraysKt.toList((Object[])keys); String type$iv = "Int"; int $i$f$keysNotFound = 0; throw new JewelBridgeException.KeysNotFoundException(list, type$iv); } @NotNull public static final TextStyle retrieveTextStyle-tD9LlGs(@NotNull String fontKey, @Nullable String colorKey, long lineHeight, boolean bold, int fontStyle, long size) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'fontKey'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: dup
/*     */     //   9: ifnull -> 25
/*     */     //   12: astore #13
/*     */     //   14: iconst_0
/*     */     //   15: istore #14
/*     */     //   17: aload_1
/*     */     //   18: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
/*     */     //   21: nop
/*     */     //   22: goto -> 32
/*     */     //   25: pop
/*     */     //   26: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   29: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   32: lstore #8
/*     */     //   34: aload_0
/*     */     //   35: lload #8
/*     */     //   37: lload_2
/*     */     //   38: iload #4
/*     */     //   40: iload #5
/*     */     //   42: lload #6
/*     */     //   44: invokestatic retrieveTextStyle-WdJyH8Q : (Ljava/lang/String;JJZIJ)Landroidx/compose/ui/text/TextStyle;
/*     */     //   47: astore #10
/*     */     //   49: aload #10
/*     */     //   51: lconst_0
/*     */     //   52: lconst_0
/*     */     //   53: aconst_null
/*     */     //   54: aconst_null
/*     */     //   55: aconst_null
/*     */     //   56: aconst_null
/*     */     //   57: aconst_null
/*     */     //   58: lconst_0
/*     */     //   59: aconst_null
/*     */     //   60: aconst_null
/*     */     //   61: aconst_null
/*     */     //   62: lconst_0
/*     */     //   63: aconst_null
/*     */     //   64: aconst_null
/*     */     //   65: aconst_null
/*     */     //   66: iconst_0
/*     */     //   67: iconst_0
/*     */     //   68: lload_2
/*     */     //   69: lstore #11
/*     */     //   71: iconst_0
/*     */     //   72: istore #13
/*     */     //   74: lload #11
/*     */     //   76: lstore #14
/*     */     //   78: iconst_0
/*     */     //   79: istore #16
/*     */     //   81: lload #14
/*     */     //   83: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   86: ifne -> 93
/*     */     //   89: iconst_1
/*     */     //   90: goto -> 94
/*     */     //   93: iconst_0
/*     */     //   94: ifeq -> 102
/*     */     //   97: lload #11
/*     */     //   99: goto -> 219
/*     */     //   102: istore #43
/*     */     //   104: istore #42
/*     */     //   106: astore #41
/*     */     //   108: astore #40
/*     */     //   110: astore #39
/*     */     //   112: lstore #37
/*     */     //   114: astore #36
/*     */     //   116: astore #35
/*     */     //   118: astore #34
/*     */     //   120: lstore #32
/*     */     //   122: astore #31
/*     */     //   124: astore #30
/*     */     //   126: astore #29
/*     */     //   128: astore #28
/*     */     //   130: astore #27
/*     */     //   132: lstore #25
/*     */     //   134: lstore #23
/*     */     //   136: astore #22
/*     */     //   138: iconst_0
/*     */     //   139: istore #17
/*     */     //   141: aload #10
/*     */     //   143: invokevirtual getFontSize-XSAIIZE : ()J
/*     */     //   146: lstore #18
/*     */     //   148: ldc_w 1.3
/*     */     //   151: fstore #20
/*     */     //   153: iconst_0
/*     */     //   154: istore #21
/*     */     //   156: lload #18
/*     */     //   158: invokestatic checkArithmetic--R2X_6o : (J)V
/*     */     //   161: lload #18
/*     */     //   163: invokestatic getRawType-impl : (J)J
/*     */     //   166: lload #18
/*     */     //   168: invokestatic getValue-impl : (J)F
/*     */     //   171: fload #20
/*     */     //   173: fmul
/*     */     //   174: invokestatic pack : (JF)J
/*     */     //   177: nop
/*     */     //   178: lstore #44
/*     */     //   180: aload #22
/*     */     //   182: lload #23
/*     */     //   184: lload #25
/*     */     //   186: aload #27
/*     */     //   188: aload #28
/*     */     //   190: aload #29
/*     */     //   192: aload #30
/*     */     //   194: aload #31
/*     */     //   196: lload #32
/*     */     //   198: aload #34
/*     */     //   200: aload #35
/*     */     //   202: aload #36
/*     */     //   204: lload #37
/*     */     //   206: aload #39
/*     */     //   208: aload #40
/*     */     //   210: aload #41
/*     */     //   212: iload #42
/*     */     //   214: iload #43
/*     */     //   216: lload #44
/*     */     //   218: nop
/*     */     //   219: aconst_null
/*     */     //   220: aconst_null
/*     */     //   221: aconst_null
/*     */     //   222: iconst_0
/*     */     //   223: iconst_0
/*     */     //   224: aconst_null
/*     */     //   225: ldc_w 16646143
/*     */     //   228: aconst_null
/*     */     //   229: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   232: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #160	-> 7
/*     */     //   #248	-> 14
/*     */     //   #160	-> 17
/*     */     //   #160	-> 21
/*     */     //   #160	-> 22
/*     */     //   #161	-> 34
/*     */     //   #162	-> 49
/*     */     //   #163	-> 68
/*     */     //   #249	-> 74
/*     */     //   #250	-> 81
/*     */     //   #249	-> 94
/*     */     //   #163	-> 141
/*     */     //   #251	-> 156
/*     */     //   #252	-> 161
/*     */     //   #163	-> 177
/*     */     //   #249	-> 218
/*     */     //   #162	-> 219
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   17	4	14	$i$a$-let-BridgeUtilsKt$retrieveTextStyle$baseColor$1	I
/*     */     //   14	7	13	it	Ljava/lang/String;
/*     */     //   156	21	21	$i$f$times-kPz2Gy4	I
/*     */     //   153	24	18	arg0$iv	J
/*     */     //   153	24	20	other$iv	F
/*     */     //   141	37	17	$i$a$-takeOrElse-eAf_CNQ-BridgeUtilsKt$retrieveTextStyle$1	I
/*     */     //   81	13	16	$i$f$isSpecified--R2X_6o	I
/*     */     //   78	16	14	$this$isSpecified$iv$iv	J
/*     */     //   74	145	13	$i$f$takeOrElse-eAf_CNQ	I
/*     */     //   71	148	11	$this$takeOrElse_u2deAf_CNQ$iv	J
/*     */     //   34	199	8	baseColor	J
/*     */     //   49	184	10	resolvedStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	233	0	fontKey	Ljava/lang/String;
/*     */     //   0	233	1	colorKey	Ljava/lang/String;
/*     */     //   0	233	2	lineHeight	J
/*     */     //   0	233	4	bold	Z
/*     */     //   0	233	5	fontStyle	I
/*     */     //   0	233	6	size	J }
/*     */   @NotNull public static final TextStyle retrieveTextStyle-WdJyH8Q(@NotNull String key, long color, long lineHeight, boolean bold, int fontStyle, long size) { Intrinsics.checkNotNullParameter(key, "key");
/*     */     if (UIManager.getFont(key) == null) {
/*     */       UIManager.getFont(key);
/*     */       String type$iv = "Font";
/*     */       int $i$f$keyNotFound = 0;
/* 253 */       throw new JewelBridgeException.KeyNotFoundException(key, type$iv);
/* 254 */     }  Intrinsics.checkNotNullExpressionValue(JBFont.create(lafFont, false), "create(...)"); JBFont jbFont = JBFont.create(lafFont, false); JBFont it = jbFont; int $i$a$-let-BridgeUtilsKt$retrieveTextStyle$derivedFont$1 = 0; it = bold ? it.asBold() : it.asPlain(); int $i$a$-let-BridgeUtilsKt$retrieveTextStyle$derivedFont$2 = 0; JBFont derivedFont = FontStyle.equals-impl0(fontStyle, FontStyle.Companion.getItalic-_-LCdwA()) ? it.asItalic() : it; long $this$takeOrElse_u2deAf_CNQ$iv = size; int $i$f$takeOrElse-eAf_CNQ = 0; long $this$isSpecified$iv$iv = $this$takeOrElse_u2deAf_CNQ$iv; int $i$f$isSpecified--R2X_6o = 0;
/* 255 */     if (!TextUnitKt.isUnspecified--R2X_6o($this$isSpecified$iv$iv)) {  }
/* 256 */     else { long l6 = color; int $i$a$-takeOrElse-eAf_CNQ-BridgeUtilsKt$retrieveTextStyle$2 = 0; long l5 = TextUnitKt.getSp(derivedFont.getSize()); float other$iv = UISettingsUtils.Companion.getInstance().getCurrentIdeScale(); int $i$f$div-kPz2Gy4 = 0; TextUnitKt.checkArithmetic--R2X_6o(l5); }
/* 257 */      Intrinsics.checkNotNull(derivedFont); DefaultConstructorMarker defaultConstructorMarker = null; int i = 16646096; TextMotion textMotion = null; boolean bool1 = false, bool2 = false; LineHeightStyle lineHeightStyle = null; PlatformTextStyle platformTextStyle = null; TextIndent textIndent = null; long l1 = lineHeight; boolean bool3 = false, bool4 = false; DrawStyle drawStyle = null; Shadow shadow = null; TextDecoration textDecoration = null; long l2 = 0L; LocaleList localeList = null; TextGeometricTransform textGeometricTransform = null; BaselineShift baselineShift = null; long l3 = 0L; String str = null; FontFamily fontFamily = AwtFontInteropKt.asComposeFontFamily((Font)derivedFont); FontSynthesis fontSynthesis = null; FontStyle fontStyle1 = FontStyle.box-impl(fontStyle); FontWeight fontWeight = bold ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(); long l4 = TextUnitKt.pack(TextUnit.getRawType-impl(l5), TextUnit.getValue-impl(l5) / other$iv); Font lafFont = UIManager.getFont(key); Font font1 = lafFont; return new TextStyle(font1, l4, fontWeight, fontStyle1, fontSynthesis, fontFamily, str, l3, baselineShift, textGeometricTransform, localeList, l2, textDecoration, shadow, drawStyle, bool4, bool3, l1, textIndent, platformTextStyle, lineHeightStyle, bool2, bool1, textMotion, i, defaultConstructorMarker); } public static final float getDp(@NotNull JBValue $this$dp) { Intrinsics.checkNotNullParameter($this$dp, "<this>"); float $this$dp$iv = $this$dp.getUnscaled(); int $i$f$getDp = 0;
/* 258 */     return Dp.constructor-impl($this$dp$iv); }
/*     */ 
/*     */   
/*     */   public static final long minus-eAf_CNQ(long $this$minus_u2deAf_CNQ, float delta) {
/*     */     return plus-eAf_CNQ($this$minus_u2deAf_CNQ, -delta);
/*     */   }
/*     */   
/*     */   public static final long plus-eAf_CNQ(long $this$plus_u2deAf_CNQ, float delta) {
/*     */     return TextUnit.isSp-impl($this$plus_u2deAf_CNQ) ? TextUnitKt.TextUnit-anM5pPY(TextUnit.getValue-impl($this$plus_u2deAf_CNQ) + delta, TextUnit.getType-UIouoOA($this$plus_u2deAf_CNQ)) : (TextUnit.isEm-impl($this$plus_u2deAf_CNQ) ? TextUnitKt.TextUnit-anM5pPY(TextUnit.getValue-impl($this$plus_u2deAf_CNQ) + delta, TextUnit.getType-UIouoOA($this$plus_u2deAf_CNQ)) : $this$plus_u2deAf_CNQ);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Density scaleDensityWithIdeScale(@NotNull Density sourceDensity) {
/*     */     Intrinsics.checkNotNullParameter(sourceDensity, "sourceDensity");
/*     */     float ideaScale = UISettingsUtils.Companion.getInstance().getCurrentIdeScale();
/*     */     float density = sourceDensity.getDensity() * ideaScale;
/*     */     return DensityKt.Density(density, sourceDensity.getFontScale());
/*     */   }
/*     */   
/*     */   public static final boolean isNewUiTheme() {
/*     */     return NewUI.isEnabled();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String lafName() {
/*     */     UIThemeLookAndFeelInfo lafInfo = LafManager.getInstance().getCurrentUIThemeLookAndFeel();
/*     */     return lafInfo.getName();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final EditorColorsScheme retrieveEditorColorScheme() {
/*     */     Intrinsics.checkNotNull(EditorColorsManager.getInstance(), "null cannot be cast to non-null type com.intellij.openapi.editor.colors.impl.EditorColorsManagerImpl");
/*     */     EditorColorsManagerImpl manager = (EditorColorsManagerImpl)EditorColorsManager.getInstance();
/*     */     if ((EditorColorsScheme)manager.getSchemeManager().getActiveScheme() == null)
/*     */       (EditorColorsScheme)manager.getSchemeManager().getActiveScheme(); 
/*     */     return (EditorColorsScheme)DefaultColorSchemesManager.Companion.getInstance().getFirstScheme();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgeUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */