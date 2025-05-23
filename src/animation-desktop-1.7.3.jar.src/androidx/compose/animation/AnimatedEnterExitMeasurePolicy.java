/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\007\n\002\020\b\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\"\020\r\032\0020\016*\0020\0172\f\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\016H\026J\"\020\024\032\0020\016*\0020\0172\f\020\020\032\b\022\004\022\0020\0220\0212\006\020\025\032\0020\016H\026J,\020\026\032\0020\027*\0020\0302\f\020\020\032\b\022\004\022\0020\0310\0212\006\020\032\032\0020\033H\026ø\001\000¢\006\004\b\034\020\035J\"\020\036\032\0020\016*\0020\0172\f\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\016H\026J\"\020\037\032\0020\016*\0020\0172\f\020\020\032\b\022\004\022\0020\0220\0212\006\020\025\032\0020\016H\026R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f\002\007\n\005\b¡\0360\001¨\006 "}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "scope", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "hasLookaheadOccurred", "", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "getScope", "()Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation"})
/*     */ @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,885:1\n151#2,3:886\n33#2,4:889\n154#2,2:893\n38#2:895\n156#2:896\n171#2,13:897\n171#2,13:910\n317#2,8:923\n317#2,8:931\n317#2,8:939\n317#2,8:947\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n812#1:886,3\n812#1:889,4\n812#1:893,2\n812#1:895\n812#1:896\n813#1:897,13\n814#1:910,13\n833#1:923,8\n838#1:931,8\n843#1:939,8\n848#1:947,8\n*E\n"})
/*     */ final class AnimatedEnterExitMeasurePolicy
/*     */   implements MeasurePolicy
/*     */ {
/*     */   @NotNull
/*     */   private final AnimatedVisibilityScopeImpl scope;
/*     */   private boolean hasLookaheadOccurred;
/*     */   
/*     */   public AnimatedEnterExitMeasurePolicy(@NotNull AnimatedVisibilityScopeImpl scope) {
/* 805 */     this.scope = scope; } @NotNull public final AnimatedVisibilityScopeImpl getScope() { return this.scope; }
/*     */   
/* 807 */   public final boolean getHasLookaheadOccurred() { return this.hasLookaheadOccurred; } public final void setHasLookaheadOccurred(boolean <set-?>) { this.hasLookaheadOccurred = <set-?>; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull List measurables, long constraints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$measure'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #6
/*     */     //   15: iconst_0
/*     */     //   16: istore #7
/*     */     //   18: nop
/*     */     //   19: new java/util/ArrayList
/*     */     //   22: dup
/*     */     //   23: aload #6
/*     */     //   25: invokeinterface size : ()I
/*     */     //   30: invokespecial <init> : (I)V
/*     */     //   33: astore #8
/*     */     //   35: aload #6
/*     */     //   37: astore #9
/*     */     //   39: iconst_0
/*     */     //   40: istore #10
/*     */     //   42: nop
/*     */     //   43: iconst_0
/*     */     //   44: istore #11
/*     */     //   46: aload #9
/*     */     //   48: invokeinterface size : ()I
/*     */     //   53: istore #12
/*     */     //   55: iload #11
/*     */     //   57: iload #12
/*     */     //   59: if_icmpge -> 122
/*     */     //   62: aload #9
/*     */     //   64: iload #11
/*     */     //   66: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   71: astore #13
/*     */     //   73: aload #13
/*     */     //   75: astore #14
/*     */     //   77: iconst_0
/*     */     //   78: istore #15
/*     */     //   80: aload #8
/*     */     //   82: checkcast java/util/Collection
/*     */     //   85: aload #14
/*     */     //   87: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   90: astore #16
/*     */     //   92: astore #18
/*     */     //   94: iconst_0
/*     */     //   95: istore #17
/*     */     //   97: aload #16
/*     */     //   99: lload_3
/*     */     //   100: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   105: aload #18
/*     */     //   107: swap
/*     */     //   108: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   113: pop
/*     */     //   114: nop
/*     */     //   115: nop
/*     */     //   116: iinc #11, 1
/*     */     //   119: goto -> 55
/*     */     //   122: nop
/*     */     //   123: aload #8
/*     */     //   125: checkcast java/util/List
/*     */     //   128: astore #5
/*     */     //   130: aload #5
/*     */     //   132: astore #8
/*     */     //   134: iconst_0
/*     */     //   135: istore #9
/*     */     //   137: nop
/*     */     //   138: aload #8
/*     */     //   140: invokeinterface isEmpty : ()Z
/*     */     //   145: ifeq -> 152
/*     */     //   148: aconst_null
/*     */     //   149: goto -> 254
/*     */     //   152: aload #8
/*     */     //   154: iconst_0
/*     */     //   155: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   160: astore #10
/*     */     //   162: aload #10
/*     */     //   164: checkcast androidx/compose/ui/layout/Placeable
/*     */     //   167: astore #11
/*     */     //   169: iconst_0
/*     */     //   170: istore #12
/*     */     //   172: aload #11
/*     */     //   174: invokevirtual getWidth : ()I
/*     */     //   177: istore #11
/*     */     //   179: iconst_1
/*     */     //   180: istore #12
/*     */     //   182: aload #8
/*     */     //   184: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   187: istore #13
/*     */     //   189: iload #12
/*     */     //   191: iload #13
/*     */     //   193: if_icmpgt -> 252
/*     */     //   196: aload #8
/*     */     //   198: iload #12
/*     */     //   200: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   205: astore #14
/*     */     //   207: aload #14
/*     */     //   209: checkcast androidx/compose/ui/layout/Placeable
/*     */     //   212: astore #15
/*     */     //   214: iconst_0
/*     */     //   215: istore #16
/*     */     //   217: aload #15
/*     */     //   219: invokevirtual getWidth : ()I
/*     */     //   222: istore #15
/*     */     //   224: iload #11
/*     */     //   226: iload #15
/*     */     //   228: if_icmpge -> 239
/*     */     //   231: aload #14
/*     */     //   233: astore #10
/*     */     //   235: iload #15
/*     */     //   237: istore #11
/*     */     //   239: iload #12
/*     */     //   241: iload #13
/*     */     //   243: if_icmpeq -> 252
/*     */     //   246: iinc #12, 1
/*     */     //   249: goto -> 196
/*     */     //   252: aload #10
/*     */     //   254: checkcast androidx/compose/ui/layout/Placeable
/*     */     //   257: dup
/*     */     //   258: ifnull -> 267
/*     */     //   261: invokevirtual getWidth : ()I
/*     */     //   264: goto -> 269
/*     */     //   267: pop
/*     */     //   268: iconst_0
/*     */     //   269: istore #6
/*     */     //   271: aload #5
/*     */     //   273: astore #9
/*     */     //   275: iconst_0
/*     */     //   276: istore #10
/*     */     //   278: nop
/*     */     //   279: aload #9
/*     */     //   281: invokeinterface isEmpty : ()Z
/*     */     //   286: ifeq -> 293
/*     */     //   289: aconst_null
/*     */     //   290: goto -> 395
/*     */     //   293: aload #9
/*     */     //   295: iconst_0
/*     */     //   296: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   301: astore #11
/*     */     //   303: aload #11
/*     */     //   305: checkcast androidx/compose/ui/layout/Placeable
/*     */     //   308: astore #12
/*     */     //   310: iconst_0
/*     */     //   311: istore #13
/*     */     //   313: aload #12
/*     */     //   315: invokevirtual getHeight : ()I
/*     */     //   318: istore #12
/*     */     //   320: iconst_1
/*     */     //   321: istore #13
/*     */     //   323: aload #9
/*     */     //   325: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   328: istore #14
/*     */     //   330: iload #13
/*     */     //   332: iload #14
/*     */     //   334: if_icmpgt -> 393
/*     */     //   337: aload #9
/*     */     //   339: iload #13
/*     */     //   341: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   346: astore #15
/*     */     //   348: aload #15
/*     */     //   350: checkcast androidx/compose/ui/layout/Placeable
/*     */     //   353: astore #16
/*     */     //   355: iconst_0
/*     */     //   356: istore #17
/*     */     //   358: aload #16
/*     */     //   360: invokevirtual getHeight : ()I
/*     */     //   363: istore #16
/*     */     //   365: iload #12
/*     */     //   367: iload #16
/*     */     //   369: if_icmpge -> 380
/*     */     //   372: aload #15
/*     */     //   374: astore #11
/*     */     //   376: iload #16
/*     */     //   378: istore #12
/*     */     //   380: iload #13
/*     */     //   382: iload #14
/*     */     //   384: if_icmpeq -> 393
/*     */     //   387: iinc #13, 1
/*     */     //   390: goto -> 337
/*     */     //   393: aload #11
/*     */     //   395: checkcast androidx/compose/ui/layout/Placeable
/*     */     //   398: dup
/*     */     //   399: ifnull -> 408
/*     */     //   402: invokevirtual getHeight : ()I
/*     */     //   405: goto -> 410
/*     */     //   408: pop
/*     */     //   409: iconst_0
/*     */     //   410: istore #7
/*     */     //   412: aload_1
/*     */     //   413: invokeinterface isLookingAhead : ()Z
/*     */     //   418: ifeq -> 451
/*     */     //   421: aload_0
/*     */     //   422: iconst_1
/*     */     //   423: putfield hasLookaheadOccurred : Z
/*     */     //   426: aload_0
/*     */     //   427: getfield scope : Landroidx/compose/animation/AnimatedVisibilityScopeImpl;
/*     */     //   430: invokevirtual getTargetSize$animation : ()Landroidx/compose/runtime/MutableState;
/*     */     //   433: iload #6
/*     */     //   435: iload #7
/*     */     //   437: invokestatic IntSize : (II)J
/*     */     //   440: invokestatic box-impl : (J)Landroidx/compose/ui/unit/IntSize;
/*     */     //   443: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   448: goto -> 480
/*     */     //   451: aload_0
/*     */     //   452: getfield hasLookaheadOccurred : Z
/*     */     //   455: ifne -> 480
/*     */     //   458: aload_0
/*     */     //   459: getfield scope : Landroidx/compose/animation/AnimatedVisibilityScopeImpl;
/*     */     //   462: invokevirtual getTargetSize$animation : ()Landroidx/compose/runtime/MutableState;
/*     */     //   465: iload #6
/*     */     //   467: iload #7
/*     */     //   469: invokestatic IntSize : (II)J
/*     */     //   472: invokestatic box-impl : (J)Landroidx/compose/ui/unit/IntSize;
/*     */     //   475: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   480: aload_1
/*     */     //   481: iload #6
/*     */     //   483: iload #7
/*     */     //   485: aconst_null
/*     */     //   486: new androidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1
/*     */     //   489: dup
/*     */     //   490: aload #5
/*     */     //   492: invokespecial <init> : (Ljava/util/List;)V
/*     */     //   495: checkcast kotlin/jvm/functions/Function1
/*     */     //   498: iconst_4
/*     */     //   499: aconst_null
/*     */     //   500: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   503: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #812	-> 12
/*     */     //   #886	-> 18
/*     */     //   #887	-> 19
/*     */     //   #888	-> 35
/*     */     //   #889	-> 42
/*     */     //   #890	-> 43
/*     */     //   #891	-> 62
/*     */     //   #892	-> 73
/*     */     //   #893	-> 80
/*     */     //   #812	-> 97
/*     */     //   #893	-> 108
/*     */     //   #894	-> 114
/*     */     //   #892	-> 115
/*     */     //   #890	-> 116
/*     */     //   #895	-> 122
/*     */     //   #896	-> 123
/*     */     //   #812	-> 128
/*     */     //   #813	-> 130
/*     */     //   #897	-> 137
/*     */     //   #898	-> 138
/*     */     //   #899	-> 152
/*     */     //   #900	-> 162
/*     */     //   #813	-> 172
/*     */     //   #900	-> 177
/*     */     //   #901	-> 179
/*     */     //   #902	-> 196
/*     */     //   #903	-> 207
/*     */     //   #813	-> 217
/*     */     //   #903	-> 222
/*     */     //   #904	-> 224
/*     */     //   #905	-> 231
/*     */     //   #906	-> 235
/*     */     //   #901	-> 239
/*     */     //   #909	-> 252
/*     */     //   #813	-> 254
/*     */     //   #814	-> 271
/*     */     //   #910	-> 278
/*     */     //   #911	-> 279
/*     */     //   #912	-> 293
/*     */     //   #913	-> 303
/*     */     //   #814	-> 313
/*     */     //   #913	-> 318
/*     */     //   #914	-> 320
/*     */     //   #915	-> 337
/*     */     //   #916	-> 348
/*     */     //   #814	-> 358
/*     */     //   #916	-> 363
/*     */     //   #917	-> 365
/*     */     //   #918	-> 372
/*     */     //   #919	-> 376
/*     */     //   #914	-> 380
/*     */     //   #922	-> 393
/*     */     //   #814	-> 395
/*     */     //   #816	-> 412
/*     */     //   #817	-> 421
/*     */     //   #818	-> 426
/*     */     //   #819	-> 451
/*     */     //   #821	-> 458
/*     */     //   #823	-> 480
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	8	17	$i$a$-fastMap-AnimatedEnterExitMeasurePolicy$measure$placeables$1	I
/*     */     //   94	11	16	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   80	35	15	$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv	I
/*     */     //   77	38	14	it$iv	Ljava/lang/Object;
/*     */     //   73	43	13	item$iv$iv	Ljava/lang/Object;
/*     */     //   46	76	11	index$iv$iv	I
/*     */     //   42	81	10	$i$f$fastForEach	I
/*     */     //   39	84	9	$this$fastForEach$iv$iv	Ljava/util/List;
/*     */     //   18	110	7	$i$f$fastMap	I
/*     */     //   35	93	8	target$iv	Ljava/util/ArrayList;
/*     */     //   15	113	6	$this$fastMap$iv	Ljava/util/List;
/*     */     //   172	5	12	$i$a$-fastMaxBy-AnimatedEnterExitMeasurePolicy$measure$maxWidth$1	I
/*     */     //   169	8	11	it	Landroidx/compose/ui/layout/Placeable;
/*     */     //   217	5	16	$i$a$-fastMaxBy-AnimatedEnterExitMeasurePolicy$measure$maxWidth$1	I
/*     */     //   214	8	15	it	Landroidx/compose/ui/layout/Placeable;
/*     */     //   207	32	14	e$iv	Ljava/lang/Object;
/*     */     //   224	15	15	v$iv	I
/*     */     //   182	70	12	i$iv	I
/*     */     //   137	117	9	$i$f$fastMaxBy	I
/*     */     //   162	92	10	maxElem$iv	Ljava/lang/Object;
/*     */     //   179	75	11	maxValue$iv	I
/*     */     //   134	120	8	$this$fastMaxBy$iv	Ljava/util/List;
/*     */     //   313	5	13	$i$a$-fastMaxBy-AnimatedEnterExitMeasurePolicy$measure$maxHeight$1	I
/*     */     //   310	8	12	it	Landroidx/compose/ui/layout/Placeable;
/*     */     //   358	5	17	$i$a$-fastMaxBy-AnimatedEnterExitMeasurePolicy$measure$maxHeight$1	I
/*     */     //   355	8	16	it	Landroidx/compose/ui/layout/Placeable;
/*     */     //   348	32	15	e$iv	Ljava/lang/Object;
/*     */     //   365	15	16	v$iv	I
/*     */     //   323	70	13	i$iv	I
/*     */     //   278	117	10	$i$f$fastMaxBy	I
/*     */     //   303	92	11	maxElem$iv	Ljava/lang/Object;
/*     */     //   320	75	12	maxValue$iv	I
/*     */     //   275	120	9	$this$fastMaxBy$iv	Ljava/util/List;
/*     */     //   130	374	5	placeables	Ljava/util/List;
/*     */     //   271	233	6	maxWidth	I
/*     */     //   412	92	7	maxHeight	I
/*     */     //   0	504	0	this	Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;
/*     */     //   0	504	1	$this$measure_u2d3p2s80s	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	504	2	measurables	Ljava/util/List;
/*     */     //   0	504	3	constraints	J
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,885:1\n33#2,6:886\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy$measure$1\n*L\n824#1:886,6\n*E\n"})
/*     */   static final class AnimatedEnterExitMeasurePolicy$measure$1
/*     */     extends Lambda
/*     */     implements Function1<Placeable.PlacementScope, Unit>
/*     */   {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/* 824 */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); List<Placeable> $this$fastForEach$iv = this.$placeables; int $i$f$fastForEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 887 */       int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 888 */         Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 889 */         Placeable it = (Placeable)item$iv; int $i$a$-fastForEach-AnimatedEnterExitMeasurePolicy$measure$1$1 = 0;
/*     */         Placeable.PlacementScope.place$default($this$layout, it, 0, 0, 0.0F, 4, null);
/*     */       } 
/*     */     }
/*     */     
/*     */     AnimatedEnterExitMeasurePolicy$measure$1(List<Placeable> $placeables) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull List<IntrinsicMeasurable> measurables, int height) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface minIntrinsicWidth : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface minIntrinsicWidth : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #833	-> 12
/*     */     //   #923	-> 18
/*     */     //   #924	-> 19
/*     */     //   #925	-> 33
/*     */     //   #833	-> 49
/*     */     //   #925	-> 60
/*     */     //   #926	-> 65
/*     */     //   #927	-> 82
/*     */     //   #833	-> 99
/*     */     //   #927	-> 110
/*     */     //   #928	-> 115
/*     */     //   #926	-> 131
/*     */     //   #930	-> 144
/*     */     //   #833	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;
/*     */     //   0	162	1	$this$minIntrinsicWidth	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	height	I
/*     */   }
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull List<IntrinsicMeasurable> measurables, int width) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface minIntrinsicHeight : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface minIntrinsicHeight : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #838	-> 12
/*     */     //   #931	-> 18
/*     */     //   #932	-> 19
/*     */     //   #933	-> 33
/*     */     //   #838	-> 49
/*     */     //   #933	-> 60
/*     */     //   #934	-> 65
/*     */     //   #935	-> 82
/*     */     //   #838	-> 99
/*     */     //   #935	-> 110
/*     */     //   #936	-> 115
/*     */     //   #934	-> 131
/*     */     //   #938	-> 144
/*     */     //   #838	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;
/*     */     //   0	162	1	$this$minIntrinsicHeight	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	width	I
/*     */   }
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull List<IntrinsicMeasurable> measurables, int height) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface maxIntrinsicWidth : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface maxIntrinsicWidth : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #843	-> 12
/*     */     //   #939	-> 18
/*     */     //   #940	-> 19
/*     */     //   #941	-> 33
/*     */     //   #843	-> 49
/*     */     //   #941	-> 60
/*     */     //   #942	-> 65
/*     */     //   #943	-> 82
/*     */     //   #843	-> 99
/*     */     //   #943	-> 110
/*     */     //   #944	-> 115
/*     */     //   #942	-> 131
/*     */     //   #946	-> 144
/*     */     //   #843	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;
/*     */     //   0	162	1	$this$maxIntrinsicWidth	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	height	I
/*     */   }
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull List<IntrinsicMeasurable> measurables, int width) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface maxIntrinsicHeight : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface maxIntrinsicHeight : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #848	-> 12
/*     */     //   #947	-> 18
/*     */     //   #948	-> 19
/*     */     //   #949	-> 33
/*     */     //   #848	-> 49
/*     */     //   #949	-> 60
/*     */     //   #950	-> 65
/*     */     //   #951	-> 82
/*     */     //   #848	-> 99
/*     */     //   #951	-> 110
/*     */     //   #952	-> 115
/*     */     //   #950	-> 131
/*     */     //   #954	-> 144
/*     */     //   #848	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;
/*     */     //   0	162	1	$this$maxIntrinsicHeight	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	width	I
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AnimatedEnterExitMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */