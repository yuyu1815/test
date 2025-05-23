/*    */ package androidx.compose.runtime.internal;
/*    */ 
/*    */ import androidx.compose.runtime.ComposeCompilerApi;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\001\n\000\n\002\020\016\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\007¨\006\004"}, d2 = {"illegalDecoyCallException", "", "fName", "", "runtime"})
/*    */ public final class DecoyKt
/*    */ {
/*    */   @ComposeCompilerApi
/*    */   @NotNull
/*    */   public static final Void illegalDecoyCallException(@NotNull String fName) {
/* 32 */     Intrinsics.checkNotNullParameter(fName, "fName"); throw new IllegalStateException(
/* 33 */         "Function " + fName + " should have been replaced by compiler.");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\DecoyKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */