/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.geometry.Offset;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\017\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\007\030\000 \0352\0020\001:\001\035B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ.\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007ø\001\000¢\006\004\b\024\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001H\002J\b\020\031\032\0020\032H\026J\b\020\033\032\0020\034H\026R\034\020\006\032\0020\0078\006X\004¢\006\016\n\000\022\004\b\t\020\n\032\004\b\013\020\fR$\020\002\032\0020\0038\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\020\022\004\b\r\020\n\032\004\b\016\020\017R$\020\004\032\0020\0058\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\020\022\004\b\021\020\n\032\004\b\022\020\017\002\013\n\005\b¡\0360\001\n\002\b!¨\006\036"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "color", "Landroidx/compose/ui/graphics/Color;", "offset", "Landroidx/compose/ui/geometry/Offset;", "blurRadius", "", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlurRadius$annotations", "()V", "getBlurRadius", "()F", "getColor-0d7_KjU$annotations", "getColor-0d7_KjU", "()J", "J", "getOffset-F1C5BW0$annotations", "getOffset-F1C5BW0", "copy", "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-graphics"})
/*    */ @Immutable
/*    */ public final class Shadow
/*    */ {
/*    */   public final long getColor-0d7_KjU() {
/*    */     return this.color;
/*    */   }
/*    */   
/*    */   public final long getOffset-F1C5BW0() {
/*    */     return this.offset;
/*    */   }
/*    */   
/*    */   private Shadow(long color, long offset, float blurRadius) {
/* 30 */     this.color = color;
/*    */     
/* 32 */     this.offset = offset;
/*    */     
/* 34 */     this.blurRadius = blurRadius; } public final float getBlurRadius() {
/* 35 */     return this.blurRadius;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "()V", "None", "Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "ui-graphics"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/* 42 */     public final Shadow getNone() { return Shadow.None; } } @NotNull public static final Companion Companion = new Companion(null); private final long color; private final long offset; private final float blurRadius; @NotNull private static final Shadow None = new Shadow(0L, 0L, 0.0F, 7, null);
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 46 */     if (this == other) return true; 
/* 47 */     if (!(other instanceof Shadow)) return false;
/*    */     
/* 49 */     if (!Color.equals-impl0(this.color, ((Shadow)other).color)) return false; 
/* 50 */     if (!Offset.equals-impl0(this.offset, ((Shadow)other).offset)) return false; 
/* 51 */     if (!((this.blurRadius == ((Shadow)other).blurRadius) ? 1 : 0)) return false;
/*    */     
/* 53 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 57 */     int result = Color.hashCode-impl(this.color);
/* 58 */     result = 31 * result + Offset.hashCode-impl(this.offset);
/* 59 */     result = 31 * result + Float.hashCode(this.blurRadius);
/* 60 */     return result;
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 64 */     return "Shadow(color=" + Color.toString-impl(this.color) + ", offset=" + Offset.toString-impl(this.offset) + ", blurRadius=" + this.blurRadius + ')';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Shadow copy-qcb84PM(long color, long offset, float blurRadius) {
/* 72 */     return new Shadow(
/* 73 */         color, 
/* 74 */         offset, 
/* 75 */         blurRadius, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Shadow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */