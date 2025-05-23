/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.annotation.FloatRange;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\033\020\017\032\0020\0202\006\020\021\032\0020\022H\002ø\001\000¢\006\004\b\023\020\024J\030\020\025\032\0020\0262\006\020\n\032\0020\0132\b\b\003\020\r\032\0020\016R\016\020\003\032\0020\004X\016¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000R\016\020\n\032\0020\013X\016¢\006\002\n\000R\016\020\f\032\0020\006X\004¢\006\002\n\000R\016\020\r\032\0020\016X\016¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\027"}, d2 = {"Landroidx/compose/ui/graphics/PathHitTester;", "", "()V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "curves", "", "intervals", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "path", "Landroidx/compose/ui/graphics/Path;", "roots", "tolerance", "", "contains", "", "position", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "updatePath", "", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,171:1\n67#2:172\n81#2:174\n22#3:173\n70#4:175\n73#4:176\n166#5,21:177\n*S KotlinDebug\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n*L\n108#1:172\n108#1:174\n108#1:173\n130#1:175\n133#1:176\n139#1:177,21\n*E\n"})
/*     */ public final class PathHitTester
/*     */ {
/*     */   @NotNull
/*  61 */   private Path path = PathHitTesterKt.access$getEmptyPath$p();
/*  62 */   private float tolerance = 0.5F;
/*     */   
/*     */   @NotNull
/*  65 */   private Rect bounds = Rect.Companion.getZero();
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  70 */   private final IntervalTree<PathSegment> intervals = new IntervalTree<>();
/*     */   
/*     */   @NotNull
/*  73 */   private final float[] curves = new float[20]; @NotNull
/*  74 */   private final float[] roots = new float[2];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void updatePath(@NotNull Path path, @FloatRange(from = 0.0D) float tolerance) {
/*  93 */     Intrinsics.checkNotNullParameter(path, "path"); this.path = path;
/*  94 */     this.tolerance = tolerance;
/*  95 */     this.bounds = path.getBounds();
/*     */     
/*  97 */     this.intervals.clear();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     PathIterator iterator = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, tolerance);
/* 103 */     for (PathIterator pathIterator1 = iterator; pathIterator1.hasNext(); ) { long l; float min; int $i$f$component1-impl; float max; int bits$iv$iv, $i$f$component2-impl, $i$f$floatFromBits, i, j; PathSegment segment = pathIterator1.next();
/* 104 */       switch (WhenMappings.$EnumSwitchMapping$0[segment.getType().ordinal()]) {
/*     */         case 1:
/*     */         case 2:
/*     */         case 3:
/* 108 */           l = BezierKt.computeVerticalBounds$default(segment, this.curves, 0, 4, null); $i$f$component1-impl = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 172 */           bits$iv$iv = (int)(l >> 32L); $i$f$floatFromBits = 0;
/* 173 */           min = Float.intBitsToFloat(bits$iv$iv); $i$f$component2-impl = 0;
/* 174 */           i = (int)(l & 0xFFFFFFFFL); j = 0;
/*     */           max = Float.intBitsToFloat(i);
/*     */           this.intervals.addInterval(min, max, segment);
/*     */         case 4:
/*     */           break;
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public final boolean contains-k-4lQ0M(long position) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_3
/*     */     //   2: aload_0
/*     */     //   3: getfield path : Landroidx/compose/ui/graphics/Path;
/*     */     //   6: invokeinterface isEmpty : ()Z
/*     */     //   11: ifne -> 25
/*     */     //   14: aload_0
/*     */     //   15: getfield bounds : Landroidx/compose/ui/geometry/Rect;
/*     */     //   18: lload_1
/*     */     //   19: invokevirtual contains-k-4lQ0M : (J)Z
/*     */     //   22: ifne -> 27
/*     */     //   25: iload_3
/*     */     //   26: ireturn
/*     */     //   27: iconst_0
/*     */     //   28: istore #5
/*     */     //   30: lload_1
/*     */     //   31: invokestatic getX-impl : (J)F
/*     */     //   34: fstore #4
/*     */     //   36: iconst_0
/*     */     //   37: istore #6
/*     */     //   39: lload_1
/*     */     //   40: invokestatic getY-impl : (J)F
/*     */     //   43: fstore #5
/*     */     //   45: aload_0
/*     */     //   46: getfield curves : [F
/*     */     //   49: astore #6
/*     */     //   51: aload_0
/*     */     //   52: getfield roots : [F
/*     */     //   55: astore #7
/*     */     //   57: iconst_0
/*     */     //   58: istore #8
/*     */     //   60: aload_0
/*     */     //   61: getfield intervals : Landroidx/compose/ui/graphics/IntervalTree;
/*     */     //   64: astore #9
/*     */     //   66: fload #5
/*     */     //   68: fstore #10
/*     */     //   70: iconst_0
/*     */     //   71: istore #11
/*     */     //   73: aload #9
/*     */     //   75: invokestatic access$getRoot$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   78: aload #9
/*     */     //   80: invokestatic access$getTerminator$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   83: if_acmpeq -> 360
/*     */     //   86: aload #9
/*     */     //   88: invokestatic access$getStack$p : (Landroidx/compose/ui/graphics/IntervalTree;)Ljava/util/ArrayList;
/*     */     //   91: astore #12
/*     */     //   93: aload #12
/*     */     //   95: aload #9
/*     */     //   97: invokestatic access$getRoot$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   100: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   103: pop
/*     */     //   104: aload #12
/*     */     //   106: invokevirtual size : ()I
/*     */     //   109: ifle -> 355
/*     */     //   112: aload #12
/*     */     //   114: checkcast java/util/List
/*     */     //   117: invokestatic removeLast : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   120: checkcast androidx/compose/ui/graphics/IntervalTree$Node
/*     */     //   123: astore #13
/*     */     //   125: aload #13
/*     */     //   127: fload #5
/*     */     //   129: fload #10
/*     */     //   131: invokevirtual overlaps : (FF)Z
/*     */     //   134: ifeq -> 276
/*     */     //   137: aload #13
/*     */     //   139: checkcast androidx/compose/ui/graphics/Interval
/*     */     //   142: astore #14
/*     */     //   144: iconst_0
/*     */     //   145: istore #15
/*     */     //   147: aload #14
/*     */     //   149: invokevirtual getData : ()Ljava/lang/Object;
/*     */     //   152: dup
/*     */     //   153: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   156: checkcast androidx/compose/ui/graphics/PathSegment
/*     */     //   159: astore #16
/*     */     //   161: aload #16
/*     */     //   163: invokevirtual getPoints : ()[F
/*     */     //   166: astore #17
/*     */     //   168: aload #16
/*     */     //   170: invokevirtual getType : ()Landroidx/compose/ui/graphics/PathSegment$Type;
/*     */     //   173: getstatic androidx/compose/ui/graphics/PathHitTester$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   176: swap
/*     */     //   177: invokevirtual ordinal : ()I
/*     */     //   180: iaload
/*     */     //   181: tableswitch default -> 274, 1 -> 212, 2 -> 229, 3 -> 250, 4 -> 271
/*     */     //   212: iload #8
/*     */     //   214: aload #17
/*     */     //   216: fload #4
/*     */     //   218: fload #5
/*     */     //   220: invokestatic lineWinding : ([FFF)I
/*     */     //   223: iadd
/*     */     //   224: istore #8
/*     */     //   226: goto -> 274
/*     */     //   229: iload #8
/*     */     //   231: aload #17
/*     */     //   233: fload #4
/*     */     //   235: fload #5
/*     */     //   237: aload #6
/*     */     //   239: aload #7
/*     */     //   241: invokestatic quadraticWinding : ([FFF[F[F)I
/*     */     //   244: iadd
/*     */     //   245: istore #8
/*     */     //   247: goto -> 274
/*     */     //   250: iload #8
/*     */     //   252: aload #17
/*     */     //   254: fload #4
/*     */     //   256: fload #5
/*     */     //   258: aload #6
/*     */     //   260: aload #7
/*     */     //   262: invokestatic cubicWinding : ([FFF[F[F)I
/*     */     //   265: iadd
/*     */     //   266: istore #8
/*     */     //   268: goto -> 274
/*     */     //   271: goto -> 275
/*     */     //   274: nop
/*     */     //   275: nop
/*     */     //   276: aload #13
/*     */     //   278: invokevirtual getLeft : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   281: aload #9
/*     */     //   283: invokestatic access$getTerminator$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   286: if_acmpeq -> 314
/*     */     //   289: aload #13
/*     */     //   291: invokevirtual getLeft : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   294: invokevirtual getMax : ()F
/*     */     //   297: fload #5
/*     */     //   299: fcmpl
/*     */     //   300: iflt -> 314
/*     */     //   303: aload #12
/*     */     //   305: aload #13
/*     */     //   307: invokevirtual getLeft : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   310: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   313: pop
/*     */     //   314: aload #13
/*     */     //   316: invokevirtual getRight : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   319: aload #9
/*     */     //   321: invokestatic access$getTerminator$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   324: if_acmpeq -> 104
/*     */     //   327: aload #13
/*     */     //   329: invokevirtual getRight : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   332: invokevirtual getMin : ()F
/*     */     //   335: fload #10
/*     */     //   337: fcmpg
/*     */     //   338: ifgt -> 104
/*     */     //   341: aload #12
/*     */     //   343: aload #13
/*     */     //   345: invokevirtual getRight : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   348: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   351: pop
/*     */     //   352: goto -> 104
/*     */     //   355: aload #12
/*     */     //   357: invokevirtual clear : ()V
/*     */     //   360: nop
/*     */     //   361: aload_0
/*     */     //   362: getfield path : Landroidx/compose/ui/graphics/Path;
/*     */     //   365: invokeinterface getFillType-Rg-k1Os : ()I
/*     */     //   370: getstatic androidx/compose/ui/graphics/PathFillType.Companion : Landroidx/compose/ui/graphics/PathFillType$Companion;
/*     */     //   373: invokevirtual getEvenOdd-Rg-k1Os : ()I
/*     */     //   376: invokestatic equals-impl0 : (II)Z
/*     */     //   379: istore #9
/*     */     //   381: iload #9
/*     */     //   383: ifeq -> 392
/*     */     //   386: iload #8
/*     */     //   388: iconst_1
/*     */     //   389: iand
/*     */     //   390: istore #8
/*     */     //   392: iload #8
/*     */     //   394: ifeq -> 399
/*     */     //   397: iconst_1
/*     */     //   398: ireturn
/*     */     //   399: iconst_0
/*     */     //   400: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #127	-> 0
/*     */     //   #129	-> 2
/*     */     //   #130	-> 25
/*     */     //   #175	-> 30
/*     */     //   #133	-> 34
/*     */     //   #176	-> 39
/*     */     //   #133	-> 43
/*     */     //   #134	-> 45
/*     */     //   #135	-> 51
/*     */     //   #137	-> 57
/*     */     //   #139	-> 60
/*     */     //   #177	-> 66
/*     */     //   #179	-> 66
/*     */     //   #177	-> 70
/*     */     //   #182	-> 73
/*     */     //   #183	-> 86
/*     */     //   #184	-> 93
/*     */     //   #185	-> 104
/*     */     //   #186	-> 112
/*     */     //   #187	-> 125
/*     */     //   #140	-> 147
/*     */     //   #141	-> 161
/*     */     //   #142	-> 168
/*     */     //   #144	-> 212
/*     */     //   #147	-> 229
/*     */     //   #150	-> 250
/*     */     //   #152	-> 271
/*     */     //   #155	-> 274
/*     */     //   #187	-> 275
/*     */     //   #188	-> 276
/*     */     //   #189	-> 303
/*     */     //   #191	-> 314
/*     */     //   #192	-> 341
/*     */     //   #195	-> 355
/*     */     //   #197	-> 360
/*     */     //   #157	-> 361
/*     */     //   #158	-> 381
/*     */     //   #159	-> 386
/*     */     //   #162	-> 392
/*     */     //   #163	-> 397
/*     */     //   #168	-> 399
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   30	4	5	$i$f$component1-impl	I
/*     */     //   39	4	6	$i$f$component2-impl	I
/*     */     //   147	128	15	$i$a$-forEach$ui_graphics$default-PathHitTester$contains$1	I
/*     */     //   161	114	16	segment	Landroidx/compose/ui/graphics/PathSegment;
/*     */     //   168	107	17	points	[F
/*     */     //   144	131	14	interval	Landroidx/compose/ui/graphics/Interval;
/*     */     //   125	227	13	node$iv	Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   93	267	12	s$iv	Ljava/util/ArrayList;
/*     */     //   73	288	11	$i$f$forEach$ui_graphics	I
/*     */     //   66	295	9	$this$iv	Landroidx/compose/ui/graphics/IntervalTree;
/*     */     //   70	291	10	end$iv	F
/*     */     //   2	399	3	isInverse	Z
/*     */     //   36	365	4	x	F
/*     */     //   45	356	5	y	F
/*     */     //   51	350	6	curvesArray	[F
/*     */     //   57	344	7	rootsArray	[F
/*     */     //   60	341	8	winding	I
/*     */     //   381	20	9	isEvenOdd	Z
/*     */     //   0	401	0	this	Landroidx/compose/ui/graphics/PathHitTester;
/*     */     //   0	401	1	position	J
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathHitTester.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */