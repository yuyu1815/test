/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\025\n\002\b\002\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\t\b\000\030\0002\0020\001B\005¢\006\002\020\002J\006\020\n\032\0020\013J\016\020\f\032\0020\0042\006\020\r\032\0020\004J\006\020\016\032\0020\017J\006\020\020\032\0020\017J\006\020\021\032\0020\004J\016\020\021\032\0020\0042\006\020\022\032\0020\004J\006\020\023\032\0020\004J\016\020\024\032\0020\0042\006\020\025\032\0020\004J\006\020\026\032\0020\004J\016\020\027\032\0020\0132\006\020\r\032\0020\004R\021\020\003\032\0020\0048F¢\006\006\032\004\b\005\020\006R\016\020\007\032\0020\bX\016¢\006\002\n\000R\016\020\t\032\0020\004X\016¢\006\002\n\000¨\006\030"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "()V", "size", "", "getSize", "()I", "slots", "", "tos", "clear", "", "indexOf", "value", "isEmpty", "", "isNotEmpty", "peek", "index", "peek2", "peekOr", "default", "pop", "push", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class IntStack
/*    */ {
/*    */   @NotNull
/* 37 */   private int[] slots = new int[10]; private int tos; public static final int $stable = 8;
/*    */   
/*    */   public final int getSize() {
/* 40 */     return this.tos;
/*    */   }
/*    */   public final void push(int value) {
/* 43 */     if (this.tos >= this.slots.length) {
/* 44 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.slots, this.slots.length * 2), "copyOf(...)"); this.slots = Arrays.copyOf(this.slots, this.slots.length * 2);
/*    */     } 
/* 46 */     int i = this.tos; this.tos = i + 1; this.slots[i] = value;
/*    */   }
/*    */   
/* 49 */   public final int pop() { this.tos--; return this.slots[this.tos]; }
/* 50 */   public final int peekOr(int default) { return (this.tos > 0) ? peek() : default; }
/* 51 */   public final int peek() { return this.slots[this.tos - 1]; }
/* 52 */   public final int peek2() { return this.slots[this.tos - 2]; }
/* 53 */   public final int peek(int index) { return this.slots[index]; }
/* 54 */   public final boolean isEmpty() { return (this.tos == 0); }
/* 55 */   public final boolean isNotEmpty() { return (this.tos != 0); } public final void clear() {
/* 56 */     this.tos = 0;
/*    */   } public final int indexOf(int value) {
/* 58 */     for (int i = 0, j = this.tos; i < j; i++) {
/* 59 */       if (this.slots[i] == value) return i; 
/* 60 */     }  return -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\IntStack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */