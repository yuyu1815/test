/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Offset;
/*    */ import androidx.compose.ui.geometry.OffsetKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.skia.PathMeasure;
/*    */ import org.jetbrains.skia.Point;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\003\b\000\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\035\020\013\032\0020\f2\006\020\r\032\0020\006H\026ø\001\000ø\001\001¢\006\004\b\016\020\017J(\020\020\032\0020\0212\006\020\022\032\0020\0062\006\020\023\032\0020\0062\006\020\024\032\0020\0252\006\020\026\032\0020\021H\026J\035\020\027\032\0020\f2\006\020\r\032\0020\006H\026ø\001\000ø\001\001¢\006\004\b\030\020\017J\032\020\031\032\0020\0322\b\020\033\032\004\030\0010\0252\006\020\034\032\0020\021H\026R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\n\002\013\n\002\b!\n\005\b¡\0360\001¨\006\035"}, d2 = {"Landroidx/compose/ui/graphics/SkiaBackedPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "skia", "Lorg/jetbrains/skia/PathMeasure;", "(Lorg/jetbrains/skia/PathMeasure;)V", "length", "", "getLength", "()F", "getSkia$ui_graphics", "()Lorg/jetbrains/skia/PathMeasure;", "getPosition", "Landroidx/compose/ui/geometry/Offset;", "distance", "getPosition-tuRUvjQ", "(F)J", "getSegment", "", "startDistance", "stopDistance", "destination", "Landroidx/compose/ui/graphics/Path;", "startWithMoveTo", "getTangent", "getTangent-tuRUvjQ", "setPath", "", "path", "forceClosed", "ui-graphics"})
/*    */ public final class SkiaBackedPathMeasure
/*    */   implements PathMeasure
/*    */ {
/*    */   @NotNull
/*    */   private final PathMeasure skia;
/*    */   
/*    */   public SkiaBackedPathMeasure(@NotNull PathMeasure skia) {
/* 32 */     this.skia = skia; } @NotNull public final PathMeasure getSkia$ui_graphics() { return this.skia; }
/*    */ 
/*    */   
/*    */   public void setPath(@Nullable Path path, boolean forceClosed) {
/* 36 */     this.skia.setPath((path != null) ? SkiaBackedPath_skikoKt.asSkiaPath(path) : null, forceClosed);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean getSegment(float startDistance, float stopDistance, @NotNull Path destination, boolean startWithMoveTo) {
/* 44 */     Intrinsics.checkNotNullParameter(destination, "destination"); return this.skia.getSegment(
/* 45 */         startDistance, 
/* 46 */         stopDistance, 
/* 47 */         SkiaBackedPath_skikoKt.asSkiaPath(destination), 
/* 48 */         startWithMoveTo);
/*    */   }
/*    */   
/*    */   public float getLength() {
/* 52 */     return this.skia.getLength();
/*    */   }
/*    */ 
/*    */   
/*    */   public long getPosition-tuRUvjQ(float distance) {
/* 57 */     Point result = this.skia.getPosition(distance);
/* 58 */     return (result != null) ? 
/* 59 */       OffsetKt.Offset(result.getX(), result.getY()) : 
/*    */       
/* 61 */       Offset.Companion.getUnspecified-F1C5BW0();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getTangent-tuRUvjQ(float distance) {
/* 68 */     Point result = this.skia.getTangent(distance);
/* 69 */     return (result != null) ? 
/* 70 */       OffsetKt.Offset(result.getX(), result.getY()) : 
/*    */       
/* 72 */       Offset.Companion.getUnspecified-F1C5BW0();
/*    */   }
/*    */   
/*    */   public SkiaBackedPathMeasure() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedPathMeasure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */