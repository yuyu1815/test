/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.animation.core.internal.ArraysKt;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\025\n\000\n\002\020\024\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\002\n\000\n\002\020\007\n\002\b\005\b\001\030\000 \0252\0020\001:\002\024\025B#\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\0050\007¢\006\002\020\bJ\026\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\005J\026\020\023\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\005R\034\020\t\032\016\022\n\022\b\022\004\022\0020\n0\0070\007X\004¢\006\004\n\002\020\013R\016\020\f\032\0020\rXD¢\006\002\n\000¨\006\026"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "arcModes", "", "timePoints", "", "y", "", "([I[F[[F)V", "arcs", "Landroidx/compose/animation/core/ArcSpline$Arc;", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "isExtrapolate", "", "getPos", "", "time", "", "v", "getSlope", "Arc", "Companion", "animation-core"})
/*     */ @ExperimentalAnimationSpecApi
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class ArcSpline
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Arc[][] arcs;
/*     */   private final boolean isExtrapolate = true;
/*     */   public static final int $stable = 8;
/*     */   public static final int ArcStartVertical = 1;
/*     */   public static final int ArcStartHorizontal = 2;
/*     */   public static final int ArcStartFlip = 3;
/*     */   public static final int ArcBelow = 4;
/*     */   public static final int ArcAbove = 5;
/*     */   public static final int ArcStartLinear = 0;
/*     */   private static final int StartVertical = 1;
/*     */   private static final int StartHorizontal = 2;
/*     */   private static final int StartLinear = 3;
/*     */   private static final int DownArc = 4;
/*     */   private static final int UpArc = 5;
/*     */   
/*     */   public ArcSpline(@NotNull int[] arcModes, @NotNull float[] timePoints, @NotNull float[][] y) {
/*  45 */     int mode = 1;
/*  46 */     int last = 1; byte b; int i; Arc[][] arrayOfArc;
/*     */     ArcSpline arcSpline;
/*  48 */     for (b = 0, i = timePoints.length - 1, arrayOfArc = new Arc[i][], arcSpline = this; b < i; ) { byte b1 = b;
/*  49 */       switch (arcModes[b1]) {
/*     */         case 1:
/*  51 */           mode = 1;
/*  52 */           last = mode;
/*     */           break;
/*     */         
/*     */         case 2:
/*  56 */           mode = 2;
/*  57 */           last = mode;
/*     */           break;
/*     */         
/*     */         case 3:
/*  61 */           mode = (last == 1) ? 2 : 1;
/*  62 */           last = mode;
/*     */           break;
/*     */         case 0:
/*  65 */           mode = 3; break;
/*  66 */         case 5: mode = 5; break;
/*  67 */         case 4: mode = 4; break;
/*     */       } 
/*  69 */       int dim = (y[b1]).length / 2 + (y[b1]).length % 2; Arc arrayOfArc1[], arrayOfArc2[][]; byte b3;
/*  70 */       for (byte b2 = 0; b2 < dim; ) { byte b4 = b2;
/*  71 */         int k = b4 * 2;
/*  72 */         arrayOfArc1[b4] = new Arc(
/*  73 */             mode, 
/*  74 */             timePoints[b1], 
/*  75 */             timePoints[b1 + 1], 
/*  76 */             y[b1][k], 
/*  77 */             y[b1][k + 1], 
/*  78 */             y[b1 + 1][k], 
/*  79 */             y[b1 + 1][k + 1]);
/*     */         b2++; }
/*     */       
/*     */       arrayOfArc2[b3] = arrayOfArc1;
/*     */       b++; }
/*     */     
/*     */     arcSpline.arcs = arrayOfArc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void getPos(float time, @NotNull float[] v) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'v'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: fload_1
/*     */     //   7: fstore_3
/*     */     //   8: aload_0
/*     */     //   9: getfield isExtrapolate : Z
/*     */     //   12: ifeq -> 348
/*     */     //   15: fload_3
/*     */     //   16: aload_0
/*     */     //   17: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   20: iconst_0
/*     */     //   21: aaload
/*     */     //   22: iconst_0
/*     */     //   23: aaload
/*     */     //   24: invokevirtual getTime1 : ()F
/*     */     //   27: fcmpg
/*     */     //   28: iflt -> 56
/*     */     //   31: fload_3
/*     */     //   32: aload_0
/*     */     //   33: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   36: aload_0
/*     */     //   37: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   40: checkcast [Ljava/lang/Object;
/*     */     //   43: arraylength
/*     */     //   44: iconst_1
/*     */     //   45: isub
/*     */     //   46: aaload
/*     */     //   47: iconst_0
/*     */     //   48: aaload
/*     */     //   49: invokevirtual getTime2 : ()F
/*     */     //   52: fcmpl
/*     */     //   53: ifle -> 422
/*     */     //   56: iconst_0
/*     */     //   57: istore #4
/*     */     //   59: fconst_0
/*     */     //   60: fstore #5
/*     */     //   62: fload_3
/*     */     //   63: aload_0
/*     */     //   64: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   67: aload_0
/*     */     //   68: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   71: checkcast [Ljava/lang/Object;
/*     */     //   74: arraylength
/*     */     //   75: iconst_1
/*     */     //   76: isub
/*     */     //   77: aaload
/*     */     //   78: iconst_0
/*     */     //   79: aaload
/*     */     //   80: invokevirtual getTime2 : ()F
/*     */     //   83: fcmpl
/*     */     //   84: ifle -> 124
/*     */     //   87: aload_0
/*     */     //   88: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   91: checkcast [Ljava/lang/Object;
/*     */     //   94: arraylength
/*     */     //   95: iconst_1
/*     */     //   96: isub
/*     */     //   97: istore #4
/*     */     //   99: aload_0
/*     */     //   100: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   103: aload_0
/*     */     //   104: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   107: checkcast [Ljava/lang/Object;
/*     */     //   110: arraylength
/*     */     //   111: iconst_1
/*     */     //   112: isub
/*     */     //   113: aaload
/*     */     //   114: iconst_0
/*     */     //   115: aaload
/*     */     //   116: invokevirtual getTime2 : ()F
/*     */     //   119: fstore #5
/*     */     //   121: goto -> 140
/*     */     //   124: iconst_0
/*     */     //   125: istore #4
/*     */     //   127: aload_0
/*     */     //   128: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   131: iconst_0
/*     */     //   132: aaload
/*     */     //   133: iconst_0
/*     */     //   134: aaload
/*     */     //   135: invokevirtual getTime1 : ()F
/*     */     //   138: fstore #5
/*     */     //   140: fload_3
/*     */     //   141: fload #5
/*     */     //   143: fsub
/*     */     //   144: fstore #6
/*     */     //   146: iconst_0
/*     */     //   147: istore #7
/*     */     //   149: iconst_0
/*     */     //   150: istore #8
/*     */     //   152: iload #7
/*     */     //   154: aload_2
/*     */     //   155: arraylength
/*     */     //   156: if_icmpge -> 347
/*     */     //   159: aload_0
/*     */     //   160: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   163: iload #4
/*     */     //   165: aaload
/*     */     //   166: iload #8
/*     */     //   168: aaload
/*     */     //   169: invokevirtual isLinear : ()Z
/*     */     //   172: ifeq -> 252
/*     */     //   175: aload_2
/*     */     //   176: iload #7
/*     */     //   178: aload_0
/*     */     //   179: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   182: iload #4
/*     */     //   184: aaload
/*     */     //   185: iload #8
/*     */     //   187: aaload
/*     */     //   188: fload #5
/*     */     //   190: invokevirtual getLinearX : (F)F
/*     */     //   193: fload #6
/*     */     //   195: aload_0
/*     */     //   196: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   199: iload #4
/*     */     //   201: aaload
/*     */     //   202: iload #8
/*     */     //   204: aaload
/*     */     //   205: invokevirtual getLinearDX : ()F
/*     */     //   208: fmul
/*     */     //   209: fadd
/*     */     //   210: fastore
/*     */     //   211: aload_2
/*     */     //   212: iload #7
/*     */     //   214: iconst_1
/*     */     //   215: iadd
/*     */     //   216: aload_0
/*     */     //   217: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   220: iload #4
/*     */     //   222: aaload
/*     */     //   223: iload #8
/*     */     //   225: aaload
/*     */     //   226: fload #5
/*     */     //   228: invokevirtual getLinearY : (F)F
/*     */     //   231: fload #6
/*     */     //   233: aload_0
/*     */     //   234: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   237: iload #4
/*     */     //   239: aaload
/*     */     //   240: iload #8
/*     */     //   242: aaload
/*     */     //   243: invokevirtual getLinearDY : ()F
/*     */     //   246: fmul
/*     */     //   247: fadd
/*     */     //   248: fastore
/*     */     //   249: goto -> 337
/*     */     //   252: aload_0
/*     */     //   253: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   256: iload #4
/*     */     //   258: aaload
/*     */     //   259: iload #8
/*     */     //   261: aaload
/*     */     //   262: fload #5
/*     */     //   264: invokevirtual setPoint : (F)V
/*     */     //   267: aload_2
/*     */     //   268: iload #7
/*     */     //   270: aload_0
/*     */     //   271: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   274: iload #4
/*     */     //   276: aaload
/*     */     //   277: iload #8
/*     */     //   279: aaload
/*     */     //   280: invokevirtual calcX : ()F
/*     */     //   283: fload #6
/*     */     //   285: aload_0
/*     */     //   286: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   289: iload #4
/*     */     //   291: aaload
/*     */     //   292: iload #8
/*     */     //   294: aaload
/*     */     //   295: invokevirtual calcDX : ()F
/*     */     //   298: fmul
/*     */     //   299: fadd
/*     */     //   300: fastore
/*     */     //   301: aload_2
/*     */     //   302: iload #7
/*     */     //   304: iconst_1
/*     */     //   305: iadd
/*     */     //   306: aload_0
/*     */     //   307: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   310: iload #4
/*     */     //   312: aaload
/*     */     //   313: iload #8
/*     */     //   315: aaload
/*     */     //   316: invokevirtual calcY : ()F
/*     */     //   319: fload #6
/*     */     //   321: aload_0
/*     */     //   322: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   325: iload #4
/*     */     //   327: aaload
/*     */     //   328: iload #8
/*     */     //   330: aaload
/*     */     //   331: invokevirtual calcDY : ()F
/*     */     //   334: fmul
/*     */     //   335: fadd
/*     */     //   336: fastore
/*     */     //   337: iinc #7, 2
/*     */     //   340: nop
/*     */     //   341: iinc #8, 1
/*     */     //   344: goto -> 152
/*     */     //   347: return
/*     */     //   348: fload_3
/*     */     //   349: aload_0
/*     */     //   350: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   353: iconst_0
/*     */     //   354: aaload
/*     */     //   355: iconst_0
/*     */     //   356: aaload
/*     */     //   357: invokevirtual getTime1 : ()F
/*     */     //   360: fcmpg
/*     */     //   361: ifge -> 376
/*     */     //   364: aload_0
/*     */     //   365: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   368: iconst_0
/*     */     //   369: aaload
/*     */     //   370: iconst_0
/*     */     //   371: aaload
/*     */     //   372: invokevirtual getTime1 : ()F
/*     */     //   375: fstore_3
/*     */     //   376: fload_3
/*     */     //   377: aload_0
/*     */     //   378: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   381: aload_0
/*     */     //   382: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   385: checkcast [Ljava/lang/Object;
/*     */     //   388: arraylength
/*     */     //   389: iconst_1
/*     */     //   390: isub
/*     */     //   391: aaload
/*     */     //   392: iconst_0
/*     */     //   393: aaload
/*     */     //   394: invokevirtual getTime2 : ()F
/*     */     //   397: fcmpl
/*     */     //   398: ifle -> 422
/*     */     //   401: aload_0
/*     */     //   402: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   405: aload_0
/*     */     //   406: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   409: checkcast [Ljava/lang/Object;
/*     */     //   412: arraylength
/*     */     //   413: iconst_1
/*     */     //   414: isub
/*     */     //   415: aaload
/*     */     //   416: iconst_0
/*     */     //   417: aaload
/*     */     //   418: invokevirtual getTime2 : ()F
/*     */     //   421: fstore_3
/*     */     //   422: iconst_0
/*     */     //   423: istore #4
/*     */     //   425: iconst_0
/*     */     //   426: istore #5
/*     */     //   428: aload_0
/*     */     //   429: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   432: checkcast [Ljava/lang/Object;
/*     */     //   435: arraylength
/*     */     //   436: istore #6
/*     */     //   438: iload #5
/*     */     //   440: iload #6
/*     */     //   442: if_icmpge -> 611
/*     */     //   445: iconst_0
/*     */     //   446: istore #7
/*     */     //   448: iconst_0
/*     */     //   449: istore #8
/*     */     //   451: iload #8
/*     */     //   453: aload_2
/*     */     //   454: arraylength
/*     */     //   455: if_icmpge -> 599
/*     */     //   458: fload_3
/*     */     //   459: aload_0
/*     */     //   460: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   463: iload #5
/*     */     //   465: aaload
/*     */     //   466: iload #7
/*     */     //   468: aaload
/*     */     //   469: invokevirtual getTime2 : ()F
/*     */     //   472: fcmpg
/*     */     //   473: ifgt -> 589
/*     */     //   476: aload_0
/*     */     //   477: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   480: iload #5
/*     */     //   482: aaload
/*     */     //   483: iload #7
/*     */     //   485: aaload
/*     */     //   486: invokevirtual isLinear : ()Z
/*     */     //   489: ifeq -> 536
/*     */     //   492: aload_2
/*     */     //   493: iload #8
/*     */     //   495: aload_0
/*     */     //   496: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   499: iload #5
/*     */     //   501: aaload
/*     */     //   502: iload #7
/*     */     //   504: aaload
/*     */     //   505: fload_3
/*     */     //   506: invokevirtual getLinearX : (F)F
/*     */     //   509: fastore
/*     */     //   510: aload_2
/*     */     //   511: iload #8
/*     */     //   513: iconst_1
/*     */     //   514: iadd
/*     */     //   515: aload_0
/*     */     //   516: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   519: iload #5
/*     */     //   521: aaload
/*     */     //   522: iload #7
/*     */     //   524: aaload
/*     */     //   525: fload_3
/*     */     //   526: invokevirtual getLinearY : (F)F
/*     */     //   529: fastore
/*     */     //   530: iconst_1
/*     */     //   531: istore #4
/*     */     //   533: goto -> 589
/*     */     //   536: aload_0
/*     */     //   537: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   540: iload #5
/*     */     //   542: aaload
/*     */     //   543: iload #7
/*     */     //   545: aaload
/*     */     //   546: fload_3
/*     */     //   547: invokevirtual setPoint : (F)V
/*     */     //   550: aload_2
/*     */     //   551: iload #8
/*     */     //   553: aload_0
/*     */     //   554: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   557: iload #5
/*     */     //   559: aaload
/*     */     //   560: iload #7
/*     */     //   562: aaload
/*     */     //   563: invokevirtual calcX : ()F
/*     */     //   566: fastore
/*     */     //   567: aload_2
/*     */     //   568: iload #8
/*     */     //   570: iconst_1
/*     */     //   571: iadd
/*     */     //   572: aload_0
/*     */     //   573: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   576: iload #5
/*     */     //   578: aaload
/*     */     //   579: iload #7
/*     */     //   581: aaload
/*     */     //   582: invokevirtual calcY : ()F
/*     */     //   585: fastore
/*     */     //   586: iconst_1
/*     */     //   587: istore #4
/*     */     //   589: iinc #8, 2
/*     */     //   592: nop
/*     */     //   593: iinc #7, 1
/*     */     //   596: goto -> 451
/*     */     //   599: iload #4
/*     */     //   601: ifeq -> 605
/*     */     //   604: return
/*     */     //   605: iinc #5, 1
/*     */     //   608: goto -> 438
/*     */     //   611: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 6
/*     */     //   #90	-> 8
/*     */     //   #91	-> 15
/*     */     //   #92	-> 56
/*     */     //   #93	-> 59
/*     */     //   #94	-> 62
/*     */     //   #95	-> 87
/*     */     //   #96	-> 99
/*     */     //   #98	-> 124
/*     */     //   #99	-> 127
/*     */     //   #101	-> 140
/*     */     //   #103	-> 146
/*     */     //   #104	-> 149
/*     */     //   #105	-> 152
/*     */     //   #106	-> 159
/*     */     //   #107	-> 175
/*     */     //   #108	-> 211
/*     */     //   #110	-> 252
/*     */     //   #111	-> 267
/*     */     //   #112	-> 301
/*     */     //   #114	-> 340
/*     */     //   #115	-> 341
/*     */     //   #117	-> 347
/*     */     //   #120	-> 348
/*     */     //   #121	-> 364
/*     */     //   #123	-> 376
/*     */     //   #124	-> 401
/*     */     //   #129	-> 422
/*     */     //   #130	-> 425
/*     */     //   #131	-> 445
/*     */     //   #132	-> 448
/*     */     //   #133	-> 451
/*     */     //   #134	-> 458
/*     */     //   #135	-> 476
/*     */     //   #136	-> 492
/*     */     //   #137	-> 510
/*     */     //   #138	-> 530
/*     */     //   #140	-> 536
/*     */     //   #141	-> 550
/*     */     //   #142	-> 567
/*     */     //   #143	-> 586
/*     */     //   #146	-> 592
/*     */     //   #147	-> 593
/*     */     //   #149	-> 599
/*     */     //   #150	-> 604
/*     */     //   #130	-> 605
/*     */     //   #153	-> 611
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   59	289	4	p	I
/*     */     //   62	286	5	t0	F
/*     */     //   146	202	6	dt	F
/*     */     //   149	199	7	i	I
/*     */     //   152	196	8	j	I
/*     */     //   448	157	7	k	I
/*     */     //   451	154	8	j	I
/*     */     //   428	183	5	i	I
/*     */     //   8	604	3	t	F
/*     */     //   425	187	4	populated	Z
/*     */     //   0	612	0	this	Landroidx/compose/animation/core/ArcSpline;
/*     */     //   0	612	1	time	F
/*     */     //   0	612	2	v	[F
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void getSlope(float time, @NotNull float[] v) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'v'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: fload_1
/*     */     //   7: fstore_3
/*     */     //   8: fload_3
/*     */     //   9: aload_0
/*     */     //   10: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   13: iconst_0
/*     */     //   14: aaload
/*     */     //   15: iconst_0
/*     */     //   16: aaload
/*     */     //   17: invokevirtual getTime1 : ()F
/*     */     //   20: fcmpg
/*     */     //   21: ifge -> 39
/*     */     //   24: aload_0
/*     */     //   25: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   28: iconst_0
/*     */     //   29: aaload
/*     */     //   30: iconst_0
/*     */     //   31: aaload
/*     */     //   32: invokevirtual getTime1 : ()F
/*     */     //   35: fstore_3
/*     */     //   36: goto -> 85
/*     */     //   39: fload_3
/*     */     //   40: aload_0
/*     */     //   41: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   44: aload_0
/*     */     //   45: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   48: checkcast [Ljava/lang/Object;
/*     */     //   51: arraylength
/*     */     //   52: iconst_1
/*     */     //   53: isub
/*     */     //   54: aaload
/*     */     //   55: iconst_0
/*     */     //   56: aaload
/*     */     //   57: invokevirtual getTime2 : ()F
/*     */     //   60: fcmpl
/*     */     //   61: ifle -> 85
/*     */     //   64: aload_0
/*     */     //   65: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   68: aload_0
/*     */     //   69: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   72: checkcast [Ljava/lang/Object;
/*     */     //   75: arraylength
/*     */     //   76: iconst_1
/*     */     //   77: isub
/*     */     //   78: aaload
/*     */     //   79: iconst_0
/*     */     //   80: aaload
/*     */     //   81: invokevirtual getTime2 : ()F
/*     */     //   84: fstore_3
/*     */     //   85: iconst_0
/*     */     //   86: istore #4
/*     */     //   88: iconst_0
/*     */     //   89: istore #5
/*     */     //   91: aload_0
/*     */     //   92: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   95: checkcast [Ljava/lang/Object;
/*     */     //   98: arraylength
/*     */     //   99: istore #6
/*     */     //   101: iload #5
/*     */     //   103: iload #6
/*     */     //   105: if_icmpge -> 272
/*     */     //   108: iconst_0
/*     */     //   109: istore #7
/*     */     //   111: iconst_0
/*     */     //   112: istore #8
/*     */     //   114: iload #7
/*     */     //   116: aload_2
/*     */     //   117: arraylength
/*     */     //   118: if_icmpge -> 260
/*     */     //   121: fload_3
/*     */     //   122: aload_0
/*     */     //   123: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   126: iload #5
/*     */     //   128: aaload
/*     */     //   129: iload #8
/*     */     //   131: aaload
/*     */     //   132: invokevirtual getTime2 : ()F
/*     */     //   135: fcmpg
/*     */     //   136: ifgt -> 250
/*     */     //   139: aload_0
/*     */     //   140: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   143: iload #5
/*     */     //   145: aaload
/*     */     //   146: iload #8
/*     */     //   148: aaload
/*     */     //   149: invokevirtual isLinear : ()Z
/*     */     //   152: ifeq -> 197
/*     */     //   155: aload_2
/*     */     //   156: iload #7
/*     */     //   158: aload_0
/*     */     //   159: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   162: iload #5
/*     */     //   164: aaload
/*     */     //   165: iload #8
/*     */     //   167: aaload
/*     */     //   168: invokevirtual getLinearDX : ()F
/*     */     //   171: fastore
/*     */     //   172: aload_2
/*     */     //   173: iload #7
/*     */     //   175: iconst_1
/*     */     //   176: iadd
/*     */     //   177: aload_0
/*     */     //   178: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   181: iload #5
/*     */     //   183: aaload
/*     */     //   184: iload #8
/*     */     //   186: aaload
/*     */     //   187: invokevirtual getLinearDY : ()F
/*     */     //   190: fastore
/*     */     //   191: iconst_1
/*     */     //   192: istore #4
/*     */     //   194: goto -> 250
/*     */     //   197: aload_0
/*     */     //   198: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   201: iload #5
/*     */     //   203: aaload
/*     */     //   204: iload #8
/*     */     //   206: aaload
/*     */     //   207: fload_3
/*     */     //   208: invokevirtual setPoint : (F)V
/*     */     //   211: aload_2
/*     */     //   212: iload #7
/*     */     //   214: aload_0
/*     */     //   215: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   218: iload #5
/*     */     //   220: aaload
/*     */     //   221: iload #8
/*     */     //   223: aaload
/*     */     //   224: invokevirtual calcDX : ()F
/*     */     //   227: fastore
/*     */     //   228: aload_2
/*     */     //   229: iload #7
/*     */     //   231: iconst_1
/*     */     //   232: iadd
/*     */     //   233: aload_0
/*     */     //   234: getfield arcs : [[Landroidx/compose/animation/core/ArcSpline$Arc;
/*     */     //   237: iload #5
/*     */     //   239: aaload
/*     */     //   240: iload #8
/*     */     //   242: aaload
/*     */     //   243: invokevirtual calcDY : ()F
/*     */     //   246: fastore
/*     */     //   247: iconst_1
/*     */     //   248: istore #4
/*     */     //   250: iinc #7, 2
/*     */     //   253: nop
/*     */     //   254: iinc #8, 1
/*     */     //   257: goto -> 114
/*     */     //   260: iload #4
/*     */     //   262: ifeq -> 266
/*     */     //   265: return
/*     */     //   266: iinc #5, 1
/*     */     //   269: goto -> 101
/*     */     //   272: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #159	-> 6
/*     */     //   #160	-> 8
/*     */     //   #161	-> 24
/*     */     //   #162	-> 39
/*     */     //   #163	-> 64
/*     */     //   #165	-> 85
/*     */     //   #167	-> 88
/*     */     //   #168	-> 108
/*     */     //   #169	-> 111
/*     */     //   #170	-> 114
/*     */     //   #171	-> 121
/*     */     //   #172	-> 139
/*     */     //   #173	-> 155
/*     */     //   #174	-> 172
/*     */     //   #175	-> 191
/*     */     //   #177	-> 197
/*     */     //   #178	-> 211
/*     */     //   #179	-> 228
/*     */     //   #180	-> 247
/*     */     //   #183	-> 253
/*     */     //   #184	-> 254
/*     */     //   #186	-> 260
/*     */     //   #187	-> 265
/*     */     //   #167	-> 266
/*     */     //   #190	-> 272
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   111	155	7	j	I
/*     */     //   114	152	8	k	I
/*     */     //   91	181	5	i	I
/*     */     //   8	265	3	t	F
/*     */     //   88	185	4	populated	Z
/*     */     //   0	273	0	this	Landroidx/compose/animation/core/ArcSpline;
/*     */     //   0	273	1	time	F
/*     */     //   0	273	2	v	[F
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\007\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\024\n\002\b\007\n\002\020\002\n\002\b\016\b\007\030\000 ,2\0020\001:\001,B?\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\005\022\006\020\t\032\0020\005\022\006\020\n\032\0020\005¢\006\002\020\013J(\020\036\032\0020\0372\006\020\007\032\0020\0052\006\020\b\032\0020\0052\006\020\t\032\0020\0052\006\020\n\032\0020\005H\002J\006\020 \032\0020\005J\006\020!\032\0020\005J\006\020\"\032\0020\005J\006\020#\032\0020\005J\006\020$\032\0020\005J\006\020%\032\0020\005J\016\020&\032\0020\0052\006\020'\032\0020\005J\016\020(\032\0020\0052\006\020'\032\0020\005J\020\020)\032\0020\0052\006\020*\032\0020\005H\002J\016\020+\032\0020\0372\006\020'\032\0020\005R\016\020\f\032\0020\005X\016¢\006\002\n\000R\016\020\r\032\0020\005X\004¢\006\002\n\000R\016\020\016\032\0020\005X\004¢\006\002\n\000R\016\020\017\032\0020\005X\004¢\006\002\n\000R\016\020\020\032\0020\005X\004¢\006\002\n\000R\016\020\021\032\0020\005X\004¢\006\002\n\000R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b\022\020\024R\016\020\025\032\0020\023X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\005X\004¢\006\002\n\000R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\032R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\033\020\032R\016\020\034\032\0020\005X\016¢\006\002\n\000R\016\020\035\032\0020\005X\016¢\006\002\n\000R\016\020\007\032\0020\005X\004¢\006\002\n\000R\016\020\t\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\005X\004¢\006\002\n\000R\016\020\n\032\0020\005X\004¢\006\002\n\000¨\006-"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "mode", "", "time1", "", "time2", "x1", "y1", "x2", "y2", "(IFFFFFF)V", "arcDistance", "arcVelocity", "ellipseA", "ellipseB", "ellipseCenterX", "ellipseCenterY", "isLinear", "", "()Z", "isVertical", "lut", "", "oneOverDeltaTime", "getTime1", "()F", "getTime2", "tmpCosAngle", "tmpSinAngle", "buildTable", "", "calcDX", "calcDY", "calcX", "calcY", "getLinearDX", "getLinearDY", "getLinearX", "time", "getLinearY", "lookup", "v", "setPoint", "Companion", "animation-core"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   @SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 2 ArcSpline.kt\nandroidx/compose/animation/core/ArcSplineKt\n*L\n1#1,388:1\n387#2:389\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n*L\n323#1:389\n*E\n"})
/*     */   public static final class Arc
/*     */   {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */     
/*     */     private final float time1;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float time2;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float x1;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float y1;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float x2;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float y2;
/*     */ 
/*     */ 
/*     */     
/*     */     private float arcDistance;
/*     */ 
/*     */ 
/*     */     
/*     */     private float tmpSinAngle;
/*     */ 
/*     */ 
/*     */     
/*     */     private float tmpCosAngle;
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final float[] lut;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float oneOverDeltaTime;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float ellipseA;
/*     */ 
/*     */ 
/*     */     
/*     */     private final float ellipseB;
/*     */ 
/*     */     
/*     */     private final float ellipseCenterX;
/*     */ 
/*     */     
/*     */     private final float ellipseCenterY;
/*     */ 
/*     */     
/*     */     private final float arcVelocity;
/*     */ 
/*     */     
/*     */     private final boolean isVertical;
/*     */ 
/*     */     
/*     */     private final boolean isLinear;
/*     */ 
/*     */     
/*     */     public static final int $stable = 8;
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     private static float[] _ourPercent;
/*     */ 
/*     */     
/*     */     private static final float Epsilon = 0.001F;
/*     */ 
/*     */ 
/*     */     
/*     */     public Arc(int mode, float time1, float time2, float x1, float y1, float x2, float y2) {
/* 194 */       this.time1 = time1;
/* 195 */       this.time2 = time2;
/* 196 */       this.x1 = x1;
/* 197 */       this.y1 = y1;
/* 198 */       this.x2 = x2;
/* 199 */       this.y2 = y2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 217 */       float dx = this.x2 - this.x1;
/* 218 */       float dy = this.y2 - this.y1;
/* 219 */       switch (mode) { case 1: 
/*     */         case 5:
/* 221 */           if (dy < 0.0F);
/* 222 */         case 4: if (dy > 0.0F);
/*     */         default:
/*     */           break; }
/* 225 */        this.isVertical = false; this.oneOverDeltaTime = true / (this.time2 - this.time1);
/*     */       
/* 227 */       boolean isLinear = false;
/* 228 */       if (3 == mode) {
/* 229 */         isLinear = true;
/*     */       }
/* 231 */       if (isLinear || Math.abs(dx) < 0.001F || Math.abs(dy) < 0.001F) {
/* 232 */         isLinear = true;
/* 233 */         this.arcDistance = (float)Math.hypot(dy, dx);
/* 234 */         this.arcVelocity = this.arcDistance * this.oneOverDeltaTime;
/* 235 */         this.ellipseCenterX = 
/* 236 */           dx / (this.time2 - this.time1);
/* 237 */         this.ellipseCenterY = 
/* 238 */           dy / (this.time2 - this.time1);
/* 239 */         this.lut = new float[101];
/* 240 */         this.ellipseA = Float.NaN;
/* 241 */         this.ellipseB = Float.NaN;
/*     */       } else {
/* 243 */         this.lut = new float[101];
/* 244 */         this.ellipseA = dx * (this.isVertical ? -1 : true);
/* 245 */         this.ellipseB = dy * (this.isVertical ? true : -1);
/* 246 */         this.ellipseCenterX = this.isVertical ? this.x2 : this.x1;
/* 247 */         this.ellipseCenterY = this.isVertical ? this.y1 : this.y2;
/* 248 */         buildTable(this.x1, this.y1, this.x2, this.y2);
/* 249 */         this.arcVelocity = this.arcDistance * this.oneOverDeltaTime;
/*     */       } 
/* 251 */       this.isLinear = isLinear;
/*     */     }
/*     */     public final float getTime1() {
/*     */       return this.time1;
/* 255 */     } public final void setPoint(float time) { float percent = (this.isVertical ? (this.time2 - time) : (time - this.time1)) * this.oneOverDeltaTime;
/* 256 */       float angle = 1.5707964F * lookup(percent);
/* 257 */       this.tmpSinAngle = (float)Math.sin(angle);
/* 258 */       this.tmpCosAngle = (float)Math.cos(angle); }
/*     */     public final float getTime2() { return this.time2; } public final boolean isLinear() {
/*     */       return this.isLinear;
/*     */     } public final float calcX() {
/* 262 */       return this.ellipseCenterX + this.ellipseA * this.tmpSinAngle;
/*     */     }
/*     */     
/*     */     public final float calcY() {
/* 266 */       return this.ellipseCenterY + this.ellipseB * this.tmpCosAngle;
/*     */     }
/*     */     
/*     */     public final float calcDX() {
/* 270 */       float vx = this.ellipseA * this.tmpCosAngle;
/* 271 */       float vy = -this.ellipseB * this.tmpSinAngle;
/* 272 */       float norm = this.arcVelocity / (float)Math.hypot(vx, vy);
/* 273 */       return this.isVertical ? (-vx * norm) : (vx * norm);
/*     */     }
/*     */     
/*     */     public final float calcDY() {
/* 277 */       float vx = this.ellipseA * this.tmpCosAngle;
/* 278 */       float vy = -this.ellipseB * this.tmpSinAngle;
/* 279 */       float norm = this.arcVelocity / (float)Math.hypot(vx, vy);
/* 280 */       return this.isVertical ? (-vy * norm) : (vy * norm);
/*     */     }
/*     */     
/*     */     public final float getLinearX(float time) {
/* 284 */       float t = time;
/* 285 */       t = (t - this.time1) * this.oneOverDeltaTime;
/* 286 */       return this.x1 + t * (this.x2 - this.x1);
/*     */     }
/*     */     
/*     */     public final float getLinearY(float time) {
/* 290 */       float t = time;
/* 291 */       t = (t - this.time1) * this.oneOverDeltaTime;
/* 292 */       return this.y1 + t * (this.y2 - this.y1);
/*     */     }
/*     */     
/*     */     public final float getLinearDX() {
/* 296 */       return this.ellipseCenterX;
/*     */     }
/*     */     
/*     */     public final float getLinearDY() {
/* 300 */       return this.ellipseCenterY;
/*     */     }
/*     */     
/*     */     private final float lookup(float v) {
/* 304 */       if (v <= 0.0F) {
/* 305 */         return 0.0F;
/*     */       }
/* 307 */       if (v >= 1.0F) {
/* 308 */         return 1.0F;
/*     */       }
/* 310 */       float pos = v * (this.lut.length - 1);
/* 311 */       int iv = (int)pos;
/* 312 */       float off = pos - (int)pos;
/* 313 */       return this.lut[iv] + off * (this.lut[iv + 1] - this.lut[iv]);
/*     */     }
/*     */     
/*     */     private final void buildTable(float x1, float y1, float x2, float y2) {
/* 317 */       float a = x2 - x1;
/* 318 */       float b = y1 - y2;
/* 319 */       float lx = 0.0F;
/* 320 */       float ly = 0.0F;
/* 321 */       float dist = 0.0F; int i, j;
/* 322 */       for (i = 0, j = (Companion.getOurPercent()).length; i < j; i++) {
/* 323 */         double $this$toRadians$iv = 90.0D * i / ((Companion.getOurPercent()).length - 1); int $i$f$toRadians = 0; float angle = (float)(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 389 */           $this$toRadians$iv / '´' * Math.PI);
/*     */         float s = (float)Math.sin(angle);
/*     */         float c = (float)Math.cos(angle);
/*     */         float px = a * s;
/*     */         float py = b * c;
/*     */         if (i > 0) {
/*     */           dist += (float)Math.hypot((px - lx), (py - ly));
/*     */           Companion.getOurPercent()[i] = dist;
/*     */         } 
/*     */         lx = px;
/*     */         ly = py;
/*     */       } 
/*     */       this.arcDistance = dist;
/*     */       for (i = 0, j = (Companion.getOurPercent()).length; i < j; i++) {
/*     */         float[] arrayOfFloat = Companion.getOurPercent();
/*     */         int k = i;
/*     */         arrayOfFloat[k] = arrayOfFloat[k] / dist;
/*     */       } 
/*     */       for (i = 0, j = this.lut.length; i < j; i++) {
/*     */         float pos = i / (this.lut.length - 1);
/*     */         int index = ArraysKt.binarySearch$default(Companion.getOurPercent(), pos, 0, 0, 6, null);
/*     */         if (index >= 0) {
/*     */           this.lut[i] = index / ((Companion.getOurPercent()).length - 1);
/*     */         } else if (index == -1) {
/*     */           this.lut[i] = 0.0F;
/*     */         } else {
/*     */           int p1 = -index - 2;
/*     */           int p2 = -index - 1;
/*     */           float ans = (p1 + (pos - Companion.getOurPercent()[p1]) / (Companion.getOurPercent()[p2] - Companion.getOurPercent()[p1])) / ((Companion.getOurPercent()).length - 1);
/*     */           this.lut[i] = ans;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\007\n\000\n\002\020\024\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\020\020\005\032\004\030\0010\006X\016¢\006\002\n\000R\024\020\007\032\0020\0068BX\004¢\006\006\032\004\b\b\020\t¨\006\n"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc$Companion;", "", "()V", "Epsilon", "", "_ourPercent", "", "ourPercent", "getOurPercent", "()[F", "animation-core"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       private final float[] getOurPercent() {
/*     */         if (ArcSpline.Arc._ourPercent != null) {
/*     */           Intrinsics.checkNotNull(ArcSpline.Arc._ourPercent);
/*     */           return ArcSpline.Arc._ourPercent;
/*     */         } 
/*     */         ArcSpline.Arc._ourPercent = new float[91];
/*     */         Intrinsics.checkNotNull(ArcSpline.Arc._ourPercent);
/*     */         return ArcSpline.Arc._ourPercent;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000R\016\020\b\032\0020\004XT¢\006\002\n\000R\016\020\t\032\0020\004XT¢\006\002\n\000R\016\020\n\032\0020\004XT¢\006\002\n\000R\016\020\013\032\0020\004XT¢\006\002\n\000R\016\020\f\032\0020\004XT¢\006\002\n\000R\016\020\r\032\0020\004XT¢\006\002\n\000R\016\020\016\032\0020\004XT¢\006\002\n\000¨\006\017"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Companion;", "", "()V", "ArcAbove", "", "ArcBelow", "ArcStartFlip", "ArcStartHorizontal", "ArcStartLinear", "ArcStartVertical", "DownArc", "StartHorizontal", "StartLinear", "StartVertical", "UpArc", "animation-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\ArcSpline.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */