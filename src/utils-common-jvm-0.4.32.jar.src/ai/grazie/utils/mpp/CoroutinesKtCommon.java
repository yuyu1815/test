/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.JvmName;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\0325\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\034\020\003\032\030\b\001\022\n\022\b\022\004\022\002H\0020\005\022\006\022\004\030\0010\0060\004¢\006\002\020\007\0329\020\b\032\b\022\004\022\002H\0020\t\"\004\b\000\020\002*\0020\n2\034\020\003\032\030\b\001\022\n\022\b\022\004\022\002H\0020\005\022\006\022\004\030\0010\0060\004¢\006\002\020\013\032\036\020\f\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\tH@¢\006\002\020\r¨\006\016"}, d2 = {"exportSuspending", "Lai/grazie/utils/mpp/ExportableSuspendingFunction;", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lai/grazie/utils/mpp/ExportableSuspendingFunction;", "asyncExportable", "Lai/grazie/utils/mpp/ExportableDeferred;", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lai/grazie/utils/mpp/ExportableDeferred;", "await", "(Lai/grazie/utils/mpp/ExportableDeferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ @JvmName(name = "CoroutinesKtCommon")
/*    */ public final class CoroutinesKtCommon
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> ExportableSuspendingFunction<T> exportSuspending(@NotNull Function1<? super Continuation<? super T>, ? extends Object> block) {
/* 21 */     Intrinsics.checkNotNullParameter(block, "block"); return new ExportableSuspendingFunction<>(block);
/*    */   }
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
/*    */   @Nullable
/*    */   public static final <T> Object await(@NotNull ExportableDeferred<T> $this$await, @NotNull Continuation $completion) {
/* 36 */     return $this$await.getDeferred$utils_common().await($completion);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T> ExportableDeferred<T> asyncExportable(@NotNull CoroutineScope $this$asyncExportable, @NotNull Function1<? super Continuation<? super T>, ? extends Object> block) {
/* 43 */     Intrinsics.checkNotNullParameter($this$asyncExportable, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); return new ExportableDeferred<>($this$asyncExportable, exportSuspending(block));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\CoroutinesKtCommon.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */