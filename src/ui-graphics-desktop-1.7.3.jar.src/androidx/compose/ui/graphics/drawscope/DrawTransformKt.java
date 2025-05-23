/*     */ package androidx.compose.ui.graphics.drawscope;
/*     */ 
/*     */ import androidx.compose.ui.graphics.DegreesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\002\030\002\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\005\032\025\020\000\032\0020\001*\0020\0022\006\020\000\032\0020\003H\b\032!\020\000\032\0020\001*\0020\0022\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003H\b\032)\020\006\032\0020\001*\0020\0022\006\020\007\032\0020\0032\b\b\002\020\b\032\0020\tH\bø\001\000¢\006\004\b\n\020\013\032)\020\f\032\0020\001*\0020\0022\006\020\f\032\0020\0032\b\b\002\020\b\032\0020\tH\bø\001\000¢\006\004\b\r\020\013\002\007\n\005\b¡\0360\001¨\006\016"}, d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,179:1\n37#1:180\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:180\n*E\n"})
/*     */ public final class DrawTransformKt
/*     */ {
/*     */   public static final void inset(@NotNull DrawTransform $this$inset, float horizontal, float vertical) {
/*  37 */     Intrinsics.checkNotNullParameter($this$inset, "<this>"); int $i$f$inset = 0; $this$inset.inset(horizontal, vertical, horizontal, vertical);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void inset(@NotNull DrawTransform $this$inset, float inset) {
/*  49 */     Intrinsics.checkNotNullParameter($this$inset, "<this>"); int $i$f$inset = 0; DrawTransform $this$inset$iv = $this$inset; int i = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     $this$inset$iv.inset(inset, inset, inset, inset);
/*     */   }
/*     */   
/*     */   public static final void rotateRad-0AR0LA0(@NotNull DrawTransform $this$rotateRad_u2d0AR0LA0, float radians, long pivot) {
/*     */     Intrinsics.checkNotNullParameter($this$rotateRad_u2d0AR0LA0, "$this$rotateRad");
/*     */     int $i$f$rotateRad-0AR0LA0 = 0;
/*     */     $this$rotateRad_u2d0AR0LA0.rotate-Uv8p0NA(DegreesKt.degrees(radians), pivot);
/*     */   }
/*     */   
/*     */   public static final void scale-0AR0LA0(@NotNull DrawTransform $this$scale_u2d0AR0LA0, float scale, long pivot) {
/*     */     Intrinsics.checkNotNullParameter($this$scale_u2d0AR0LA0, "$this$scale");
/*     */     int $i$f$scale-0AR0LA0 = 0;
/*     */     $this$scale_u2d0AR0LA0.scale-0AR0LA0(scale, scale, pivot);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\DrawTransformKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */