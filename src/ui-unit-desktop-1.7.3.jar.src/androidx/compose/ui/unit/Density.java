/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.geometry.SizeKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\005\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\007\bg\030\0002\0060\001j\002`\002J\026\020\t\032\0020\n*\0020\013H\027ø\001\000¢\006\004\b\f\020\rJ\026\020\t\032\0020\n*\0020\016H\027ø\001\000¢\006\004\b\017\020\020J\031\020\021\032\0020\013*\0020\004H\027ø\001\001ø\001\000¢\006\004\b\022\020\023J\031\020\021\032\0020\013*\0020\nH\027ø\001\001ø\001\000¢\006\004\b\022\020\024J\026\020\025\032\0020\026*\0020\027H\027ø\001\000¢\006\004\b\030\020\031J\026\020\032\032\0020\004*\0020\013H\027ø\001\000¢\006\004\b\033\020\023J\026\020\032\032\0020\004*\0020\016H\027ø\001\000¢\006\004\b\034\020\035J\f\020\036\032\0020\037*\0020 H\027J\026\020!\032\0020\027*\0020\026H\027ø\001\000¢\006\004\b\"\020\031J\031\020#\032\0020\016*\0020\004H\027ø\001\001ø\001\000¢\006\004\b$\020%J\031\020#\032\0020\016*\0020\nH\027ø\001\001ø\001\000¢\006\004\b$\020&R\032\020\003\032\0020\0048&X§\004¢\006\f\022\004\b\005\020\006\032\004\b\007\020\bø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006'À\006\003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScalingLinear;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,141:1\n26#2:142\n26#2:144\n1#3:143\n169#4:145\n169#4:146\n483#4:147\n198#5:148\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n69#1:142\n86#1:144\n92#1:145\n102#1:146\n125#1:147\n135#1:148\n*E\n"})
/*     */ public interface Density
/*     */   extends FontScalingLinear
/*     */ {
/*     */   @Stable
/*     */   default float toPx-0680j_4(float $this$toPx_u2d0680j_4) {
/*  61 */     return $this$toPx_u2d0680j_4 * getDensity(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @Stable public static float toDp-GaN1DYA(@NotNull Density $this, long $receiver) { return $this.toDp-GaN1DYA($receiver); } @Deprecated @Stable public static float toPx-0680j_4(@NotNull Density $this, float $receiver) { return $this.toPx-0680j_4($receiver); }
/*     */     @Deprecated
/*     */     @Stable
/*     */     public static long toSp-0xMU5do(@NotNull Density $this, float $receiver) { return $this.toSp-0xMU5do($receiver); } @Deprecated
/*     */     @Stable
/*     */     public static int roundToPx-0680j_4(@NotNull Density $this, float $receiver) {
/*  67 */       return $this.roundToPx-0680j_4($receiver);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @Stable
/*     */     public static float toPx--R2X_6o(@NotNull Density $this, long $receiver) {
/*  77 */       return $this.toPx--R2X_6o($receiver);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @Stable
/*     */     public static int roundToPx--R2X_6o(@NotNull Density $this, long $receiver) {
/*  86 */       return $this.roundToPx--R2X_6o($receiver);
/*     */     }
/*     */     
/*     */     @Deprecated
/*     */     @Stable
/*     */     public static float toDp-u2uoSUM(@NotNull Density $this, int $receiver) {
/*  92 */       return $this.toDp-u2uoSUM($receiver);
/*     */     }
/*     */     
/*     */     @Deprecated
/*     */     @Stable
/*     */     public static long toSp-kPz2Gy4(@NotNull Density $this, int $receiver) {
/*  98 */       return $this.toSp-kPz2Gy4($receiver);
/*     */     } @Deprecated
/*     */     @Stable
/*     */     public static float toDp-u2uoSUM(@NotNull Density $this, float $receiver) {
/* 102 */       return $this.toDp-u2uoSUM($receiver);
/*     */     } @Deprecated
/*     */     @Stable
/*     */     public static long toSp-kPz2Gy4(@NotNull Density $this, float $receiver) {
/* 106 */       return $this.toSp-kPz2Gy4($receiver);
/*     */     }
/*     */     @Deprecated
/*     */     @Stable
/*     */     @NotNull
/*     */     public static Rect toRect(@NotNull Density $this, @NotNull DpRect $receiver) {
/* 112 */       Intrinsics.checkNotNullParameter($receiver, "$receiver"); return $this.toRect($receiver);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @Stable
/*     */     public static long toSize-XkaWNTQ(@NotNull Density $this, long $receiver) {
/* 125 */       return $this.toSize-XkaWNTQ($receiver);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @Stable
/*     */     public static long toDpSize-k-rfVVM(@NotNull Density $this, long $receiver) {
/* 135 */       return $this.toDpSize-k-rfVVM($receiver);
/*     */     } }
/*     */   
/*     */   @Stable
/*     */   default int roundToPx-0680j_4(float $this$roundToPx_u2d0680j_4) { float px = toPx-0680j_4($this$roundToPx_u2d0680j_4);
/*     */     float $this$fastRoundToInt$iv = px;
/*     */     int $i$f$fastRoundToInt = 0;
/* 142 */     return Float.isInfinite(px) ? Integer.MAX_VALUE : Math.round($this$fastRoundToInt$iv); } @Stable default float toPx--R2X_6o(long $this$toPx_u2d_u2dR2X_6o) { if (!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA($this$toPx_u2d_u2dR2X_6o), TextUnitType.Companion.getSp-UIouoOA())) {
/* 143 */       int $i$a$-check-Density$toPx$1 = 0; String str = "Only Sp can convert to Px"; throw new IllegalStateException(str.toString());
/* 144 */     }  return toPx-0680j_4(toDp-GaN1DYA($this$toPx_u2d_u2dR2X_6o)); } @Stable default int roundToPx--R2X_6o(long $this$roundToPx_u2d_u2dR2X_6o) { float $this$fastRoundToInt$iv = toPx--R2X_6o($this$roundToPx_u2d_u2dR2X_6o); int $i$f$fastRoundToInt = 0; return Math.round($this$fastRoundToInt$iv); } @Stable default float toDp-u2uoSUM(int $this$toDp_u2du2uoSUM) { float $this$dp$iv = $this$toDp_u2du2uoSUM / getDensity(); int $i$f$getDp = 0;
/* 145 */     return Dp.constructor-impl($this$dp$iv); } @Stable default long toSp-kPz2Gy4(int $this$toSp_u2dkPz2Gy4) { return toSp-0xMU5do(toDp-u2uoSUM($this$toSp_u2dkPz2Gy4)); }
/* 146 */   @Stable default float toDp-u2uoSUM(float $this$toDp_u2du2uoSUM) { float $this$dp$iv = $this$toDp_u2du2uoSUM / getDensity(); int $i$f$getDp = 0; return Dp.constructor-impl($this$dp$iv); } @Stable default long toSp-kPz2Gy4(float $this$toSp_u2dkPz2Gy4) { return toSp-0xMU5do(toDp-u2uoSUM($this$toSp_u2dkPz2Gy4)); } @Stable @NotNull default Rect toRect(@NotNull DpRect $this$toRect) { Intrinsics.checkNotNullParameter($this$toRect, "<this>"); return new Rect(toPx-0680j_4($this$toRect.getLeft-D9Ej5fM()), toPx-0680j_4($this$toRect.getTop-D9Ej5fM()), toPx-0680j_4($this$toRect.getRight-D9Ej5fM()), toPx-0680j_4($this$toRect.getBottom-D9Ej5fM())); }
/* 147 */   @Stable default long toSize-XkaWNTQ(long $this$toSize_u2dXkaWNTQ) { long $this$isSpecified$iv = $this$toSize_u2dXkaWNTQ; int $i$f$isSpecified-EaSLcWc = 0; return (($this$isSpecified$iv != 9205357640488583168L)) ? SizeKt.Size(toPx-0680j_4(DpSize.getWidth-D9Ej5fM($this$toSize_u2dXkaWNTQ)), toPx-0680j_4(DpSize.getHeight-D9Ej5fM($this$toSize_u2dXkaWNTQ))) : Size.Companion.getUnspecified-NH-jbRc(); } @Stable default long toDpSize-k-rfVVM(long $this$toDpSize_u2dk_u2drfVVM) { long $this$isSpecified$iv = $this$toDpSize_u2dk_u2drfVVM; int $i$f$isSpecified-uvyYCjk = 0;
/* 148 */     return (($this$isSpecified$iv != 9205357640488583168L)) ? DpKt.DpSize-YgX7TsA(toDp-u2uoSUM(Size.getWidth-impl($this$toDpSize_u2dk_u2drfVVM)), toDp-u2uoSUM(Size.getHeight-impl($this$toDpSize_u2dk_u2drfVVM))) : DpSize.Companion.getUnspecified-MYxV2XQ(); }
/*     */ 
/*     */   
/*     */   float getDensity();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\Density.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */