/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.sync.Mutex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"asSimpleMutex", "Lai/grazie/utils/SimpleMutex;", "Lkotlinx/coroutines/sync/Mutex;", "utils-common"})
/*    */ public final class SimpleMutexKt
/*    */ {
/*    */   @NotNull
/*    */   public static final SimpleMutex asSimpleMutex(@NotNull Mutex $this$asSimpleMutex) {
/* 20 */     Intrinsics.checkNotNullParameter($this$asSimpleMutex, "<this>"); return new MutexWrapper($this$asSimpleMutex);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SimpleMutexKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */