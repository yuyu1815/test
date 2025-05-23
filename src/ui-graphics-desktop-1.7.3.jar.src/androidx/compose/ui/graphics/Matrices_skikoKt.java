/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.ui.InternalComposeUiApi;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.Matrix33;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\000\032\b\020\002\032\0020\003H\000\032j\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0012\006\020\t\032\0020\0012\006\020\n\032\0020\0012\006\020\013\032\0020\0012\006\020\f\032\0020\0012\006\020\r\032\0020\0012\006\020\016\032\0020\0012\006\020\017\032\0020\0012\006\020\020\032\0020\0012\006\020\021\032\0020\001H\007ø\001\000¢\006\004\b\022\020\023\032\r\020\024\032\0020\025*\0020\001H\b\"\016\020\000\032\0020\001XT¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\026"}, d2 = {"NON_ZERO_EPSILON", "", "identityMatrix33", "Lorg/jetbrains/skia/Matrix33;", "prepareTransformationMatrix", "", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "pivotX", "pivotY", "translationX", "translationY", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "cameraDistance", "prepareTransformationMatrix-ao2toNE", "([FFFFFFFFFFF)V", "isZero", "", "ui-graphics"})
/*    */ @SourceDebugExtension({"SMAP\nMatrices.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrices.skiko.kt\nandroidx/compose/ui/graphics/Matrices_skikoKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,78:1\n77#1:79\n42#2,2:80\n42#2,2:82\n42#2,2:84\n42#2,2:86\n42#2,2:88\n42#2,2:90\n42#2,2:92\n*S KotlinDebug\n*F\n+ 1 Matrices.skiko.kt\nandroidx/compose/ui/graphics/Matrices_skikoKt\n*L\n54#1:79\n58#1:80,2\n67#1:82,2\n68#1:84,2\n69#1:86,2\n70#1:88,2\n71#1:90,2\n72#1:92,2\n*E\n"})
/*    */ public final class Matrices_skikoKt
/*    */ {
/*    */   private static final float NON_ZERO_EPSILON = 0.001F;
/*    */   
/*    */   @NotNull
/*    */   public static final Matrix33 identityMatrix33() {
/* 24 */     float[] arrayOfFloat = new float[9]; arrayOfFloat[0] = 1.0F; arrayOfFloat[1] = 0.0F; arrayOfFloat[2] = 0.0F; arrayOfFloat[3] = 
/* 25 */       0.0F; arrayOfFloat[4] = 1.0F; arrayOfFloat[5] = 0.0F;
/* 26 */     arrayOfFloat[6] = 0.0F; arrayOfFloat[7] = 0.0F; arrayOfFloat[8] = 1.0F;
/*    */     return new Matrix33(arrayOfFloat);
/*    */   }
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
/*    */   @InternalComposeUiApi
/*    */   public static final void prepareTransformationMatrix-ao2toNE(@NotNull float[] matrix, float pivotX, float pivotY, float translationX, float translationY, float rotationX, float rotationY, float rotationZ, float scaleX, float scaleY, float cameraDistance) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'matrix'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokestatic reset-impl : ([F)V
/*    */     //   10: aload_0
/*    */     //   11: fload_1
/*    */     //   12: fneg
/*    */     //   13: fload_2
/*    */     //   14: fneg
/*    */     //   15: fconst_0
/*    */     //   16: iconst_4
/*    */     //   17: aconst_null
/*    */     //   18: invokestatic translate-impl$default : ([FFFFILjava/lang/Object;)V
/*    */     //   21: aload_0
/*    */     //   22: aconst_null
/*    */     //   23: iconst_1
/*    */     //   24: aconst_null
/*    */     //   25: invokestatic constructor-impl$default : ([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F
/*    */     //   28: astore #11
/*    */     //   30: aload #11
/*    */     //   32: astore #12
/*    */     //   34: astore #19
/*    */     //   36: iconst_0
/*    */     //   37: istore #13
/*    */     //   39: aload #12
/*    */     //   41: fload #7
/*    */     //   43: invokestatic rotateZ-impl : ([FF)V
/*    */     //   46: aload #12
/*    */     //   48: fload #6
/*    */     //   50: invokestatic rotateY-impl : ([FF)V
/*    */     //   53: aload #12
/*    */     //   55: fload #5
/*    */     //   57: invokestatic rotateX-impl : ([FF)V
/*    */     //   60: aload #12
/*    */     //   62: fload #8
/*    */     //   64: fload #9
/*    */     //   66: fconst_0
/*    */     //   67: iconst_4
/*    */     //   68: aconst_null
/*    */     //   69: invokestatic scale-impl$default : ([FFFFILjava/lang/Object;)V
/*    */     //   72: nop
/*    */     //   73: aload #19
/*    */     //   75: aload #11
/*    */     //   77: invokestatic timesAssign-58bKbWc : ([F[F)V
/*    */     //   80: fload #5
/*    */     //   82: fstore #11
/*    */     //   84: iconst_0
/*    */     //   85: istore #12
/*    */     //   87: fload #11
/*    */     //   89: invokestatic abs : (F)F
/*    */     //   92: ldc 0.001
/*    */     //   94: fcmpg
/*    */     //   95: ifgt -> 102
/*    */     //   98: iconst_1
/*    */     //   99: goto -> 103
/*    */     //   102: iconst_0
/*    */     //   103: ifeq -> 132
/*    */     //   106: fload #6
/*    */     //   108: fstore #11
/*    */     //   110: iconst_0
/*    */     //   111: istore #12
/*    */     //   113: fload #11
/*    */     //   115: invokestatic abs : (F)F
/*    */     //   118: ldc 0.001
/*    */     //   120: fcmpg
/*    */     //   121: ifgt -> 128
/*    */     //   124: iconst_1
/*    */     //   125: goto -> 129
/*    */     //   128: iconst_0
/*    */     //   129: ifne -> 194
/*    */     //   132: aload_0
/*    */     //   133: aconst_null
/*    */     //   134: iconst_1
/*    */     //   135: aconst_null
/*    */     //   136: invokestatic constructor-impl$default : ([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F
/*    */     //   139: astore #11
/*    */     //   141: aload #11
/*    */     //   143: astore #12
/*    */     //   145: astore #19
/*    */     //   147: iconst_0
/*    */     //   148: istore #13
/*    */     //   150: fload #10
/*    */     //   152: ldc 72.0
/*    */     //   154: fmul
/*    */     //   155: fstore #14
/*    */     //   157: iconst_2
/*    */     //   158: istore #15
/*    */     //   160: iconst_3
/*    */     //   161: istore #16
/*    */     //   163: ldc -1.0
/*    */     //   165: fload #14
/*    */     //   167: fdiv
/*    */     //   168: fstore #17
/*    */     //   170: iconst_0
/*    */     //   171: istore #18
/*    */     //   173: aload #12
/*    */     //   175: iload #15
/*    */     //   177: iconst_4
/*    */     //   178: imul
/*    */     //   179: iload #16
/*    */     //   181: iadd
/*    */     //   182: fload #17
/*    */     //   184: fastore
/*    */     //   185: nop
/*    */     //   186: nop
/*    */     //   187: aload #19
/*    */     //   189: aload #11
/*    */     //   191: invokestatic timesAssign-58bKbWc : ([F[F)V
/*    */     //   194: aload_0
/*    */     //   195: aconst_null
/*    */     //   196: iconst_1
/*    */     //   197: aconst_null
/*    */     //   198: invokestatic constructor-impl$default : ([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F
/*    */     //   201: astore #11
/*    */     //   203: aload #11
/*    */     //   205: astore #12
/*    */     //   207: astore #19
/*    */     //   209: iconst_0
/*    */     //   210: istore #13
/*    */     //   212: aload #12
/*    */     //   214: fload_1
/*    */     //   215: fload_3
/*    */     //   216: fadd
/*    */     //   217: fload_2
/*    */     //   218: fload #4
/*    */     //   220: fadd
/*    */     //   221: fconst_0
/*    */     //   222: iconst_4
/*    */     //   223: aconst_null
/*    */     //   224: invokestatic translate-impl$default : ([FFFFILjava/lang/Object;)V
/*    */     //   227: nop
/*    */     //   228: aload #19
/*    */     //   230: aload #11
/*    */     //   232: invokestatic timesAssign-58bKbWc : ([F[F)V
/*    */     //   235: iconst_2
/*    */     //   236: istore #11
/*    */     //   238: iconst_0
/*    */     //   239: istore #12
/*    */     //   241: fconst_0
/*    */     //   242: fstore #13
/*    */     //   244: iconst_0
/*    */     //   245: istore #14
/*    */     //   247: aload_0
/*    */     //   248: iload #11
/*    */     //   250: iconst_4
/*    */     //   251: imul
/*    */     //   252: iload #12
/*    */     //   254: iadd
/*    */     //   255: fload #13
/*    */     //   257: fastore
/*    */     //   258: nop
/*    */     //   259: iconst_2
/*    */     //   260: istore #11
/*    */     //   262: iconst_1
/*    */     //   263: istore #12
/*    */     //   265: fconst_0
/*    */     //   266: fstore #13
/*    */     //   268: iconst_0
/*    */     //   269: istore #14
/*    */     //   271: aload_0
/*    */     //   272: iload #11
/*    */     //   274: iconst_4
/*    */     //   275: imul
/*    */     //   276: iload #12
/*    */     //   278: iadd
/*    */     //   279: fload #13
/*    */     //   281: fastore
/*    */     //   282: nop
/*    */     //   283: iconst_2
/*    */     //   284: istore #11
/*    */     //   286: iconst_3
/*    */     //   287: istore #12
/*    */     //   289: fconst_0
/*    */     //   290: fstore #13
/*    */     //   292: iconst_0
/*    */     //   293: istore #14
/*    */     //   295: aload_0
/*    */     //   296: iload #11
/*    */     //   298: iconst_4
/*    */     //   299: imul
/*    */     //   300: iload #12
/*    */     //   302: iadd
/*    */     //   303: fload #13
/*    */     //   305: fastore
/*    */     //   306: nop
/*    */     //   307: iconst_0
/*    */     //   308: istore #11
/*    */     //   310: iconst_2
/*    */     //   311: istore #12
/*    */     //   313: fconst_0
/*    */     //   314: fstore #13
/*    */     //   316: iconst_0
/*    */     //   317: istore #14
/*    */     //   319: aload_0
/*    */     //   320: iload #11
/*    */     //   322: iconst_4
/*    */     //   323: imul
/*    */     //   324: iload #12
/*    */     //   326: iadd
/*    */     //   327: fload #13
/*    */     //   329: fastore
/*    */     //   330: nop
/*    */     //   331: iconst_1
/*    */     //   332: istore #11
/*    */     //   334: iconst_2
/*    */     //   335: istore #12
/*    */     //   337: fconst_0
/*    */     //   338: fstore #13
/*    */     //   340: iconst_0
/*    */     //   341: istore #14
/*    */     //   343: aload_0
/*    */     //   344: iload #11
/*    */     //   346: iconst_4
/*    */     //   347: imul
/*    */     //   348: iload #12
/*    */     //   350: iadd
/*    */     //   351: fload #13
/*    */     //   353: fastore
/*    */     //   354: nop
/*    */     //   355: iconst_3
/*    */     //   356: istore #11
/*    */     //   358: iconst_2
/*    */     //   359: istore #12
/*    */     //   361: fconst_0
/*    */     //   362: fstore #13
/*    */     //   364: iconst_0
/*    */     //   365: istore #14
/*    */     //   367: aload_0
/*    */     //   368: iload #11
/*    */     //   370: iconst_4
/*    */     //   371: imul
/*    */     //   372: iload #12
/*    */     //   374: iadd
/*    */     //   375: fload #13
/*    */     //   377: fastore
/*    */     //   378: nop
/*    */     //   379: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #43	-> 6
/*    */     //   #44	-> 10
/*    */     //   #45	-> 21
/*    */     //   #46	-> 39
/*    */     //   #47	-> 46
/*    */     //   #48	-> 53
/*    */     //   #49	-> 60
/*    */     //   #50	-> 72
/*    */     //   #45	-> 75
/*    */     //   #45	-> 77
/*    */     //   #54	-> 80
/*    */     //   #79	-> 87
/*    */     //   #79	-> 92
/*    */     //   #54	-> 103
/*    */     //   #79	-> 113
/*    */     //   #79	-> 118
/*    */     //   #54	-> 129
/*    */     //   #55	-> 132
/*    */     //   #57	-> 150
/*    */     //   #58	-> 157
/*    */     //   #80	-> 173
/*    */     //   #81	-> 185
/*    */     //   #59	-> 186
/*    */     //   #55	-> 189
/*    */     //   #55	-> 191
/*    */     //   #61	-> 194
/*    */     //   #62	-> 212
/*    */     //   #63	-> 227
/*    */     //   #61	-> 230
/*    */     //   #61	-> 232
/*    */     //   #67	-> 235
/*    */     //   #82	-> 247
/*    */     //   #83	-> 258
/*    */     //   #68	-> 259
/*    */     //   #84	-> 271
/*    */     //   #85	-> 282
/*    */     //   #69	-> 283
/*    */     //   #86	-> 295
/*    */     //   #87	-> 306
/*    */     //   #70	-> 307
/*    */     //   #88	-> 319
/*    */     //   #89	-> 330
/*    */     //   #71	-> 331
/*    */     //   #90	-> 343
/*    */     //   #91	-> 354
/*    */     //   #72	-> 355
/*    */     //   #92	-> 367
/*    */     //   #93	-> 378
/*    */     //   #73	-> 379
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   39	34	13	$i$a$-apply-Matrices_skikoKt$prepareTransformationMatrix$1	I
/*    */     //   36	37	12	$this$prepareTransformationMatrix_ao2toNE_u24lambda_u240	[F
/*    */     //   87	16	12	$i$f$isZero	I
/*    */     //   84	19	11	$this$isZero$iv	F
/*    */     //   113	16	12	$i$f$isZero	I
/*    */     //   110	19	11	$this$isZero$iv	F
/*    */     //   173	13	18	$i$f$set-impl	I
/*    */     //   170	16	15	row$iv	I
/*    */     //   170	16	16	column$iv	I
/*    */     //   170	16	17	v$iv	F
/*    */     //   150	37	13	$i$a$-apply-Matrices_skikoKt$prepareTransformationMatrix$2	I
/*    */     //   157	30	14	depth	F
/*    */     //   147	40	12	$this$prepareTransformationMatrix_ao2toNE_u24lambda_u241	[F
/*    */     //   212	16	13	$i$a$-apply-Matrices_skikoKt$prepareTransformationMatrix$3	I
/*    */     //   209	19	12	$this$prepareTransformationMatrix_ao2toNE_u24lambda_u242	[F
/*    */     //   247	12	14	$i$f$set-impl	I
/*    */     //   244	15	11	row$iv	I
/*    */     //   244	15	12	column$iv	I
/*    */     //   244	15	13	v$iv	F
/*    */     //   271	12	14	$i$f$set-impl	I
/*    */     //   268	15	11	row$iv	I
/*    */     //   268	15	12	column$iv	I
/*    */     //   268	15	13	v$iv	F
/*    */     //   295	12	14	$i$f$set-impl	I
/*    */     //   292	15	11	row$iv	I
/*    */     //   292	15	12	column$iv	I
/*    */     //   292	15	13	v$iv	F
/*    */     //   319	12	14	$i$f$set-impl	I
/*    */     //   316	15	11	row$iv	I
/*    */     //   316	15	12	column$iv	I
/*    */     //   316	15	13	v$iv	F
/*    */     //   343	12	14	$i$f$set-impl	I
/*    */     //   340	15	11	row$iv	I
/*    */     //   340	15	12	column$iv	I
/*    */     //   340	15	13	v$iv	F
/*    */     //   367	12	14	$i$f$set-impl	I
/*    */     //   364	15	11	row$iv	I
/*    */     //   364	15	12	column$iv	I
/*    */     //   364	15	13	v$iv	F
/*    */     //   0	380	0	matrix	[F
/*    */     //   0	380	1	pivotX	F
/*    */     //   0	380	2	pivotY	F
/*    */     //   0	380	3	translationX	F
/*    */     //   0	380	4	translationY	F
/*    */     //   0	380	5	rotationX	F
/*    */     //   0	380	6	rotationY	F
/*    */     //   0	380	7	rotationZ	F
/*    */     //   0	380	8	scaleX	F
/*    */     //   0	380	9	scaleY	F
/*    */     //   0	380	10	cameraDistance	F
/*    */   }
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
/*    */   private static final boolean isZero(float $this$isZero) {
/* 77 */     int $i$f$isZero = 0; return (Math.abs($this$isZero) <= 0.001F);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Matrices_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */