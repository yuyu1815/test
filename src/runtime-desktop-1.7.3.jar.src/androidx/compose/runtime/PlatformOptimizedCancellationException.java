/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.concurrent.CancellationException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\003\n\000\b \030\0002\0060\001j\002`\002B\021\022\n\b\002\020\003\032\004\030\0010\004¢\006\002\020\005J\b\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Landroidx/compose/runtime/PlatformOptimizedCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "(Ljava/lang/String;)V", "fillInStackTrace", "", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/PlatformOptimizedCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,87:1\n26#2:88\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/PlatformOptimizedCancellationException\n*L\n82#1:88\n*E\n"})
/*    */ public abstract class PlatformOptimizedCancellationException
/*    */   extends CancellationException
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   public PlatformOptimizedCancellationException(@Nullable String message) {
/* 78 */     super(message);
/*    */   }
/*    */   @NotNull
/*    */   public Throwable fillInStackTrace() {
/* 82 */     int $i$f$emptyArray = 0; setStackTrace(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 88 */         new StackTraceElement[0]);
/*    */     return this;
/*    */   }
/*    */   
/*    */   public PlatformOptimizedCancellationException() {
/*    */     this((String)null, 1, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\PlatformOptimizedCancellationException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */