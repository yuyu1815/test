/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\024\n\000\n\002\020\007\n\002\b\b\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\030\0002\0020\001:\001\026B\037\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\025H\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\027"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", "type", "Landroidx/compose/ui/graphics/PathSegment$Type;", "points", "", "weight", "", "(Landroidx/compose/ui/graphics/PathSegment$Type;[FF)V", "getPoints", "()[F", "getType", "()Landroidx/compose/ui/graphics/PathSegment$Type;", "getWeight", "()F", "equals", "", "other", "hashCode", "", "toString", "", "Type", "ui-graphics"})
/*     */ public final class PathSegment
/*     */ {
/*     */   @NotNull
/*     */   private final Type type;
/*     */   @NotNull
/*     */   private final float[] points;
/*     */   private final float weight;
/*     */   
/*     */   public PathSegment(@NotNull Type type, @NotNull float[] points, float weight) {
/*  38 */     this.type = type;
/*  39 */     this.points = points;
/*  40 */     this.weight = weight; } public final float getWeight() { return this.weight; }
/*     */    @NotNull
/*     */   public final Type getType() {
/*     */     return this.type;
/*     */   } @NotNull
/*     */   public final float[] getPoints() {
/*     */     return this.points;
/*     */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\t¨\006\n"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "(Ljava/lang/String;I)V", "Move", "Line", "Quadratic", "Conic", "Cubic", "Close", "Done", "ui-graphics"})
/*     */   public enum Type { @NotNull
/*     */     public static EnumEntries<Type> getEntries() {
/*     */       return $ENTRIES;
/*     */     }
/*  52 */     Move,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     Line,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  66 */     Quadratic,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     Conic,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     Cubic,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     Close,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     Done; }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 106 */     if (this == other) return true; 
/* 107 */     if (other == null || getClass() != other.getClass()) return false;
/*     */     
/* 109 */     (PathSegment)other;
/*     */     
/* 111 */     if (this.type != ((PathSegment)other).type) return false; 
/* 112 */     if (!Arrays.equals(this.points, ((PathSegment)other).points)) return false; 
/* 113 */     if (!((this.weight == ((PathSegment)other).weight) ? 1 : 0)) return false;
/*     */     
/* 115 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 119 */     int result = this.type.hashCode();
/* 120 */     result = 31 * result + Arrays.hashCode(this.points);
/* 121 */     result = 31 * result + Float.hashCode(this.weight);
/* 122 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 126 */     Intrinsics.checkNotNullExpressionValue(Arrays.toString(this.points), "toString(...)"); return "PathSegment(type=" + this.type + ", points=" + Arrays.toString(this.points) + ", weight=" + this.weight + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */