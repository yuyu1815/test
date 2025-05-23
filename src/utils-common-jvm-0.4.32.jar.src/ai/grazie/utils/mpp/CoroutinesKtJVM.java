/*    */ package ai.grazie.utils.mpp;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\032\036\020\005\032\002H\006\"\004\b\000\020\006*\b\022\004\022\002H\0060\007H@¢\006\002\020\b\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004¨\006\t"}, d2 = {"SuitableForIO", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Dispatchers;", "getSuitableForIO", "(Lkotlinx/coroutines/Dispatchers;)Lkotlinx/coroutines/CoroutineDispatcher;", "invokeAndAwait", "T", "Lai/grazie/utils/mpp/ExportableSuspendingFunction;", "(Lai/grazie/utils/mpp/ExportableSuspendingFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ @JvmName(name = "CoroutinesKtJVM")
/*    */ public final class CoroutinesKtJVM {
/*    */   @Nullable
/*    */   public static final <T> Object invokeAndAwait(@NotNull ExportableSuspendingFunction<T> $this$invokeAndAwait, @NotNull Continuation $completion) {
/* 10 */     return $this$invokeAndAwait.getBlock$utils_common().invoke($completion);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final CoroutineDispatcher getSuitableForIO(@NotNull Dispatchers $this$SuitableForIO) {
/* 17 */     Intrinsics.checkNotNullParameter($this$SuitableForIO, "<this>"); return Dispatchers.getIO();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\CoroutinesKtJVM.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */