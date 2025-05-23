/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import androidx.annotation.RestrictTo;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\020\016\n\002\020\b\n\000\n\002\020\013\n\002\b\003\b\027\030\0002\0020\001B\005¢\006\002\020\002J\030\020\007\032\0020\b2\006\020\t\032\0020\0052\006\020\n\032\0020\006H\027R\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004X\004¢\006\002\n\000¨\006\013"}, d2 = {"Landroidx/lifecycle/MethodCallsLogger;", "", "()V", "calledMethods", "", "", "", "approveCall", "", "name", "type", "lifecycle-common"})
/*    */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*    */ public class MethodCallsLogger
/*    */ {
/*    */   @NotNull
/* 22 */   private final Map<String, Integer> calledMethods = new HashMap<>();
/*    */   
/*    */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*    */   public boolean approveCall(@NotNull String name, int type) {
/* 26 */     Intrinsics.checkNotNullParameter(name, "name"); Integer nullableMask = this.calledMethods.get(name);
/* 27 */     int mask = (nullableMask != null) ? nullableMask.intValue() : 0;
/* 28 */     boolean wasCalled = ((mask & type) != 0);
/* 29 */     this.calledMethods.put(name, Integer.valueOf(mask | type));
/* 30 */     return !wasCalled;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\MethodCallsLogger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */