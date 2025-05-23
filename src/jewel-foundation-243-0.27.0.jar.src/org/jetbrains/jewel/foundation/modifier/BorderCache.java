/*     */ package org.jetbrains.jewel.foundation.modifier;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.SkiaBackedPath_skikoKt;
/*     */ import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B7\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\004\b\n\020\013J@\020\f\032\0020\003*\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\027\020\022\032\023\022\004\022\0020\024\022\004\022\0020\0250\023¢\006\002\b\026H\bø\001\000¢\006\004\b\027\020\030J\006\020\031\032\0020\tR\020\020\002\032\004\030\0010\003X\016¢\006\002\n\000R\020\020\004\032\004\030\0010\005X\016¢\006\002\n\000R\020\020\006\032\004\030\0010\007X\016¢\006\002\n\000R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000\002\007\n\005\b20\001¨\006\032"}, d2 = {"Lorg/jetbrains/jewel/foundation/modifier/BorderCache;", "", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "borderPath", "Landroidx/compose/ui/graphics/Path;", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "drawBorderCache", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "borderSize", "Landroidx/compose/ui/unit/IntSize;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBorderCache-EMwLDEs", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;JILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/ImageBitmap;", "obtainPath", "foundation"})
/*     */ @SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,357:1\n1#2:358\n546#3,17:359\n*S KotlinDebug\n*F\n+ 1 Border.kt\norg/jetbrains/jewel/foundation/modifier/BorderCache\n*L\n198#1:359,17\n*E\n"})
/*     */ final class BorderCache
/*     */ {
/*     */   @Nullable
/*     */   private ImageBitmap imageBitmap;
/*     */   @Nullable
/*     */   private Canvas canvas;
/*     */   @Nullable
/*     */   private CanvasDrawScope canvasDrawScope;
/*     */   @Nullable
/*     */   private Path borderPath;
/*     */   
/*     */   public BorderCache(@Nullable ImageBitmap imageBitmap, @Nullable Canvas canvas, @Nullable CanvasDrawScope canvasDrawScope, @Nullable Path borderPath) {
/* 168 */     this.imageBitmap = imageBitmap;
/* 169 */     this.canvas = canvas;
/* 170 */     this.canvasDrawScope = canvasDrawScope;
/* 171 */     this.borderPath = borderPath;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ImageBitmap drawBorderCache-EMwLDEs(@NotNull ContentDrawScope $this$drawBorderCache_u2dEMwLDEs, long borderSize, int config, @NotNull Function1 block) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$drawBorderCache'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #5
/*     */     //   8: ldc 'block'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: iconst_0
/*     */     //   14: istore #6
/*     */     //   16: aload_0
/*     */     //   17: invokestatic access$getImageBitmap$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;)Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   20: astore #7
/*     */     //   22: aload_0
/*     */     //   23: invokestatic access$getCanvas$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;)Landroidx/compose/ui/graphics/Canvas;
/*     */     //   26: astore #8
/*     */     //   28: aload #7
/*     */     //   30: dup
/*     */     //   31: ifnull -> 45
/*     */     //   34: invokeinterface getConfig-_sVssgQ : ()I
/*     */     //   39: invokestatic box-impl : (I)Landroidx/compose/ui/graphics/ImageBitmapConfig;
/*     */     //   42: goto -> 47
/*     */     //   45: pop
/*     */     //   46: aconst_null
/*     */     //   47: astore #10
/*     */     //   49: getstatic androidx/compose/ui/graphics/ImageBitmapConfig.Companion : Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;
/*     */     //   52: invokevirtual getArgb8888-_sVssgQ : ()I
/*     */     //   55: istore #11
/*     */     //   57: aload #10
/*     */     //   59: dup
/*     */     //   60: ifnonnull -> 68
/*     */     //   63: pop
/*     */     //   64: iconst_0
/*     */     //   65: goto -> 76
/*     */     //   68: invokevirtual unbox-impl : ()I
/*     */     //   71: iload #11
/*     */     //   73: invokestatic equals-impl0 : (II)Z
/*     */     //   76: ifne -> 106
/*     */     //   79: iload #4
/*     */     //   81: aload #7
/*     */     //   83: dup
/*     */     //   84: ifnull -> 98
/*     */     //   87: invokeinterface getConfig-_sVssgQ : ()I
/*     */     //   92: invokestatic box-impl : (I)Landroidx/compose/ui/graphics/ImageBitmapConfig;
/*     */     //   95: goto -> 100
/*     */     //   98: pop
/*     */     //   99: aconst_null
/*     */     //   100: invokestatic equals-impl : (ILjava/lang/Object;)Z
/*     */     //   103: ifeq -> 110
/*     */     //   106: iconst_1
/*     */     //   107: goto -> 111
/*     */     //   110: iconst_0
/*     */     //   111: istore #9
/*     */     //   113: aload #7
/*     */     //   115: ifnull -> 170
/*     */     //   118: aload #8
/*     */     //   120: ifnull -> 170
/*     */     //   123: aload_1
/*     */     //   124: invokeinterface getSize-NH-jbRc : ()J
/*     */     //   129: invokestatic getWidth-impl : (J)F
/*     */     //   132: aload #7
/*     */     //   134: invokeinterface getWidth : ()I
/*     */     //   139: i2f
/*     */     //   140: fcmpl
/*     */     //   141: ifgt -> 170
/*     */     //   144: aload_1
/*     */     //   145: invokeinterface getSize-NH-jbRc : ()J
/*     */     //   150: invokestatic getHeight-impl : (J)F
/*     */     //   153: aload #7
/*     */     //   155: invokeinterface getHeight : ()I
/*     */     //   160: i2f
/*     */     //   161: fcmpl
/*     */     //   162: ifgt -> 170
/*     */     //   165: iload #9
/*     */     //   167: ifne -> 231
/*     */     //   170: lload_2
/*     */     //   171: invokestatic getWidth-impl : (J)I
/*     */     //   174: lload_2
/*     */     //   175: invokestatic getHeight-impl : (J)I
/*     */     //   178: iload #4
/*     */     //   180: iconst_0
/*     */     //   181: aconst_null
/*     */     //   182: bipush #24
/*     */     //   184: aconst_null
/*     */     //   185: invokestatic ImageBitmap-x__-hDU$default : (IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;ILjava/lang/Object;)Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   188: astore #10
/*     */     //   190: aload #10
/*     */     //   192: astore #11
/*     */     //   194: iconst_0
/*     */     //   195: istore #12
/*     */     //   197: aload_0
/*     */     //   198: aload #11
/*     */     //   200: invokestatic access$setImageBitmap$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;Landroidx/compose/ui/graphics/ImageBitmap;)V
/*     */     //   203: aload #10
/*     */     //   205: astore #7
/*     */     //   207: aload #7
/*     */     //   209: invokestatic Canvas : (Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;
/*     */     //   212: astore #10
/*     */     //   214: aload #10
/*     */     //   216: astore #11
/*     */     //   218: iconst_0
/*     */     //   219: istore #12
/*     */     //   221: aload_0
/*     */     //   222: aload #11
/*     */     //   224: invokestatic access$setCanvas$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;Landroidx/compose/ui/graphics/Canvas;)V
/*     */     //   227: aload #10
/*     */     //   229: astore #8
/*     */     //   231: aload_0
/*     */     //   232: invokestatic access$getCanvasDrawScope$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   235: dup
/*     */     //   236: ifnonnull -> 264
/*     */     //   239: pop
/*     */     //   240: new androidx/compose/ui/graphics/drawscope/CanvasDrawScope
/*     */     //   243: dup
/*     */     //   244: invokespecial <init> : ()V
/*     */     //   247: astore #12
/*     */     //   249: aload #12
/*     */     //   251: astore #13
/*     */     //   253: iconst_0
/*     */     //   254: istore #14
/*     */     //   256: aload_0
/*     */     //   257: aload #13
/*     */     //   259: invokestatic access$setCanvasDrawScope$p : (Lorg/jetbrains/jewel/foundation/modifier/BorderCache;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V
/*     */     //   262: aload #12
/*     */     //   264: astore #10
/*     */     //   266: lload_2
/*     */     //   267: invokestatic toSize-ozmzZPI : (J)J
/*     */     //   270: lstore #11
/*     */     //   272: aload #10
/*     */     //   274: astore #13
/*     */     //   276: aload_1
/*     */     //   277: invokeinterface getLayoutDirection : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   282: astore #14
/*     */     //   284: iconst_0
/*     */     //   285: istore #15
/*     */     //   287: aload #13
/*     */     //   289: invokevirtual getDrawParams : ()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   292: astore #16
/*     */     //   294: aload #16
/*     */     //   296: invokevirtual component1 : ()Landroidx/compose/ui/unit/Density;
/*     */     //   299: astore #17
/*     */     //   301: aload #16
/*     */     //   303: invokevirtual component2 : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   306: astore #18
/*     */     //   308: aload #16
/*     */     //   310: invokevirtual component3 : ()Landroidx/compose/ui/graphics/Canvas;
/*     */     //   313: astore #19
/*     */     //   315: aload #16
/*     */     //   317: invokevirtual component4-NH-jbRc : ()J
/*     */     //   320: lstore #20
/*     */     //   322: aload #13
/*     */     //   324: invokevirtual getDrawParams : ()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   327: astore #22
/*     */     //   329: iconst_0
/*     */     //   330: istore #23
/*     */     //   332: aload #22
/*     */     //   334: aload_1
/*     */     //   335: checkcast androidx/compose/ui/unit/Density
/*     */     //   338: invokevirtual setDensity : (Landroidx/compose/ui/unit/Density;)V
/*     */     //   341: aload #22
/*     */     //   343: aload #14
/*     */     //   345: invokevirtual setLayoutDirection : (Landroidx/compose/ui/unit/LayoutDirection;)V
/*     */     //   348: aload #22
/*     */     //   350: aload #8
/*     */     //   352: invokevirtual setCanvas : (Landroidx/compose/ui/graphics/Canvas;)V
/*     */     //   355: aload #22
/*     */     //   357: lload #11
/*     */     //   359: invokevirtual setSize-uvyYCjk : (J)V
/*     */     //   362: nop
/*     */     //   363: nop
/*     */     //   364: aload #8
/*     */     //   366: invokeinterface save : ()V
/*     */     //   371: aload #13
/*     */     //   373: checkcast androidx/compose/ui/graphics/drawscope/DrawScope
/*     */     //   376: astore #24
/*     */     //   378: iconst_0
/*     */     //   379: istore #25
/*     */     //   381: aload #24
/*     */     //   383: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   386: invokevirtual getBlack-0d7_KjU : ()J
/*     */     //   389: lconst_0
/*     */     //   390: lload #11
/*     */     //   392: fconst_0
/*     */     //   393: aconst_null
/*     */     //   394: aconst_null
/*     */     //   395: getstatic androidx/compose/ui/graphics/BlendMode.Companion : Landroidx/compose/ui/graphics/BlendMode$Companion;
/*     */     //   398: invokevirtual getClear-0nO6VwU : ()I
/*     */     //   401: bipush #58
/*     */     //   403: aconst_null
/*     */     //   404: invokestatic drawRect-n-J9OG0$default : (Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
/*     */     //   407: aload #5
/*     */     //   409: aload #24
/*     */     //   411: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   416: pop
/*     */     //   417: nop
/*     */     //   418: nop
/*     */     //   419: aload #8
/*     */     //   421: invokeinterface restore : ()V
/*     */     //   426: aload #13
/*     */     //   428: invokevirtual getDrawParams : ()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   431: astore #22
/*     */     //   433: iconst_0
/*     */     //   434: istore #23
/*     */     //   436: aload #22
/*     */     //   438: aload #17
/*     */     //   440: invokevirtual setDensity : (Landroidx/compose/ui/unit/Density;)V
/*     */     //   443: aload #22
/*     */     //   445: aload #18
/*     */     //   447: invokevirtual setLayoutDirection : (Landroidx/compose/ui/unit/LayoutDirection;)V
/*     */     //   450: aload #22
/*     */     //   452: aload #19
/*     */     //   454: invokevirtual setCanvas : (Landroidx/compose/ui/graphics/Canvas;)V
/*     */     //   457: aload #22
/*     */     //   459: lload #20
/*     */     //   461: invokevirtual setSize-uvyYCjk : (J)V
/*     */     //   464: nop
/*     */     //   465: nop
/*     */     //   466: nop
/*     */     //   467: aload #7
/*     */     //   469: invokeinterface prepareToDraw : ()V
/*     */     //   474: aload #7
/*     */     //   476: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #178	-> 16
/*     */     //   #179	-> 22
/*     */     //   #181	-> 28
/*     */     //   #180	-> 111
/*     */     //   #184	-> 113
/*     */     //   #185	-> 113
/*     */     //   #186	-> 118
/*     */     //   #187	-> 123
/*     */     //   #188	-> 144
/*     */     //   #189	-> 165
/*     */     //   #192	-> 170
/*     */     //   #358	-> 194
/*     */     //   #192	-> 197
/*     */     //   #192	-> 203
/*     */     //   #191	-> 205
/*     */     //   #193	-> 207
/*     */     //   #358	-> 218
/*     */     //   #193	-> 221
/*     */     //   #193	-> 227
/*     */     //   #193	-> 229
/*     */     //   #196	-> 231
/*     */     //   #358	-> 253
/*     */     //   #196	-> 256
/*     */     //   #196	-> 262
/*     */     //   #196	-> 264
/*     */     //   #197	-> 266
/*     */     //   #198	-> 272
/*     */     //   #359	-> 287
/*     */     //   #360	-> 322
/*     */     //   #361	-> 332
/*     */     //   #362	-> 341
/*     */     //   #363	-> 348
/*     */     //   #364	-> 355
/*     */     //   #365	-> 362
/*     */     //   #360	-> 363
/*     */     //   #366	-> 364
/*     */     //   #367	-> 371
/*     */     //   #199	-> 381
/*     */     //   #200	-> 407
/*     */     //   #201	-> 417
/*     */     //   #367	-> 418
/*     */     //   #368	-> 419
/*     */     //   #369	-> 426
/*     */     //   #370	-> 436
/*     */     //   #371	-> 443
/*     */     //   #372	-> 450
/*     */     //   #373	-> 457
/*     */     //   #374	-> 464
/*     */     //   #369	-> 465
/*     */     //   #375	-> 466
/*     */     //   #202	-> 467
/*     */     //   #203	-> 474
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   197	6	12	$i$a$-also-BorderCache$drawBorderCache$1	I
/*     */     //   194	9	11	it	Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   221	6	12	$i$a$-also-BorderCache$drawBorderCache$2	I
/*     */     //   218	9	11	it	Landroidx/compose/ui/graphics/Canvas;
/*     */     //   256	6	14	$i$a$-also-BorderCache$drawBorderCache$targetDrawScope$1	I
/*     */     //   253	9	13	it	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   381	37	25	$i$a$-draw-yzxVdVo-BorderCache$drawBorderCache$3	I
/*     */     //   378	40	24	$this$drawBorderCache_EMwLDEs_u24lambda_u243	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   332	31	23	$i$a$-apply-CanvasDrawScope$draw$1$iv	I
/*     */     //   329	34	22	$this$draw_yzxVdVo_u24lambda_u240$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   436	29	23	$i$a$-apply-CanvasDrawScope$draw$2$iv	I
/*     */     //   433	32	22	$this$draw_yzxVdVo_u24lambda_u241$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
/*     */     //   287	180	15	$i$f$draw-yzxVdVo	I
/*     */     //   301	166	17	prevDensity$iv	Landroidx/compose/ui/unit/Density;
/*     */     //   308	159	18	prevLayoutDirection$iv	Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   315	152	19	prevCanvas$iv	Landroidx/compose/ui/graphics/Canvas;
/*     */     //   322	145	20	prevSize$iv	J
/*     */     //   284	183	13	this_$iv	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   284	183	14	layoutDirection$iv	Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   16	461	6	$i$f$drawBorderCache-EMwLDEs	I
/*     */     //   22	455	7	targetImageBitmap	Landroidx/compose/ui/graphics/ImageBitmap;
/*     */     //   28	449	8	targetCanvas	Landroidx/compose/ui/graphics/Canvas;
/*     */     //   113	364	9	compatibleConfig	Z
/*     */     //   266	211	10	targetDrawScope	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
/*     */     //   272	205	11	drawSize	J
/*     */     //   0	477	0	this	Lorg/jetbrains/jewel/foundation/modifier/BorderCache;
/*     */     //   0	477	1	$this$drawBorderCache_u2dEMwLDEs	Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
/*     */     //   0	477	2	borderSize	J
/*     */     //   0	477	4	config	I
/*     */     //   0	477	5	block	Lkotlin/jvm/functions/Function1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Path obtainPath() {
/* 206 */     if (this.borderPath == null) { Path path1 = SkiaBackedPath_skikoKt.Path(), it = path1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 358 */       int $i$a$-also-BorderCache$obtainPath$1 = 0;
/*     */       this.borderPath = it; }
/*     */     
/*     */     return path1;
/*     */   }
/*     */   
/*     */   public BorderCache() {
/*     */     this(null, null, null, null, 15, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\BorderCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */