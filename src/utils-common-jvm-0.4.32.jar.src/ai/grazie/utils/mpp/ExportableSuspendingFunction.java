/*   */ package ai.grazie.utils.mpp;
/*   */ 
/*   */ import kotlin.coroutines.Continuation;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\005\030\000*\006\b\000\020\001 \0012\0020\002B%\b\000\022\034\020\003\032\030\b\001\022\n\022\b\022\004\022\0028\0000\005\022\006\022\004\030\0010\0020\004¢\006\002\020\006R,\020\003\032\030\b\001\022\n\022\b\022\004\022\0028\0000\005\022\006\022\004\030\0010\0020\004X\004¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/ExportableSuspendingFunction;", "T", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)V", "getBlock$utils_common", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "utils-common"})
/*   */ public final class ExportableSuspendingFunction<T> {
/* 7 */   public ExportableSuspendingFunction(@NotNull Function1<Continuation<? super T>, Object> block) { this.block = block; } @NotNull private final Function1<Continuation<? super T>, Object> block; @NotNull public final Function1<Continuation<? super T>, Object> getBlock$utils_common() { return this.block; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\ExportableSuspendingFunction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */