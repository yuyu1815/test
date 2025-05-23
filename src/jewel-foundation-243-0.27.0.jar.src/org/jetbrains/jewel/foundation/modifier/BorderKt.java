/*     */ package org.jetbrains.jewel.foundation.modifier;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.draw.CacheDrawScope;
/*     */ import androidx.compose.ui.draw.DrawResult;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RoundRectKt;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.Outline;
/*     */ import androidx.compose.ui.graphics.RectangleShapeKt;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.graphics.SolidColor;
/*     */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.node.Ref;
/*     */ import androidx.compose.ui.platform.InspectableValueKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.foundation.Stroke;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000r\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032\032\020\002\032\0020\003*\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007\032=\020\002\032\0020\003*\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\b\b\002\020\006\032\0020\0072\b\b\002\020\016\032\0020\013¢\006\004\b\017\020\020\032=\020\002\032\0020\003*\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\021\032\0020\0222\b\b\002\020\006\032\0020\0072\b\b\002\020\016\032\0020\013¢\006\004\b\023\020\024\032;\020\025\032\0020\003*\0020\0032\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\021\032\0020\0222\006\020\006\032\0020\0072\006\020\016\032\0020\013H\002¢\006\004\b\026\020\024\032J\020\027\032\0020\030*\0020\0312\006\020\006\032\0020\0072\f\020\032\032\b\022\004\022\0020\0340\0332\006\020\b\032\0020\t2\006\020\021\032\0020\0222\006\020\035\032\0020\0362\006\020\037\032\0020\0362\006\020 \032\0020!H\002\032\022\020\"\032\0020\034*\b\022\004\022\0020\0340\033H\002\032B\020#\032\0020\030*\0020\0312\f\020\032\032\b\022\004\022\0020\0340\0332\006\020\b\032\0020\t2\006\020$\032\0020%2\006\020\021\032\0020\0222\006\020\035\032\0020\0362\006\020\037\032\0020\036H\002\032B\020&\032\0020\030*\0020\0312\f\020\032\032\b\022\004\022\0020\0340\0332\006\020\b\032\0020\t2\006\020$\032\0020'2\006\020\021\032\0020\0222\006\020\035\032\0020\0362\006\020\037\032\0020\036H\002\032B\020(\032\0020)*\0020!2\f\020\032\032\b\022\004\022\0020\0340\0332\006\020\b\032\0020\t2\006\020$\032\0020*2\006\020\021\032\0020\0222\006\020+\032\0020\0362\006\020\037\032\0020\036H\002*\n\020\000\"\0020\0012\0020\001¨\006,"}, d2 = {"DrawScopeStroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "border", "Landroidx/compose/ui/Modifier;", "stroke", "Lorg/jetbrains/jewel/foundation/Stroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "alignment", "Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "width", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "expand", "border-QWjY48E", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;F)Landroidx/compose/ui/Modifier;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-AkepmR4", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;F)Landroidx/compose/ui/Modifier;", "drawBorderWithAlignment", "drawBorderWithAlignment-AkepmR4", "drawBorderInner", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "borderCacheRef", "Landroidx/compose/ui/node/Ref;", "Lorg/jetbrains/jewel/foundation/modifier/BorderCache;", "strokeWidthPx", "", "expandWidthPx", "cacheDrawScope", "Landroidx/compose/ui/draw/CacheDrawScope;", "obtain", "drawRectBorder", "outline", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "drawRoundedBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Outline$Generic;", "strokeWidth", "foundation"})
/*     */ @SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderCache\n+ 7 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,357:1\n132#2:358\n135#3:359\n1#4:360\n1#4:383\n128#5,7:361\n128#5,7:401\n178#6,15:368\n193#6,6:384\n199#6,2:399\n201#6:408\n202#6,2:417\n546#7,9:390\n555#7,8:409\n*S KotlinDebug\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderKt\n*L\n77#1:358\n119#1:359\n309#1:383\n350#1:361,7\n310#1:401,7\n309#1:368,15\n309#1:384,6\n309#1:399,2\n309#1:408\n309#1:417,2\n309#1:390,9\n309#1:409,8\n*E\n"})
/*     */ public final class BorderKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Modifier border(@NotNull Modifier $this$border, @NotNull Stroke stroke, @NotNull Shape shape) {
/*  49 */     Intrinsics.checkNotNullParameter($this$border, "<this>"); Intrinsics.checkNotNullParameter(stroke, "stroke"); Intrinsics.checkNotNullParameter(shape, "shape"); Stroke stroke1 = stroke;
/*     */ 
/*     */     
/*  52 */     if (stroke1 instanceof Stroke.Brush) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (stroke1 instanceof Stroke.None) ? $this$border : ((stroke1 instanceof Stroke.Solid) ? border-QWjY48E($this$border, ((Stroke.Solid)stroke).getAlignment(), ((Stroke.Solid)stroke).getWidth-D9Ej5fM(), ((Stroke.Solid)stroke).getColor-0d7_KjU(), shape, ((Stroke.Solid)stroke).getExpand-D9Ej5fM()) : (Modifier)"JD-Core does not support Kotlin");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Modifier border-QWjY48E(@NotNull Modifier $this$border_u2dQWjY48E, @NotNull Stroke.Alignment alignment, float width, long color, @NotNull Shape shape, float expand) {
/*  68 */     Intrinsics.checkNotNullParameter($this$border_u2dQWjY48E, "$this$border"); Intrinsics.checkNotNullParameter(alignment, "alignment"); Intrinsics.checkNotNullParameter(shape, "shape"); return border-AkepmR4($this$border_u2dQWjY48E, alignment, width, (Brush)new SolidColor(color, null), shape, expand);
/*     */   } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderKt$drawBorderWithAlignment$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,357:1\n1225#2,6:358\n1225#2,6:364\n139#3:370\n125#3:371\n149#3:372\n*S KotlinDebug\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderKt$drawBorderWithAlignment$2\n*L\n95#1:358,6\n97#1:364,6\n104#1:370\n104#1:371\n104#1:372\n*E\n"})
/*     */   static final class BorderKt$drawBorderWithAlignment$2 implements Function3<Modifier, Composer, Integer, Modifier> {
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$composed'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 539276792
/*     */       //   9: invokeinterface startReplaceGroup : (I)V
/*     */       //   14: invokestatic isTraceInProgress : ()Z
/*     */       //   17: ifeq -> 29
/*     */       //   20: ldc 539276792
/*     */       //   22: iload_3
/*     */       //   23: iconst_m1
/*     */       //   24: ldc 'org.jetbrains.jewel.foundation.modifier.drawBorderWithAlignment.<anonymous> (Border.kt:94)'
/*     */       //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   29: aload_2
/*     */       //   30: ldc 1551215970
/*     */       //   32: invokeinterface startReplaceGroup : (I)V
/*     */       //   37: aload_2
/*     */       //   38: astore #6
/*     */       //   40: iconst_0
/*     */       //   41: istore #7
/*     */       //   43: iconst_0
/*     */       //   44: istore #8
/*     */       //   46: aload #6
/*     */       //   48: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   53: astore #9
/*     */       //   55: iconst_0
/*     */       //   56: istore #10
/*     */       //   58: aload #9
/*     */       //   60: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   63: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   66: if_acmpne -> 95
/*     */       //   69: iconst_0
/*     */       //   70: istore #11
/*     */       //   72: new androidx/compose/ui/node/Ref
/*     */       //   75: dup
/*     */       //   76: invokespecial <init> : ()V
/*     */       //   79: astore #11
/*     */       //   81: aload #6
/*     */       //   83: aload #11
/*     */       //   85: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   90: aload #11
/*     */       //   92: goto -> 97
/*     */       //   95: aload #9
/*     */       //   97: nop
/*     */       //   98: nop
/*     */       //   99: nop
/*     */       //   100: checkcast androidx/compose/ui/node/Ref
/*     */       //   103: astore #5
/*     */       //   105: aload_2
/*     */       //   106: invokeinterface endReplaceGroup : ()V
/*     */       //   111: aload #5
/*     */       //   113: astore #4
/*     */       //   115: aload_1
/*     */       //   116: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   119: checkcast androidx/compose/ui/Modifier
/*     */       //   122: aload_2
/*     */       //   123: ldc 1551219651
/*     */       //   125: invokeinterface startReplaceGroup : (I)V
/*     */       //   130: aload_2
/*     */       //   131: astore #7
/*     */       //   133: aload_2
/*     */       //   134: aload_0
/*     */       //   135: getfield $width : F
/*     */       //   138: invokeinterface changed : (F)Z
/*     */       //   143: aload_2
/*     */       //   144: aload_0
/*     */       //   145: getfield $expand : F
/*     */       //   148: invokeinterface changed : (F)Z
/*     */       //   153: ior
/*     */       //   154: aload_2
/*     */       //   155: aload_0
/*     */       //   156: getfield $shape : Landroidx/compose/ui/graphics/Shape;
/*     */       //   159: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   164: ior
/*     */       //   165: aload_2
/*     */       //   166: aload #4
/*     */       //   168: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   173: ior
/*     */       //   174: aload_2
/*     */       //   175: aload_0
/*     */       //   176: getfield $alignment : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */       //   179: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   184: ior
/*     */       //   185: aload_2
/*     */       //   186: aload_0
/*     */       //   187: getfield $brush : Landroidx/compose/ui/graphics/Brush;
/*     */       //   190: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   195: ior
/*     */       //   196: istore #8
/*     */       //   198: aload_0
/*     */       //   199: getfield $width : F
/*     */       //   202: fstore #9
/*     */       //   204: aload_0
/*     */       //   205: getfield $expand : F
/*     */       //   208: fstore #10
/*     */       //   210: aload_0
/*     */       //   211: getfield $shape : Landroidx/compose/ui/graphics/Shape;
/*     */       //   214: astore #11
/*     */       //   216: aload_0
/*     */       //   217: getfield $alignment : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */       //   220: astore #12
/*     */       //   222: aload_0
/*     */       //   223: getfield $brush : Landroidx/compose/ui/graphics/Brush;
/*     */       //   226: astore #13
/*     */       //   228: iconst_0
/*     */       //   229: istore #14
/*     */       //   231: aload #7
/*     */       //   233: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   238: astore #15
/*     */       //   240: iconst_0
/*     */       //   241: istore #16
/*     */       //   243: iload #8
/*     */       //   245: ifne -> 259
/*     */       //   248: aload #15
/*     */       //   250: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   253: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   256: if_acmpne -> 307
/*     */       //   259: astore #20
/*     */       //   261: astore #19
/*     */       //   263: iconst_0
/*     */       //   264: istore #17
/*     */       //   266: fload #9
/*     */       //   268: fload #10
/*     */       //   270: aload #11
/*     */       //   272: aload #4
/*     */       //   274: aload #12
/*     */       //   276: aload #13
/*     */       //   278: <illegal opcode> invoke : (FFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/node/Ref;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;Landroidx/compose/ui/graphics/Brush;)Lkotlin/jvm/functions/Function1;
/*     */       //   283: astore #21
/*     */       //   285: aload #19
/*     */       //   287: aload #20
/*     */       //   289: aload #21
/*     */       //   291: astore #18
/*     */       //   293: aload #7
/*     */       //   295: aload #18
/*     */       //   297: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   302: aload #18
/*     */       //   304: goto -> 309
/*     */       //   307: aload #15
/*     */       //   309: nop
/*     */       //   310: nop
/*     */       //   311: nop
/*     */       //   312: checkcast kotlin/jvm/functions/Function1
/*     */       //   315: astore #6
/*     */       //   317: aload_2
/*     */       //   318: invokeinterface endReplaceGroup : ()V
/*     */       //   323: aload #6
/*     */       //   325: invokestatic drawWithCache : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */       //   328: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   333: astore #5
/*     */       //   335: invokestatic isTraceInProgress : ()Z
/*     */       //   338: ifeq -> 344
/*     */       //   341: invokestatic traceEventEnd : ()V
/*     */       //   344: aload_2
/*     */       //   345: invokeinterface endReplaceGroup : ()V
/*     */       //   350: aload #5
/*     */       //   352: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #95	-> 26
/*     */       //   #358	-> 46
/*     */       //   #359	-> 58
/*     */       //   #360	-> 69
/*     */       //   #95	-> 72
/*     */       //   #360	-> 79
/*     */       //   #361	-> 81
/*     */       //   #362	-> 90
/*     */       //   #363	-> 95
/*     */       //   #359	-> 97
/*     */       //   #358	-> 98
/*     */       //   #358	-> 99
/*     */       //   #95	-> 100
/*     */       //   #96	-> 115
/*     */       //   #97	-> 116
/*     */       //   #364	-> 231
/*     */       //   #365	-> 243
/*     */       //   #366	-> 259
/*     */       //   #97	-> 266
/*     */       //   #366	-> 291
/*     */       //   #367	-> 293
/*     */       //   #368	-> 302
/*     */       //   #369	-> 307
/*     */       //   #365	-> 309
/*     */       //   #364	-> 310
/*     */       //   #364	-> 311
/*     */       //   #97	-> 312
/*     */       //   #96	-> 328
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   72	7	11	$i$a$-cache-BorderKt$drawBorderWithAlignment$2$borderCacheRef$1	I
/*     */       //   81	11	11	value$iv	Ljava/lang/Object;
/*     */       //   58	40	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   55	43	9	it$iv	Ljava/lang/Object;
/*     */       //   46	54	8	$i$f$cache	I
/*     */       //   43	57	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   43	57	7	invalid$iv	Z
/*     */       //   266	17	17	$i$a$-cache-BorderKt$drawBorderWithAlignment$2$1	I
/*     */       //   293	11	18	value$iv	Ljava/lang/Object;
/*     */       //   243	67	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   240	70	15	it$iv	Ljava/lang/Object;
/*     */       //   231	81	14	$i$f$cache	I
/*     */       //   228	84	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   228	84	8	invalid$iv	Z
/*     */       //   115	238	4	borderCacheRef	Landroidx/compose/ui/node/Ref;
/*     */       //   0	353	0	this	Lorg/jetbrains/jewel/foundation/modifier/BorderKt$drawBorderWithAlignment$2;
/*     */       //   0	353	1	$this$composed	Landroidx/compose/ui/Modifier;
/*     */       //   0	353	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	353	3	$changed	I } private static final DrawResult invoke$lambda$4$lambda$3(float $width, float $expand, Shape $shape, Ref $borderCacheRef, Stroke.Alignment $alignment, Brush $brush, CacheDrawScope $this$drawWithCache) { // Byte code:
/*     */       //   0: aload #6
/*     */       //   2: ldc '$this$drawWithCache'
/*     */       //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   7: aload #6
/*     */       //   9: fload_0
/*     */       //   10: fload_1
/*     */       //   11: aload_2
/*     */       //   12: aload_3
/*     */       //   13: aload #4
/*     */       //   15: aload #5
/*     */       //   17: aload #6
/*     */       //   19: <illegal opcode> invoke : (FFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/node/Ref;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/draw/CacheDrawScope;)Lkotlin/jvm/functions/Function1;
/*     */       //   24: invokevirtual onDrawWithContent : (Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;
/*     */       //   27: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #98	-> 7
/*     */       //   #115	-> 27
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	28	0	$width	F
/*     */       //   0	28	1	$expand	F
/*     */       //   0	28	2	$shape	Landroidx/compose/ui/graphics/Shape;
/*     */       //   0	28	3	$borderCacheRef	Landroidx/compose/ui/node/Ref;
/*     */       //   0	28	4	$alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */       //   0	28	5	$brush	Landroidx/compose/ui/graphics/Brush;
/*     */       //   0	28	6	$this$drawWithCache	Landroidx/compose/ui/draw/CacheDrawScope; }
/*     */     private static final Unit invoke$lambda$4$lambda$3$lambda$2(float $width, float $expand, Shape $shape, Ref $borderCacheRef, Stroke.Alignment $alignment, Brush $brush, CacheDrawScope $this_drawWithCache, ContentDrawScope $this$onDrawWithContent) { // Byte code:
/*     */       //   0: aload #7
/*     */       //   2: ldc '$this$onDrawWithContent'
/*     */       //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   7: aload #7
/*     */       //   9: invokeinterface drawContent : ()V
/*     */       //   14: fload_0
/*     */       //   15: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */       //   18: invokevirtual getHairline-D9Ej5fM : ()F
/*     */       //   21: invokestatic equals-impl0 : (FF)Z
/*     */       //   24: ifeq -> 31
/*     */       //   27: fconst_1
/*     */       //   28: goto -> 39
/*     */       //   31: aload #7
/*     */       //   33: fload_0
/*     */       //   34: invokeinterface toPx-0680j_4 : (F)F
/*     */       //   39: aload #7
/*     */       //   41: invokeinterface getSize-NH-jbRc : ()J
/*     */       //   46: invokestatic getMinDimension-impl : (J)F
/*     */       //   49: iconst_2
/*     */       //   50: i2f
/*     */       //   51: fdiv
/*     */       //   52: invokestatic min : (FF)F
/*     */       //   55: fconst_1
/*     */       //   56: invokestatic coerceAtLeast : (FF)F
/*     */       //   59: fstore #8
/*     */       //   61: aload #7
/*     */       //   63: fload_1
/*     */       //   64: fstore #10
/*     */       //   66: iconst_0
/*     */       //   67: istore #11
/*     */       //   69: fload #10
/*     */       //   71: fstore #12
/*     */       //   73: iconst_0
/*     */       //   74: istore #13
/*     */       //   76: fload #12
/*     */       //   78: invokestatic isNaN : (F)Z
/*     */       //   81: ifne -> 88
/*     */       //   84: iconst_1
/*     */       //   85: goto -> 89
/*     */       //   88: iconst_0
/*     */       //   89: nop
/*     */       //   90: ifeq -> 98
/*     */       //   93: fload #10
/*     */       //   95: goto -> 123
/*     */       //   98: astore #17
/*     */       //   100: iconst_0
/*     */       //   101: istore #14
/*     */       //   103: iconst_0
/*     */       //   104: istore #15
/*     */       //   106: iconst_0
/*     */       //   107: istore #16
/*     */       //   109: iload #15
/*     */       //   111: i2f
/*     */       //   112: invokestatic constructor-impl : (F)F
/*     */       //   115: nop
/*     */       //   116: fstore #18
/*     */       //   118: aload #17
/*     */       //   120: fload #18
/*     */       //   122: nop
/*     */       //   123: invokeinterface toPx-0680j_4 : (F)F
/*     */       //   128: fstore #9
/*     */       //   130: aload #7
/*     */       //   132: aload_2
/*     */       //   133: aload_3
/*     */       //   134: aload #4
/*     */       //   136: aload #5
/*     */       //   138: fload #8
/*     */       //   140: fload #9
/*     */       //   142: aload #6
/*     */       //   144: invokestatic access$drawBorderInner : (Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/node/Ref;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;Landroidx/compose/ui/graphics/Brush;FFLandroidx/compose/ui/draw/CacheDrawScope;)V
/*     */       //   147: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   150: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #99	-> 7
/*     */       //   #102	-> 14
/*     */       //   #102	-> 55
/*     */       //   #101	-> 59
/*     */       //   #104	-> 61
/*     */       //   #370	-> 69
/*     */       //   #371	-> 76
/*     */       //   #371	-> 89
/*     */       //   #370	-> 90
/*     */       //   #104	-> 103
/*     */       //   #372	-> 109
/*     */       //   #104	-> 115
/*     */       //   #370	-> 122
/*     */       //   #104	-> 123
/*     */       //   #106	-> 130
/*     */       //   #107	-> 132
/*     */       //   #108	-> 133
/*     */       //   #109	-> 134
/*     */       //   #110	-> 136
/*     */       //   #111	-> 138
/*     */       //   #112	-> 140
/*     */       //   #113	-> 142
/*     */       //   #106	-> 144
/*     */       //   #115	-> 147
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   109	6	16	$i$f$getDp	I
/*     */       //   106	9	15	$this$dp$iv	I
/*     */       //   103	13	14	$i$a$-takeOrElse-D5KLDUw-BorderKt$drawBorderWithAlignment$2$1$1$1$expandWidthPx$1	I
/*     */       //   76	14	13	$i$f$isSpecified-0680j_4	I
/*     */       //   73	17	12	$this$isSpecified$iv$iv	F
/*     */       //   69	54	11	$i$f$takeOrElse-D5KLDUw	I
/*     */       //   66	57	10	$this$takeOrElse_u2dD5KLDUw$iv	F
/*     */       //   61	90	8	strokeWidthPx	F
/*     */       //   130	21	9	expandWidthPx	F
/*     */       //   0	151	0	$width	F
/*     */       //   0	151	1	$expand	F
/*     */       //   0	151	2	$shape	Landroidx/compose/ui/graphics/Shape;
/*     */       //   0	151	3	$borderCacheRef	Landroidx/compose/ui/node/Ref;
/*     */       //   0	151	4	$alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */       //   0	151	5	$brush	Landroidx/compose/ui/graphics/Brush;
/*     */       //   0	151	6	$this_drawWithCache	Landroidx/compose/ui/draw/CacheDrawScope;
/*     */       //   0	151	7	$this$onDrawWithContent	Landroidx/compose/ui/graphics/drawscope/ContentDrawScope; }
/*     */     BorderKt$drawBorderWithAlignment$2(float $width, float $expand, Shape $shape, Stroke.Alignment $alignment, Brush $brush) {} }
/*     */   @NotNull
/*  77 */   public static final Modifier border-AkepmR4(@NotNull Modifier $this$border_u2dAkepmR4, @NotNull Stroke.Alignment alignment, float width, @NotNull Brush brush, @NotNull Shape shape, float expand) { Intrinsics.checkNotNullParameter($this$border_u2dAkepmR4, "$this$border"); Intrinsics.checkNotNullParameter(alignment, "alignment"); Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(shape, "shape"); if (alignment == Stroke.Alignment.Inside) { float $this$isUnspecified$iv = expand; int $i$f$isUnspecified-0680j_4 = 0;
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
/* 358 */       if (Float.isNaN($this$isUnspecified$iv)); }  return drawBorderWithAlignment-AkepmR4($this$border_u2dAkepmR4, alignment, width, brush, shape, expand); }
/* 359 */   private static final void drawBorderInner(ContentDrawScope $this$drawBorderInner, Shape shape, Ref<BorderCache> borderCacheRef, Stroke.Alignment alignment, Brush brush, float strokeWidthPx, float expandWidthPx, CacheDrawScope cacheDrawScope) { Outline outline = shape.createOutline-Pq9zytI($this$drawBorderInner.getSize-NH-jbRc(), $this$drawBorderInner.getLayoutDirection(), (Density)cacheDrawScope); if (outline instanceof Outline.Rectangle) { if (shape instanceof androidx.compose.foundation.shape.RoundedCornerShape) { drawRoundedBorder($this$drawBorderInner, borderCacheRef, alignment, new Outline.Rounded(RoundRectKt.RoundRect-ZAM2FJo$default(((Outline.Rectangle)outline).getRect(), 0L, 0L, 0L, 0L, 30, null)), brush, strokeWidthPx, expandWidthPx); } else { drawRectBorder($this$drawBorderInner, borderCacheRef, alignment, (Outline.Rectangle)outline, brush, strokeWidthPx, expandWidthPx); }  } else if (outline instanceof Outline.Rounded) { drawRoundedBorder($this$drawBorderInner, borderCacheRef, alignment, (Outline.Rounded)outline, brush, strokeWidthPx, expandWidthPx); } else if (outline instanceof Outline.Generic) { drawGenericBorder(cacheDrawScope, borderCacheRef, alignment, (Outline.Generic)outline, brush, strokeWidthPx, expandWidthPx); } else { throw new NoWhenBranchMatchedException(); }  } private static final Modifier drawBorderWithAlignment-AkepmR4(Modifier $this$drawBorderWithAlignment_u2dAkepmR4, Stroke.Alignment alignment, float width, Brush brush, Shape shape, float expand) { int $i$f$debugInspectorInfo = 0; Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new BorderKt$drawBorderWithAlignment-AkepmR4$$inlined$debugInspectorInfo$1(alignment, width, brush, shape, expand) : InspectableValueKt.getNoInspectorInfo(); return ComposedModifierKt.composed($this$drawBorderWithAlignment_u2dAkepmR4, function1, new BorderKt$drawBorderWithAlignment$2(width, expand, shape, alignment, brush)); } private static final BorderCache obtain(Ref $this$obtain) { if ((BorderCache)$this$obtain.getValue() == null)
/* 360 */     { (BorderCache)$this$obtain.getValue(); BorderCache borderCache1 = new BorderCache(null, null, null, null, 15, null), it = borderCache1; int $i$a$-also-BorderKt$obtain$1 = 0; $this$obtain.setValue(it); }  return borderCache1; } private static final void drawRectBorder(ContentDrawScope $this$drawRectBorder, Ref borderCacheRef, Stroke.Alignment alignment, Outline.Rectangle outline, Brush brush, float strokeWidthPx, float expandWidthPx) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: getstatic org/jetbrains/jewel/foundation/modifier/BorderKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   4: swap
/*     */     //   5: invokevirtual ordinal : ()I
/*     */     //   8: iaload
/*     */     //   9: tableswitch default -> 82, 1 -> 36, 2 -> 53, 3 -> 65
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual getRect : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   40: fload #6
/*     */     //   42: fload #5
/*     */     //   44: fconst_2
/*     */     //   45: fdiv
/*     */     //   46: fsub
/*     */     //   47: invokevirtual inflate : (F)Landroidx/compose/ui/geometry/Rect;
/*     */     //   50: goto -> 90
/*     */     //   53: aload_3
/*     */     //   54: invokevirtual getRect : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   57: fload #6
/*     */     //   59: invokevirtual inflate : (F)Landroidx/compose/ui/geometry/Rect;
/*     */     //   62: goto -> 90
/*     */     //   65: aload_3
/*     */     //   66: invokevirtual getRect : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   69: fload #6
/*     */     //   71: fload #5
/*     */     //   73: fconst_2
/*     */     //   74: fdiv
/*     */     //   75: fadd
/*     */     //   76: invokevirtual inflate : (F)Landroidx/compose/ui/geometry/Rect;
/*     */     //   79: goto -> 90
/*     */     //   82: new kotlin/NoWhenBranchMatchedException
/*     */     //   85: dup
/*     */     //   86: invokespecial <init> : ()V
/*     */     //   89: athrow
/*     */     //   90: astore #7
/*     */     //   92: aload_0
/*     */     //   93: checkcast androidx/compose/ui/graphics/drawscope/DrawScope
/*     */     //   96: aload #4
/*     */     //   98: aload #7
/*     */     //   100: invokevirtual getTopLeft-F1C5BW0 : ()J
/*     */     //   103: aload #7
/*     */     //   105: invokevirtual getSize-NH-jbRc : ()J
/*     */     //   108: fconst_0
/*     */     //   109: new androidx/compose/ui/graphics/drawscope/Stroke
/*     */     //   112: dup
/*     */     //   113: fload #5
/*     */     //   115: fconst_0
/*     */     //   116: iconst_0
/*     */     //   117: iconst_0
/*     */     //   118: aconst_null
/*     */     //   119: bipush #30
/*     */     //   121: aconst_null
/*     */     //   122: invokespecial <init> : (FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   125: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   128: aconst_null
/*     */     //   129: iconst_0
/*     */     //   130: bipush #104
/*     */     //   132: aconst_null
/*     */     //   133: invokestatic drawRect-AsUm42w$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   136: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #221	-> 0
/*     */     //   #222	-> 36
/*     */     //   #223	-> 53
/*     */     //   #224	-> 65
/*     */     //   #221	-> 82
/*     */     //   #220	-> 90
/*     */     //   #227	-> 92
/*     */     //   #228	-> 136
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	45	7	rect	Landroidx/compose/ui/geometry/Rect;
/*     */     //   0	137	0	$this$drawRectBorder	Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
/*     */     //   0	137	1	borderCacheRef	Landroidx/compose/ui/node/Ref;
/*     */     //   0	137	2	alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   0	137	3	outline	Landroidx/compose/ui/graphics/Outline$Rectangle;
/*     */     //   0	137	4	brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   0	137	5	strokeWidthPx	F
/*     */     //   0	137	6	expandWidthPx	F } private static final void drawRoundedBorder(ContentDrawScope $this$drawRoundedBorder, Ref borderCacheRef, Stroke.Alignment alignment, Outline.Rounded outline, Brush brush, float strokeWidthPx, float expandWidthPx) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: getstatic org/jetbrains/jewel/foundation/modifier/BorderKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   4: swap
/*     */     //   5: invokevirtual ordinal : ()I
/*     */     //   8: iaload
/*     */     //   9: tableswitch default -> 82, 1 -> 36, 2 -> 53, 3 -> 65
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual getRoundRect : ()Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   40: fload #6
/*     */     //   42: fload #5
/*     */     //   44: fconst_2
/*     */     //   45: fdiv
/*     */     //   46: fsub
/*     */     //   47: invokestatic grow : (Landroidx/compose/ui/geometry/RoundRect;F)Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   50: goto -> 90
/*     */     //   53: aload_3
/*     */     //   54: invokevirtual getRoundRect : ()Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   57: fload #6
/*     */     //   59: invokestatic grow : (Landroidx/compose/ui/geometry/RoundRect;F)Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   62: goto -> 90
/*     */     //   65: aload_3
/*     */     //   66: invokevirtual getRoundRect : ()Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   69: fload #6
/*     */     //   71: fload #5
/*     */     //   73: fconst_2
/*     */     //   74: fdiv
/*     */     //   75: fadd
/*     */     //   76: invokestatic grow : (Landroidx/compose/ui/geometry/RoundRect;F)Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   79: goto -> 90
/*     */     //   82: new kotlin/NoWhenBranchMatchedException
/*     */     //   85: dup
/*     */     //   86: invokespecial <init> : ()V
/*     */     //   89: athrow
/*     */     //   90: astore #7
/*     */     //   92: aload #7
/*     */     //   94: invokestatic hasAtLeastOneNonRoundedCorner : (Landroidx/compose/ui/geometry/RoundRect;)Z
/*     */     //   97: ifeq -> 200
/*     */     //   100: aload_1
/*     */     //   101: invokestatic obtain : (Landroidx/compose/ui/node/Ref;)Lorg/jetbrains/jewel/foundation/modifier/BorderCache;
/*     */     //   104: astore #8
/*     */     //   106: aload #8
/*     */     //   108: invokevirtual obtainPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   111: astore #10
/*     */     //   113: aload #10
/*     */     //   115: astore #11
/*     */     //   117: iconst_0
/*     */     //   118: istore #12
/*     */     //   120: aload #11
/*     */     //   122: invokeinterface reset : ()V
/*     */     //   127: aload #11
/*     */     //   129: getstatic androidx/compose/ui/graphics/PathFillType.Companion : Landroidx/compose/ui/graphics/PathFillType$Companion;
/*     */     //   132: invokevirtual getEvenOdd-Rg-k1Os : ()I
/*     */     //   135: invokeinterface setFillType-oQ8Xj4U : (I)V
/*     */     //   140: aload #11
/*     */     //   142: aload #7
/*     */     //   144: fload #5
/*     */     //   146: fconst_2
/*     */     //   147: fdiv
/*     */     //   148: invokestatic shrink : (Landroidx/compose/ui/geometry/RoundRect;F)Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   151: aconst_null
/*     */     //   152: iconst_2
/*     */     //   153: aconst_null
/*     */     //   154: invokestatic addRoundRect$default : (Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;ILjava/lang/Object;)V
/*     */     //   157: aload #11
/*     */     //   159: aload #7
/*     */     //   161: fload #5
/*     */     //   163: fconst_2
/*     */     //   164: fdiv
/*     */     //   165: invokestatic grow : (Landroidx/compose/ui/geometry/RoundRect;F)Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   168: aconst_null
/*     */     //   169: iconst_2
/*     */     //   170: aconst_null
/*     */     //   171: invokestatic addRoundRect$default : (Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;ILjava/lang/Object;)V
/*     */     //   174: nop
/*     */     //   175: aload #10
/*     */     //   177: astore #9
/*     */     //   179: aload_0
/*     */     //   180: checkcast androidx/compose/ui/graphics/drawscope/DrawScope
/*     */     //   183: aload #9
/*     */     //   185: aload #4
/*     */     //   187: fconst_0
/*     */     //   188: aconst_null
/*     */     //   189: aconst_null
/*     */     //   190: iconst_0
/*     */     //   191: bipush #60
/*     */     //   193: aconst_null
/*     */     //   194: invokestatic drawPath-GBMwjPU$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   197: goto -> 246
/*     */     //   200: aload_0
/*     */     //   201: checkcast androidx/compose/ui/graphics/drawscope/DrawScope
/*     */     //   204: new androidx/compose/ui/graphics/Outline$Rounded
/*     */     //   207: dup
/*     */     //   208: aload #7
/*     */     //   210: invokespecial <init> : (Landroidx/compose/ui/geometry/RoundRect;)V
/*     */     //   213: checkcast androidx/compose/ui/graphics/Outline
/*     */     //   216: aload #4
/*     */     //   218: fconst_0
/*     */     //   219: new androidx/compose/ui/graphics/drawscope/Stroke
/*     */     //   222: dup
/*     */     //   223: fload #5
/*     */     //   225: fconst_0
/*     */     //   226: iconst_0
/*     */     //   227: iconst_0
/*     */     //   228: aconst_null
/*     */     //   229: bipush #30
/*     */     //   231: aconst_null
/*     */     //   232: invokespecial <init> : (FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   235: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   238: aconst_null
/*     */     //   239: iconst_0
/*     */     //   240: bipush #52
/*     */     //   242: aconst_null
/*     */     //   243: invokestatic drawOutline-hn5TExg$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   246: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #239	-> 0
/*     */     //   #240	-> 36
/*     */     //   #241	-> 53
/*     */     //   #242	-> 65
/*     */     //   #239	-> 82
/*     */     //   #238	-> 90
/*     */     //   #245	-> 92
/*     */     //   #247	-> 100
/*     */     //   #249	-> 106
/*     */     //   #250	-> 120
/*     */     //   #251	-> 127
/*     */     //   #252	-> 140
/*     */     //   #253	-> 157
/*     */     //   #254	-> 174
/*     */     //   #249	-> 175
/*     */     //   #249	-> 177
/*     */     //   #248	-> 177
/*     */     //   #255	-> 179
/*     */     //   #257	-> 200
/*     */     //   #259	-> 246
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   120	55	12	$i$a$-apply-BorderKt$drawRoundedBorder$borderPath$1	I
/*     */     //   117	58	11	$this$drawRoundedBorder_u24lambda_u242	Landroidx/compose/ui/graphics/Path;
/*     */     //   106	91	8	cache	Lorg/jetbrains/jewel/foundation/modifier/BorderCache;
/*     */     //   179	18	9	borderPath	Landroidx/compose/ui/graphics/Path;
/*     */     //   92	155	7	roundRect	Landroidx/compose/ui/geometry/RoundRect;
/*     */     //   0	247	0	$this$drawRoundedBorder	Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
/*     */     //   0	247	1	borderCacheRef	Landroidx/compose/ui/node/Ref;
/*     */     //   0	247	2	alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   0	247	3	outline	Landroidx/compose/ui/graphics/Outline$Rounded;
/*     */     //   0	247	4	brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   0	247	5	strokeWidthPx	F
/*     */     //   0	247	6	expandWidthPx	F }
/* 361 */   private static final Unit drawGenericBorder$lambda$9$lambda$8(Rect $pathBounds, Ref.ObjectRef $cacheImageBitmap, long $pathBoundsSize, ColorFilter $colorFilter, ContentDrawScope $this$onDrawWithContent) { Intrinsics.checkNotNullParameter($this$onDrawWithContent, "$this$onDrawWithContent"); $this$onDrawWithContent.drawContent(); DrawScope drawScope = (DrawScope)$this$onDrawWithContent; float f1 = $pathBounds.getLeft(), top$iv = $pathBounds.getTop(); int $i$f$translate = 0; drawScope.getDrawContext().getTransform().translate(f1, top$iv);
/*     */     try {
/* 363 */       DrawScope $this$drawGenericBorder_u24lambda_u249_u24lambda_u248_u24lambda_u247 = drawScope; int $i$a$-translate-BorderKt$drawGenericBorder$1$2$1 = 0; DrawScope.drawImage-AZ2fEMs$default($this$drawGenericBorder_u24lambda_u249_u24lambda_u248_u24lambda_u247, (ImageBitmap)$cacheImageBitmap.element, 0L, $pathBoundsSize, 0L, 0L, 0.0F, null, $colorFilter, 0, 0, 890, null);
/*     */     } finally {
/* 365 */       drawScope.getDrawContext().getTransform().translate(-f1, -top$iv);
/*     */     } 
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   private static final DrawResult drawGenericBorder(CacheDrawScope $this$drawGenericBorder, Ref borderCacheRef, Stroke.Alignment alignment, Outline.Generic outline, Brush brush, float strokeWidth, float expandWidthPx) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_2
/*     */     //   2: fload #6
/*     */     //   4: fload #5
/*     */     //   6: aload_3
/*     */     //   7: aload #4
/*     */     //   9: aload_1
/*     */     //   10: aload_0
/*     */     //   11: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/ui/graphics/Outline$Generic;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/draw/CacheDrawScope;)Lkotlin/jvm/functions/Function1;
/*     */     //   16: invokevirtual onDrawWithContent : (Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;
/*     */     //   19: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #268	-> 0
/*     */     //   #356	-> 19
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	20	0	$this$drawGenericBorder	Landroidx/compose/ui/draw/CacheDrawScope;
/*     */     //   0	20	1	borderCacheRef	Landroidx/compose/ui/node/Ref;
/*     */     //   0	20	2	alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   0	20	3	outline	Landroidx/compose/ui/graphics/Outline$Generic;
/*     */     //   0	20	4	brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   0	20	5	strokeWidth	F
/*     */     //   0	20	6	expandWidthPx	F
/*     */   }
/*     */   
/*     */   private static final Unit drawGenericBorder$lambda$9(Stroke.Alignment $alignment, float $expandWidthPx, float $strokeWidth, Outline.Generic $outline, Brush $brush, Ref $borderCacheRef, CacheDrawScope $this_drawGenericBorder, ContentDrawScope $this$onDrawWithContent) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: ldc_w '$this$onDrawWithContent'
/*     */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   8: aload #7
/*     */     //   10: invokeinterface drawContent : ()V
/*     */     //   15: aload_0
/*     */     //   16: getstatic org/jetbrains/jewel/foundation/modifier/BorderKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   19: swap
/*     */     //   20: invokevirtual ordinal : ()I
/*     */     //   23: iaload
/*     */     //   24: tableswitch default -> 112, 1 -> 52, 2 -> 71, 3 -> 94
/*     */     //   52: fconst_0
/*     */     //   53: fload_1
/*     */     //   54: fadd
/*     */     //   55: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   58: fload_2
/*     */     //   59: fneg
/*     */     //   60: fload_1
/*     */     //   61: fadd
/*     */     //   62: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   65: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   68: goto -> 120
/*     */     //   71: fload_2
/*     */     //   72: fconst_2
/*     */     //   73: fdiv
/*     */     //   74: fload_1
/*     */     //   75: fadd
/*     */     //   76: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   79: fload_2
/*     */     //   80: fneg
/*     */     //   81: fconst_2
/*     */     //   82: fdiv
/*     */     //   83: fload_1
/*     */     //   84: fadd
/*     */     //   85: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   88: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   91: goto -> 120
/*     */     //   94: fload_2
/*     */     //   95: fload_1
/*     */     //   96: fadd
/*     */     //   97: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   100: fconst_0
/*     */     //   101: fload_1
/*     */     //   102: fadd
/*     */     //   103: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   106: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   109: goto -> 120
/*     */     //   112: new kotlin/NoWhenBranchMatchedException
/*     */     //   115: dup
/*     */     //   116: invokespecial <init> : ()V
/*     */     //   119: athrow
/*     */     //   120: astore #8
/*     */     //   122: aload #8
/*     */     //   124: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   127: checkcast java/lang/Number
/*     */     //   130: invokevirtual floatValue : ()F
/*     */     //   133: fstore #9
/*     */     //   135: aload #8
/*     */     //   137: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   140: checkcast java/lang/Number
/*     */     //   143: invokevirtual floatValue : ()F
/*     */     //   146: fstore #10
/*     */     //   148: fload #9
/*     */     //   150: fstore #11
/*     */     //   152: fload #11
/*     */     //   154: fload #10
/*     */     //   156: fcmpg
/*     */     //   157: ifne -> 164
/*     */     //   160: iconst_1
/*     */     //   161: goto -> 165
/*     */     //   164: iconst_0
/*     */     //   165: ifeq -> 172
/*     */     //   168: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   171: areturn
/*     */     //   172: fload #11
/*     */     //   174: fload #10
/*     */     //   176: fneg
/*     */     //   177: fcmpg
/*     */     //   178: ifne -> 185
/*     */     //   181: iconst_1
/*     */     //   182: goto -> 186
/*     */     //   185: iconst_0
/*     */     //   186: ifeq -> 233
/*     */     //   189: aload #7
/*     */     //   191: checkcast androidx/compose/ui/graphics/drawscope/DrawScope
/*     */     //   194: aload_3
/*     */     //   195: checkcast androidx/compose/ui/graphics/Outline
/*     */     //   198: aload #4
/*     */     //   200: fconst_0
/*     */     //   201: new androidx/compose/ui/graphics/drawscope/Stroke
/*     */     //   204: dup
/*     */     //   205: fload #9
/*     */     //   207: fconst_2
/*     */     //   208: fmul
/*     */     //   209: fconst_0
/*     */     //   210: iconst_0
/*     */     //   211: iconst_0
/*     */     //   212: aconst_null
/*     */     //   213: bipush #30
/*     */     //   215: aconst_null
/*     */     //   216: invokespecial <init> : (FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   219: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   222: aconst_null
/*     */     //   223: iconst_0
/*     */     //   224: bipush #52
/*     */     //   226: aconst_null
/*     */     //   227: invokestatic drawOutline-hn5TExg$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   230: goto -> 1354
/*     */     //   233: iconst_0
/*     */     //   234: istore #12
/*     */     //   236: aconst_null
/*     */     //   237: astore #13
/*     */     //   239: aload #4
/*     */     //   241: instanceof androidx/compose/ui/graphics/SolidColor
/*     */     //   244: ifeq -> 277
/*     */     //   247: getstatic androidx/compose/ui/graphics/ImageBitmapConfig.Companion : Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;
/*     */     //   250: invokevirtual getAlpha8-_sVssgQ : ()I
/*     */     //   253: istore #12
/*     */     //   255: getstatic androidx/compose/ui/graphics/ColorFilter.Companion : Landroidx/compose/ui/graphics/ColorFilter$Companion;
/*     */     //   258: aload #4
/*     */     //   260: checkcast androidx/compose/ui/graphics/SolidColor
/*     */     //   263: invokevirtual getValue-0d7_KjU : ()J
/*     */     //   266: iconst_0
/*     */     //   267: iconst_2
/*     */     //   268: aconst_null
/*     */     //   269: invokestatic tint-xETnrds$default : (Landroidx/compose/ui/graphics/ColorFilter$Companion;JIILjava/lang/Object;)Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   272: astore #13
/*     */     //   274: goto -> 288
/*     */     //   277: getstatic androidx/compose/ui/graphics/ImageBitmapConfig.Companion : Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;
/*     */     //   280: invokevirtual getArgb8888-_sVssgQ : ()I
/*     */     //   283: istore #12
/*     */     //   285: aconst_null
/*     */     //   286: astore #13
/*     */     //   288: aload_3
/*     */     //   289: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   292: invokeinterface getBounds : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   297: fload #9
/*     */     //   299: invokevirtual inflate : (F)Landroidx/compose/ui/geometry/Rect;
/*     */     //   302: astore #14
/*     */     //   304: aload #5
/*     */     //   306: invokestatic obtain : (Landroidx/compose/ui/node/Ref;)Lorg/jetbrains/jewel/foundation/modifier/BorderCache;
/*     */     //   309: astore #15
/*     */     //   311: aload #15
/*     */     //   313: invokevirtual obtainPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   316: astore #17
/*     */     //   318: aload #17
/*     */     //   320: astore #18
/*     */     //   322: iconst_0
/*     */     //   323: istore #19
/*     */     //   325: aload #18
/*     */     //   327: invokeinterface reset : ()V
/*     */     //   332: aload #18
/*     */     //   334: aload #14
/*     */     //   336: aconst_null
/*     */     //   337: iconst_2
/*     */     //   338: aconst_null
/*     */     //   339: invokestatic addRect$default : (Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;ILjava/lang/Object;)V
/*     */     //   342: aload #18
/*     */     //   344: aload #18
/*     */     //   346: aload_3
/*     */     //   347: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   350: getstatic androidx/compose/ui/graphics/PathOperation.Companion : Landroidx/compose/ui/graphics/PathOperation$Companion;
/*     */     //   353: invokevirtual getDifference-b3I0S0c : ()I
/*     */     //   356: invokeinterface op-N5in7k0 : (Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z
/*     */     //   361: pop
/*     */     //   362: nop
/*     */     //   363: aload #17
/*     */     //   365: astore #16
/*     */     //   367: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   370: dup
/*     */     //   371: invokespecial <init> : ()V
/*     */     //   374: astore #17
/*     */     //   376: aload #14
/*     */     //   378: invokevirtual getWidth : ()F
/*     */     //   381: f2d
/*     */     //   382: invokestatic ceil : (D)D
/*     */     //   385: d2f
/*     */     //   386: f2i
/*     */     //   387: aload #14
/*     */     //   389: invokevirtual getHeight : ()F
/*     */     //   392: f2d
/*     */     //   393: invokestatic ceil : (D)D
/*     */     //   396: d2f
/*     */     //   397: f2i
/*     */     //   398: invokestatic IntSize : (II)J
/*     */     //   401: lstore #18
/*     */     //   403: aload #15
/*     */     //   405: astore #20
/*     */     //   407: iconst_0
/*     */     //   408: istore #21
/*     */     //   410: aload #17
/*     */     //   412: aload #20
/*     */     //   414: astore #22
/*     */     //   416: aload #7
/*     */     //   418: astore #23
/*     */     //   420: iconst_0
/*     */     //   421: istore #24
/*     */     //   423: aload #22
/*     */     //   425: invokestatic access$getImageBitmap$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;)Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   428: astore #25
/*     */     //   430: aload #22
/*     */     //   432: invokestatic access$getCanvas$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;)Landroidx/compose/ui/graphics/Canvas;
/*     */     //   435: astore #26
/*     */     //   437: aload #25
/*     */     //   439: dup
/*     */     //   440: ifnull -> 454
/*     */     //   443: invokeinterface getConfig-_sVssgQ : ()I
/*     */     //   448: invokestatic box-impl : (I)Landroidx/compose/ui/graphics/ImageBitmapConfig;
/*     */     //   451: goto -> 456
/*     */     //   454: pop
/*     */     //   455: aconst_null
/*     */     //   456: astore #27
/*     */     //   458: getstatic androidx/compose/ui/graphics/ImageBitmapConfig.Companion : Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;
/*     */     //   461: invokevirtual getArgb8888-_sVssgQ : ()I
/*     */     //   464: istore #28
/*     */     //   466: aload #27
/*     */     //   468: dup
/*     */     //   469: ifnonnull -> 477
/*     */     //   472: pop
/*     */     //   473: iconst_0
/*     */     //   474: goto -> 485
/*     */     //   477: invokevirtual unbox-impl : ()I
/*     */     //   480: iload #28
/*     */     //   482: invokestatic equals-impl0 : (II)Z
/*     */     //   485: ifne -> 515
/*     */     //   488: iload #12
/*     */     //   490: aload #25
/*     */     //   492: dup
/*     */     //   493: ifnull -> 507
/*     */     //   496: invokeinterface getConfig-_sVssgQ : ()I
/*     */     //   501: invokestatic box-impl : (I)Landroidx/compose/ui/graphics/ImageBitmapConfig;
/*     */     //   504: goto -> 509
/*     */     //   507: pop
/*     */     //   508: aconst_null
/*     */     //   509: invokestatic equals-impl : (ILjava/lang/Object;)Z
/*     */     //   512: ifeq -> 519
/*     */     //   515: iconst_1
/*     */     //   516: goto -> 520
/*     */     //   519: iconst_0
/*     */     //   520: istore #29
/*     */     //   522: aload #25
/*     */     //   524: ifnull -> 581
/*     */     //   527: aload #26
/*     */     //   529: ifnull -> 581
/*     */     //   532: aload #23
/*     */     //   534: invokeinterface getSize-NH-jbRc : ()J
/*     */     //   539: invokestatic getWidth-impl : (J)F
/*     */     //   542: aload #25
/*     */     //   544: invokeinterface getWidth : ()I
/*     */     //   549: i2f
/*     */     //   550: fcmpl
/*     */     //   551: ifgt -> 581
/*     */     //   554: aload #23
/*     */     //   556: invokeinterface getSize-NH-jbRc : ()J
/*     */     //   561: invokestatic getHeight-impl : (J)F
/*     */     //   564: aload #25
/*     */     //   566: invokeinterface getHeight : ()I
/*     */     //   571: i2f
/*     */     //   572: fcmpl
/*     */     //   573: ifgt -> 581
/*     */     //   576: iload #29
/*     */     //   578: ifne -> 646
/*     */     //   581: lload #18
/*     */     //   583: invokestatic getWidth-impl : (J)I
/*     */     //   586: lload #18
/*     */     //   588: invokestatic getHeight-impl : (J)I
/*     */     //   591: iload #12
/*     */     //   593: iconst_0
/*     */     //   594: aconst_null
/*     */     //   595: bipush #24
/*     */     //   597: aconst_null
/*     */     //   598: invokestatic ImageBitmap-x__-hDU$default : (IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;ILjava/lang/Object;)Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   601: astore #27
/*     */     //   603: aload #27
/*     */     //   605: astore #28
/*     */     //   607: iconst_0
/*     */     //   608: istore #30
/*     */     //   610: aload #22
/*     */     //   612: aload #28
/*     */     //   614: invokestatic access$setImageBitmap$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;Landroidx/compose/ui/graphics/ImageBitmap;)V
/*     */     //   617: aload #27
/*     */     //   619: astore #25
/*     */     //   621: aload #25
/*     */     //   623: invokestatic Canvas : (Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;
/*     */     //   626: astore #27
/*     */     //   628: aload #27
/*     */     //   630: astore #28
/*     */     //   632: iconst_0
/*     */     //   633: istore #30
/*     */     //   635: aload #22
/*     */     //   637: aload #28
/*     */     //   639: invokestatic access$setCanvas$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;Landroidx/compose/ui/graphics/Canvas;)V
/*     */     //   642: aload #27
/*     */     //   644: astore #26
/*     */     //   646: aload #22
/*     */     //   648: invokestatic access$getCanvasDrawScope$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   651: dup
/*     */     //   652: ifnonnull -> 681
/*     */     //   655: pop
/*     */     //   656: new androidx/compose/ui/graphics/drawscope/CanvasDrawScope
/*     */     //   659: dup
/*     */     //   660: invokespecial <init> : ()V
/*     */     //   663: astore #30
/*     */     //   665: aload #30
/*     */     //   667: astore #31
/*     */     //   669: iconst_0
/*     */     //   670: istore #32
/*     */     //   672: aload #22
/*     */     //   674: aload #31
/*     */     //   676: invokestatic access$setCanvasDrawScope$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V
/*     */     //   679: aload #30
/*     */     //   681: astore #27
/*     */     //   683: lload #18
/*     */     //   685: invokestatic toSize-ozmzZPI : (J)J
/*     */     //   688: lstore #33
/*     */     //   690: aload #27
/*     */     //   692: astore #31
/*     */     //   694: aload #23
/*     */     //   696: invokeinterface getLayoutDirection : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   701: astore #32
/*     */     //   703: iconst_0
/*     */     //   704: istore #35
/*     */     //   706: aload #31
/*     */     //   708: invokevirtual getDrawParams : ()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   711: astore #36
/*     */     //   713: aload #36
/*     */     //   715: invokevirtual component1 : ()Landroidx/compose/ui/unit/Density;
/*     */     //   718: astore #37
/*     */     //   720: aload #36
/*     */     //   722: invokevirtual component2 : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   725: astore #38
/*     */     //   727: aload #36
/*     */     //   729: invokevirtual component3 : ()Landroidx/compose/ui/graphics/Canvas;
/*     */     //   732: astore #39
/*     */     //   734: aload #36
/*     */     //   736: invokevirtual component4-NH-jbRc : ()J
/*     */     //   739: lstore #40
/*     */     //   741: aload #31
/*     */     //   743: invokevirtual getDrawParams : ()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   746: astore #42
/*     */     //   748: iconst_0
/*     */     //   749: istore #43
/*     */     //   751: aload #42
/*     */     //   753: aload #23
/*     */     //   755: checkcast androidx/compose/ui/unit/Density
/*     */     //   758: invokevirtual setDensity : (Landroidx/compose/ui/unit/Density;)V
/*     */     //   761: aload #42
/*     */     //   763: aload #32
/*     */     //   765: invokevirtual setLayoutDirection : (Landroidx/compose/ui/unit/LayoutDirection;)V
/*     */     //   768: aload #42
/*     */     //   770: aload #26
/*     */     //   772: invokevirtual setCanvas : (Landroidx/compose/ui/graphics/Canvas;)V
/*     */     //   775: aload #42
/*     */     //   777: lload #33
/*     */     //   779: invokevirtual setSize-uvyYCjk : (J)V
/*     */     //   782: nop
/*     */     //   783: nop
/*     */     //   784: aload #26
/*     */     //   786: invokeinterface save : ()V
/*     */     //   791: aload #31
/*     */     //   793: checkcast androidx/compose/ui/graphics/drawscope/DrawScope
/*     */     //   796: astore #44
/*     */     //   798: iconst_0
/*     */     //   799: istore #45
/*     */     //   801: aload #44
/*     */     //   803: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   806: invokevirtual getBlack-0d7_KjU : ()J
/*     */     //   809: lconst_0
/*     */     //   810: lload #33
/*     */     //   812: fconst_0
/*     */     //   813: aconst_null
/*     */     //   814: aconst_null
/*     */     //   815: getstatic androidx/compose/ui/graphics/BlendMode.Companion : Landroidx/compose/ui/graphics/BlendMode$Companion;
/*     */     //   818: invokevirtual getClear-0nO6VwU : ()I
/*     */     //   821: bipush #58
/*     */     //   823: aconst_null
/*     */     //   824: invokestatic drawRect-n-J9OG0$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   827: aload #44
/*     */     //   829: astore #46
/*     */     //   831: astore #47
/*     */     //   833: iconst_0
/*     */     //   834: istore #48
/*     */     //   836: aload #46
/*     */     //   838: astore #49
/*     */     //   840: aload #14
/*     */     //   842: invokevirtual getLeft : ()F
/*     */     //   845: fneg
/*     */     //   846: fstore #50
/*     */     //   848: aload #14
/*     */     //   850: invokevirtual getTop : ()F
/*     */     //   853: fneg
/*     */     //   854: fstore #51
/*     */     //   856: iconst_0
/*     */     //   857: istore #52
/*     */     //   859: aload #49
/*     */     //   861: invokeinterface getDrawContext : ()Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */     //   866: invokeinterface getTransform : ()Landroidx/compose/ui/graphics/drawscope/DrawTransform;
/*     */     //   871: fload #50
/*     */     //   873: fload #51
/*     */     //   875: invokeinterface translate : (FF)V
/*     */     //   880: nop
/*     */     //   881: aload #49
/*     */     //   883: astore #53
/*     */     //   885: iconst_0
/*     */     //   886: istore #54
/*     */     //   888: fload #10
/*     */     //   890: fconst_0
/*     */     //   891: fcmpg
/*     */     //   892: ifge -> 936
/*     */     //   895: fload #9
/*     */     //   897: fconst_0
/*     */     //   898: fcmpl
/*     */     //   899: ifle -> 936
/*     */     //   902: ldc_w 'Not implemented for generic border'
/*     */     //   905: astore #55
/*     */     //   907: new kotlin/NotImplementedError
/*     */     //   910: dup
/*     */     //   911: new java/lang/StringBuilder
/*     */     //   914: dup
/*     */     //   915: invokespecial <init> : ()V
/*     */     //   918: ldc_w 'An operation is not implemented: '
/*     */     //   921: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   924: aload #55
/*     */     //   926: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   929: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   932: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   935: athrow
/*     */     //   936: fload #9
/*     */     //   938: fconst_0
/*     */     //   939: fcmpl
/*     */     //   940: ifle -> 1073
/*     */     //   943: fload #10
/*     */     //   945: fconst_0
/*     */     //   946: fcmpl
/*     */     //   947: iflt -> 1073
/*     */     //   950: aload #53
/*     */     //   952: aload_3
/*     */     //   953: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   956: aload #4
/*     */     //   958: fconst_0
/*     */     //   959: new androidx/compose/ui/graphics/drawscope/Stroke
/*     */     //   962: dup
/*     */     //   963: fload #9
/*     */     //   965: fconst_2
/*     */     //   966: fmul
/*     */     //   967: fconst_0
/*     */     //   968: iconst_0
/*     */     //   969: iconst_0
/*     */     //   970: aconst_null
/*     */     //   971: bipush #30
/*     */     //   973: aconst_null
/*     */     //   974: invokespecial <init> : (FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   977: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   980: aconst_null
/*     */     //   981: iconst_0
/*     */     //   982: bipush #52
/*     */     //   984: aconst_null
/*     */     //   985: invokestatic drawPath-GBMwjPU$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   988: fload #10
/*     */     //   990: fconst_0
/*     */     //   991: fcmpl
/*     */     //   992: ifle -> 1050
/*     */     //   995: aload_3
/*     */     //   996: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   999: astore #55
/*     */     //   1001: getstatic androidx/compose/ui/graphics/BlendMode.Companion : Landroidx/compose/ui/graphics/BlendMode$Companion;
/*     */     //   1004: invokevirtual getClear-0nO6VwU : ()I
/*     */     //   1007: istore #56
/*     */     //   1009: new androidx/compose/ui/graphics/drawscope/Stroke
/*     */     //   1012: dup
/*     */     //   1013: fload #10
/*     */     //   1015: fconst_2
/*     */     //   1016: fmul
/*     */     //   1017: fconst_0
/*     */     //   1018: iconst_0
/*     */     //   1019: iconst_0
/*     */     //   1020: aconst_null
/*     */     //   1021: bipush #30
/*     */     //   1023: aconst_null
/*     */     //   1024: invokespecial <init> : (FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1027: astore #57
/*     */     //   1029: aload #53
/*     */     //   1031: aload #55
/*     */     //   1033: aload #4
/*     */     //   1035: fconst_0
/*     */     //   1036: aload #57
/*     */     //   1038: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   1041: aconst_null
/*     */     //   1042: iload #56
/*     */     //   1044: bipush #20
/*     */     //   1046: aconst_null
/*     */     //   1047: invokestatic drawPath-GBMwjPU$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   1050: aload #53
/*     */     //   1052: aload_3
/*     */     //   1053: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   1056: aload #4
/*     */     //   1058: fconst_0
/*     */     //   1059: aconst_null
/*     */     //   1060: aconst_null
/*     */     //   1061: getstatic androidx/compose/ui/graphics/BlendMode.Companion : Landroidx/compose/ui/graphics/BlendMode$Companion;
/*     */     //   1064: invokevirtual getClear-0nO6VwU : ()I
/*     */     //   1067: bipush #28
/*     */     //   1069: aconst_null
/*     */     //   1070: invokestatic drawPath-GBMwjPU$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   1073: fload #9
/*     */     //   1075: fconst_0
/*     */     //   1076: fcmpg
/*     */     //   1077: ifgt -> 1210
/*     */     //   1080: fload #10
/*     */     //   1082: fconst_0
/*     */     //   1083: fcmpg
/*     */     //   1084: ifge -> 1210
/*     */     //   1087: aload #53
/*     */     //   1089: aload_3
/*     */     //   1090: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   1093: aload #4
/*     */     //   1095: fconst_0
/*     */     //   1096: new androidx/compose/ui/graphics/drawscope/Stroke
/*     */     //   1099: dup
/*     */     //   1100: fload #10
/*     */     //   1102: fneg
/*     */     //   1103: fconst_2
/*     */     //   1104: fmul
/*     */     //   1105: fconst_0
/*     */     //   1106: iconst_0
/*     */     //   1107: iconst_0
/*     */     //   1108: aconst_null
/*     */     //   1109: bipush #30
/*     */     //   1111: aconst_null
/*     */     //   1112: invokespecial <init> : (FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1115: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   1118: aconst_null
/*     */     //   1119: iconst_0
/*     */     //   1120: bipush #52
/*     */     //   1122: aconst_null
/*     */     //   1123: invokestatic drawPath-GBMwjPU$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   1126: fload #9
/*     */     //   1128: fconst_0
/*     */     //   1129: fcmpg
/*     */     //   1130: ifge -> 1189
/*     */     //   1133: aload_3
/*     */     //   1134: invokevirtual getPath : ()Landroidx/compose/ui/graphics/Path;
/*     */     //   1137: astore #55
/*     */     //   1139: getstatic androidx/compose/ui/graphics/BlendMode.Companion : Landroidx/compose/ui/graphics/BlendMode$Companion;
/*     */     //   1142: invokevirtual getClear-0nO6VwU : ()I
/*     */     //   1145: istore #56
/*     */     //   1147: new androidx/compose/ui/graphics/drawscope/Stroke
/*     */     //   1150: dup
/*     */     //   1151: fload #9
/*     */     //   1153: fneg
/*     */     //   1154: fconst_2
/*     */     //   1155: fmul
/*     */     //   1156: fconst_0
/*     */     //   1157: iconst_0
/*     */     //   1158: iconst_0
/*     */     //   1159: aconst_null
/*     */     //   1160: bipush #30
/*     */     //   1162: aconst_null
/*     */     //   1163: invokespecial <init> : (FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1166: astore #57
/*     */     //   1168: aload #53
/*     */     //   1170: aload #55
/*     */     //   1172: aload #4
/*     */     //   1174: fconst_0
/*     */     //   1175: aload #57
/*     */     //   1177: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   1180: aconst_null
/*     */     //   1181: iload #56
/*     */     //   1183: bipush #20
/*     */     //   1185: aconst_null
/*     */     //   1186: invokestatic drawPath-GBMwjPU$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   1189: aload #53
/*     */     //   1191: aload #16
/*     */     //   1193: aload #4
/*     */     //   1195: fconst_0
/*     */     //   1196: aconst_null
/*     */     //   1197: aconst_null
/*     */     //   1198: getstatic androidx/compose/ui/graphics/BlendMode.Companion : Landroidx/compose/ui/graphics/BlendMode$Companion;
/*     */     //   1201: invokevirtual getClear-0nO6VwU : ()I
/*     */     //   1204: bipush #28
/*     */     //   1206: aconst_null
/*     */     //   1207: invokestatic drawPath-GBMwjPU$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   1210: nop
/*     */     //   1211: nop
/*     */     //   1212: aload #49
/*     */     //   1214: invokeinterface getDrawContext : ()Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */     //   1219: invokeinterface getTransform : ()Landroidx/compose/ui/graphics/drawscope/DrawTransform;
/*     */     //   1224: fload #50
/*     */     //   1226: fneg
/*     */     //   1227: fload #51
/*     */     //   1229: fneg
/*     */     //   1230: invokeinterface translate : (FF)V
/*     */     //   1235: goto -> 1266
/*     */     //   1238: astore #58
/*     */     //   1240: aload #49
/*     */     //   1242: invokeinterface getDrawContext : ()Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */     //   1247: invokeinterface getTransform : ()Landroidx/compose/ui/graphics/drawscope/DrawTransform;
/*     */     //   1252: fload #50
/*     */     //   1254: fneg
/*     */     //   1255: fload #51
/*     */     //   1257: fneg
/*     */     //   1258: invokeinterface translate : (FF)V
/*     */     //   1263: aload #58
/*     */     //   1265: athrow
/*     */     //   1266: nop
/*     */     //   1267: nop
/*     */     //   1268: aload #47
/*     */     //   1270: nop
/*     */     //   1271: nop
/*     */     //   1272: nop
/*     */     //   1273: aload #26
/*     */     //   1275: invokeinterface restore : ()V
/*     */     //   1280: aload #31
/*     */     //   1282: invokevirtual getDrawParams : ()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   1285: astore #42
/*     */     //   1287: iconst_0
/*     */     //   1288: istore #43
/*     */     //   1290: aload #42
/*     */     //   1292: aload #37
/*     */     //   1294: invokevirtual setDensity : (Landroidx/compose/ui/unit/Density;)V
/*     */     //   1297: aload #42
/*     */     //   1299: aload #38
/*     */     //   1301: invokevirtual setLayoutDirection : (Landroidx/compose/ui/unit/LayoutDirection;)V
/*     */     //   1304: aload #42
/*     */     //   1306: aload #39
/*     */     //   1308: invokevirtual setCanvas : (Landroidx/compose/ui/graphics/Canvas;)V
/*     */     //   1311: aload #42
/*     */     //   1313: lload #40
/*     */     //   1315: invokevirtual setSize-uvyYCjk : (J)V
/*     */     //   1318: nop
/*     */     //   1319: nop
/*     */     //   1320: nop
/*     */     //   1321: aload #25
/*     */     //   1323: invokeinterface prepareToDraw : ()V
/*     */     //   1328: aload #25
/*     */     //   1330: putfield element : Ljava/lang/Object;
/*     */     //   1333: nop
/*     */     //   1334: nop
/*     */     //   1335: aload #6
/*     */     //   1337: aload #14
/*     */     //   1339: aload #17
/*     */     //   1341: lload #18
/*     */     //   1343: aload #13
/*     */     //   1345: <illegal opcode> invoke : (Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/internal/Ref$ObjectRef;JLandroidx/compose/ui/graphics/ColorFilter;)Lkotlin/jvm/functions/Function1;
/*     */     //   1350: invokevirtual onDrawWithContent : (Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;
/*     */     //   1353: pop
/*     */     //   1354: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1357: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #269	-> 8
/*     */     //   #275	-> 15
/*     */     //   #277	-> 52
/*     */     //   #278	-> 71
/*     */     //   #279	-> 94
/*     */     //   #275	-> 112
/*     */     //   #274	-> 120
/*     */     //   #282	-> 148
/*     */     //   #283	-> 152
/*     */     //   #285	-> 172
/*     */     //   #287	-> 233
/*     */     //   #288	-> 236
/*     */     //   #289	-> 239
/*     */     //   #290	-> 247
/*     */     //   #291	-> 255
/*     */     //   #293	-> 277
/*     */     //   #294	-> 285
/*     */     //   #296	-> 288
/*     */     //   #297	-> 304
/*     */     //   #299	-> 311
/*     */     //   #300	-> 325
/*     */     //   #301	-> 332
/*     */     //   #302	-> 342
/*     */     //   #303	-> 362
/*     */     //   #299	-> 363
/*     */     //   #299	-> 365
/*     */     //   #298	-> 365
/*     */     //   #304	-> 367
/*     */     //   #305	-> 376
/*     */     //   #305	-> 386
/*     */     //   #305	-> 397
/*     */     //   #307	-> 403
/*     */     //   #308	-> 410
/*     */     //   #309	-> 412
/*     */     //   #368	-> 423
/*     */     //   #369	-> 430
/*     */     //   #371	-> 437
/*     */     //   #370	-> 520
/*     */     //   #374	-> 522
/*     */     //   #375	-> 522
/*     */     //   #376	-> 527
/*     */     //   #377	-> 532
/*     */     //   #378	-> 554
/*     */     //   #379	-> 576
/*     */     //   #382	-> 581
/*     */     //   #383	-> 607
/*     */     //   #382	-> 610
/*     */     //   #382	-> 617
/*     */     //   #381	-> 619
/*     */     //   #384	-> 621
/*     */     //   #383	-> 632
/*     */     //   #384	-> 635
/*     */     //   #384	-> 642
/*     */     //   #384	-> 644
/*     */     //   #387	-> 646
/*     */     //   #383	-> 669
/*     */     //   #387	-> 672
/*     */     //   #387	-> 679
/*     */     //   #387	-> 681
/*     */     //   #388	-> 683
/*     */     //   #389	-> 690
/*     */     //   #390	-> 706
/*     */     //   #391	-> 741
/*     */     //   #392	-> 751
/*     */     //   #393	-> 761
/*     */     //   #394	-> 768
/*     */     //   #395	-> 775
/*     */     //   #396	-> 782
/*     */     //   #391	-> 783
/*     */     //   #397	-> 784
/*     */     //   #398	-> 791
/*     */     //   #399	-> 801
/*     */     //   #400	-> 827
/*     */     //   #310	-> 836
/*     */     //   #401	-> 859
/*     */     //   #402	-> 880
/*     */     //   #403	-> 881
/*     */     //   #311	-> 888
/*     */     //   #312	-> 902
/*     */     //   #315	-> 936
/*     */     //   #316	-> 950
/*     */     //   #318	-> 988
/*     */     //   #320	-> 995
/*     */     //   #322	-> 1001
/*     */     //   #323	-> 1009
/*     */     //   #319	-> 1029
/*     */     //   #320	-> 1031
/*     */     //   #321	-> 1033
/*     */     //   #319	-> 1035
/*     */     //   #323	-> 1036
/*     */     //   #319	-> 1041
/*     */     //   #322	-> 1042
/*     */     //   #319	-> 1044
/*     */     //   #327	-> 1050
/*     */     //   #330	-> 1073
/*     */     //   #331	-> 1087
/*     */     //   #333	-> 1126
/*     */     //   #335	-> 1133
/*     */     //   #337	-> 1139
/*     */     //   #338	-> 1147
/*     */     //   #334	-> 1168
/*     */     //   #335	-> 1170
/*     */     //   #336	-> 1172
/*     */     //   #334	-> 1174
/*     */     //   #338	-> 1175
/*     */     //   #334	-> 1180
/*     */     //   #337	-> 1181
/*     */     //   #334	-> 1183
/*     */     //   #342	-> 1189
/*     */     //   #344	-> 1210
/*     */     //   #403	-> 1211
/*     */     //   #405	-> 1212
/*     */     //   #406	-> 1235
/*     */     //   #405	-> 1238
/*     */     //   #407	-> 1266
/*     */     //   #345	-> 1267
/*     */     //   #400	-> 1270
/*     */     //   #408	-> 1271
/*     */     //   #398	-> 1272
/*     */     //   #409	-> 1273
/*     */     //   #410	-> 1280
/*     */     //   #411	-> 1290
/*     */     //   #412	-> 1297
/*     */     //   #413	-> 1304
/*     */     //   #414	-> 1311
/*     */     //   #415	-> 1318
/*     */     //   #410	-> 1319
/*     */     //   #416	-> 1320
/*     */     //   #417	-> 1321
/*     */     //   #418	-> 1328
/*     */     //   #308	-> 1330
/*     */     //   #346	-> 1333
/*     */     //   #307	-> 1334
/*     */     //   #348	-> 1335
/*     */     //   #356	-> 1354
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   325	38	19	$i$a$-apply-BorderKt$drawGenericBorder$1$outerMaskPath$1	I
/*     */     //   322	41	18	$this$drawGenericBorder_u24lambda_u249_u24lambda_u243	Landroidx/compose/ui/graphics/Path;
/*     */     //   888	323	54	$i$a$-translate-BorderKt$drawGenericBorder$1$1$1$1	I
/*     */     //   885	326	53	$this$drawGenericBorder_u24lambda_u249_u24lambda_u246_u24lambda_u245_u24lambda_u244	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   859	408	52	$i$f$translate	I
/*     */     //   856	411	49	$this$translate$iv	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   856	411	50	left$iv	F
/*     */     //   856	411	51	top$iv	F
/*     */     //   836	432	48	$i$a$-drawBorderCache-EMwLDEs-BorderKt$drawGenericBorder$1$1$1	I
/*     */     //   833	435	46	$this$drawGenericBorder_u24lambda_u249_u24lambda_u246_u24lambda_u245	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   610	7	30	$i$a$-also-BorderCache$drawBorderCache$1$iv	I
/*     */     //   607	10	28	it$iv	Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   635	7	30	$i$a$-also-BorderCache$drawBorderCache$2$iv	I
/*     */     //   632	10	28	it$iv	Landroidx/compose/ui/graphics/Canvas;
/*     */     //   672	7	32	$i$a$-also-BorderCache$drawBorderCache$targetDrawScope$1$iv	I
/*     */     //   669	10	31	it$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   801	471	45	$i$a$-draw-yzxVdVo-BorderCache$drawBorderCache$3$iv	I
/*     */     //   798	474	44	$this$drawBorderCache_EMwLDEs_u24lambda_u243$iv	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   751	32	43	$i$a$-apply-CanvasDrawScope$draw$1$iv$iv	I
/*     */     //   748	35	42	$this$draw_yzxVdVo_u24lambda_u240$iv$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   1290	29	43	$i$a$-apply-CanvasDrawScope$draw$2$iv$iv	I
/*     */     //   1287	32	42	$this$draw_yzxVdVo_u24lambda_u241$iv$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   706	615	35	$i$f$draw-yzxVdVo	I
/*     */     //   720	601	37	prevDensity$iv$iv	Landroidx/compose/ui/unit/Density;
/*     */     //   727	594	38	prevLayoutDirection$iv$iv	Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   734	587	39	prevCanvas$iv$iv	Landroidx/compose/ui/graphics/Canvas;
/*     */     //   741	580	40	prevSize$iv$iv	J
/*     */     //   703	618	31	this_$iv$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   703	618	32	layoutDirection$iv$iv	Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   423	907	24	$i$f$drawBorderCache-EMwLDEs	I
/*     */     //   430	900	25	targetImageBitmap$iv	Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   437	893	26	targetCanvas$iv	Landroidx/compose/ui/graphics/Canvas;
/*     */     //   522	808	29	compatibleConfig$iv	Z
/*     */     //   683	647	27	targetDrawScope$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   690	640	33	drawSize$iv	J
/*     */     //   420	910	22	this_$iv	Lorg/jetbrains/jewel/foundation/modifier/BorderCache;
/*     */     //   420	910	23	$this$drawBorderCache_u2dEMwLDEs$iv	Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
/*     */     //   410	924	21	$i$a$-with-BorderKt$drawGenericBorder$1$1	I
/*     */     //   407	927	20	$this$drawGenericBorder_u24lambda_u249_u24lambda_u246	Lorg/jetbrains/jewel/foundation/modifier/BorderCache;
/*     */     //   236	1118	12	config	I
/*     */     //   239	1115	13	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   304	1050	14	pathBounds	Landroidx/compose/ui/geometry/Rect;
/*     */     //   311	1043	15	borderCache	Lorg/jetbrains/jewel/foundation/modifier/BorderCache;
/*     */     //   367	987	16	outerMaskPath	Landroidx/compose/ui/graphics/Path;
/*     */     //   376	978	17	cacheImageBitmap	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   403	951	18	pathBoundsSize	J
/*     */     //   135	1223	9	outer	F
/*     */     //   148	1210	10	inner	F
/*     */     //   0	1358	0	$alignment	Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   0	1358	1	$expandWidthPx	F
/*     */     //   0	1358	2	$strokeWidth	F
/*     */     //   0	1358	3	$outline	Landroidx/compose/ui/graphics/Outline$Generic;
/*     */     //   0	1358	4	$brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   0	1358	5	$borderCacheRef	Landroidx/compose/ui/node/Ref;
/*     */     //   0	1358	6	$this_drawGenericBorder	Landroidx/compose/ui/draw/CacheDrawScope;
/*     */     //   0	1358	7	$this$onDrawWithContent	Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   880	1212	1238	finally
/*     */     //   1238	1240	1238	finally
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\BorderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */