/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import ai.grazie.utils.SuspendLazy;
/*    */ import ai.grazie.utils.SuspendLazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\032\"\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\004H\007\0325\020\005\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\034\020\003\032\030\b\001\022\n\022\b\022\004\022\002H\0020\007\022\006\022\004\030\0010\b0\006¢\006\002\020\t\032\034\020\n\032\b\022\004\022\002H\0020\013\"\004\b\000\020\002*\b\022\004\022\002H\0020\001\032\034\020\f\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\013¨\006\r"}, d2 = {"exportableLazy", "Lai/grazie/utils/mpp/ExportableSuspendLazy;", "T", "block", "Lkotlin/Function0;", "exportableSuspendLazy", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lai/grazie/utils/mpp/ExportableSuspendLazy;", "fromExportable", "Lai/grazie/utils/SuspendLazy;", "toExportable", "utils-common"})
/*    */ public final class ExportableSuspendLazyKt {
/*    */   @NotNull
/* 19 */   public static final <T> SuspendLazy<T> fromExportable(@NotNull ExportableSuspendLazy<? extends T> $this$fromExportable) { Intrinsics.checkNotNullParameter($this$fromExportable, "<this>"); return SuspendLazyKt.suspendLazy(new ExportableSuspendLazyKt$fromExportable$1($this$fromExportable, null)); } @DebugMetadata(f = "ExportableSuspendLazy.kt", l = {19}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.mpp.ExportableSuspendLazyKt$fromExportable$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\002\020\000\032\002H\001\"\004\b\000\020\001H@"}, d2 = {"<anonymous>", "T"}) static final class ExportableSuspendLazyKt$fromExportable$1 extends SuspendLambda implements Function1<Continuation<? super T>, Object> { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (CoroutinesKtJVM.invokeAndAwait(this.$this_fromExportable.getGetter(), (Continuation)this) == object) ? object : CoroutinesKtJVM.invokeAndAwait(this.$this_fromExportable.getGetter(), (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     ExportableSuspendLazyKt$fromExportable$1(ExportableSuspendLazy<T> $receiver, Continuation $completion) { super(1, $completion); }
/*    */     public final Continuation<Unit> create(Continuation<? super ExportableSuspendLazyKt$fromExportable$1> $completion) { return (Continuation<Unit>)new ExportableSuspendLazyKt$fromExportable$1(this.$this_fromExportable, $completion); } public final Object invoke(Continuation<?> p1) { return ((ExportableSuspendLazyKt$fromExportable$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*    */    @NotNull
/* 23 */   public static final <T> ExportableSuspendLazy<T> toExportable(@NotNull SuspendLazy $this$toExportable) { Intrinsics.checkNotNullParameter($this$toExportable, "<this>"); return new ExportableSuspendLazyImpl<>(CoroutinesKtCommon.exportSuspending(new ExportableSuspendLazyKt$toExportable$1($this$toExportable))); }
/*    */ 
/*    */   
/*    */   @NotNull
/* 27 */   public static final <T> ExportableSuspendLazy<T> exportableSuspendLazy(@NotNull Function1<? super Continuation<? super T>, ? extends Object> block) { Intrinsics.checkNotNullParameter(block, "block"); return toExportable(SuspendLazyKt.suspendLazy(new ExportableSuspendLazyKt$exportableSuspendLazy$1(block, null))); } @DebugMetadata(f = "ExportableSuspendLazy.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.mpp.ExportableSuspendLazyKt$exportableSuspendLazy$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\002\020\000\032\002H\001\"\004\b\000\020\001H@"}, d2 = {"<anonymous>", "T"}) static final class ExportableSuspendLazyKt$exportableSuspendLazy$1 extends SuspendLambda implements Function1<Continuation<? super T>, Object> { int label; ExportableSuspendLazyKt$exportableSuspendLazy$1(Function1<Continuation<? super T>, Object> $block, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$block.invoke(this) == object) ? object : this.$block.invoke(this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super ExportableSuspendLazyKt$exportableSuspendLazy$1> $completion) { return (Continuation<Unit>)new ExportableSuspendLazyKt$exportableSuspendLazy$1(this.$block, $completion); } public final Object invoke(Continuation<?> p1) {
/*    */       return ((ExportableSuspendLazyKt$exportableSuspendLazy$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */   @NotNull
/*    */   public static final <T> ExportableSuspendLazy<T> exportableLazy(@NotNull Function0 block) {
/* 32 */     Intrinsics.checkNotNullParameter(block, "block"); return exportableSuspendLazy(new ExportableSuspendLazyKt$exportableLazy$1(block));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\ExportableSuspendLazyKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */