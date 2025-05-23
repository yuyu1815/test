/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.FilterTileMode;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\013\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\032\024\020\000\032\0020\001*\0020\002ø\001\000¢\006\004\b\003\020\004\032\026\020\005\032\0020\006*\0020\002H\000ø\001\000¢\006\004\b\007\020\b\002\007\n\005\b¡\0360\001¨\006\t"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toSkiaTileMode", "Lorg/jetbrains/skia/FilterTileMode;", "toSkiaTileMode-0vamqd0", "(I)Lorg/jetbrains/skia/FilterTileMode;", "ui-graphics"})
/*    */ public final class SkiaTileMode_skikoKt
/*    */ {
/*    */   public static final boolean isSupported-0vamqd0(int $this$isSupported_u2d0vamqd0) {
/* 21 */     return true; } @NotNull
/*    */   public static final FilterTileMode toSkiaTileMode-0vamqd0(int $this$toSkiaTileMode_u2d0vamqd0) {
/* 23 */     int i = $this$toSkiaTileMode_u2d0vamqd0;
/* 24 */     return TileMode.equals-impl0(i, TileMode.Companion.getClamp-3opZhB0()) ? FilterTileMode.CLAMP : (
/* 25 */       TileMode.equals-impl0(i, TileMode.Companion.getRepeated-3opZhB0()) ? FilterTileMode.REPEAT : (
/* 26 */       TileMode.equals-impl0(i, TileMode.Companion.getMirror-3opZhB0()) ? FilterTileMode.MIRROR : (
/* 27 */       TileMode.equals-impl0(i, TileMode.Companion.getDecal-3opZhB0()) ? FilterTileMode.DECAL : 
/* 28 */       FilterTileMode.CLAMP)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaTileMode_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */