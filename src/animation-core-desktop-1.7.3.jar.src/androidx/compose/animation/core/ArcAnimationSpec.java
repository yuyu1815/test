/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.collection.IntListKt;
/*     */ import androidx.collection.IntObjectMapKt;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B-\022\b\b\002\020\003\032\0020\004\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\006\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025H\002J\b\020\026\032\0020\006H\026J,\020\027\032\b\022\004\022\002H\0310\030\"\b\b\001\020\031*\0020\0322\022\020\033\032\016\022\004\022\0028\000\022\004\022\002H\0310\034H\026R\021\020\007\032\0020\006¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\r\020\fR\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\016\020\017R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\020\020\f\002\013\n\005\b¡\0360\001\n\002\b!¨\006\035"}, d2 = {"Landroidx/compose/animation/core/ArcAnimationSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "mode", "Landroidx/compose/animation/core/ArcMode;", "durationMillis", "", "delayMillis", "easing", "Landroidx/compose/animation/core/Easing;", "(IIILandroidx/compose/animation/core/Easing;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDelayMillis", "()I", "getDurationMillis", "getEasing", "()Landroidx/compose/animation/core/Easing;", "getMode--9T-Mq4", "I", "equals", "", "other", "", "hashCode", "vectorize", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core"})
/*     */ @ExperimentalAnimationSpecApi
/*     */ @Immutable
/*     */ public final class ArcAnimationSpec<T>
/*     */   implements DurationBasedAnimationSpec<T>
/*     */ {
/*     */   private final int mode;
/*     */   private final int durationMillis;
/*     */   private final int delayMillis;
/*     */   @NotNull
/*     */   private final Easing easing;
/*     */   public static final int $stable;
/*     */   
/*     */   private ArcAnimationSpec(int mode, int durationMillis, int delayMillis, Easing easing) {
/* 208 */     this.mode = mode;
/* 209 */     this.durationMillis = durationMillis;
/* 210 */     this.delayMillis = delayMillis;
/* 211 */     this.easing = easing; } public final int getMode--9T-Mq4() { return this.mode; } @NotNull public final Easing getEasing() { return this.easing; }
/*     */   public final int getDurationMillis() { return this.durationMillis; } public final int getDelayMillis() {
/*     */     return this.delayMillis;
/*     */   } @NotNull
/*     */   public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(@NotNull TwoWayConverter converter) {
/* 216 */     Intrinsics.checkNotNullParameter(converter, "converter"); return new VectorizedKeyframesSpec<>(
/* 217 */         IntListKt.intListOf(0, this.durationMillis), 
/* 218 */         IntObjectMapKt.emptyIntObjectMap(), 
/* 219 */         this.durationMillis, 
/* 220 */         this.delayMillis, 
/* 221 */         this.easing, 
/* 222 */         this.mode, null);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 226 */     if (this == other) return true; 
/* 227 */     if (!(other instanceof ArcAnimationSpec)) return false;
/*     */     
/* 229 */     if (!ArcMode.equals-impl0(this.mode, ((ArcAnimationSpec)other).mode)) return false; 
/* 230 */     if (this.durationMillis != ((ArcAnimationSpec)other).durationMillis) return false; 
/* 231 */     if (this.delayMillis != ((ArcAnimationSpec)other).delayMillis) return false; 
/* 232 */     return Intrinsics.areEqual(this.easing, ((ArcAnimationSpec)other).easing);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 236 */     int result = ArcMode.hashCode-impl(this.mode);
/* 237 */     result = 31 * result + this.durationMillis;
/* 238 */     result = 31 * result + this.delayMillis;
/* 239 */     result = 31 * result + this.easing.hashCode();
/* 240 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\ArcAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */