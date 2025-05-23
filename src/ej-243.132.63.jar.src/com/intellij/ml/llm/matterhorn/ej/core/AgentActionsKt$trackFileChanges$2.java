/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.AsyncFileListener;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileManager;
/*     */ import com.intellij.openapi.vfs.VirtualFileVisitor;
/*     */ import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
/*     */ import com.intellij.util.ThreeState;
/*     */ import com.intellij.workspaceModel.core.fileIndex.WorkspaceFileIndex;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.Charsets;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AgentActions.kt", l = {376, 378, 384}, i = {0, 0, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"collected", "disposable", "collected", "disposable", "result", "disposable", "result"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentActionsKt$trackFileChanges$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\020\000\032\024\022\n\022\b\022\004\022\0020\0030\002\022\004\022\002H\0040\001\"\004\b\000\020\004*\0020\005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nAgentActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,414:1\n607#2:415\n*S KotlinDebug\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2\n*L\n406#1:415\n*E\n"})
/*     */ final class AgentActionsKt$trackFileChanges$2
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends FileChange>, ? extends T>>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   Object L$1;
/*     */   Object L$2;
/*     */   int label;
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #8
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 347, 0 -> 40, 1 -> 131, 2 -> 199, 3 -> 291
/*     */     //   40: aload_1
/*     */     //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   44: new java/util/concurrent/ConcurrentLinkedQueue
/*     */     //   47: dup
/*     */     //   48: invokespecial <init> : ()V
/*     */     //   51: astore_2
/*     */     //   52: invokestatic getInstance : ()Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */     //   55: dup
/*     */     //   56: ldc 'getInstance(...)'
/*     */     //   58: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   61: astore_3
/*     */     //   62: ldc 'track-file-changes'
/*     */     //   64: invokestatic newDisposable : (Ljava/lang/String;)Lcom/intellij/openapi/Disposable;
/*     */     //   67: dup
/*     */     //   68: ldc 'newDisposable(...)'
/*     */     //   70: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   73: astore #4
/*     */     //   75: invokestatic getInstance : ()Lcom/intellij/openapi/vfs/VirtualFileManager;
/*     */     //   78: new com/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1
/*     */     //   81: dup
/*     */     //   82: aload_3
/*     */     //   83: aload_2
/*     */     //   84: invokespecial <init> : (Lcom/intellij/openapi/fileEditor/FileDocumentManager;Ljava/util/concurrent/ConcurrentLinkedQueue;)V
/*     */     //   87: checkcast com/intellij/openapi/vfs/AsyncFileListener
/*     */     //   90: aload #4
/*     */     //   92: invokevirtual addAsyncFileListener : (Lcom/intellij/openapi/vfs/AsyncFileListener;Lcom/intellij/openapi/Disposable;)V
/*     */     //   95: nop
/*     */     //   96: aload_0
/*     */     //   97: getfield $action : Lkotlin/jvm/functions/Function1;
/*     */     //   100: aload_0
/*     */     //   101: aload_0
/*     */     //   102: aload_2
/*     */     //   103: putfield L$0 : Ljava/lang/Object;
/*     */     //   106: aload_0
/*     */     //   107: aload #4
/*     */     //   109: putfield L$1 : Ljava/lang/Object;
/*     */     //   112: aload_0
/*     */     //   113: iconst_1
/*     */     //   114: putfield label : I
/*     */     //   117: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: aload #8
/*     */     //   125: if_acmpne -> 154
/*     */     //   128: aload #8
/*     */     //   130: areturn
/*     */     //   131: aload_0
/*     */     //   132: getfield L$1 : Ljava/lang/Object;
/*     */     //   135: checkcast com/intellij/openapi/Disposable
/*     */     //   138: astore #4
/*     */     //   140: aload_0
/*     */     //   141: getfield L$0 : Ljava/lang/Object;
/*     */     //   144: checkcast java/util/concurrent/ConcurrentLinkedQueue
/*     */     //   147: astore_2
/*     */     //   148: nop
/*     */     //   149: aload_1
/*     */     //   150: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   153: aload_1
/*     */     //   154: astore #5
/*     */     //   156: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   161: aload_0
/*     */     //   162: checkcast kotlin/coroutines/Continuation
/*     */     //   165: aload_0
/*     */     //   166: aload_2
/*     */     //   167: putfield L$0 : Ljava/lang/Object;
/*     */     //   170: aload_0
/*     */     //   171: aload #4
/*     */     //   173: putfield L$1 : Ljava/lang/Object;
/*     */     //   176: aload_0
/*     */     //   177: aload #5
/*     */     //   179: putfield L$2 : Ljava/lang/Object;
/*     */     //   182: aload_0
/*     */     //   183: iconst_2
/*     */     //   184: putfield label : I
/*     */     //   187: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   190: dup
/*     */     //   191: aload #8
/*     */     //   193: if_acmpne -> 228
/*     */     //   196: aload #8
/*     */     //   198: areturn
/*     */     //   199: aload_0
/*     */     //   200: getfield L$2 : Ljava/lang/Object;
/*     */     //   203: astore #5
/*     */     //   205: aload_0
/*     */     //   206: getfield L$1 : Ljava/lang/Object;
/*     */     //   209: checkcast com/intellij/openapi/Disposable
/*     */     //   212: astore #4
/*     */     //   214: aload_0
/*     */     //   215: getfield L$0 : Ljava/lang/Object;
/*     */     //   218: checkcast java/util/concurrent/ConcurrentLinkedQueue
/*     */     //   221: astore_2
/*     */     //   222: nop
/*     */     //   223: aload_1
/*     */     //   224: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   227: aload_1
/*     */     //   228: pop
/*     */     //   229: getstatic com/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex.Companion : Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex$Companion;
/*     */     //   232: aload_0
/*     */     //   233: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   236: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex;
/*     */     //   239: astore #6
/*     */     //   241: aload_2
/*     */     //   242: aload #6
/*     */     //   244: aload_0
/*     */     //   245: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   248: <illegal opcode> invoke : (Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex;Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*     */     //   253: aload_0
/*     */     //   254: checkcast kotlin/coroutines/Continuation
/*     */     //   257: aload_0
/*     */     //   258: aload #4
/*     */     //   260: putfield L$0 : Ljava/lang/Object;
/*     */     //   263: aload_0
/*     */     //   264: aload #5
/*     */     //   266: putfield L$1 : Ljava/lang/Object;
/*     */     //   269: aload_0
/*     */     //   270: aconst_null
/*     */     //   271: putfield L$2 : Ljava/lang/Object;
/*     */     //   274: aload_0
/*     */     //   275: iconst_3
/*     */     //   276: putfield label : I
/*     */     //   279: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   282: dup
/*     */     //   283: aload #8
/*     */     //   285: if_acmpne -> 312
/*     */     //   288: aload #8
/*     */     //   290: areturn
/*     */     //   291: aload_0
/*     */     //   292: getfield L$1 : Ljava/lang/Object;
/*     */     //   295: astore #5
/*     */     //   297: aload_0
/*     */     //   298: getfield L$0 : Ljava/lang/Object;
/*     */     //   301: checkcast com/intellij/openapi/Disposable
/*     */     //   304: astore #4
/*     */     //   306: nop
/*     */     //   307: aload_1
/*     */     //   308: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   311: aload_1
/*     */     //   312: checkcast java/util/List
/*     */     //   315: astore #7
/*     */     //   317: aload #7
/*     */     //   319: aload #5
/*     */     //   321: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   324: astore #5
/*     */     //   326: aload #4
/*     */     //   328: invokestatic dispose : (Lcom/intellij/openapi/Disposable;)V
/*     */     //   331: goto -> 344
/*     */     //   334: astore #6
/*     */     //   336: aload #4
/*     */     //   338: invokestatic dispose : (Lcom/intellij/openapi/Disposable;)V
/*     */     //   341: aload #6
/*     */     //   343: athrow
/*     */     //   344: aload #5
/*     */     //   346: areturn
/*     */     //   347: new java/lang/IllegalStateException
/*     */     //   350: dup
/*     */     //   351: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   353: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   356: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #288	-> 3
/*     */     //   #290	-> 44
/*     */     //   #291	-> 52
/*     */     //   #293	-> 62
/*     */     //   #295	-> 75
/*     */     //   #296	-> 78
/*     */     //   #372	-> 90
/*     */     //   #295	-> 92
/*     */     //   #375	-> 95
/*     */     //   #376	-> 96
/*     */     //   #288	-> 128
/*     */     //   #378	-> 165
/*     */     //   #288	-> 196
/*     */     //   #382	-> 228
/*     */     //   #384	-> 241
/*     */     //   #288	-> 288
/*     */     //   #410	-> 317
/*     */     //   #412	-> 326
/*     */     //   #413	-> 331
/*     */     //   #412	-> 334
/*     */     //   #413	-> 346
/*     */     //   #288	-> 347
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   52	79	2	collected	Ljava/util/concurrent/ConcurrentLinkedQueue;
/*     */     //   148	51	2	collected	Ljava/util/concurrent/ConcurrentLinkedQueue;
/*     */     //   222	60	2	collected	Ljava/util/concurrent/ConcurrentLinkedQueue;
/*     */     //   62	28	3	docMgr	Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */     //   75	56	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */     //   140	59	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */     //   214	77	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */     //   306	25	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */     //   334	13	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */     //   156	43	5	result	Ljava/lang/Object;
/*     */     //   205	86	5	result	Ljava/lang/Object;
/*     */     //   297	27	5	result	Ljava/lang/Object;
/*     */     //   241	41	6	wsIndex	Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex;
/*     */     //   317	7	7	changes	Ljava/util/List;
/*     */     //   0	357	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2;
/*     */     //   44	303	1	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   95	122	334	finally
/*     */     //   148	190	334	finally
/*     */     //   222	282	334	finally
/*     */     //   306	326	334	finally
/*     */     //   334	336	334	finally
/*     */   }
/*     */   
/*     */   private static final long invokeSuspend$lambda$0() {
/* 379 */     return VirtualFileManager.getInstance().syncRefresh();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final List invokeSuspend$lambda$4(ConcurrentLinkedQueue $collected, WorkspaceFileIndex $wsIndex, Project $project) {
/* 387 */     Sequence sequence = SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence($collected), $wsIndex::invokeSuspend$lambda$4$lambda$1), $project::invokeSuspend$lambda$4$lambda$2);
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
/* 406 */     int $i$f$sortedBy = 0;
/* 407 */     return SequencesKt.toList(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 415 */         SequencesKt.sortedWith(sequence, new AgentActionsKt$trackFileChanges$2$invokeSuspend$lambda$4$$inlined$sortedBy$1()));
/*     */   }
/*     */   
/*     */   private static final boolean invokeSuspend$lambda$4$lambda$1(WorkspaceFileIndex $wsIndex, Raw it) {
/*     */     Intrinsics.checkNotNullExpressionValue(it.getFile().getUrl(), "getUrl(...)");
/*     */     return ($wsIndex.isUrlInContent(it.getFile().getUrl()) != ThreeState.NO);
/*     */   }
/*     */   
/*     */   private static final FileChange invokeSuspend$lambda$4$lambda$2(Project $project, Raw raw) {
/*     */     Raw raw1 = raw;
/*     */     if (raw1 instanceof Raw.Modify) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (raw1 instanceof Raw.Create) ? FileChange.Companion.from($project, ((Raw.Create)raw).getFile(), null, ((Raw.Create)raw).getAfter()) : ((raw1 instanceof Raw.Delete) ? FileChange.Companion.from($project, ((Raw.Delete)raw).getFile(), ((Raw.Delete)raw).getBefore(), null) : (FileChange)"JD-Core does not support Kotlin");
/*     */   }
/*     */   
/*     */   AgentActionsKt$trackFileChanges$2(Function1<Continuation<? super T>, Object> $action, Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super AgentActionsKt$trackFileChanges$2> $completion) {
/*     */     return (Continuation<Unit>)new AgentActionsKt$trackFileChanges$2(this.$action, this.$project, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((AgentActionsKt$trackFileChanges$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentActionsKt$trackFileChanges$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */