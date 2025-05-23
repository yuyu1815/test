/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpKt;
/*     */ import androidx.compose.ui.unit.DpOffset;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import androidx.compose.ui.unit.IntOffsetKt;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.FloatCompanionObject;
/*     */ import kotlin.jvm.internal.IntCompanionObject;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000l\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\b\002\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\004X\004¢\006\002\n\000\"(\020\005\032\026\022\f\022\n\022\002\b\003\022\002\b\0030\007\022\004\022\0020\0010\006X\004¢\006\b\n\000\032\004\b\b\020\t\"\025\020\n\032\0020\013*\0020\f8F¢\006\006\032\004\b\r\020\016\"\025\020\n\032\0020\004*\0020\0178F¢\006\006\032\004\b\r\020\020\"\025\020\n\032\0020\021*\0020\0228F¢\006\006\032\004\b\r\020\023\"\025\020\n\032\0020\024*\0020\0258F¢\006\006\032\004\b\r\020\026\"\025\020\n\032\0020\027*\0020\0308F¢\006\006\032\004\b\r\020\031\"\025\020\n\032\0020\032*\0020\0338F¢\006\006\032\004\b\r\020\034\"\025\020\n\032\0020\035*\0020\0368F¢\006\006\032\004\b\r\020\037\"\025\020\n\032\0020 *\0020!8F¢\006\006\032\004\b\r\020\"¨\006#"}, d2 = {"DpVisibilityThreshold", "", "PxVisibilityThreshold", "rectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "visibilityThresholdMap", "", "Landroidx/compose/animation/core/TwoWayConverter;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Offset$Companion;", "getVisibilityThreshold", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "animation-core"})
/*     */ @SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n169#2:116\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:116\n*E\n"})
/*     */ public final class VisibilityThresholdsKt {
/*     */   private static final float DpVisibilityThreshold = 0.1F;
/*     */   @NotNull
/*  31 */   private static final Rect rectVisibilityThreshold = new Rect(
/*  32 */       0.5F, 
/*  33 */       0.5F, 
/*  34 */       0.5F, 
/*  35 */       0.5F);
/*     */   
/*     */   private static final float PxVisibilityThreshold = 0.5F;
/*     */   
/*     */   @NotNull
/*     */   private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;
/*     */ 
/*     */   
/*     */   public static final long getVisibilityThreshold(@NotNull IntOffset.Companion $this$VisibilityThreshold) {
/*  44 */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>"); return IntOffsetKt.IntOffset(1, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long getVisibilityThreshold(@NotNull Offset.Companion $this$VisibilityThreshold) {
/*  52 */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>"); return OffsetKt.Offset(0.5F, 0.5F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getVisibilityThreshold(@NotNull IntCompanionObject $this$VisibilityThreshold) {
/*  60 */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>"); return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float getVisibilityThreshold(@NotNull Dp.Companion $this$VisibilityThreshold) {
/*  68 */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>"); float $this$dp$iv = 0.1F; int $i$f$getDp = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 116 */       Dp.constructor-impl($this$dp$iv);
/*     */   }
/*     */   
/*     */   public static final long getVisibilityThreshold(@NotNull DpOffset.Companion $this$VisibilityThreshold) {
/*     */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>");
/*     */     return DpKt.DpOffset-YgX7TsA(getVisibilityThreshold(Dp.Companion), getVisibilityThreshold(Dp.Companion));
/*     */   }
/*     */   
/*     */   public static final long getVisibilityThreshold(@NotNull Size.Companion $this$VisibilityThreshold) {
/*     */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>");
/*     */     return SizeKt.Size(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public static final long getVisibilityThreshold(@NotNull IntSize.Companion $this$VisibilityThreshold) {
/*     */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>");
/*     */     return IntSizeKt.IntSize(1, 1);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Rect getVisibilityThreshold(@NotNull Rect.Companion $this$VisibilityThreshold) {
/*     */     Intrinsics.checkNotNullParameter($this$VisibilityThreshold, "<this>");
/*     */     return rectVisibilityThreshold;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
/*     */     return visibilityThresholdMap;
/*     */   }
/*     */   
/*     */   static {
/*     */     Pair[] arrayOfPair = new Pair[9];
/*     */     arrayOfPair[0] = TuplesKt.to(VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), Float.valueOf(1.0F));
/*     */     arrayOfPair[1] = TuplesKt.to(VectorConvertersKt.getVectorConverter(IntSize.Companion), Float.valueOf(1.0F));
/*     */     arrayOfPair[2] = TuplesKt.to(VectorConvertersKt.getVectorConverter(IntOffset.Companion), Float.valueOf(1.0F));
/*     */     arrayOfPair[3] = TuplesKt.to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(0.01F));
/*     */     arrayOfPair[4] = TuplesKt.to(VectorConvertersKt.getVectorConverter(Rect.Companion), Float.valueOf(0.5F));
/*     */     arrayOfPair[5] = TuplesKt.to(VectorConvertersKt.getVectorConverter(Size.Companion), Float.valueOf(0.5F));
/*     */     arrayOfPair[6] = TuplesKt.to(VectorConvertersKt.getVectorConverter(Offset.Companion), Float.valueOf(0.5F));
/*     */     arrayOfPair[7] = TuplesKt.to(VectorConvertersKt.getVectorConverter(Dp.Companion), Float.valueOf(0.1F));
/*     */     arrayOfPair[8] = TuplesKt.to(VectorConvertersKt.getVectorConverter(DpOffset.Companion), Float.valueOf(0.1F));
/*     */     visibilityThresholdMap = MapsKt.mapOf(arrayOfPair);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VisibilityThresholdsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */