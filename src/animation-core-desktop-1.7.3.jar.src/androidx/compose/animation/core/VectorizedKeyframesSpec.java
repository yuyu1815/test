/*      */ package androidx.compose.animation.core;
/*      */ 
/*      */ import androidx.collection.IntList;
/*      */ import androidx.collection.IntObjectMap;
/*      */ import androidx.collection.MutableIntObjectMap;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import java.util.Map;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Pair;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\b\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\025\n\000\n\002\020\024\n\002\b\007\n\002\020\007\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\t\n\002\b\006\n\002\020\002\n\002\b\002\b\007\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B9\b\026\022\036\020\004\032\032\022\004\022\0020\006\022\020\022\016\022\004\022\0028\000\022\004\022\0020\b0\0070\005\022\006\020\t\032\0020\006\022\b\b\002\020\n\032\0020\006¢\006\002\020\013BC\b\000\022\006\020\f\032\0020\r\022\022\020\004\032\016\022\n\022\b\022\004\022\0028\0000\0170\016\022\006\020\t\032\0020\006\022\006\020\n\032\0020\006\022\006\020\020\032\0020\b\022\006\020\021\032\0020\022¢\006\002\020\023J\020\020%\032\0020\0062\006\020&\032\0020\006H\002J\020\020'\032\0020(2\006\020&\032\0020\006H\002J \020)\032\0020(2\006\020*\032\0020\0062\006\020&\032\0020\0062\006\020+\032\0020,H\002J-\020-\032\0028\0002\006\020.\032\0020/2\006\0200\032\0028\0002\006\0201\032\0028\0002\006\0202\032\0028\000H\026¢\006\002\0203J-\0204\032\0028\0002\006\020.\032\0020/2\006\0200\032\0028\0002\006\0201\032\0028\0002\006\0202\032\0028\000H\026¢\006\002\0203J%\0205\032\002062\006\0200\032\0028\0002\006\0201\032\0028\0002\006\0202\032\0028\000H\002¢\006\002\0207R\016\020\024\032\0020\025X.¢\006\002\n\000R\016\020\020\032\0020\bX\004¢\006\002\n\000R\024\020\n\032\0020\006X\004¢\006\b\n\000\032\004\b\026\020\027R\024\020\t\032\0020\006X\004¢\006\b\n\000\032\004\b\030\020\027R\026\020\021\032\0020\022X\004ø\001\000ø\001\001¢\006\004\n\002\020\031R\032\020\004\032\016\022\n\022\b\022\004\022\0028\0000\0170\016X\004¢\006\002\n\000R\020\020\032\032\0028\000X.¢\006\004\n\002\020\033R\020\020\034\032\0028\000X.¢\006\004\n\002\020\033R\016\020\035\032\0020\036X.¢\006\002\n\000R\016\020\037\032\0020 X.¢\006\002\n\000R\016\020!\032\0020 X.¢\006\002\n\000R\016\020\"\032\0020 X.¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\020\020#\032\0028\000X.¢\006\004\n\002\020\033R\020\020$\032\0028\000X.¢\006\004\n\002\020\033\002\013\n\005\b¡\0360\001\n\002\b!¨\0068"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "keyframes", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "delayMillis", "(Ljava/util/Map;II)V", "timestamps", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "defaultEasing", "initialArcMode", "Landroidx/compose/animation/core/ArcMode;", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "arcSpline", "Landroidx/compose/animation/core/ArcSpline;", "getDelayMillis", "()I", "getDurationMillis", "I", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "modes", "", "posArray", "", "slopeArray", "times", "valueVector", "velocityVector", "findEntryForTimeMillis", "timeMillis", "getEasedTime", "", "getEasedTimeFromIndex", "index", "asFraction", "", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1081:1\n215#2,2:1082\n215#2,2:1084\n70#3:1086\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n256#1:1082,2\n273#1:1084,2\n506#1:1086\n*E\n"})
/*      */ public final class VectorizedKeyframesSpec<V extends AnimationVector>
/*      */   implements VectorizedDurationBasedAnimationSpec<V>
/*      */ {
/*      */   @NotNull
/*      */   private final IntList timestamps;
/*      */   @NotNull
/*      */   private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;
/*      */   private final int durationMillis;
/*      */   private final int delayMillis;
/*      */   @NotNull
/*      */   private final Easing defaultEasing;
/*      */   private final int initialArcMode;
/*      */   private int[] modes;
/*      */   private float[] times;
/*      */   private V valueVector;
/*      */   private V velocityVector;
/*      */   private V lastInitialValue;
/*      */   private V lastTargetValue;
/*      */   private float[] posArray;
/*      */   private float[] slopeArray;
/*      */   private ArcSpline arcSpline;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   private VectorizedKeyframesSpec(IntList timestamps, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes, int durationMillis, int delayMillis, Easing defaultEasing, int initialArcMode) {
/*  231 */     this.timestamps = timestamps;
/*  232 */     this.keyframes = keyframes;
/*  233 */     this.durationMillis = durationMillis;
/*  234 */     this.delayMillis = delayMillis;
/*      */     
/*  236 */     this.defaultEasing = defaultEasing;
/*      */ 
/*      */     
/*  239 */     this.initialArcMode = initialArcMode;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getDurationMillis() {
/*      */     return this.durationMillis;
/*      */   }
/*      */ 
/*      */   
/*      */   public int getDelayMillis() {
/*      */     return this.delayMillis;
/*      */   }
/*      */   
/*      */   public VectorizedKeyframesSpec(@NotNull Map keyframes, int durationMillis, int delayMillis) {
/*  253 */     this(
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  281 */         intList, (IntObjectMap)mutableIntObjectMap1, 
/*      */         
/*  283 */         durationMillis, 
/*  284 */         delayMillis, 
/*  285 */         EasingKt.getLinearEasing(), 
/*  286 */         ArcMode.Companion.getArcLinear--9T-Mq4(), null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final void init(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield arcSpline : Landroidx/compose/animation/core/ArcSpline;
/*      */     //   4: ifnull -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore #4
/*      */     //   14: aload_0
/*      */     //   15: getfield valueVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   18: ifnonnull -> 207
/*      */     //   21: aload_0
/*      */     //   22: aload_1
/*      */     //   23: invokestatic newInstance : (Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*      */     //   26: putfield valueVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   29: aload_0
/*      */     //   30: aload_3
/*      */     //   31: invokestatic newInstance : (Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*      */     //   34: putfield velocityVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   37: aload_0
/*      */     //   38: iconst_0
/*      */     //   39: istore #5
/*      */     //   41: aload_0
/*      */     //   42: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   45: invokevirtual getSize : ()I
/*      */     //   48: istore #6
/*      */     //   50: iload #6
/*      */     //   52: newarray float
/*      */     //   54: astore #7
/*      */     //   56: astore #16
/*      */     //   58: iload #5
/*      */     //   60: iload #6
/*      */     //   62: if_icmpge -> 95
/*      */     //   65: iload #5
/*      */     //   67: istore #8
/*      */     //   69: aload #7
/*      */     //   71: iload #8
/*      */     //   73: aload_0
/*      */     //   74: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   77: iload #8
/*      */     //   79: invokevirtual get : (I)I
/*      */     //   82: i2f
/*      */     //   83: ldc2_w 1000
/*      */     //   86: l2f
/*      */     //   87: fdiv
/*      */     //   88: fastore
/*      */     //   89: iinc #5, 1
/*      */     //   92: goto -> 58
/*      */     //   95: aload #16
/*      */     //   97: aload #7
/*      */     //   99: putfield times : [F
/*      */     //   102: aload_0
/*      */     //   103: iconst_0
/*      */     //   104: istore #5
/*      */     //   106: aload_0
/*      */     //   107: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   110: invokevirtual getSize : ()I
/*      */     //   113: istore #6
/*      */     //   115: iload #6
/*      */     //   117: newarray int
/*      */     //   119: astore #7
/*      */     //   121: astore #16
/*      */     //   123: iload #5
/*      */     //   125: iload #6
/*      */     //   127: if_icmpge -> 200
/*      */     //   130: iload #5
/*      */     //   132: istore #8
/*      */     //   134: aload #7
/*      */     //   136: iload #8
/*      */     //   138: aload_0
/*      */     //   139: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   142: aload_0
/*      */     //   143: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   146: iload #8
/*      */     //   148: invokevirtual get : (I)I
/*      */     //   151: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   154: checkcast androidx/compose/animation/core/VectorizedKeyframeSpecElementInfo
/*      */     //   157: dup
/*      */     //   158: ifnull -> 167
/*      */     //   161: invokevirtual getArcMode--9T-Mq4 : ()I
/*      */     //   164: goto -> 172
/*      */     //   167: pop
/*      */     //   168: aload_0
/*      */     //   169: getfield initialArcMode : I
/*      */     //   172: istore #9
/*      */     //   174: iload #9
/*      */     //   176: getstatic androidx/compose/animation/core/ArcMode.Companion : Landroidx/compose/animation/core/ArcMode$Companion;
/*      */     //   179: invokevirtual getArcLinear--9T-Mq4 : ()I
/*      */     //   182: invokestatic equals-impl0 : (II)Z
/*      */     //   185: ifne -> 191
/*      */     //   188: iconst_1
/*      */     //   189: istore #4
/*      */     //   191: iload #9
/*      */     //   193: iastore
/*      */     //   194: iinc #5, 1
/*      */     //   197: goto -> 123
/*      */     //   200: aload #16
/*      */     //   202: aload #7
/*      */     //   204: putfield modes : [I
/*      */     //   207: iload #4
/*      */     //   209: ifne -> 213
/*      */     //   212: return
/*      */     //   213: aload_0
/*      */     //   214: getfield arcSpline : Landroidx/compose/animation/core/ArcSpline;
/*      */     //   217: ifnull -> 264
/*      */     //   220: aload_0
/*      */     //   221: getfield lastInitialValue : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   224: dup
/*      */     //   225: ifnonnull -> 235
/*      */     //   228: pop
/*      */     //   229: ldc 'lastInitialValue'
/*      */     //   231: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   234: aconst_null
/*      */     //   235: aload_1
/*      */     //   236: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   239: ifeq -> 264
/*      */     //   242: aload_0
/*      */     //   243: getfield lastTargetValue : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   246: dup
/*      */     //   247: ifnonnull -> 257
/*      */     //   250: pop
/*      */     //   251: ldc 'lastTargetValue'
/*      */     //   253: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   256: aconst_null
/*      */     //   257: aload_2
/*      */     //   258: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   261: ifne -> 755
/*      */     //   264: aload_0
/*      */     //   265: aload_1
/*      */     //   266: putfield lastInitialValue : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   269: aload_0
/*      */     //   270: aload_2
/*      */     //   271: putfield lastTargetValue : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   274: aload_1
/*      */     //   275: invokevirtual getSize$animation_core : ()I
/*      */     //   278: iconst_2
/*      */     //   279: irem
/*      */     //   280: aload_1
/*      */     //   281: invokevirtual getSize$animation_core : ()I
/*      */     //   284: iadd
/*      */     //   285: istore #5
/*      */     //   287: aload_0
/*      */     //   288: iload #5
/*      */     //   290: newarray float
/*      */     //   292: putfield posArray : [F
/*      */     //   295: aload_0
/*      */     //   296: iload #5
/*      */     //   298: newarray float
/*      */     //   300: putfield slopeArray : [F
/*      */     //   303: iconst_0
/*      */     //   304: istore #7
/*      */     //   306: aload_0
/*      */     //   307: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   310: invokevirtual getSize : ()I
/*      */     //   313: istore #8
/*      */     //   315: iload #8
/*      */     //   317: anewarray [F
/*      */     //   320: astore #9
/*      */     //   322: iload #7
/*      */     //   324: iload #8
/*      */     //   326: if_icmpge -> 706
/*      */     //   329: iload #7
/*      */     //   331: istore #10
/*      */     //   333: aload #9
/*      */     //   335: iload #10
/*      */     //   337: aload_0
/*      */     //   338: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   341: iload #10
/*      */     //   343: invokevirtual get : (I)I
/*      */     //   346: istore #11
/*      */     //   348: iload #11
/*      */     //   350: ifne -> 487
/*      */     //   353: aload_0
/*      */     //   354: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   357: iload #11
/*      */     //   359: invokevirtual contains : (I)Z
/*      */     //   362: ifne -> 415
/*      */     //   365: iconst_0
/*      */     //   366: istore #12
/*      */     //   368: iload #5
/*      */     //   370: newarray float
/*      */     //   372: astore #13
/*      */     //   374: istore #17
/*      */     //   376: astore #16
/*      */     //   378: iload #12
/*      */     //   380: iload #5
/*      */     //   382: if_icmpge -> 406
/*      */     //   385: iload #12
/*      */     //   387: istore #14
/*      */     //   389: aload #13
/*      */     //   391: iload #14
/*      */     //   393: aload_1
/*      */     //   394: iload #14
/*      */     //   396: invokevirtual get$animation_core : (I)F
/*      */     //   399: fastore
/*      */     //   400: iinc #12, 1
/*      */     //   403: goto -> 378
/*      */     //   406: aload #16
/*      */     //   408: iload #17
/*      */     //   410: aload #13
/*      */     //   412: goto -> 699
/*      */     //   415: iconst_0
/*      */     //   416: istore #12
/*      */     //   418: iload #5
/*      */     //   420: newarray float
/*      */     //   422: astore #13
/*      */     //   424: aload_0
/*      */     //   425: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   428: iload #11
/*      */     //   430: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   433: dup
/*      */     //   434: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*      */     //   437: checkcast androidx/compose/animation/core/VectorizedKeyframeSpecElementInfo
/*      */     //   440: invokevirtual getVectorValue : ()Landroidx/compose/animation/core/AnimationVector;
/*      */     //   443: astore #14
/*      */     //   445: istore #17
/*      */     //   447: astore #16
/*      */     //   449: iload #12
/*      */     //   451: iload #5
/*      */     //   453: if_icmpge -> 478
/*      */     //   456: iload #12
/*      */     //   458: istore #15
/*      */     //   460: aload #13
/*      */     //   462: iload #15
/*      */     //   464: aload #14
/*      */     //   466: iload #15
/*      */     //   468: invokevirtual get$animation_core : (I)F
/*      */     //   471: fastore
/*      */     //   472: iinc #12, 1
/*      */     //   475: goto -> 449
/*      */     //   478: aload #16
/*      */     //   480: iload #17
/*      */     //   482: aload #13
/*      */     //   484: goto -> 699
/*      */     //   487: iload #11
/*      */     //   489: aload_0
/*      */     //   490: invokevirtual getDurationMillis : ()I
/*      */     //   493: if_icmpne -> 630
/*      */     //   496: aload_0
/*      */     //   497: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   500: iload #11
/*      */     //   502: invokevirtual contains : (I)Z
/*      */     //   505: ifne -> 558
/*      */     //   508: iconst_0
/*      */     //   509: istore #12
/*      */     //   511: iload #5
/*      */     //   513: newarray float
/*      */     //   515: astore #13
/*      */     //   517: istore #17
/*      */     //   519: astore #16
/*      */     //   521: iload #12
/*      */     //   523: iload #5
/*      */     //   525: if_icmpge -> 549
/*      */     //   528: iload #12
/*      */     //   530: istore #14
/*      */     //   532: aload #13
/*      */     //   534: iload #14
/*      */     //   536: aload_2
/*      */     //   537: iload #14
/*      */     //   539: invokevirtual get$animation_core : (I)F
/*      */     //   542: fastore
/*      */     //   543: iinc #12, 1
/*      */     //   546: goto -> 521
/*      */     //   549: aload #16
/*      */     //   551: iload #17
/*      */     //   553: aload #13
/*      */     //   555: goto -> 699
/*      */     //   558: iconst_0
/*      */     //   559: istore #12
/*      */     //   561: iload #5
/*      */     //   563: newarray float
/*      */     //   565: astore #13
/*      */     //   567: aload_0
/*      */     //   568: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   571: iload #11
/*      */     //   573: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   576: dup
/*      */     //   577: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*      */     //   580: checkcast androidx/compose/animation/core/VectorizedKeyframeSpecElementInfo
/*      */     //   583: invokevirtual getVectorValue : ()Landroidx/compose/animation/core/AnimationVector;
/*      */     //   586: astore #14
/*      */     //   588: istore #17
/*      */     //   590: astore #16
/*      */     //   592: iload #12
/*      */     //   594: iload #5
/*      */     //   596: if_icmpge -> 621
/*      */     //   599: iload #12
/*      */     //   601: istore #15
/*      */     //   603: aload #13
/*      */     //   605: iload #15
/*      */     //   607: aload #14
/*      */     //   609: iload #15
/*      */     //   611: invokevirtual get$animation_core : (I)F
/*      */     //   614: fastore
/*      */     //   615: iinc #12, 1
/*      */     //   618: goto -> 592
/*      */     //   621: aload #16
/*      */     //   623: iload #17
/*      */     //   625: aload #13
/*      */     //   627: goto -> 699
/*      */     //   630: iconst_0
/*      */     //   631: istore #12
/*      */     //   633: iload #5
/*      */     //   635: newarray float
/*      */     //   637: astore #13
/*      */     //   639: aload_0
/*      */     //   640: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   643: iload #11
/*      */     //   645: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   648: dup
/*      */     //   649: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*      */     //   652: checkcast androidx/compose/animation/core/VectorizedKeyframeSpecElementInfo
/*      */     //   655: invokevirtual getVectorValue : ()Landroidx/compose/animation/core/AnimationVector;
/*      */     //   658: astore #14
/*      */     //   660: istore #17
/*      */     //   662: astore #16
/*      */     //   664: iload #12
/*      */     //   666: iload #5
/*      */     //   668: if_icmpge -> 693
/*      */     //   671: iload #12
/*      */     //   673: istore #15
/*      */     //   675: aload #13
/*      */     //   677: iload #15
/*      */     //   679: aload #14
/*      */     //   681: iload #15
/*      */     //   683: invokevirtual get$animation_core : (I)F
/*      */     //   686: fastore
/*      */     //   687: iinc #12, 1
/*      */     //   690: goto -> 664
/*      */     //   693: aload #16
/*      */     //   695: iload #17
/*      */     //   697: aload #13
/*      */     //   699: aastore
/*      */     //   700: iinc #7, 1
/*      */     //   703: goto -> 322
/*      */     //   706: aload #9
/*      */     //   708: astore #6
/*      */     //   710: aload_0
/*      */     //   711: new androidx/compose/animation/core/ArcSpline
/*      */     //   714: dup
/*      */     //   715: aload_0
/*      */     //   716: getfield modes : [I
/*      */     //   719: dup
/*      */     //   720: ifnonnull -> 731
/*      */     //   723: pop
/*      */     //   724: ldc_w 'modes'
/*      */     //   727: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   730: aconst_null
/*      */     //   731: aload_0
/*      */     //   732: getfield times : [F
/*      */     //   735: dup
/*      */     //   736: ifnonnull -> 747
/*      */     //   739: pop
/*      */     //   740: ldc_w 'times'
/*      */     //   743: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   746: aconst_null
/*      */     //   747: aload #6
/*      */     //   749: invokespecial <init> : ([I[F[[F)V
/*      */     //   752: putfield arcSpline : Landroidx/compose/animation/core/ArcSpline;
/*      */     //   755: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #307	-> 0
/*      */     //   #310	-> 14
/*      */     //   #311	-> 21
/*      */     //   #312	-> 29
/*      */     //   #314	-> 37
/*      */     //   #315	-> 73
/*      */     //   #314	-> 92
/*      */     //   #318	-> 102
/*      */     //   #319	-> 138
/*      */     //   #320	-> 174
/*      */     //   #321	-> 188
/*      */     //   #324	-> 191
/*      */     //   #318	-> 197
/*      */     //   #328	-> 207
/*      */     //   #329	-> 212
/*      */     //   #333	-> 213
/*      */     //   #334	-> 220
/*      */     //   #336	-> 264
/*      */     //   #337	-> 269
/*      */     //   #340	-> 274
/*      */     //   #341	-> 287
/*      */     //   #342	-> 295
/*      */     //   #346	-> 303
/*      */     //   #347	-> 337
/*      */     //   #349	-> 348
/*      */     //   #350	-> 353
/*      */     //   #351	-> 365
/*      */     //   #353	-> 415
/*      */     //   #357	-> 487
/*      */     //   #358	-> 496
/*      */     //   #359	-> 508
/*      */     //   #361	-> 558
/*      */     //   #366	-> 630
/*      */     //   #346	-> 703
/*      */     //   #369	-> 710
/*      */     //   #370	-> 715
/*      */     //   #371	-> 731
/*      */     //   #372	-> 747
/*      */     //   #369	-> 749
/*      */     //   #375	-> 755
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   174	19	9	mode	I
/*      */     //   348	351	11	timestamp	I
/*      */     //   287	468	5	dimensionCount	I
/*      */     //   710	45	6	values	[[F
/*      */     //   14	742	4	requiresArcSpline	Z
/*      */     //   0	756	0	this	Landroidx/compose/animation/core/VectorizedKeyframesSpec;
/*      */     //   0	756	1	initialValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	756	2	targetValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	756	3	initialVelocity	Landroidx/compose/animation/core/AnimationVector;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public V getValueFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/*      */     // Byte code:
/*      */     //   0: aload_3
/*      */     //   1: ldc_w 'initialValue'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #4
/*      */     //   9: ldc_w 'targetValue'
/*      */     //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   15: aload #5
/*      */     //   17: ldc_w 'initialVelocity'
/*      */     //   20: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   23: lload_1
/*      */     //   24: ldc2_w 1000000
/*      */     //   27: ldiv
/*      */     //   28: lstore #6
/*      */     //   30: aload_0
/*      */     //   31: checkcast androidx/compose/animation/core/VectorizedDurationBasedAnimationSpec
/*      */     //   34: lload #6
/*      */     //   36: invokestatic clampPlayTime : (Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J
/*      */     //   39: l2i
/*      */     //   40: istore #8
/*      */     //   42: aload_0
/*      */     //   43: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   46: iload #8
/*      */     //   48: invokevirtual contains : (I)Z
/*      */     //   51: ifeq -> 74
/*      */     //   54: aload_0
/*      */     //   55: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   58: iload #8
/*      */     //   60: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   63: dup
/*      */     //   64: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*      */     //   67: checkcast androidx/compose/animation/core/VectorizedKeyframeSpecElementInfo
/*      */     //   70: invokevirtual getVectorValue : ()Landroidx/compose/animation/core/AnimationVector;
/*      */     //   73: areturn
/*      */     //   74: iload #8
/*      */     //   76: aload_0
/*      */     //   77: invokevirtual getDurationMillis : ()I
/*      */     //   80: if_icmplt -> 86
/*      */     //   83: aload #4
/*      */     //   85: areturn
/*      */     //   86: iload #8
/*      */     //   88: ifgt -> 93
/*      */     //   91: aload_3
/*      */     //   92: areturn
/*      */     //   93: aload_0
/*      */     //   94: aload_3
/*      */     //   95: aload #4
/*      */     //   97: aload #5
/*      */     //   99: invokespecial init : (Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V
/*      */     //   102: aload_0
/*      */     //   103: getfield arcSpline : Landroidx/compose/animation/core/ArcSpline;
/*      */     //   106: ifnull -> 246
/*      */     //   109: aload_0
/*      */     //   110: iload #8
/*      */     //   112: invokespecial getEasedTime : (I)F
/*      */     //   115: fstore #9
/*      */     //   117: aload_0
/*      */     //   118: getfield arcSpline : Landroidx/compose/animation/core/ArcSpline;
/*      */     //   121: dup
/*      */     //   122: ifnonnull -> 133
/*      */     //   125: pop
/*      */     //   126: ldc_w 'arcSpline'
/*      */     //   129: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   132: aconst_null
/*      */     //   133: fload #9
/*      */     //   135: aload_0
/*      */     //   136: getfield posArray : [F
/*      */     //   139: dup
/*      */     //   140: ifnonnull -> 151
/*      */     //   143: pop
/*      */     //   144: ldc_w 'posArray'
/*      */     //   147: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   150: aconst_null
/*      */     //   151: invokevirtual getPos : (F[F)V
/*      */     //   154: iconst_0
/*      */     //   155: istore #10
/*      */     //   157: aload_0
/*      */     //   158: getfield posArray : [F
/*      */     //   161: dup
/*      */     //   162: ifnonnull -> 173
/*      */     //   165: pop
/*      */     //   166: ldc_w 'posArray'
/*      */     //   169: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   172: aconst_null
/*      */     //   173: arraylength
/*      */     //   174: istore #11
/*      */     //   176: iload #10
/*      */     //   178: iload #11
/*      */     //   180: if_icmpge -> 229
/*      */     //   183: aload_0
/*      */     //   184: getfield valueVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   187: dup
/*      */     //   188: ifnonnull -> 199
/*      */     //   191: pop
/*      */     //   192: ldc_w 'valueVector'
/*      */     //   195: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   198: aconst_null
/*      */     //   199: iload #10
/*      */     //   201: aload_0
/*      */     //   202: getfield posArray : [F
/*      */     //   205: dup
/*      */     //   206: ifnonnull -> 217
/*      */     //   209: pop
/*      */     //   210: ldc_w 'posArray'
/*      */     //   213: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   216: aconst_null
/*      */     //   217: iload #10
/*      */     //   219: faload
/*      */     //   220: invokevirtual set$animation_core : (IF)V
/*      */     //   223: iinc #10, 1
/*      */     //   226: goto -> 176
/*      */     //   229: aload_0
/*      */     //   230: getfield valueVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   233: dup
/*      */     //   234: ifnonnull -> 245
/*      */     //   237: pop
/*      */     //   238: ldc_w 'valueVector'
/*      */     //   241: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   244: aconst_null
/*      */     //   245: areturn
/*      */     //   246: aload_0
/*      */     //   247: iload #8
/*      */     //   249: invokespecial findEntryForTimeMillis : (I)I
/*      */     //   252: istore #9
/*      */     //   254: aload_0
/*      */     //   255: iload #9
/*      */     //   257: iload #8
/*      */     //   259: iconst_1
/*      */     //   260: invokespecial getEasedTimeFromIndex : (IIZ)F
/*      */     //   263: fstore #10
/*      */     //   265: aload_0
/*      */     //   266: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   269: iload #9
/*      */     //   271: invokevirtual get : (I)I
/*      */     //   274: istore #11
/*      */     //   276: aload_0
/*      */     //   277: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   280: iload #11
/*      */     //   282: invokevirtual contains : (I)Z
/*      */     //   285: ifeq -> 310
/*      */     //   288: aload_0
/*      */     //   289: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   292: iload #11
/*      */     //   294: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   297: dup
/*      */     //   298: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*      */     //   301: checkcast androidx/compose/animation/core/VectorizedKeyframeSpecElementInfo
/*      */     //   304: invokevirtual getVectorValue : ()Landroidx/compose/animation/core/AnimationVector;
/*      */     //   307: goto -> 311
/*      */     //   310: aload_3
/*      */     //   311: astore #12
/*      */     //   313: aload_0
/*      */     //   314: getfield timestamps : Landroidx/collection/IntList;
/*      */     //   317: iload #9
/*      */     //   319: iconst_1
/*      */     //   320: iadd
/*      */     //   321: invokevirtual get : (I)I
/*      */     //   324: istore #13
/*      */     //   326: aload_0
/*      */     //   327: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   330: iload #13
/*      */     //   332: invokevirtual contains : (I)Z
/*      */     //   335: ifeq -> 360
/*      */     //   338: aload_0
/*      */     //   339: getfield keyframes : Landroidx/collection/IntObjectMap;
/*      */     //   342: iload #13
/*      */     //   344: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   347: dup
/*      */     //   348: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*      */     //   351: checkcast androidx/compose/animation/core/VectorizedKeyframeSpecElementInfo
/*      */     //   354: invokevirtual getVectorValue : ()Landroidx/compose/animation/core/AnimationVector;
/*      */     //   357: goto -> 362
/*      */     //   360: aload #4
/*      */     //   362: astore #14
/*      */     //   364: iconst_0
/*      */     //   365: istore #15
/*      */     //   367: aload_0
/*      */     //   368: getfield valueVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   371: dup
/*      */     //   372: ifnonnull -> 383
/*      */     //   375: pop
/*      */     //   376: ldc_w 'valueVector'
/*      */     //   379: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   382: aconst_null
/*      */     //   383: invokevirtual getSize$animation_core : ()I
/*      */     //   386: istore #16
/*      */     //   388: iload #15
/*      */     //   390: iload #16
/*      */     //   392: if_icmpge -> 441
/*      */     //   395: aload_0
/*      */     //   396: getfield valueVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   399: dup
/*      */     //   400: ifnonnull -> 411
/*      */     //   403: pop
/*      */     //   404: ldc_w 'valueVector'
/*      */     //   407: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   410: aconst_null
/*      */     //   411: iload #15
/*      */     //   413: aload #12
/*      */     //   415: iload #15
/*      */     //   417: invokevirtual get$animation_core : (I)F
/*      */     //   420: aload #14
/*      */     //   422: iload #15
/*      */     //   424: invokevirtual get$animation_core : (I)F
/*      */     //   427: fload #10
/*      */     //   429: invokestatic lerp : (FFF)F
/*      */     //   432: invokevirtual set$animation_core : (IF)V
/*      */     //   435: iinc #15, 1
/*      */     //   438: goto -> 388
/*      */     //   441: aload_0
/*      */     //   442: getfield valueVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   445: dup
/*      */     //   446: ifnonnull -> 457
/*      */     //   449: pop
/*      */     //   450: ldc_w 'valueVector'
/*      */     //   453: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   456: aconst_null
/*      */     //   457: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #387	-> 23
/*      */     //   #388	-> 30
/*      */     //   #391	-> 42
/*      */     //   #392	-> 54
/*      */     //   #395	-> 74
/*      */     //   #396	-> 83
/*      */     //   #397	-> 86
/*      */     //   #399	-> 93
/*      */     //   #402	-> 102
/*      */     //   #404	-> 109
/*      */     //   #406	-> 117
/*      */     //   #407	-> 133
/*      */     //   #408	-> 135
/*      */     //   #406	-> 151
/*      */     //   #410	-> 154
/*      */     //   #411	-> 183
/*      */     //   #410	-> 223
/*      */     //   #413	-> 229
/*      */     //   #417	-> 246
/*      */     //   #420	-> 254
/*      */     //   #422	-> 265
/*      */     //   #423	-> 276
/*      */     //   #424	-> 288
/*      */     //   #429	-> 310
/*      */     //   #423	-> 311
/*      */     //   #432	-> 313
/*      */     //   #433	-> 326
/*      */     //   #434	-> 338
/*      */     //   #439	-> 360
/*      */     //   #433	-> 362
/*      */     //   #442	-> 364
/*      */     //   #443	-> 395
/*      */     //   #442	-> 435
/*      */     //   #445	-> 441
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   157	72	10	i	I
/*      */     //   117	129	9	easedTime	F
/*      */     //   367	74	15	i	I
/*      */     //   30	428	6	playTimeMillis	J
/*      */     //   42	416	8	clampedPlayTime	I
/*      */     //   254	204	9	index	I
/*      */     //   265	193	10	easedTime	F
/*      */     //   276	182	11	timestampStart	I
/*      */     //   313	145	12	startValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   326	132	13	timestampEnd	I
/*      */     //   364	94	14	endValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	458	0	this	Landroidx/compose/animation/core/VectorizedKeyframesSpec;
/*      */     //   0	458	1	playTimeNanos	J
/*      */     //   0	458	3	initialValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	458	4	targetValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	458	5	initialVelocity	Landroidx/compose/animation/core/AnimationVector;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public V getVelocityFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/*      */     // Byte code:
/*      */     //   0: aload_3
/*      */     //   1: ldc_w 'initialValue'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #4
/*      */     //   9: ldc_w 'targetValue'
/*      */     //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   15: aload #5
/*      */     //   17: ldc_w 'initialVelocity'
/*      */     //   20: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   23: lload_1
/*      */     //   24: ldc2_w 1000000
/*      */     //   27: ldiv
/*      */     //   28: lstore #6
/*      */     //   30: aload_0
/*      */     //   31: checkcast androidx/compose/animation/core/VectorizedDurationBasedAnimationSpec
/*      */     //   34: lload #6
/*      */     //   36: invokestatic clampPlayTime : (Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J
/*      */     //   39: lstore #8
/*      */     //   41: lload #8
/*      */     //   43: lconst_0
/*      */     //   44: lcmp
/*      */     //   45: ifge -> 51
/*      */     //   48: aload #5
/*      */     //   50: areturn
/*      */     //   51: aload_0
/*      */     //   52: aload_3
/*      */     //   53: aload #4
/*      */     //   55: aload #5
/*      */     //   57: invokespecial init : (Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V
/*      */     //   60: aload_0
/*      */     //   61: getfield arcSpline : Landroidx/compose/animation/core/ArcSpline;
/*      */     //   64: ifnull -> 205
/*      */     //   67: aload_0
/*      */     //   68: lload #8
/*      */     //   70: l2i
/*      */     //   71: invokespecial getEasedTime : (I)F
/*      */     //   74: fstore #10
/*      */     //   76: aload_0
/*      */     //   77: getfield arcSpline : Landroidx/compose/animation/core/ArcSpline;
/*      */     //   80: dup
/*      */     //   81: ifnonnull -> 92
/*      */     //   84: pop
/*      */     //   85: ldc_w 'arcSpline'
/*      */     //   88: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   91: aconst_null
/*      */     //   92: fload #10
/*      */     //   94: aload_0
/*      */     //   95: getfield slopeArray : [F
/*      */     //   98: dup
/*      */     //   99: ifnonnull -> 110
/*      */     //   102: pop
/*      */     //   103: ldc_w 'slopeArray'
/*      */     //   106: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   109: aconst_null
/*      */     //   110: invokevirtual getSlope : (F[F)V
/*      */     //   113: iconst_0
/*      */     //   114: istore #11
/*      */     //   116: aload_0
/*      */     //   117: getfield slopeArray : [F
/*      */     //   120: dup
/*      */     //   121: ifnonnull -> 132
/*      */     //   124: pop
/*      */     //   125: ldc_w 'slopeArray'
/*      */     //   128: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   131: aconst_null
/*      */     //   132: arraylength
/*      */     //   133: istore #12
/*      */     //   135: iload #11
/*      */     //   137: iload #12
/*      */     //   139: if_icmpge -> 188
/*      */     //   142: aload_0
/*      */     //   143: getfield velocityVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   146: dup
/*      */     //   147: ifnonnull -> 158
/*      */     //   150: pop
/*      */     //   151: ldc_w 'velocityVector'
/*      */     //   154: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   157: aconst_null
/*      */     //   158: iload #11
/*      */     //   160: aload_0
/*      */     //   161: getfield slopeArray : [F
/*      */     //   164: dup
/*      */     //   165: ifnonnull -> 176
/*      */     //   168: pop
/*      */     //   169: ldc_w 'slopeArray'
/*      */     //   172: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   175: aconst_null
/*      */     //   176: iload #11
/*      */     //   178: faload
/*      */     //   179: invokevirtual set$animation_core : (IF)V
/*      */     //   182: iinc #11, 1
/*      */     //   185: goto -> 135
/*      */     //   188: aload_0
/*      */     //   189: getfield velocityVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   192: dup
/*      */     //   193: ifnonnull -> 204
/*      */     //   196: pop
/*      */     //   197: ldc_w 'velocityVector'
/*      */     //   200: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   203: aconst_null
/*      */     //   204: areturn
/*      */     //   205: aload_0
/*      */     //   206: checkcast androidx/compose/animation/core/VectorizedAnimationSpec
/*      */     //   209: lload #8
/*      */     //   211: lconst_1
/*      */     //   212: lsub
/*      */     //   213: aload_3
/*      */     //   214: aload #4
/*      */     //   216: aload #5
/*      */     //   218: invokestatic getValueFromMillis : (Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*      */     //   221: astore #10
/*      */     //   223: aload_0
/*      */     //   224: checkcast androidx/compose/animation/core/VectorizedAnimationSpec
/*      */     //   227: lload #8
/*      */     //   229: aload_3
/*      */     //   230: aload #4
/*      */     //   232: aload #5
/*      */     //   234: invokestatic getValueFromMillis : (Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*      */     //   237: astore #11
/*      */     //   239: iconst_0
/*      */     //   240: istore #12
/*      */     //   242: aload #10
/*      */     //   244: invokevirtual getSize$animation_core : ()I
/*      */     //   247: istore #13
/*      */     //   249: iload #12
/*      */     //   251: iload #13
/*      */     //   253: if_icmpge -> 302
/*      */     //   256: aload_0
/*      */     //   257: getfield velocityVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   260: dup
/*      */     //   261: ifnonnull -> 272
/*      */     //   264: pop
/*      */     //   265: ldc_w 'velocityVector'
/*      */     //   268: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   271: aconst_null
/*      */     //   272: iload #12
/*      */     //   274: aload #10
/*      */     //   276: iload #12
/*      */     //   278: invokevirtual get$animation_core : (I)F
/*      */     //   281: aload #11
/*      */     //   283: iload #12
/*      */     //   285: invokevirtual get$animation_core : (I)F
/*      */     //   288: fsub
/*      */     //   289: ldc_w 1000.0
/*      */     //   292: fmul
/*      */     //   293: invokevirtual set$animation_core : (IF)V
/*      */     //   296: iinc #12, 1
/*      */     //   299: goto -> 249
/*      */     //   302: aload_0
/*      */     //   303: getfield velocityVector : Landroidx/compose/animation/core/AnimationVector;
/*      */     //   306: dup
/*      */     //   307: ifnonnull -> 318
/*      */     //   310: pop
/*      */     //   311: ldc_w 'velocityVector'
/*      */     //   314: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*      */     //   317: aconst_null
/*      */     //   318: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #454	-> 23
/*      */     //   #455	-> 30
/*      */     //   #456	-> 41
/*      */     //   #457	-> 48
/*      */     //   #460	-> 51
/*      */     //   #463	-> 60
/*      */     //   #464	-> 67
/*      */     //   #465	-> 76
/*      */     //   #466	-> 92
/*      */     //   #467	-> 94
/*      */     //   #465	-> 110
/*      */     //   #469	-> 113
/*      */     //   #470	-> 142
/*      */     //   #469	-> 182
/*      */     //   #472	-> 188
/*      */     //   #476	-> 205
/*      */     //   #477	-> 209
/*      */     //   #478	-> 213
/*      */     //   #479	-> 214
/*      */     //   #480	-> 216
/*      */     //   #476	-> 218
/*      */     //   #482	-> 223
/*      */     //   #483	-> 227
/*      */     //   #484	-> 229
/*      */     //   #485	-> 230
/*      */     //   #486	-> 232
/*      */     //   #482	-> 234
/*      */     //   #488	-> 239
/*      */     //   #489	-> 256
/*      */     //   #488	-> 296
/*      */     //   #491	-> 302
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   116	72	11	i	I
/*      */     //   76	129	10	easedTime	F
/*      */     //   242	60	12	i	I
/*      */     //   30	289	6	playTimeMillis	J
/*      */     //   41	278	8	clampedPlayTime	J
/*      */     //   223	96	10	startNum	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   239	80	11	endNum	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	319	0	this	Landroidx/compose/animation/core/VectorizedKeyframesSpec;
/*      */     //   0	319	1	playTimeNanos	J
/*      */     //   0	319	3	initialValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	319	4	targetValue	Landroidx/compose/animation/core/AnimationVector;
/*      */     //   0	319	5	initialVelocity	Landroidx/compose/animation/core/AnimationVector;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final float getEasedTime(int timeMillis) {
/*  497 */     int index = findEntryForTimeMillis(timeMillis);
/*  498 */     return getEasedTimeFromIndex(index, timeMillis, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final float getEasedTimeFromIndex(int index, int timeMillis, boolean asFraction) {
/*  506 */     IntList this_$iv = this.timestamps; int $i$f$getLastIndex = 0; if (index >= 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1086 */       this_$iv._size - 1)
/*      */       return timeMillis / (float)1000L; 
/*      */     int timeMin = this.timestamps.get(index);
/*      */     int timeMax = this.timestamps.get(index + 1);
/*      */     if (timeMillis == timeMin)
/*      */       return timeMin / (float)1000L; 
/*      */     int timeRange = timeMax - timeMin;
/*      */     if ((VectorizedKeyframeSpecElementInfo)this.keyframes.get(timeMin) == null || ((VectorizedKeyframeSpecElementInfo)this.keyframes.get(timeMin)).getEasing() == null)
/*      */       ((VectorizedKeyframeSpecElementInfo)this.keyframes.get(timeMin)).getEasing(); 
/*      */     Easing easing = this.defaultEasing;
/*      */     float rawFraction = (timeMillis - timeMin) / timeRange;
/*      */     float easedFraction = easing.transform(rawFraction);
/*      */     if (asFraction)
/*      */       return easedFraction; 
/*      */     return (timeRange * easedFraction + timeMin) / (float)1000L;
/*      */   }
/*      */   
/*      */   private final int findEntryForTimeMillis(int timeMillis) {
/*      */     int index = IntListExtensionKt.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
/*      */     return (index < -1) ? -(index + 2) : index;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorizedKeyframesSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */