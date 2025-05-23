/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.Shader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001BA\b\000\022\f\020\002\032\b\022\004\022\0020\0040\003\022\020\b\002\020\005\032\n\022\004\022\0020\006\030\0010\003\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\b\b\002\020\n\032\0020\013¢\006\002\020\fJ\036\020\023\032\0060\024j\002`\0252\006\020\026\032\0020\017H\026ø\001\000¢\006\004\b\027\020\030J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034H\002J\b\020\035\032\0020\036H\026J\b\020\037\032\0020 H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\026\020\t\032\0020\bX\004ø\001\000ø\001\001¢\006\004\n\002\020\rR\032\020\016\032\0020\0178VX\004ø\001\000ø\001\001¢\006\006\032\004\b\020\020\021R\026\020\007\032\0020\bX\004ø\001\000ø\001\001¢\006\004\n\002\020\rR\026\020\005\032\n\022\004\022\0020\006\030\0010\003X\004¢\006\002\n\000R\026\020\n\032\0020\013X\004ø\001\000ø\001\001¢\006\004\n\002\020\022\002\013\n\005\b¡\0360\001\n\002\b!¨\006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Lorg/jetbrains/skia/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Lorg/jetbrains/skia/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics"})
/*     */ @Immutable
/*     */ public final class LinearGradient
/*     */   extends ShaderBrush
/*     */ {
/*     */   @NotNull
/*     */   private final List<Color> colors;
/*     */   @Nullable
/*     */   private final List<Float> stops;
/*     */   private final long start;
/*     */   private final long end;
/*     */   private final int tileMode;
/*     */   
/*     */   private LinearGradient(List<Color> colors, List<Float> stops, long start, long end, int tileMode) {
/* 448 */     this.colors = colors;
/* 449 */     this.stops = stops;
/* 450 */     this.start = start;
/* 451 */     this.end = end;
/* 452 */     this.tileMode = tileMode;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getIntrinsicSize-NH-jbRc() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield start : J
/*     */     //   4: invokestatic getX-impl : (J)F
/*     */     //   7: fstore_1
/*     */     //   8: fload_1
/*     */     //   9: invokestatic isInfinite : (F)Z
/*     */     //   12: ifne -> 26
/*     */     //   15: fload_1
/*     */     //   16: invokestatic isNaN : (F)Z
/*     */     //   19: ifne -> 26
/*     */     //   22: iconst_1
/*     */     //   23: goto -> 27
/*     */     //   26: iconst_0
/*     */     //   27: ifeq -> 81
/*     */     //   30: aload_0
/*     */     //   31: getfield end : J
/*     */     //   34: invokestatic getX-impl : (J)F
/*     */     //   37: fstore_1
/*     */     //   38: fload_1
/*     */     //   39: invokestatic isInfinite : (F)Z
/*     */     //   42: ifne -> 56
/*     */     //   45: fload_1
/*     */     //   46: invokestatic isNaN : (F)Z
/*     */     //   49: ifne -> 56
/*     */     //   52: iconst_1
/*     */     //   53: goto -> 57
/*     */     //   56: iconst_0
/*     */     //   57: ifeq -> 81
/*     */     //   60: aload_0
/*     */     //   61: getfield start : J
/*     */     //   64: invokestatic getX-impl : (J)F
/*     */     //   67: aload_0
/*     */     //   68: getfield end : J
/*     */     //   71: invokestatic getX-impl : (J)F
/*     */     //   74: fsub
/*     */     //   75: invokestatic abs : (F)F
/*     */     //   78: goto -> 83
/*     */     //   81: ldc NaN
/*     */     //   83: aload_0
/*     */     //   84: getfield start : J
/*     */     //   87: invokestatic getY-impl : (J)F
/*     */     //   90: fstore_1
/*     */     //   91: fload_1
/*     */     //   92: invokestatic isInfinite : (F)Z
/*     */     //   95: ifne -> 109
/*     */     //   98: fload_1
/*     */     //   99: invokestatic isNaN : (F)Z
/*     */     //   102: ifne -> 109
/*     */     //   105: iconst_1
/*     */     //   106: goto -> 110
/*     */     //   109: iconst_0
/*     */     //   110: ifeq -> 164
/*     */     //   113: aload_0
/*     */     //   114: getfield end : J
/*     */     //   117: invokestatic getY-impl : (J)F
/*     */     //   120: fstore_1
/*     */     //   121: fload_1
/*     */     //   122: invokestatic isInfinite : (F)Z
/*     */     //   125: ifne -> 139
/*     */     //   128: fload_1
/*     */     //   129: invokestatic isNaN : (F)Z
/*     */     //   132: ifne -> 139
/*     */     //   135: iconst_1
/*     */     //   136: goto -> 140
/*     */     //   139: iconst_0
/*     */     //   140: ifeq -> 164
/*     */     //   143: aload_0
/*     */     //   144: getfield start : J
/*     */     //   147: invokestatic getY-impl : (J)F
/*     */     //   150: aload_0
/*     */     //   151: getfield end : J
/*     */     //   154: invokestatic getY-impl : (J)F
/*     */     //   157: fsub
/*     */     //   158: invokestatic abs : (F)F
/*     */     //   161: goto -> 166
/*     */     //   164: ldc NaN
/*     */     //   166: invokestatic Size : (FF)J
/*     */     //   169: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #458	-> 0
/*     */     //   #458	-> 27
/*     */     //   #458	-> 57
/*     */     //   #458	-> 81
/*     */     //   #459	-> 83
/*     */     //   #459	-> 110
/*     */     //   #459	-> 140
/*     */     //   #459	-> 164
/*     */     //   #457	-> 166
/*     */     //   #460	-> 169
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	170	0	this	Landroidx/compose/ui/graphics/LinearGradient;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Shader createShader-uvyYCjk(long size) {
/* 463 */     float startX = ((Offset.getX-impl(this.start) == Float.POSITIVE_INFINITY)) ? Size.getWidth-impl(size) : Offset.getX-impl(this.start);
/* 464 */     float startY = ((Offset.getY-impl(this.start) == Float.POSITIVE_INFINITY)) ? Size.getHeight-impl(size) : Offset.getY-impl(this.start);
/* 465 */     float endX = ((Offset.getX-impl(this.end) == Float.POSITIVE_INFINITY)) ? Size.getWidth-impl(size) : Offset.getX-impl(this.end);
/* 466 */     float endY = ((Offset.getY-impl(this.end) == Float.POSITIVE_INFINITY)) ? Size.getHeight-impl(size) : Offset.getY-impl(this.end);
/*     */     
/* 468 */     List<Color> list = this.colors;
/* 469 */     List<Float> list1 = this.stops;
/* 470 */     long l1 = OffsetKt.Offset(startX, startY);
/* 471 */     long l2 = OffsetKt.Offset(endX, endY);
/* 472 */     int i = this.tileMode; return ShaderKt.LinearGradientShader-VjE6UOU(l1, l2, list, list1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 477 */     if (this == other) return true; 
/* 478 */     if (!(other instanceof LinearGradient)) return false;
/*     */     
/* 480 */     if (!Intrinsics.areEqual(this.colors, ((LinearGradient)other).colors)) return false; 
/* 481 */     if (!Intrinsics.areEqual(this.stops, ((LinearGradient)other).stops)) return false; 
/* 482 */     if (!Offset.equals-impl0(this.start, ((LinearGradient)other).start)) return false; 
/* 483 */     if (!Offset.equals-impl0(this.end, ((LinearGradient)other).end)) return false; 
/* 484 */     if (!TileMode.equals-impl0(this.tileMode, ((LinearGradient)other).tileMode)) return false;
/*     */     
/* 486 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 490 */     int result = this.colors.hashCode();
/* 491 */     result = 31 * result + ((this.stops != null) ? this.stops.hashCode() : 0);
/* 492 */     result = 31 * result + Offset.hashCode-impl(this.start);
/* 493 */     result = 31 * result + Offset.hashCode-impl(this.end);
/* 494 */     result = 31 * result + TileMode.hashCode-impl(this.tileMode);
/* 495 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 499 */     String startValue = OffsetKt.isFinite-k-4lQ0M(this.start) ? ("start=" + Offset.toString-impl(this.start) + ", ") : "";
/* 500 */     String endValue = OffsetKt.isFinite-k-4lQ0M(this.end) ? ("end=" + Offset.toString-impl(this.end) + ", ") : "";
/* 501 */     return "LinearGradient(colors=" + this.colors + ", stops=" + 
/* 502 */       this.stops + ", " + 
/* 503 */       startValue + 
/* 504 */       endValue + 
/* 505 */       "tileMode=" + TileMode.toString-impl(this.tileMode) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\LinearGradient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */