/*    */ package androidx.compose.runtime.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.CharsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\016\n\000\b\000\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\b\020\b\032\0020\tH\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\004¨\006\n"}, d2 = {"Landroidx/compose/runtime/internal/IntRef;", "", "element", "", "(I)V", "getElement", "()I", "setElement", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class IntRef
/*    */ {
/*    */   private int element;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public IntRef(int element) {
/* 20 */     this.element = element; } public final int getElement() { return this.element; } public final void setElement(int <set-?>) { this.element = <set-?>; } @NotNull
/*    */   public String toString() {
/* 22 */     Intrinsics.checkNotNullExpressionValue(Integer.toString(hashCode(), CharsKt.checkRadix(16)), "toString(...)"); return "IntRef(element = " + this.element + ")@" + Integer.toString(hashCode(), CharsKt.checkRadix(16));
/*    */   }
/*    */   
/*    */   public IntRef() {
/*    */     this(0, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\IntRef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */