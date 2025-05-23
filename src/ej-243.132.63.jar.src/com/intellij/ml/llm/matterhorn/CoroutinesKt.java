/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.util.Disposer;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Job;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"nestedDisposable", "Lcom/intellij/openapi/Disposable;", "Lkotlinx/coroutines/CoroutineScope;", "core"})
/*    */ public final class CoroutinesKt {
/*    */   @NotNull
/* 11 */   public static final Disposable nestedDisposable(@NotNull CoroutineScope $this$nestedDisposable) { Intrinsics.checkNotNullParameter($this$nestedDisposable, "<this>"); Job job = (Job)$this$nestedDisposable.getCoroutineContext().get((CoroutineContext.Key)Job.Key);
/* 12 */     if (!((job != null) ? 1 : 0)) { int $i$a$-require-CoroutinesKt$nestedDisposable$1 = 0; String str = "Found no Job in context: " + 
/* 13 */         $this$nestedDisposable.getCoroutineContext(); throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 15 */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable(), "newDisposable(...)"); Disposable disposable1 = Disposer.newDisposable(), it = disposable1; int $i$a$-also-CoroutinesKt$nestedDisposable$2 = 0;
/* 16 */     Job.DefaultImpls.invokeOnCompletion$default(job, true, false, it::nestedDisposable$lambda$2$lambda$1, 2, null);
/* 17 */     return disposable1; } private static final Unit nestedDisposable$lambda$2$lambda$1(Disposable $it, Throwable paramThrowable) { Disposer.dispose($it);
/* 18 */     return Unit.INSTANCE; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\CoroutinesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */