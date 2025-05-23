/*    */ package androidx.compose.animation.core;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.IntervalTree;
/*    */ import androidx.compose.ui.graphics.Path;
/*    */ import androidx.compose.ui.graphics.PathSegment;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\007\n\002\b\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\b\032\0020\tH\002J\020\020\n\032\0020\0132\006\020\f\032\0020\013H\026R\024\020\005\032\b\022\004\022\0020\0070\006X.¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "path", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)V", "intervals", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "initializeEasing", "", "transform", "", "fraction", "animation-core"})
/*    */ @Immutable
/*    */ @SourceDebugExtension({"SMAP\nPathEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,121:1\n66#2,8:122\n54#2,7:130\n33#2,7:137\n33#2,7:147\n48#3:144\n54#3:146\n22#4:145\n*S KotlinDebug\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n*L\n73#1:122,8\n78#1:130,7\n102#1:137,7\n114#1:147,7\n109#1:144\n109#1:146\n109#1:145\n*E\n"})
/*    */ public final class PathEasing
/*    */   implements Easing
/*    */ {
/*    */   @NotNull
/*    */   private final Path path;
/*    */   private IntervalTree<PathSegment> intervals;
/*    */   public static final int $stable;
/*    */   
/*    */   public PathEasing(@NotNull Path path) {
/* 58 */     this.path = path;
/*    */   }
/*    */   
/*    */   public float transform(float fraction) {
/*    */     // Byte code:
/*    */     //   0: fload_1
/*    */     //   1: fconst_0
/*    */     //   2: fcmpg
/*    */     //   3: ifgt -> 8
/*    */     //   6: fconst_0
/*    */     //   7: freturn
/*    */     //   8: fload_1
/*    */     //   9: fconst_1
/*    */     //   10: fcmpl
/*    */     //   11: iflt -> 16
/*    */     //   14: fconst_1
/*    */     //   15: freturn
/*    */     //   16: aload_0
/*    */     //   17: getfield intervals : Landroidx/compose/ui/graphics/IntervalTree;
/*    */     //   20: ifnonnull -> 27
/*    */     //   23: aload_0
/*    */     //   24: invokespecial initializeEasing : ()V
/*    */     //   27: aload_0
/*    */     //   28: getfield intervals : Landroidx/compose/ui/graphics/IntervalTree;
/*    */     //   31: dup
/*    */     //   32: ifnonnull -> 42
/*    */     //   35: pop
/*    */     //   36: ldc 'intervals'
/*    */     //   38: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*    */     //   41: aconst_null
/*    */     //   42: fload_1
/*    */     //   43: fconst_0
/*    */     //   44: iconst_2
/*    */     //   45: aconst_null
/*    */     //   46: invokestatic findFirstOverlap$default : (Landroidx/compose/ui/graphics/IntervalTree;FFILjava/lang/Object;)Landroidx/compose/ui/graphics/Interval;
/*    */     //   49: astore_2
/*    */     //   50: aload_2
/*    */     //   51: invokevirtual getData : ()Ljava/lang/Object;
/*    */     //   54: astore #4
/*    */     //   56: iconst_0
/*    */     //   57: istore #5
/*    */     //   59: nop
/*    */     //   60: aload #4
/*    */     //   62: ifnonnull -> 82
/*    */     //   65: iconst_0
/*    */     //   66: istore #6
/*    */     //   68: ldc 'The easing path is invalid. Make sure it is continuous on the x axis.'
/*    */     //   70: invokestatic throwIllegalStateExceptionForNullCheck : (Ljava/lang/String;)Ljava/lang/Void;
/*    */     //   73: pop
/*    */     //   74: new kotlin/KotlinNothingValueException
/*    */     //   77: dup
/*    */     //   78: invokespecial <init> : ()V
/*    */     //   81: athrow
/*    */     //   82: aload #4
/*    */     //   84: checkcast androidx/compose/ui/graphics/PathSegment
/*    */     //   87: astore_3
/*    */     //   88: aload_3
/*    */     //   89: fload_1
/*    */     //   90: invokestatic findFirstRoot : (Landroidx/compose/ui/graphics/PathSegment;F)F
/*    */     //   93: fstore #4
/*    */     //   95: fload #4
/*    */     //   97: invokestatic isNaN : (F)Z
/*    */     //   100: ifne -> 107
/*    */     //   103: iconst_1
/*    */     //   104: goto -> 108
/*    */     //   107: iconst_0
/*    */     //   108: istore #5
/*    */     //   110: nop
/*    */     //   111: iconst_0
/*    */     //   112: istore #6
/*    */     //   114: nop
/*    */     //   115: iload #5
/*    */     //   117: ifne -> 128
/*    */     //   120: iconst_0
/*    */     //   121: istore #7
/*    */     //   123: ldc 'The easing path is invalid. Make sure it does not contain NaN/Infinity values.'
/*    */     //   125: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*    */     //   128: nop
/*    */     //   129: aload_3
/*    */     //   130: fload #4
/*    */     //   132: invokestatic evaluateY : (Landroidx/compose/ui/graphics/PathSegment;F)F
/*    */     //   135: freturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #62	-> 0
/*    */     //   #63	-> 6
/*    */     //   #64	-> 8
/*    */     //   #65	-> 14
/*    */     //   #68	-> 16
/*    */     //   #69	-> 23
/*    */     //   #72	-> 27
/*    */     //   #73	-> 50
/*    */     //   #122	-> 59
/*    */     //   #126	-> 60
/*    */     //   #127	-> 65
/*    */     //   #74	-> 68
/*    */     //   #127	-> 70
/*    */     //   #129	-> 82
/*    */     //   #73	-> 84
/*    */     //   #77	-> 88
/*    */     //   #78	-> 95
/*    */     //   #78	-> 110
/*    */     //   #130	-> 114
/*    */     //   #133	-> 115
/*    */     //   #134	-> 120
/*    */     //   #79	-> 123
/*    */     //   #134	-> 125
/*    */     //   #136	-> 128
/*    */     //   #82	-> 129
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   68	2	6	$i$a$-checkPreconditionNotNull-PathEasing$transform$segment$1	I
/*    */     //   59	25	5	$i$f$checkPreconditionNotNull	I
/*    */     //   56	28	4	value$iv	Ljava/lang/Object;
/*    */     //   123	2	7	$i$a$-checkPrecondition-PathEasing$transform$1	I
/*    */     //   114	15	6	$i$f$checkPrecondition	I
/*    */     //   111	18	5	value$iv	Z
/*    */     //   50	86	2	result	Landroidx/compose/ui/graphics/Interval;
/*    */     //   88	48	3	segment	Landroidx/compose/ui/graphics/PathSegment;
/*    */     //   95	41	4	t	F
/*    */     //   0	136	0	this	Landroidx/compose/animation/core/PathEasing;
/*    */     //   0	136	1	fraction	F
/*    */   }
/*    */   
/*    */   private final void initializeEasing() {
/*    */     // Byte code:
/*    */     //   0: iconst_5
/*    */     //   1: newarray float
/*    */     //   3: astore_1
/*    */     //   4: new androidx/compose/ui/graphics/IntervalTree
/*    */     //   7: dup
/*    */     //   8: invokespecial <init> : ()V
/*    */     //   11: astore_3
/*    */     //   12: aload_3
/*    */     //   13: astore #4
/*    */     //   15: iconst_0
/*    */     //   16: istore #5
/*    */     //   18: aload_0
/*    */     //   19: getfield path : Landroidx/compose/ui/graphics/Path;
/*    */     //   22: getstatic androidx/compose/ui/graphics/PathIterator$ConicEvaluation.AsQuadratics : Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;
/*    */     //   25: ldc 2.0E-4
/*    */     //   27: invokeinterface iterator : (Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;
/*    */     //   32: astore #6
/*    */     //   34: aload #6
/*    */     //   36: invokeinterface hasNext : ()Z
/*    */     //   41: ifeq -> 173
/*    */     //   44: aload #6
/*    */     //   46: invokeinterface next : ()Landroidx/compose/ui/graphics/PathSegment;
/*    */     //   51: astore #7
/*    */     //   53: aload #7
/*    */     //   55: invokevirtual getType : ()Landroidx/compose/ui/graphics/PathSegment$Type;
/*    */     //   58: getstatic androidx/compose/ui/graphics/PathSegment$Type.Close : Landroidx/compose/ui/graphics/PathSegment$Type;
/*    */     //   61: if_acmpeq -> 68
/*    */     //   64: iconst_1
/*    */     //   65: goto -> 69
/*    */     //   68: iconst_0
/*    */     //   69: istore #8
/*    */     //   71: iconst_0
/*    */     //   72: istore #9
/*    */     //   74: nop
/*    */     //   75: iload #8
/*    */     //   77: ifne -> 88
/*    */     //   80: iconst_0
/*    */     //   81: istore #10
/*    */     //   83: ldc 'The path cannot contain a close() command.'
/*    */     //   85: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*    */     //   88: nop
/*    */     //   89: aload #7
/*    */     //   91: invokevirtual getType : ()Landroidx/compose/ui/graphics/PathSegment$Type;
/*    */     //   94: getstatic androidx/compose/ui/graphics/PathSegment$Type.Move : Landroidx/compose/ui/graphics/PathSegment$Type;
/*    */     //   97: if_acmpeq -> 34
/*    */     //   100: aload #7
/*    */     //   102: invokevirtual getType : ()Landroidx/compose/ui/graphics/PathSegment$Type;
/*    */     //   105: getstatic androidx/compose/ui/graphics/PathSegment$Type.Done : Landroidx/compose/ui/graphics/PathSegment$Type;
/*    */     //   108: if_acmpeq -> 34
/*    */     //   111: aload #7
/*    */     //   113: aload_1
/*    */     //   114: iconst_0
/*    */     //   115: iconst_4
/*    */     //   116: aconst_null
/*    */     //   117: invokestatic computeHorizontalBounds$default : (Landroidx/compose/ui/graphics/PathSegment;[FIILjava/lang/Object;)J
/*    */     //   120: lstore #11
/*    */     //   122: aload #4
/*    */     //   124: iconst_0
/*    */     //   125: istore #10
/*    */     //   127: lload #11
/*    */     //   129: bipush #32
/*    */     //   131: lshr
/*    */     //   132: l2i
/*    */     //   133: istore #13
/*    */     //   135: iconst_0
/*    */     //   136: istore #14
/*    */     //   138: iload #13
/*    */     //   140: invokestatic intBitsToFloat : (I)F
/*    */     //   143: nop
/*    */     //   144: iconst_0
/*    */     //   145: istore #10
/*    */     //   147: lload #11
/*    */     //   149: ldc2_w 4294967295
/*    */     //   152: land
/*    */     //   153: l2i
/*    */     //   154: istore #13
/*    */     //   156: iconst_0
/*    */     //   157: istore #14
/*    */     //   159: iload #13
/*    */     //   161: invokestatic intBitsToFloat : (I)F
/*    */     //   164: nop
/*    */     //   165: aload #7
/*    */     //   167: invokevirtual addInterval : (FFLjava/lang/Object;)V
/*    */     //   170: goto -> 34
/*    */     //   173: nop
/*    */     //   174: aload_3
/*    */     //   175: astore_2
/*    */     //   176: aload_2
/*    */     //   177: fconst_0
/*    */     //   178: invokevirtual contains : (F)Z
/*    */     //   181: ifeq -> 196
/*    */     //   184: aload_2
/*    */     //   185: fconst_1
/*    */     //   186: invokevirtual contains : (F)Z
/*    */     //   189: ifeq -> 196
/*    */     //   192: iconst_1
/*    */     //   193: goto -> 197
/*    */     //   196: iconst_0
/*    */     //   197: istore_3
/*    */     //   198: iconst_0
/*    */     //   199: istore #4
/*    */     //   201: nop
/*    */     //   202: iload_3
/*    */     //   203: ifne -> 214
/*    */     //   206: iconst_0
/*    */     //   207: istore #5
/*    */     //   209: ldc 'The easing path must start at 0.0f and end at 1.0f.'
/*    */     //   211: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*    */     //   214: nop
/*    */     //   215: aload_0
/*    */     //   216: aload_2
/*    */     //   217: putfield intervals : Landroidx/compose/ui/graphics/IntervalTree;
/*    */     //   220: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #86	-> 0
/*    */     //   #92	-> 4
/*    */     //   #96	-> 18
/*    */     //   #97	-> 22
/*    */     //   #98	-> 25
/*    */     //   #96	-> 27
/*    */     //   #100	-> 34
/*    */     //   #101	-> 44
/*    */     //   #102	-> 53
/*    */     //   #137	-> 74
/*    */     //   #140	-> 75
/*    */     //   #141	-> 80
/*    */     //   #103	-> 83
/*    */     //   #141	-> 85
/*    */     //   #143	-> 88
/*    */     //   #105	-> 89
/*    */     //   #106	-> 100
/*    */     //   #108	-> 111
/*    */     //   #109	-> 122
/*    */     //   #144	-> 127
/*    */     //   #145	-> 138
/*    */     //   #144	-> 143
/*    */     //   #109	-> 144
/*    */     //   #146	-> 147
/*    */     //   #145	-> 159
/*    */     //   #146	-> 164
/*    */     //   #109	-> 165
/*    */     //   #112	-> 173
/*    */     //   #92	-> 174
/*    */     //   #92	-> 175
/*    */     //   #114	-> 176
/*    */     //   #147	-> 201
/*    */     //   #150	-> 202
/*    */     //   #151	-> 206
/*    */     //   #115	-> 209
/*    */     //   #151	-> 211
/*    */     //   #153	-> 214
/*    */     //   #118	-> 215
/*    */     //   #119	-> 220
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   83	2	10	$i$a$-requirePrecondition-PathEasing$initializeEasing$segmentIntervals$1$1	I
/*    */     //   74	15	9	$i$f$requirePrecondition	I
/*    */     //   71	18	8	value$iv	Z
/*    */     //   138	5	14	$i$f$floatFromBits	I
/*    */     //   135	8	13	bits$iv$iv	I
/*    */     //   127	17	10	$i$f$getFirst-impl	I
/*    */     //   159	5	14	$i$f$floatFromBits	I
/*    */     //   156	8	13	bits$iv$iv	I
/*    */     //   147	18	10	$i$f$getSecond-impl	I
/*    */     //   122	48	11	bounds	J
/*    */     //   53	117	7	segment	Landroidx/compose/ui/graphics/PathSegment;
/*    */     //   18	156	5	$i$a$-apply-PathEasing$initializeEasing$segmentIntervals$1	I
/*    */     //   34	140	6	iterator	Landroidx/compose/ui/graphics/PathIterator;
/*    */     //   15	159	4	$this$initializeEasing_u24lambda_u243	Landroidx/compose/ui/graphics/IntervalTree;
/*    */     //   209	2	5	$i$a$-requirePrecondition-PathEasing$initializeEasing$1	I
/*    */     //   201	14	4	$i$f$requirePrecondition	I
/*    */     //   198	17	3	value$iv	Z
/*    */     //   4	217	1	roots	[F
/*    */     //   176	45	2	segmentIntervals	Landroidx/compose/ui/graphics/IntervalTree;
/*    */     //   0	221	0	this	Landroidx/compose/animation/core/PathEasing;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\PathEasing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */