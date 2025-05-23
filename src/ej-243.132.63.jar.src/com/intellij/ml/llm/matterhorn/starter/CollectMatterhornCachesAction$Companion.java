/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import com.intellij.ide.logsUploader.LogProvider;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.util.concurrency.annotations.RequiresBackgroundThread;
/*     */ import com.intellij.util.io.Compressor;
/*     */ import java.io.Closeable;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Iterator;
/*     */ import kotlin.ExceptionsKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.io.CloseableKt;
/*     */ import kotlin.io.path.PathsKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.JobKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH@¢\006\002\020\rJ\030\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\t\032\0020\nH\002R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion;", "", "<init>", "()V", "CONFIRMATION_DIALOG", "", "NOTIFICATION_GROUP", "packMatterhornLogs", "Ljava/nio/file/Path;", "project", "Lcom/intellij/openapi/project/Project;", "caches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "packIdeaLogs", "", "zip", "Lcom/intellij/util/io/Compressor$Zip;", "matterhorn"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornLogsProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornLogsProcessor.kt\ncom/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1863#2:151\n1863#2,2:152\n1864#2:154\n*S KotlinDebug\n*F\n+ 1 MatterhornLogsProcessor.kt\ncom/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion\n*L\n124#1:151\n133#1:152,2\n124#1:154\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @RequiresBackgroundThread
/*     */   @Nullable
/*     */   public final Object packMatterhornLogs(@NotNull Project project, @NotNull MatterhornCaches caches, @NotNull Continuation $completion) throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion$packMatterhornLogs$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion$packMatterhornLogs$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion$packMatterhornLogs$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 187, 0 -> 88, 1 -> 173
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new java/text/SimpleDateFormat
/*     */     //   96: dup
/*     */     //   97: ldc 'yyyyMMdd-HHmmss'
/*     */     //   99: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   102: new java/util/Date
/*     */     //   105: dup
/*     */     //   106: invokespecial <init> : ()V
/*     */     //   109: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
/*     */     //   112: astore #4
/*     */     //   114: aload #4
/*     */     //   116: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   121: ldc '.zip'
/*     */     //   123: iconst_0
/*     */     //   124: anewarray java/nio/file/attribute/FileAttribute
/*     */     //   127: invokestatic createTempFile : (Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
/*     */     //   130: astore #5
/*     */     //   132: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   135: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   138: new com/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$Companion$packMatterhornLogs$2
/*     */     //   141: dup
/*     */     //   142: aload #5
/*     */     //   144: aload_2
/*     */     //   145: aload_1
/*     */     //   146: aconst_null
/*     */     //   147: invokespecial <init> : (Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */     //   150: checkcast kotlin/jvm/functions/Function2
/*     */     //   153: aload #7
/*     */     //   155: aload #7
/*     */     //   157: iconst_1
/*     */     //   158: putfield label : I
/*     */     //   161: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   164: dup
/*     */     //   165: aload #8
/*     */     //   167: if_acmpne -> 180
/*     */     //   170: aload #8
/*     */     //   172: areturn
/*     */     //   173: aload #6
/*     */     //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   178: aload #6
/*     */     //   180: dup
/*     */     //   181: ldc 'withContext(...)'
/*     */     //   183: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   186: areturn
/*     */     //   187: new java/lang/IllegalStateException
/*     */     //   190: dup
/*     */     //   191: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   193: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   196: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #94	-> 60
/*     */     //   #98	-> 93
/*     */     //   #99	-> 114
/*     */     //   #101	-> 132
/*     */     //   #94	-> 170
/*     */     //   #101	-> 180
/*     */     //   #94	-> 187
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	71	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   93	71	2	caches	Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */     //   114	18	4	date	Ljava/lang/String;
/*     */     //   132	32	5	archive	Ljava/nio/file/Path;
/*     */     //   0	197	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	137	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	130	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornLogsProcessor.kt", l = {101}, i = {}, s = {}, n = {}, m = "packMatterhornLogs", c = "com.intellij.ml.llm.matterhorn.starter.CollectMatterhornCachesAction$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CollectMatterhornCachesAction$Companion$packMatterhornLogs$1
/*     */     extends ContinuationImpl
/*     */   {
/*     */     int label;
/*     */     
/*     */     CollectMatterhornCachesAction$Companion$packMatterhornLogs$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CollectMatterhornCachesAction.Companion.this.packMatterhornLogs(null, null, (Continuation<? super Path>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornLogsProcessor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CollectMatterhornCachesAction$Companion$packMatterhornLogs$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\n \002*\004\030\0010\0010\001*\0020\003H\n"}, d2 = {"<anonymous>", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class CollectMatterhornCachesAction$Companion$packMatterhornLogs$2
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Path>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     CollectMatterhornCachesAction$Companion$packMatterhornLogs$2(Path $archive, MatterhornCaches $caches, Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super CollectMatterhornCachesAction$Companion$packMatterhornLogs$2> $completion) {
/*     */       CollectMatterhornCachesAction$Companion$packMatterhornLogs$2 collectMatterhornCachesAction$Companion$packMatterhornLogs$2 = new CollectMatterhornCachesAction$Companion$packMatterhornLogs$2(this.$archive, this.$caches, this.$project, $completion);
/*     */       collectMatterhornCachesAction$Companion$packMatterhornLogs$2.L$0 = value;
/*     */       return (Continuation<Unit>)collectMatterhornCachesAction$Companion$packMatterhornLogs$2;
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       CoroutineScope $this$withContext;
/* 101 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withContext = (CoroutineScope)this.L$0;
/*     */           try {
/* 103 */             Closeable closeable = (Closeable)new Compressor.Zip(this.$archive); MatterhornCaches matterhornCaches = this.$caches; Project project = this.$project; Throwable throwable = null; try { Compressor.Zip zip = (Compressor.Zip)closeable; int $i$a$-use-CollectMatterhornCachesAction$Companion$packMatterhornLogs$2$1 = 0;
/* 104 */               JobKt.ensureActive($this$withContext.getCoroutineContext());
/* 105 */               matterhornCaches.dumpToZip(zip);
/*     */               
/* 107 */               CollectMatterhornCachesAction.Companion.packIdeaLogs(zip, project);
/* 108 */               Unit unit = Unit.INSTANCE; } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(closeable, throwable); } 
/* 109 */           } catch (IOException e) {
/*     */             try {
/* 111 */               Files.delete(this.$archive);
/* 112 */             } catch (IOException x) {
/* 113 */               ExceptionsKt.addSuppressed(e, x);
/*     */             } 
/* 115 */             throw e;
/*     */           } 
/* 117 */           return this.$archive; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((CollectMatterhornCachesAction$Companion$packMatterhornLogs$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } } private final void packIdeaLogs(Compressor.Zip zip, Project project) {
/*     */     Iterator iterator;
/* 123 */     if ((LogProvider)CollectionsKt.firstOrNull(LogProvider.Companion.getEP().getExtensionList()) != null) { LogProvider logProvider = (LogProvider)CollectionsKt.firstOrNull(LogProvider.Companion.getEP().getExtensionList()); int $i$a$-let-CollectMatterhornCachesAction$Companion$packIdeaLogs$1 = 0;
/* 124 */       Iterable $this$forEach$iv = logProvider.getAdditionalLogFiles(project); int $i$f$forEach = 0;
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
/* 151 */       iterator = $this$forEach$iv.iterator(); } else { (LogProvider)CollectionsKt.firstOrNull(LogProvider.Companion.getEP().getExtensionList()); return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); LogProvider.LogsEntry entry = (LogProvider.LogsEntry)element$iv; int $i$a$-forEach-CollectMatterhornCachesAction$Companion$packIdeaLogs$1$1 = 0;
/*     */       Iterator iterator1 = entry.getFiles().iterator(); }
/*     */   
/*     */   }
/*     */   
/*     */   private static final boolean packIdeaLogs$lambda$4$lambda$3$lambda$0(String paramString, Path file) {
/*     */     PathsKt.getName(file);
/*     */     return (file != null && PathsKt.getName(file) != null) ? (!StringsKt.startsWith$default(PathsKt.getName(file), "open-telemetry-", false, 2, null)) : false;
/*     */   }
/*     */   
/*     */   private static final boolean packIdeaLogs$lambda$4$lambda$3$lambda$1(Function2 $tmp0, Object p0, Object p1) {
/*     */     return ((Boolean)$tmp0.invoke(p0, p1)).booleanValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CollectMatterhornCachesAction$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */