/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002B\025\b\000\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005R\032\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/utils/mpp/ExportableSuspendLazyImpl;", "T", "Lai/grazie/utils/mpp/ExportableSuspendLazy;", "getter", "Lai/grazie/utils/mpp/ExportableSuspendingFunction;", "(Lai/grazie/utils/mpp/ExportableSuspendingFunction;)V", "getGetter", "()Lai/grazie/utils/mpp/ExportableSuspendingFunction;", "utils-common"})
/*    */ public final class ExportableSuspendLazyImpl<T>
/*    */   implements ExportableSuspendLazy<T>
/*    */ {
/*    */   @NotNull
/*    */   private final ExportableSuspendingFunction<T> getter;
/*    */   
/*    */   public ExportableSuspendLazyImpl(@NotNull ExportableSuspendingFunction<T> getter) {
/* 14 */     this.getter = getter; } @NotNull public ExportableSuspendingFunction<T> getGetter() { return this.getter; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\ExportableSuspendLazyImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */