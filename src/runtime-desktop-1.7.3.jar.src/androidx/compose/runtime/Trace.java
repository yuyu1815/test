/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0012\006\020\004\032\0020\005J\020\020\006\032\0020\0072\b\020\b\032\004\030\0010\001¨\006\t"}, d2 = {"Landroidx/compose/runtime/Trace;", "", "()V", "beginSection", "name", "", "endSection", "", "token", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Trace
/*    */ {
/*    */   @NotNull
/*    */   public static final Trace INSTANCE = new Trace();
/*    */   public static final int $stable;
/*    */   
/*    */   @Nullable
/*    */   public final Object beginSection(@NotNull String name) {
/* 25 */     Intrinsics.checkNotNullParameter(name, "name"); return null;
/*    */   }
/*    */   
/*    */   public final void endSection(@Nullable Object token) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\Trace.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */