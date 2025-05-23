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
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.FloatCompanionObject;
/*     */ import kotlin.jvm.internal.IntCompanionObject;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\006\032J\020*\032\016\022\004\022\002H+\022\004\022\002H,0\001\"\004\b\000\020+\"\b\b\001\020,*\0020-2\022\020.\032\016\022\004\022\002H+\022\004\022\002H,0/2\022\0200\032\016\022\004\022\002H,\022\004\022\002H+0/\032 \0201\032\0020\b2\006\0202\032\0020\b2\006\0203\032\0020\b2\006\0204\032\0020\bH\000\"\032\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\004\032\016\022\004\022\0020\005\022\004\022\0020\0060\001X\004¢\006\002\n\000\"\032\020\007\032\016\022\004\022\0020\b\022\004\022\0020\0060\001X\004¢\006\002\n\000\"\032\020\t\032\016\022\004\022\0020\n\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\013\032\016\022\004\022\0020\f\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\r\032\016\022\004\022\0020\016\022\004\022\0020\0060\001X\004¢\006\002\n\000\"\032\020\017\032\016\022\004\022\0020\020\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\021\032\016\022\004\022\0020\022\022\004\022\0020\0230\001X\004¢\006\002\n\000\"\032\020\024\032\016\022\004\022\0020\025\022\004\022\0020\0030\001X\004¢\006\002\n\000\"!\020\026\032\016\022\004\022\0020\020\022\004\022\0020\0030\001*\0020\0278F¢\006\006\032\004\b\030\020\031\"!\020\026\032\016\022\004\022\0020\022\022\004\022\0020\0230\001*\0020\0328F¢\006\006\032\004\b\030\020\033\"!\020\026\032\016\022\004\022\0020\025\022\004\022\0020\0030\001*\0020\0348F¢\006\006\032\004\b\030\020\035\"!\020\026\032\016\022\004\022\0020\005\022\004\022\0020\0060\001*\0020\0368F¢\006\006\032\004\b\030\020\037\"!\020\026\032\016\022\004\022\0020\002\022\004\022\0020\0030\001*\0020 8F¢\006\006\032\004\b\030\020!\"!\020\026\032\016\022\004\022\0020\n\022\004\022\0020\0030\001*\0020\"8F¢\006\006\032\004\b\030\020#\"!\020\026\032\016\022\004\022\0020\f\022\004\022\0020\0030\001*\0020$8F¢\006\006\032\004\b\030\020%\"!\020\026\032\016\022\004\022\0020\b\022\004\022\0020\0060\001*\0020&8F¢\006\006\032\004\b\030\020'\"!\020\026\032\016\022\004\022\0020\016\022\004\022\0020\0060\001*\0020(8F¢\006\006\032\004\b\030\020)¨\0065"}, d2 = {"DpOffsetToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpToVector", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntSizeToVector", "Landroidx/compose/ui/unit/IntSize;", "IntToVector", "", "OffsetToVector", "Landroidx/compose/ui/geometry/Offset;", "RectToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "SizeToVector", "Landroidx/compose/ui/geometry/Size;", "VectorConverter", "Landroidx/compose/ui/geometry/Offset$Companion;", "getVectorConverter", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "convertToVector", "Lkotlin/Function1;", "convertFromVector", "lerp", "start", "stop", "fraction", "animation-core"})
/*     */ public final class VectorConvertersKt
/*     */ {
/*     */   @NotNull
/*     */   public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(@NotNull Function1<? super T, ? extends V> convertToVector, @NotNull Function1<? super V, ? extends T> convertFromVector) {
/*  59 */     Intrinsics.checkNotNullParameter(convertToVector, "convertToVector"); Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector"); return new TwoWayConverterImpl<>(convertToVector, convertFromVector);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float lerp(float start, float stop, float fraction) {
/*  70 */     return start * (true - fraction) + stop * fraction;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(@NotNull FloatCompanionObject $this$VectorConverter) {
/*  76 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return FloatToVector;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(@NotNull IntCompanionObject $this$VectorConverter) {
/*  82 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return IntToVector;
/*     */   }
/*     */   @NotNull
/*  85 */   private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(VectorConvertersKt$FloatToVector$1.INSTANCE, VectorConvertersKt$FloatToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\007\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector1D;", "it", "", "invoke"}) static final class VectorConvertersKt$FloatToVector$1 extends Lambda implements Function1<Float, AnimationVector1D> { public static final VectorConvertersKt$FloatToVector$1 INSTANCE = new VectorConvertersKt$FloatToVector$1(); VectorConvertersKt$FloatToVector$1() { super(1); } @NotNull public final AnimationVector1D invoke(float it) { return new AnimationVector1D(it); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke", "(Landroidx/compose/animation/core/AnimationVector1D;)Ljava/lang/Float;"}) static final class VectorConvertersKt$FloatToVector$2 extends Lambda implements Function1<AnimationVector1D, Float> { public static final VectorConvertersKt$FloatToVector$2 INSTANCE = new VectorConvertersKt$FloatToVector$2(); VectorConvertersKt$FloatToVector$2() { super(1); } @NotNull public final Float invoke(@NotNull AnimationVector1D it) { Intrinsics.checkNotNullParameter(it, "it"); return Float.valueOf(it.getValue()); }
/*     */      }
/*     */   @NotNull
/*  88 */   private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(VectorConvertersKt$IntToVector$1.INSTANCE, VectorConvertersKt$IntToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\b\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector1D;", "it", "", "invoke"}) static final class VectorConvertersKt$IntToVector$1 extends Lambda implements Function1<Integer, AnimationVector1D> { public static final VectorConvertersKt$IntToVector$1 INSTANCE = new VectorConvertersKt$IntToVector$1(); VectorConvertersKt$IntToVector$1() { super(1); } @NotNull public final AnimationVector1D invoke(int it) { return new AnimationVector1D(it); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke", "(Landroidx/compose/animation/core/AnimationVector1D;)Ljava/lang/Integer;"}) static final class VectorConvertersKt$IntToVector$2 extends Lambda implements Function1<AnimationVector1D, Integer> { public static final VectorConvertersKt$IntToVector$2 INSTANCE = new VectorConvertersKt$IntToVector$2(); VectorConvertersKt$IntToVector$2() { super(1); } @NotNull public final Integer invoke(@NotNull AnimationVector1D it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf((int)it.getValue()); }
/*     */      }
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(@NotNull Rect.Companion $this$VectorConverter) {
/*  93 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return RectToVector;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(@NotNull Dp.Companion $this$VectorConverter) {
/*  99 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return DpToVector;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(@NotNull DpOffset.Companion $this$VectorConverter) {
/* 105 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return DpOffsetToVector;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(@NotNull Size.Companion $this$VectorConverter) {
/* 111 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return SizeToVector;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(@NotNull Offset.Companion $this$VectorConverter) {
/* 117 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return OffsetToVector;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(@NotNull IntOffset.Companion $this$VectorConverter) {
/* 123 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return IntOffsetToVector;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(@NotNull IntSize.Companion $this$VectorConverter) {
/* 131 */     Intrinsics.checkNotNullParameter($this$VectorConverter, "<this>"); return IntSizeToVector;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 136 */   private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(VectorConvertersKt$DpToVector$1.INSTANCE, VectorConvertersKt$DpToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector1D;", "it", "Landroidx/compose/ui/unit/Dp;", "invoke-0680j_4", "(F)Landroidx/compose/animation/core/AnimationVector1D;"}) static final class VectorConvertersKt$DpToVector$1 extends Lambda implements Function1<Dp, AnimationVector1D> { public static final VectorConvertersKt$DpToVector$1 INSTANCE = new VectorConvertersKt$DpToVector$1(); @NotNull
/* 137 */     public final AnimationVector1D invoke-0680j_4(float it) { return new AnimationVector1D(it); } VectorConvertersKt$DpToVector$1() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Dp;", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke-u2uoSUM", "(Landroidx/compose/animation/core/AnimationVector1D;)F"}) static final class VectorConvertersKt$DpToVector$2 extends Lambda implements Function1<AnimationVector1D, Dp> { public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();
/* 138 */     public final float invoke-u2uoSUM(@NotNull AnimationVector1D it) { Intrinsics.checkNotNullParameter(it, "it"); return Dp.constructor-impl(it.getValue()); }
/*     */ 
/*     */     
/*     */     VectorConvertersKt$DpToVector$2() {
/*     */       super(1);
/*     */     } }
/*     */   @NotNull
/* 145 */   private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(VectorConvertersKt$DpOffsetToVector$1.INSTANCE, VectorConvertersKt$DpOffsetToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/unit/DpOffset;", "invoke-jo-Fl9I", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}) static final class VectorConvertersKt$DpOffsetToVector$1 extends Lambda implements Function1<DpOffset, AnimationVector2D> { public static final VectorConvertersKt$DpOffsetToVector$1 INSTANCE = new VectorConvertersKt$DpOffsetToVector$1(); @NotNull
/* 146 */     public final AnimationVector2D invoke-jo-Fl9I(long it) { return new AnimationVector2D(DpOffset.getX-D9Ej5fM(it), DpOffset.getY-D9Ej5fM(it)); } VectorConvertersKt$DpOffsetToVector$1() { super(1); } }
/* 147 */    @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/DpOffset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-gVRvYmI", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}) @SourceDebugExtension({"SMAP\nVectorConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,205:1\n169#2:206\n*S KotlinDebug\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n*L\n147#1:206\n*E\n"}) static final class VectorConvertersKt$DpOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, DpOffset> { public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2(); VectorConvertersKt$DpOffsetToVector$2() { super(1); } public final long invoke-gVRvYmI(@NotNull AnimationVector2D it) { Intrinsics.checkNotNullParameter(it, "it"); float $this$dp$iv = it.getV1(); int $i$f$getDp = 0; $this$dp$iv = it.getV2(); $i$f$getDp = 0; return DpKt.DpOffset-YgX7TsA(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 206 */           Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); } } @NotNull private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(VectorConvertersKt$SizeToVector$1.INSTANCE, VectorConvertersKt$SizeToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/geometry/Size;", "invoke-uvyYCjk", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}) static final class VectorConvertersKt$SizeToVector$1 extends Lambda implements Function1<Size, AnimationVector2D> { public static final VectorConvertersKt$SizeToVector$1 INSTANCE = new VectorConvertersKt$SizeToVector$1(); @NotNull public final AnimationVector2D invoke-uvyYCjk(long it) { return new AnimationVector2D(Size.getWidth-impl(it), Size.getHeight-impl(it)); } VectorConvertersKt$SizeToVector$1() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Size;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-7Ah8Wj8", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}) static final class VectorConvertersKt$SizeToVector$2 extends Lambda implements Function1<AnimationVector2D, Size> { public static final VectorConvertersKt$SizeToVector$2 INSTANCE = new VectorConvertersKt$SizeToVector$2(); public final long invoke-7Ah8Wj8(@NotNull AnimationVector2D it) { Intrinsics.checkNotNullParameter(it, "it"); return SizeKt.Size(it.getV1(), it.getV2()); } VectorConvertersKt$SizeToVector$2() { super(1); } } @NotNull private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(VectorConvertersKt$OffsetToVector$1.INSTANCE, VectorConvertersKt$OffsetToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}) static final class VectorConvertersKt$OffsetToVector$1 extends Lambda implements Function1<Offset, AnimationVector2D> { public static final VectorConvertersKt$OffsetToVector$1 INSTANCE = new VectorConvertersKt$OffsetToVector$1(); @NotNull public final AnimationVector2D invoke-k-4lQ0M(long it) { return new AnimationVector2D(Offset.getX-impl(it), Offset.getY-impl(it)); } VectorConvertersKt$OffsetToVector$1() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-tuRUvjQ", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}) static final class VectorConvertersKt$OffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, Offset> { public static final VectorConvertersKt$OffsetToVector$2 INSTANCE = new VectorConvertersKt$OffsetToVector$2(); public final long invoke-tuRUvjQ(@NotNull AnimationVector2D it) { Intrinsics.checkNotNullParameter(it, "it"); return OffsetKt.Offset(it.getV1(), it.getV2()); } VectorConvertersKt$OffsetToVector$2() { super(1); } } @NotNull private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(VectorConvertersKt$IntOffsetToVector$1.INSTANCE, VectorConvertersKt$IntOffsetToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/unit/IntOffset;", "invoke--gyyYBs", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}) static final class VectorConvertersKt$IntOffsetToVector$1 extends Lambda implements Function1<IntOffset, AnimationVector2D> { public static final VectorConvertersKt$IntOffsetToVector$1 INSTANCE = new VectorConvertersKt$IntOffsetToVector$1(); @NotNull public final AnimationVector2D invoke--gyyYBs(long it) { return new AnimationVector2D(IntOffset.getX-impl(it), IntOffset.getY-impl(it)); } VectorConvertersKt$IntOffsetToVector$1() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-Bjo55l4", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}) @SourceDebugExtension({"SMAP\nVectorConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$IntOffsetToVector$2\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,205:1\n26#2:206\n*S KotlinDebug\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$IntOffsetToVector$2\n*L\n174#1:206\n*E\n"}) static final class VectorConvertersKt$IntOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, IntOffset> { public static final VectorConvertersKt$IntOffsetToVector$2 INSTANCE = new VectorConvertersKt$IntOffsetToVector$2(); public final long invoke-Bjo55l4(@NotNull AnimationVector2D it) { Intrinsics.checkNotNullParameter(it, "it"); float $this$fastRoundToInt$iv = it.getV1(); int $i$f$fastRoundToInt = 0; $this$fastRoundToInt$iv = it.getV2(); $i$f$fastRoundToInt = 0; return IntOffsetKt.IntOffset(Math.round($this$fastRoundToInt$iv), Math.round($this$fastRoundToInt$iv)); } VectorConvertersKt$IntOffsetToVector$2() { super(1); } } @NotNull private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(VectorConvertersKt$IntSizeToVector$1.INSTANCE, VectorConvertersKt$IntSizeToVector$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}) static final class VectorConvertersKt$IntSizeToVector$1 extends Lambda implements Function1<IntSize, AnimationVector2D> { public static final VectorConvertersKt$IntSizeToVector$1 INSTANCE = new VectorConvertersKt$IntSizeToVector$1(); @NotNull public final AnimationVector2D invoke-ozmzZPI(long it) { return new AnimationVector2D(IntSize.getWidth-impl(it), IntSize.getHeight-impl(it)); } VectorConvertersKt$IntSizeToVector$1() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-YEO4UFw", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}) @SourceDebugExtension({"SMAP\nVectorConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$IntSizeToVector$2\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,205:1\n26#2:206\n26#2:207\n*S KotlinDebug\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$IntSizeToVector$2\n*L\n187#1:206\n188#1:207\n*E\n"}) static final class VectorConvertersKt$IntSizeToVector$2 extends Lambda implements Function1<AnimationVector2D, IntSize> { public static final VectorConvertersKt$IntSizeToVector$2 INSTANCE = new VectorConvertersKt$IntSizeToVector$2(); public final long invoke-YEO4UFw(@NotNull AnimationVector2D it) { Intrinsics.checkNotNullParameter(it, "it"); float $this$fastRoundToInt$iv = it.getV1(); int $i$f$fastRoundToInt = 0; $this$fastRoundToInt$iv = it.getV2(); $i$f$fastRoundToInt = 0; return IntSizeKt.IntSize(RangesKt.coerceAtLeast(Math.round($this$fastRoundToInt$iv), 0), RangesKt.coerceAtLeast(
/* 207 */             Math.round($this$fastRoundToInt$iv), 0)); }
/*     */ 
/*     */     
/*     */     VectorConvertersKt$IntSizeToVector$2() {
/*     */       super(1);
/*     */     } }
/*     */   
/*     */   @NotNull
/*     */   private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(VectorConvertersKt$RectToVector$1.INSTANCE, VectorConvertersKt$RectToVector$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "it", "Landroidx/compose/ui/geometry/Rect;", "invoke"})
/*     */   static final class VectorConvertersKt$RectToVector$1 extends Lambda implements Function1<Rect, AnimationVector4D> {
/*     */     public static final VectorConvertersKt$RectToVector$1 INSTANCE = new VectorConvertersKt$RectToVector$1();
/*     */     
/*     */     @NotNull
/*     */     public final AnimationVector4D invoke(@NotNull Rect it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return new AnimationVector4D(it.getLeft(), it.getTop(), it.getRight(), it.getBottom());
/*     */     }
/*     */     
/*     */     VectorConvertersKt$RectToVector$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "it", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke"})
/*     */   static final class VectorConvertersKt$RectToVector$2 extends Lambda implements Function1<AnimationVector4D, Rect> {
/*     */     public static final VectorConvertersKt$RectToVector$2 INSTANCE = new VectorConvertersKt$RectToVector$2();
/*     */     
/*     */     @NotNull
/*     */     public final Rect invoke(@NotNull AnimationVector4D it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return new Rect(it.getV1(), it.getV2(), it.getV3(), it.getV4());
/*     */     }
/*     */     
/*     */     VectorConvertersKt$RectToVector$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorConvertersKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */