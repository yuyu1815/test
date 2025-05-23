/*      */ package androidx.compose.animation.core;
/*      */ 
/*      */ import androidx.annotation.FloatRange;
/*      */ import androidx.annotation.IntRange;
/*      */ import androidx.collection.IntList;
/*      */ import androidx.collection.IntObjectMap;
/*      */ import androidx.collection.MutableIntList;
/*      */ import androidx.collection.MutableIntObjectMap;
/*      */ import androidx.compose.runtime.Immutable;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ReplaceWith;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\007\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\002\016\017B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J,\020\b\032\b\022\004\022\002H\n0\t\"\b\b\001\020\n*\0020\0132\022\020\f\032\016\022\004\022\0028\000\022\004\022\002H\n0\rH\026R\027\020\003\032\b\022\004\022\0028\0000\004¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "config", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "vectorize", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core"})
/*      */ @Immutable
/*      */ @SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1101:1\n382#2,4:1102\n354#2,6:1106\n364#2,3:1113\n367#2,2:1117\n387#2,2:1119\n370#2,6:1121\n389#2:1127\n1810#3:1112\n1672#3:1116\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n668#1:1102,4\n668#1:1106,6\n668#1:1113,3\n668#1:1117,2\n668#1:1119,2\n668#1:1121,6\n668#1:1127\n668#1:1112\n668#1:1116\n*E\n"})
/*      */ public final class KeyframesSpec<T>
/*      */   implements DurationBasedAnimationSpec<T>
/*      */ {
/*      */   @NotNull
/*      */   private final KeyframesSpecConfig<T> config;
/*      */   public static final int $stable;
/*      */   
/*      */   public KeyframesSpec(@NotNull KeyframesSpecConfig<T> config) {
/*  575 */     this.config = config; } @NotNull public final KeyframesSpecConfig<T> getConfig() { return this.config; }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\b\n\002\b\003\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\007\030\000*\004\b\001\020\0012\024\022\004\022\002H\001\022\n\022\b\022\004\022\002H\0010\0030\002B\005¢\006\002\020\004J\035\020\005\032\b\022\004\022\0028\0010\0032\006\020\006\032\0028\001H\020¢\006\004\b\007\020\bJ\"\020\t\032\b\022\004\022\0028\0010\003*\0028\0012\b\b\001\020\n\032\0020\013H\004¢\006\002\020\fJ\"\020\r\032\b\022\004\022\0028\0010\003*\0028\0012\b\b\001\020\016\032\0020\017H\004¢\006\002\020\020J+\020\021\032\b\022\004\022\0028\0010\003*\b\022\004\022\0028\0010\0032\006\020\022\032\0020\023H\004ø\001\000¢\006\004\b\024\020\025J\033\020\026\032\0020\027*\b\022\004\022\0028\0010\0032\006\020\030\032\0020\031H\004\002\007\n\005\b¡\0360\001¨\006\032"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "()V", "createEntityFor", "value", "createEntityFor$animation_core", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "at", "timeStamp", "", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "atFraction", "fraction", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "using", "arcMode", "Landroidx/compose/animation/core/ArcMode;", "using-ngzHuyU", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "with", "", "easing", "Landroidx/compose/animation/core/Easing;", "animation-core"})
/*      */   @StabilityInferred(parameters = 2)
/*      */   @SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1101:1\n26#2:1102\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n*L\n617#1:1102\n*E\n"})
/*      */   public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>>
/*      */   {
/*      */     public static final int $stable;
/*      */     
/*  585 */     public KeyframesSpecConfig() { super(null); } @NotNull
/*      */     public KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core(Object value) {
/*  587 */       return new KeyframesSpec.KeyframeEntity<>(value, null, 0, 6, null);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public KeyframesSpec.KeyframeEntity<T> at(Object $this$at, @IntRange(from = 0L) int timeStamp) {
/*  601 */       KeyframesSpec.KeyframeEntity<T> keyframeEntity1 = new KeyframesSpec.KeyframeEntity($this$at, null, 0, 6, null), it = keyframeEntity1; int $i$a$-also-KeyframesSpec$KeyframesSpecConfig$at$1 = 0;
/*  602 */       getKeyframes$animation_core().set(timeStamp, it);
/*      */       return keyframeEntity1;
/*      */     }
/*      */     @Deprecated(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @ReplaceWith(expression = "this using easing", imports = {}))
/*      */     public final void with(@NotNull KeyframesSpec.KeyframeEntity $this$with, @NotNull Easing easing) {
/*      */       Intrinsics.checkNotNullParameter($this$with, "<this>");
/*      */       Intrinsics.checkNotNullParameter(easing, "easing");
/*      */       $this$with.setEasing$animation_core(easing);
/*      */     } @ExperimentalAnimationSpecApi
/*      */     @NotNull
/*      */     public final KeyframesSpec.KeyframeEntity<T> using-ngzHuyU(@NotNull KeyframesSpec.KeyframeEntity<T> $this$using_u2dngzHuyU, int arcMode) {
/*      */       Intrinsics.checkNotNullParameter($this$using_u2dngzHuyU, "$this$using");
/*      */       $this$using_u2dngzHuyU.setArcMode-Rur9ykg$animation_core(arcMode);
/*      */       return $this$using_u2dngzHuyU;
/*      */     } @NotNull
/*  617 */     public KeyframesSpec.KeyframeEntity<T> atFraction(Object $this$atFraction, @FloatRange(from = 0.0D, to = 1.0D) float fraction) { float $this$fastRoundToInt$iv = getDurationMillis() * fraction; int $i$f$fastRoundToInt = 0; return at((T)$this$atFraction, 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1102 */           Math.round($this$fastRoundToInt$iv)); } } @NotNull public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(@NotNull TwoWayConverter converter) { Intrinsics.checkNotNullParameter(converter, "converter"); MutableIntList timestamps = new MutableIntList(this.config.getKeyframes$animation_core().getSize() + 2); MutableIntObjectMap timeToInfoMap = new MutableIntObjectMap(this.config.getKeyframes$animation_core().getSize()); IntObjectMap this_$iv = (IntObjectMap)this.config.getKeyframes$animation_core(); int $i$f$forEach = 0; int[] k$iv = this_$iv.keys;
/* 1103 */     Object[] v$iv = this_$iv.values;
/*      */     
/* 1105 */     IntObjectMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 1106 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 1107 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/* 1109 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 1110 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 1111 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 1112 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1113 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1114 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1123 */           if (bitCount$iv$iv == 8)
/*      */             continue; 
/*      */           break;
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 317
/*      */       }  }
/*      */     else
/*      */     {  }
/*      */     
/*      */     if (!this.config.getKeyframes$animation_core().contains(0))
/*      */       timestamps.add(0, 0); 
/*      */     if (!this.config.getKeyframes$animation_core().contains(this.config.getDurationMillis()))
/*      */       timestamps.add(this.config.getDurationMillis()); 
/*      */     if (timestamps.isNotEmpty())
/*      */       timestamps.sort(); 
/*      */     return new VectorizedKeyframesSpec<>((IntList)timestamps, (IntObjectMap)timeToInfoMap, this.config.getDurationMillis(), this.config.getDelayMillis(), EasingKt.getLinearEasing(), ArcMode.Companion.getArcLinear--9T-Mq4(), null); }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\b\007\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B#\b\000\022\006\020\003\032\0028\001\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026R\"\020\006\032\0020\007X\016ø\001\000ø\001\001¢\006\020\n\002\020\r\032\004\b\t\020\n\"\004\b\013\020\f\002\013\n\005\b¡\0360\001\n\002\b!¨\006\024"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "value", "easing", "Landroidx/compose/animation/core/Easing;", "arcMode", "Landroidx/compose/animation/core/ArcMode;", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArcMode--9T-Mq4$animation_core", "()I", "setArcMode-Rur9ykg$animation_core", "(I)V", "I", "equals", "", "other", "", "hashCode", "", "animation-core"})
/*      */   @StabilityInferred(parameters = 0)
/*      */   public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
/*      */     private int arcMode;
/*      */     public static final int $stable = 8;
/*      */     
/*      */     public final int getArcMode--9T-Mq4$animation_core() {
/*      */       return this.arcMode;
/*      */     }
/*      */     
/*      */     public final void setArcMode-Rur9ykg$animation_core(int <set-?>) {
/*      */       this.arcMode = <set-?>;
/*      */     }
/*      */     
/*      */     private KeyframeEntity(Object value, Easing easing, int arcMode) {
/*      */       super(value, easing, null);
/*      */       this.arcMode = arcMode;
/*      */     }
/*      */     
/*      */     public boolean equals(@Nullable Object other) {
/*      */       if (other == this)
/*      */         return true; 
/*      */       if (!(other instanceof KeyframeEntity))
/*      */         return false; 
/*      */       return (Intrinsics.areEqual(((KeyframeEntity)other).getValue$animation_core(), getValue$animation_core()) && Intrinsics.areEqual(((KeyframeEntity)other).getEasing$animation_core(), getEasing$animation_core()) && ArcMode.equals-impl0(((KeyframeEntity)other).arcMode, this.arcMode));
/*      */     }
/*      */     
/*      */     public int hashCode() {
/*      */       getValue$animation_core();
/*      */       int result = (getValue$animation_core() != null) ? getValue$animation_core().hashCode() : 0;
/*      */       result = 31 * result + ArcMode.hashCode-impl(this.arcMode);
/*      */       result = 31 * result + getEasing$animation_core().hashCode();
/*      */       return result;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\KeyframesSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */