/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.annotation.RestrictTo;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\007\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\002\n\002\020\016\n\000\b\027\030\000*\004\b\000\020\0012\0020\002B!\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004\022\n\b\002\020\006\032\004\030\0018\000¢\006\002\020\007J\021\020\016\032\0020\0172\006\020\020\032\0020\004H\002J\023\020\021\032\0020\0172\b\020\022\032\004\030\0010\002H\002J\b\020\023\032\0020\024H\026J\024\020\025\032\0020\0172\f\020\022\032\b\022\004\022\0028\0000\000J\026\020\025\032\0020\0172\006\020\003\032\0020\0042\006\020\005\032\0020\004J\b\020\026\032\0020\027H\026R\025\020\006\032\004\030\0018\000¢\006\n\n\002\020\n\032\004\b\b\020\tR\021\020\005\032\0020\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\r\020\f¨\006\030"}, d2 = {"Landroidx/compose/ui/graphics/Interval;", "T", "", "start", "", "end", "data", "(FFLjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getEnd", "()F", "getStart", "contains", "", "value", "equals", "other", "hashCode", "", "overlaps", "toString", "", "ui-graphics"})
/*    */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*    */ public class Interval<T>
/*    */ {
/*    */   private final float start;
/*    */   private final float end;
/*    */   @Nullable
/*    */   private final T data;
/*    */   
/*    */   public Interval(float start, float end, @Nullable Object data) {
/* 32 */     this.start = start; this.end = end; this.data = (T)data; } public final float getStart() { return this.start; } public final float getEnd() { return this.end; } @Nullable public final T getData() { return this.data; }
/*    */ 
/*    */   
/*    */   public final boolean overlaps(@NotNull Interval other) {
/* 36 */     Intrinsics.checkNotNullParameter(other, "other"); return (this.start <= other.end && this.end >= other.start);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean overlaps(float start, float end) {
/* 42 */     return (this.start <= end && this.end >= start);
/*    */   }
/*    */ 
/*    */   
/*    */   public final boolean contains(float value) {
/* 47 */     float f = this.start; return (value <= this.end) ? ((f <= value)) : false;
/*    */   }
/*    */   public boolean equals(@Nullable Object other) {
/* 50 */     if (this == other) return true; 
/* 51 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 53 */     (Interval)other;
/*    */     
/* 55 */     if (!((this.start == ((Interval)other).start) ? 1 : 0)) return false; 
/* 56 */     if (!((this.end == ((Interval)other).end) ? 1 : 0)) return false; 
/* 57 */     if (!Intrinsics.areEqual(this.data, ((Interval)other).data)) return false;
/*    */     
/* 59 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 63 */     int result = Float.hashCode(this.start);
/* 64 */     result = 31 * result + Float.hashCode(this.end);
/* 65 */     result = 31 * result + ((this.data != null) ? this.data.hashCode() : 0);
/* 66 */     return result;
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 70 */     return "Interval(start=" + this.start + ", end=" + this.end + ", data=" + this.data + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Interval.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */