/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.util.io.Compressor;
/*     */ import java.io.Closeable;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.ExceptionsKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.io.CloseableKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.JobKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "MatterhornLogsProcessor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CollectMatterhornCachesAction$Companion$packMatterhornLogs$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\n \002*\004\030\0010\0010\001*\0020\003H\n"}, d2 = {"<anonymous>", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class CollectMatterhornCachesAction$Companion$packMatterhornLogs$2
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Path>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   CollectMatterhornCachesAction$Companion$packMatterhornLogs$2(Path $archive, MatterhornCaches $caches, Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     CoroutineScope $this$withContext;
/* 101 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withContext = (CoroutineScope)this.L$0;
/*     */         try {
/* 103 */           Closeable closeable = (Closeable)new Compressor.Zip(this.$archive); MatterhornCaches matterhornCaches = this.$caches; Project project = this.$project; Throwable throwable = null; try { Compressor.Zip zip = (Compressor.Zip)closeable; int $i$a$-use-CollectMatterhornCachesAction$Companion$packMatterhornLogs$2$1 = 0;
/* 104 */             JobKt.ensureActive($this$withContext.getCoroutineContext());
/* 105 */             matterhornCaches.dumpToZip(zip);
/*     */             
/* 107 */             CollectMatterhornCachesAction.Companion.access$packIdeaLogs(CollectMatterhornCachesAction.Companion, zip, project);
/* 108 */             Unit unit = Unit.INSTANCE; } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(closeable, throwable); } 
/* 109 */         } catch (IOException e) {
/*     */           try {
/* 111 */             Files.delete(this.$archive);
/* 112 */           } catch (IOException x) {
/* 113 */             ExceptionsKt.addSuppressed(e, x);
/*     */           } 
/* 115 */           throw e;
/*     */         } 
/* 117 */         return this.$archive; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super CollectMatterhornCachesAction$Companion$packMatterhornLogs$2> $completion) {
/*     */     CollectMatterhornCachesAction$Companion$packMatterhornLogs$2 collectMatterhornCachesAction$Companion$packMatterhornLogs$2 = new CollectMatterhornCachesAction$Companion$packMatterhornLogs$2(this.$archive, this.$caches, this.$project, $completion);
/*     */     collectMatterhornCachesAction$Companion$packMatterhornLogs$2.L$0 = value;
/*     */     return (Continuation<Unit>)collectMatterhornCachesAction$Companion$packMatterhornLogs$2;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((CollectMatterhornCachesAction$Companion$packMatterhornLogs$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CollectMatterhornCachesAction$Companion$packMatterhornLogs$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */