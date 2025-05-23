/*    */ package androidx.compose.ui.graphics.drawscope;
/*    */ 
/*    */ import androidx.annotation.FloatRange;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.geometry.Rect;
/*    */ import androidx.compose.ui.graphics.ColorFilter;
/*    */ import androidx.compose.ui.graphics.ImageBitmap;
/*    */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*    */ import androidx.compose.ui.unit.DpRect;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\bf\030\0002\0020\001J\b\020\002\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\004À\006\003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics"})
/*    */ public interface ContentDrawScope
/*    */   extends DrawScope {
/*    */   void drawContent();
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @Deprecated
/*    */     public static long getCenter-F1C5BW0(@NotNull ContentDrawScope $this) {
/* 26 */       return $this.getCenter-F1C5BW0(); } @Deprecated public static long getSize-NH-jbRc(@NotNull ContentDrawScope $this) { return $this.getSize-NH-jbRc(); } @Deprecated public static void drawImage-AZ2fEMs(@NotNull ContentDrawScope $this, @NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) { Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(style, "style"); $this.drawImage-AZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality); } @Deprecated public static void record-JVtK1S4(@NotNull ContentDrawScope $this, @NotNull GraphicsLayer $receiver, long size, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($receiver, "$receiver"); Intrinsics.checkNotNullParameter(block, "block"); $this.record-JVtK1S4($receiver, size, block); } @Deprecated @Stable public static int roundToPx-0680j_4(@NotNull ContentDrawScope $this, float $receiver) { return $this.roundToPx-0680j_4($receiver); } @Deprecated @Stable public static int roundToPx--R2X_6o(@NotNull ContentDrawScope $this, long $receiver) { return $this.roundToPx--R2X_6o($receiver); } @Deprecated @Stable public static float toDp-u2uoSUM(@NotNull ContentDrawScope $this, float $receiver) { return $this.toDp-u2uoSUM($receiver); } @Deprecated @Stable public static float toDp-u2uoSUM(@NotNull ContentDrawScope $this, int $receiver) { return $this.toDp-u2uoSUM($receiver); } @Deprecated @Stable public static float toDp-GaN1DYA(@NotNull ContentDrawScope $this, long $receiver) { return $this.toDp-GaN1DYA($receiver); } @Deprecated @Stable public static long toDpSize-k-rfVVM(@NotNull ContentDrawScope $this, long $receiver) { return $this.toDpSize-k-rfVVM($receiver); } @Deprecated @Stable public static float toPx-0680j_4(@NotNull ContentDrawScope $this, float $receiver) { return $this.toPx-0680j_4($receiver); } @Deprecated @Stable public static float toPx--R2X_6o(@NotNull ContentDrawScope $this, long $receiver) { return $this.toPx--R2X_6o($receiver); } @Deprecated @Stable @NotNull public static Rect toRect(@NotNull ContentDrawScope $this, @NotNull DpRect $receiver) { Intrinsics.checkNotNullParameter($receiver, "$receiver"); return $this.toRect($receiver); } @Deprecated @Stable public static long toSize-XkaWNTQ(@NotNull ContentDrawScope $this, long $receiver) { return $this.toSize-XkaWNTQ($receiver); } @Deprecated @Stable public static long toSp-kPz2Gy4(@NotNull ContentDrawScope $this, float $receiver) { return $this.toSp-kPz2Gy4($receiver); } @Deprecated @Stable public static long toSp-kPz2Gy4(@NotNull ContentDrawScope $this, int $receiver) { return $this.toSp-kPz2Gy4($receiver); } @Deprecated @Stable public static long toSp-0xMU5do(@NotNull ContentDrawScope $this, float $receiver) { return $this.toSp-0xMU5do($receiver); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\ContentDrawScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */