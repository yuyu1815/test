/*     */ package androidx.compose.ui.graphics.colorspace;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmOverloads;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000F\n\000\n\002\020\006\n\002\b\b\n\002\020\024\n\002\b\004\n\002\020\013\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\007\n\002\b\f\n\002\030\002\n\002\b\003\0328\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\000\0328\020\b\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\000\032 \020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\n2\006\020\r\032\0020\nH\000\032\032\020\016\032\0020\0172\006\020\003\032\0020\0202\b\020\004\032\004\030\0010\020H\000\032\030\020\016\032\0020\0172\006\020\003\032\0020\0212\006\020\004\032\0020\021H\000\032\030\020\016\032\0020\0172\006\020\003\032\0020\n2\006\020\004\032\0020\nH\000\032*\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\0252\006\020\027\032\0020\030H\002ø\001\000¢\006\004\b\031\020\032\032\020\020\033\032\0020\n2\006\020\034\032\0020\nH\000\032\030\020\035\032\0020\n2\006\020\036\032\0020\n2\006\020\037\032\0020\nH\000\032\030\020 \032\0020\n2\006\020\036\032\0020\n2\006\020\037\032\0020\nH\000\032\030\020!\032\0020\n2\006\020\036\032\0020\n2\006\020\037\032\0020\nH\000\032)\020\"\032\0020#2\006\020\036\032\0020\n2\006\020$\032\0020#2\006\020%\032\0020#2\006\020&\032\0020#H\b\032)\020'\032\0020#2\006\020\036\032\0020\n2\006\020$\032\0020#2\006\020%\032\0020#2\006\020&\032\0020#H\b\032)\020(\032\0020#2\006\020\036\032\0020\n2\006\020$\032\0020#2\006\020%\032\0020#2\006\020&\032\0020#H\b\0328\020)\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\000\032H\020)\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020*\032\0020\0012\006\020+\032\0020\0012\006\020\007\032\0020\001H\000\0328\020,\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\000\032H\020,\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020*\032\0020\0012\006\020+\032\0020\0012\006\020\007\032\0020\001H\000\032\036\020-\032\0020\025*\0020\0252\006\020.\032\0020\0212\b\b\002\020/\032\00200H\007\032(\0201\032\0020\023*\0020\0252\b\b\002\020\026\032\0020\0252\b\b\002\020\027\032\0020\030ø\001\000¢\006\004\b2\020\032\002\007\n\005\b¡\0360\001¨\0063"}, d2 = {"absRcpResponse", "", "x", "a", "b", "c", "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "createConnector", "Landroidx/compose/ui/graphics/colorspace/Connector;", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "createConnector-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", "e", "f", "response", "adapt", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "connect-YBCOT_4", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,802:1\n347#2:803\n728#3:804\n1#4:805\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n460#1:803\n460#1:804\n460#1:805\n*E\n"})
/*     */ public final class ColorSpaceKt
/*     */ {
/*     */   private static final Connector createConnector-YBCOT_4(ColorSpace source, ColorSpace destination, int intent) {
/* 428 */     Intrinsics.checkNotNull(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
/* 429 */     Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb"); return (source == destination) ? Connector.Companion.identity$ui_graphics(source) : ((ColorModel.equals-impl0(source.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw()) && ColorModel.equals-impl0(destination.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw())) ? new Connector.RgbConnector((Rgb)source, (Rgb)destination, 
/* 430 */         intent, null) : 
/*     */ 
/*     */       
/* 433 */       new Connector(source, destination, intent, null));
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
/*     */   public static final Connector connect-YBCOT_4(@NotNull ColorSpace $this$connect_u2dYBCOT_4, @NotNull ColorSpace destination, int intent) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$this$connect'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'destination'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: invokevirtual getId$ui_graphics : ()I
/*     */     //   16: istore_3
/*     */     //   17: aload_1
/*     */     //   18: invokevirtual getId$ui_graphics : ()I
/*     */     //   21: istore #4
/*     */     //   23: iload_3
/*     */     //   24: iload #4
/*     */     //   26: ior
/*     */     //   27: ifge -> 39
/*     */     //   30: aload_0
/*     */     //   31: aload_1
/*     */     //   32: iload_2
/*     */     //   33: invokestatic createConnector-YBCOT_4 : (Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;
/*     */     //   36: goto -> 110
/*     */     //   39: invokestatic getConnectors : ()Landroidx/collection/MutableIntObjectMap;
/*     */     //   42: astore #5
/*     */     //   44: iconst_0
/*     */     //   45: istore #6
/*     */     //   47: iload_3
/*     */     //   48: iload #4
/*     */     //   50: bipush #6
/*     */     //   52: ishl
/*     */     //   53: ior
/*     */     //   54: iload_2
/*     */     //   55: bipush #12
/*     */     //   57: ishl
/*     */     //   58: ior
/*     */     //   59: istore #6
/*     */     //   61: nop
/*     */     //   62: iconst_0
/*     */     //   63: istore #7
/*     */     //   65: aload #5
/*     */     //   67: iload #6
/*     */     //   69: invokevirtual get : (I)Ljava/lang/Object;
/*     */     //   72: dup
/*     */     //   73: ifnonnull -> 106
/*     */     //   76: pop
/*     */     //   77: iconst_0
/*     */     //   78: istore #8
/*     */     //   80: aload_0
/*     */     //   81: aload_1
/*     */     //   82: iload_2
/*     */     //   83: invokestatic createConnector-YBCOT_4 : (Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;
/*     */     //   86: astore #9
/*     */     //   88: aload #9
/*     */     //   90: astore #10
/*     */     //   92: iconst_0
/*     */     //   93: istore #11
/*     */     //   95: aload #5
/*     */     //   97: iload #6
/*     */     //   99: aload #10
/*     */     //   101: invokevirtual set : (ILjava/lang/Object;)V
/*     */     //   104: aload #9
/*     */     //   106: nop
/*     */     //   107: checkcast androidx/compose/ui/graphics/colorspace/Connector
/*     */     //   110: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #455	-> 12
/*     */     //   #456	-> 17
/*     */     //   #457	-> 23
/*     */     //   #458	-> 30
/*     */     //   #460	-> 39
/*     */     //   #803	-> 47
/*     */     //   #460	-> 61
/*     */     //   #804	-> 65
/*     */     //   #461	-> 80
/*     */     //   #804	-> 86
/*     */     //   #805	-> 92
/*     */     //   #804	-> 95
/*     */     //   #804	-> 104
/*     */     //   #804	-> 106
/*     */     //   #457	-> 110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	12	6	$i$f$connectorKey-YBCOT_4	I
/*     */     //   80	6	8	$i$a$-getOrPut-ColorSpaceKt$connect$1	I
/*     */     //   95	9	11	$i$a$-also-MutableIntObjectMap$getOrPut$1$iv	I
/*     */     //   92	12	10	it$iv	Ljava/lang/Object;
/*     */     //   65	42	7	$i$f$getOrPut	I
/*     */     //   62	45	5	this_$iv	Landroidx/collection/MutableIntObjectMap;
/*     */     //   62	45	6	key$iv	I
/*     */     //   17	94	3	srcId	I
/*     */     //   23	88	4	dstId	I
/*     */     //   0	111	0	$this$connect_u2dYBCOT_4	Landroidx/compose/ui/graphics/colorspace/ColorSpace;
/*     */     //   0	111	1	destination	Landroidx/compose/ui/graphics/colorspace/ColorSpace;
/*     */     //   0	111	2	intent	I
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmOverloads
/*     */   @NotNull
/*     */   public static final ColorSpace adapt(@NotNull ColorSpace $this$adapt, @NotNull WhitePoint whitePoint, @NotNull Adaptation adaptation) {
/* 488 */     Intrinsics.checkNotNullParameter($this$adapt, "<this>"); Intrinsics.checkNotNullParameter(whitePoint, "whitePoint"); Intrinsics.checkNotNullParameter(adaptation, "adaptation"); if (ColorModel.equals-impl0($this$adapt.getModel-xdoWZVw(), ColorModel.Companion.getRgb-xdoWZVw())) {
/* 489 */       Rgb rgb = (Rgb)$this$adapt;
/* 490 */       if (compare(rgb.getWhitePoint(), whitePoint)) {
/* 491 */         return $this$adapt;
/*     */       }
/*     */       
/* 494 */       float[] xyz = whitePoint.toXyz$ui_graphics();
/* 495 */       float[] adaptationTransform = 
/* 496 */         chromaticAdaptation(
/* 497 */           adaptation.getTransform$ui_graphics(), 
/* 498 */           rgb.getWhitePoint().toXyz$ui_graphics(), 
/* 499 */           xyz);
/*     */       
/* 501 */       float[] transform = mul3x3(
/* 502 */           adaptationTransform, 
/* 503 */           rgb.getTransform$ui_graphics());
/*     */ 
/*     */       
/* 506 */       return new Rgb(rgb, transform, whitePoint);
/*     */     } 
/* 508 */     return $this$adapt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final double rcpResponse(double x, double a, double b, double c, double d, double g) {
/* 514 */     return (x >= d * c) ? ((Math.pow(x, 1.0D / g) - b) / a) : (x / c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final double response(double x, double a, double b, double c, double d, double g) {
/* 520 */     return (x >= d) ? Math.pow(a * x + b, g) : (c * x);
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
/*     */   public static final double rcpResponse(double x, double a, double b, double c, double d, double e, double f, double g) {
/* 534 */     return (x >= d * c) ? ((Math.pow(x - e, 1.0D / g) - b) / a) : ((x - f) / c);
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
/*     */   public static final double response(double x, double a, double b, double c, double d, double e, double f, double g) {
/* 548 */     return (x >= d) ? (Math.pow(a * x + b, g) + e) : (c * x + f);
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
/*     */   public static final double absRcpResponse(double x, double a, double b, double c, double d, double g) {
/* 561 */     return Math.copySign(rcpResponse((x < 0.0D) ? -x : x, a, b, c, d, g), x);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final double absResponse(double x, double a, double b, double c, double d, double g) {
/* 568 */     return Math.copySign(response((x < 0.0D) ? -x : x, a, b, c, d, g), x);
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
/*     */   public static final boolean compare(@NotNull TransferParameters a, @Nullable TransferParameters b) {
/* 580 */     Intrinsics.checkNotNullParameter(a, "a"); if (b != null && 
/* 581 */       Math.abs(a.getA() - b.getA()) < 0.001D && 
/* 582 */       Math.abs(a.getB() - b.getB()) < 0.001D && 
/* 583 */       Math.abs(a.getC() - b.getC()) < 0.001D && 
/* 584 */       Math.abs(a.getD() - b.getD()) < 0.002D)
/*     */     {
/* 586 */       if (Math.abs(a.getE() - b.getE()) < 0.001D && 
/* 587 */         Math.abs(a.getF() - b.getF()) < 0.001D && 
/* 588 */         Math.abs(a.getGamma() - b.getGamma()) < 0.001D);
/*     */     }
/*     */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean compare(@NotNull WhitePoint a, @NotNull WhitePoint b) {
/* 600 */     Intrinsics.checkNotNullParameter(a, "a"); Intrinsics.checkNotNullParameter(b, "b"); if (a == b) return true; 
/* 601 */     return (Math.abs(a.getX() - b.getX()) < 0.001F && Math.abs(a.getY() - b.getY()) < 0.001F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean compare(@NotNull float[] a, @NotNull float[] b) {
/* 612 */     Intrinsics.checkNotNullParameter(a, "a"); Intrinsics.checkNotNullParameter(b, "b"); if (a == b) return true; 
/* 613 */     for (int i = 0, j = a.length; i < j; i++) {
/*     */       
/* 615 */       if (Float.compare(a[i], b[i]) != 0 && Math.abs(a[i] - b[i]) > 0.001F) return false; 
/*     */     } 
/* 617 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final float[] inverse3x3(@NotNull float[] m) {
/* 627 */     Intrinsics.checkNotNullParameter(m, "m"); float a = m[0];
/* 628 */     float b = m[3];
/* 629 */     float c = m[6];
/* 630 */     float d = m[1];
/* 631 */     float e = m[4];
/* 632 */     float f = m[7];
/* 633 */     float g = m[2];
/* 634 */     float h = m[5];
/* 635 */     float i = m[8];
/*     */     
/* 637 */     float xA = e * i - f * h;
/* 638 */     float xB = f * g - d * i;
/* 639 */     float xC = d * h - e * g;
/*     */     
/* 641 */     float det = a * xA + b * xB + c * xC;
/*     */     
/* 643 */     float[] inverted = new float[m.length];
/* 644 */     inverted[0] = xA / det;
/* 645 */     inverted[1] = xB / det;
/* 646 */     inverted[2] = xC / det;
/* 647 */     inverted[3] = (c * h - b * i) / det;
/* 648 */     inverted[4] = (a * i - c * g) / det;
/* 649 */     inverted[5] = (b * g - a * h) / det;
/* 650 */     inverted[6] = (b * f - c * e) / det;
/* 651 */     inverted[7] = (c * d - a * f) / det;
/* 652 */     inverted[8] = (a * e - b * d) / det;
/* 653 */     return inverted;
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
/*     */   @NotNull
/*     */   public static final float[] mul3x3(@NotNull float[] lhs, @NotNull float[] rhs) {
/* 666 */     Intrinsics.checkNotNullParameter(lhs, "lhs"); Intrinsics.checkNotNullParameter(rhs, "rhs"); float[] r = new float[9];
/* 667 */     r[0] = lhs[0] * rhs[0] + lhs[3] * rhs[1] + lhs[6] * rhs[2];
/* 668 */     r[1] = lhs[1] * rhs[0] + lhs[4] * rhs[1] + lhs[7] * rhs[2];
/* 669 */     r[2] = lhs[2] * rhs[0] + lhs[5] * rhs[1] + lhs[8] * rhs[2];
/* 670 */     r[3] = lhs[0] * rhs[3] + lhs[3] * rhs[4] + lhs[6] * rhs[5];
/* 671 */     r[4] = lhs[1] * rhs[3] + lhs[4] * rhs[4] + lhs[7] * rhs[5];
/* 672 */     r[5] = lhs[2] * rhs[3] + lhs[5] * rhs[4] + lhs[8] * rhs[5];
/* 673 */     r[6] = lhs[0] * rhs[6] + lhs[3] * rhs[7] + lhs[6] * rhs[8];
/* 674 */     r[7] = lhs[1] * rhs[6] + lhs[4] * rhs[7] + lhs[7] * rhs[8];
/* 675 */     r[8] = lhs[2] * rhs[6] + lhs[5] * rhs[7] + lhs[8] * rhs[8];
/* 676 */     return r;
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
/*     */   @NotNull
/*     */   public static final float[] mul3x3Float3(@NotNull float[] lhs, @NotNull float[] rhs) {
/* 691 */     Intrinsics.checkNotNullParameter(lhs, "lhs"); Intrinsics.checkNotNullParameter(rhs, "rhs"); float r0 = rhs[0];
/* 692 */     float r1 = rhs[1];
/* 693 */     float r2 = rhs[2];
/* 694 */     rhs[0] = lhs[0] * r0 + lhs[3] * r1 + lhs[6] * r2;
/* 695 */     rhs[1] = lhs[1] * r0 + lhs[4] * r1 + lhs[7] * r2;
/* 696 */     rhs[2] = lhs[2] * r0 + lhs[5] * r1 + lhs[8] * r2;
/* 697 */     return rhs;
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
/*     */ 
/*     */   
/*     */   public static final float mul3x3Float3_0(@NotNull float[] lhs, float r0, float r1, float r2) {
/* 716 */     Intrinsics.checkNotNullParameter(lhs, "lhs"); int $i$f$mul3x3Float3_0 = 0; return lhs[0] * r0 + lhs[3] * r1 + lhs[6] * r2;
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
/*     */ 
/*     */   
/*     */   public static final float mul3x3Float3_1(@NotNull float[] lhs, float r0, float r1, float r2) {
/* 735 */     Intrinsics.checkNotNullParameter(lhs, "lhs"); int $i$f$mul3x3Float3_1 = 0; return lhs[1] * r0 + lhs[4] * r1 + lhs[7] * r2;
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
/*     */ 
/*     */   
/*     */   public static final float mul3x3Float3_2(@NotNull float[] lhs, float r0, float r1, float r2) {
/* 754 */     Intrinsics.checkNotNullParameter(lhs, "lhs"); int $i$f$mul3x3Float3_2 = 0; return lhs[2] * r0 + lhs[5] * r1 + lhs[8] * r2;
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
/*     */   public static final float[] mul3x3Diag(@NotNull float[] lhs, @NotNull float[] rhs) {
/* 771 */     Intrinsics.checkNotNullParameter(lhs, "lhs"); Intrinsics.checkNotNullParameter(rhs, "rhs"); float[] arrayOfFloat = new float[9]; arrayOfFloat[0] = lhs[0] * rhs[0]; arrayOfFloat[1] = lhs[1] * rhs[1]; arrayOfFloat[2] = lhs[2] * rhs[2]; arrayOfFloat[3] = 
/* 772 */       lhs[0] * rhs[3]; arrayOfFloat[4] = lhs[1] * rhs[4]; arrayOfFloat[5] = lhs[2] * rhs[5];
/* 773 */     arrayOfFloat[6] = lhs[0] * rhs[6]; arrayOfFloat[7] = lhs[1] * rhs[7]; arrayOfFloat[8] = lhs[2] * rhs[8];
/*     */     return arrayOfFloat;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final float[] chromaticAdaptation(@NotNull float[] matrix, @NotNull float[] srcWhitePoint, @NotNull float[] dstWhitePoint) {
/* 796 */     Intrinsics.checkNotNullParameter(matrix, "matrix"); Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint"); Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint"); float[] srcLMS = mul3x3Float3(matrix, srcWhitePoint);
/* 797 */     float[] dstLMS = mul3x3Float3(matrix, dstWhitePoint);
/*     */     
/* 799 */     float[] arrayOfFloat1 = new float[3]; arrayOfFloat1[0] = dstLMS[0] / srcLMS[0]; arrayOfFloat1[1] = dstLMS[1] / srcLMS[1]; arrayOfFloat1[2] = dstLMS[2] / srcLMS[2]; float[] LMS = arrayOfFloat1;
/* 800 */     return mul3x3(inverse3x3(matrix), mul3x3Diag(LMS, matrix));
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*     */   @NotNull
/*     */   public static final ColorSpace adapt(@NotNull ColorSpace $this$adapt, @NotNull WhitePoint whitePoint) {
/*     */     Intrinsics.checkNotNullParameter($this$adapt, "<this>");
/*     */     Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
/*     */     return adapt$default($this$adapt, whitePoint, null, 2, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\ColorSpaceKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */