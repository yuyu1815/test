/*    */ package androidx.compose.runtime;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020\b\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\000¨\006\003"}, d2 = {"postIncrement", "", "Landroidx/compose/runtime/AtomicInt;", "runtime"})
/*    */ public final class ExpectKt
/*    */ {
/*    */   public static final int postIncrement(@NotNull AtomicInt $this$postIncrement) {
/* 55 */     Intrinsics.checkNotNullParameter($this$postIncrement, "<this>"); return $this$postIncrement.add(1) - 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ExpectKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */