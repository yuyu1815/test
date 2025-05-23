/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ import com.intellij.openapi.diff.impl.patch.IdeaTextPatchBuilder;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vcs.FilePath;
/*    */ import com.intellij.openapi.vcs.changes.Change;
/*    */ import com.intellij.openapi.vcs.changes.ContentRevision;
/*    */ import com.intellij.openapi.vcs.changes.SimpleContentRevision;
/*    */ import com.intellij.vcsUtil.VcsUtil;
/*    */ import java.nio.file.Paths;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\004\032,\020\000\032\004\030\0010\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH\007\0320\020\n\032\0020\0132\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0072\b\b\002\020\r\032\0020\007H@¢\006\002\020\016¨\006\017"}, d2 = {"getDocumentDiff", "Lcom/intellij/openapi/vcs/changes/Change;", "project", "Lcom/intellij/openapi/project/Project;", "document", "Lcom/intellij/openapi/editor/Document;", "updatedContent", "", "newFileCreated", "", "updateDocument", "", "content", "commandName", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class DocumentUtilKt {
/*    */   @RequiresReadLock
/*    */   @Nullable
/*    */   public static final Change getDocumentDiff(@NotNull Project project, @NotNull Document document, @NotNull String updatedContent, boolean newFileCreated) {
/*    */     String path;
/* 25 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(document, "document"); Intrinsics.checkNotNullParameter(updatedContent, "updatedContent"); if (FileDocumentManager.getInstance().getFile(document) == null || FileDocumentManager.getInstance().getFile(document).getPath() == null) { FileDocumentManager.getInstance().getFile(document).getPath(); return null; }
/* 26 */      Intrinsics.checkNotNullExpressionValue(VcsUtil.getFilePath(path, false), "getFilePath(...)"); FilePath vcsFile = VcsUtil.getFilePath(path, false);
/* 27 */     SimpleContentRevision oldRevision = newFileCreated ? null : new SimpleContentRevision(document.getText(), vcsFile, "old");
/* 28 */     SimpleContentRevision newRevision = new SimpleContentRevision(updatedContent, vcsFile, "new");
/* 29 */     Change change = new Change((ContentRevision)oldRevision, (ContentRevision)newRevision);
/*    */     
/* 31 */     Intrinsics.checkNotNullExpressionValue(IdeaTextPatchBuilder.buildPatch(project, CollectionsKt.listOf(change), Paths.get("/", new String[0]), false), "buildPatch(...)"); List createdPatches = IdeaTextPatchBuilder.buildPatch(project, CollectionsKt.listOf(change), Paths.get("/", new String[0]), false);
/* 32 */     if (createdPatches.isEmpty()) {
/* 33 */       return null;
/*    */     }
/*    */     
/* 36 */     return change;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final Object updateDocument(@NotNull Project project, @NotNull Document document, @NotNull String content, @NotNull String commandName, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/DocumentUtilKt$updateDocument$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/DocumentUtilKt$updateDocument$1
/*    */     //   13: astore #8
/*    */     //   15: aload #8
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #8
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 52
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/DocumentUtilKt$updateDocument$1
/*    */     //   44: dup
/*    */     //   45: aload #4
/*    */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   50: astore #8
/*    */     //   52: aload #8
/*    */     //   54: getfield result : Ljava/lang/Object;
/*    */     //   57: astore #7
/*    */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   62: astore #9
/*    */     //   64: aload #8
/*    */     //   66: getfield label : I
/*    */     //   69: tableswitch default -> 466, 0 -> 104, 1 -> 173, 2 -> 256, 3 -> 338, 4 -> 450
/*    */     //   104: aload #7
/*    */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   109: getstatic com/intellij/history/LocalHistory.Companion : Lcom/intellij/history/LocalHistory$Companion;
/*    */     //   112: invokevirtual getInstance : ()Lcom/intellij/history/LocalHistory;
/*    */     //   115: aload_3
/*    */     //   116: invokestatic getJunieActivityId : ()Lcom/intellij/history/ActivityId;
/*    */     //   119: invokevirtual startAction : (Ljava/lang/String;Lcom/intellij/history/ActivityId;)Lcom/intellij/history/LocalHistoryAction;
/*    */     //   122: astore #5
/*    */     //   124: nop
/*    */     //   125: aload_0
/*    */     //   126: aload_3
/*    */     //   127: aload_1
/*    */     //   128: aload_2
/*    */     //   129: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   134: aload #8
/*    */     //   136: aload #8
/*    */     //   138: aload_0
/*    */     //   139: putfield L$0 : Ljava/lang/Object;
/*    */     //   142: aload #8
/*    */     //   144: aload_1
/*    */     //   145: putfield L$1 : Ljava/lang/Object;
/*    */     //   148: aload #8
/*    */     //   150: aload #5
/*    */     //   152: putfield L$2 : Ljava/lang/Object;
/*    */     //   155: aload #8
/*    */     //   157: iconst_1
/*    */     //   158: putfield label : I
/*    */     //   161: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   164: dup
/*    */     //   165: aload #9
/*    */     //   167: if_acmpne -> 209
/*    */     //   170: aload #9
/*    */     //   172: areturn
/*    */     //   173: aload #8
/*    */     //   175: getfield L$2 : Ljava/lang/Object;
/*    */     //   178: checkcast com/intellij/history/LocalHistoryAction
/*    */     //   181: astore #5
/*    */     //   183: aload #8
/*    */     //   185: getfield L$1 : Ljava/lang/Object;
/*    */     //   188: checkcast com/intellij/openapi/editor/Document
/*    */     //   191: astore_1
/*    */     //   192: aload #8
/*    */     //   194: getfield L$0 : Ljava/lang/Object;
/*    */     //   197: checkcast com/intellij/openapi/project/Project
/*    */     //   200: astore_0
/*    */     //   201: nop
/*    */     //   202: aload #7
/*    */     //   204: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   207: aload #7
/*    */     //   209: pop
/*    */     //   210: aload_0
/*    */     //   211: aload_1
/*    */     //   212: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*    */     //   217: aload #8
/*    */     //   219: aload #8
/*    */     //   221: aload_0
/*    */     //   222: putfield L$0 : Ljava/lang/Object;
/*    */     //   225: aload #8
/*    */     //   227: aload_1
/*    */     //   228: putfield L$1 : Ljava/lang/Object;
/*    */     //   231: aload #8
/*    */     //   233: aload #5
/*    */     //   235: putfield L$2 : Ljava/lang/Object;
/*    */     //   238: aload #8
/*    */     //   240: iconst_2
/*    */     //   241: putfield label : I
/*    */     //   244: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   247: dup
/*    */     //   248: aload #9
/*    */     //   250: if_acmpne -> 292
/*    */     //   253: aload #9
/*    */     //   255: areturn
/*    */     //   256: aload #8
/*    */     //   258: getfield L$2 : Ljava/lang/Object;
/*    */     //   261: checkcast com/intellij/history/LocalHistoryAction
/*    */     //   264: astore #5
/*    */     //   266: aload #8
/*    */     //   268: getfield L$1 : Ljava/lang/Object;
/*    */     //   271: checkcast com/intellij/openapi/editor/Document
/*    */     //   274: astore_1
/*    */     //   275: aload #8
/*    */     //   277: getfield L$0 : Ljava/lang/Object;
/*    */     //   280: checkcast com/intellij/openapi/project/Project
/*    */     //   283: astore_0
/*    */     //   284: nop
/*    */     //   285: aload #7
/*    */     //   287: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   290: aload #7
/*    */     //   292: pop
/*    */     //   293: aload_1
/*    */     //   294: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*    */     //   299: aload #8
/*    */     //   301: aload #8
/*    */     //   303: aload_0
/*    */     //   304: putfield L$0 : Ljava/lang/Object;
/*    */     //   307: aload #8
/*    */     //   309: aload_1
/*    */     //   310: putfield L$1 : Ljava/lang/Object;
/*    */     //   313: aload #8
/*    */     //   315: aload #5
/*    */     //   317: putfield L$2 : Ljava/lang/Object;
/*    */     //   320: aload #8
/*    */     //   322: iconst_3
/*    */     //   323: putfield label : I
/*    */     //   326: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   329: dup
/*    */     //   330: aload #9
/*    */     //   332: if_acmpne -> 374
/*    */     //   335: aload #9
/*    */     //   337: areturn
/*    */     //   338: aload #8
/*    */     //   340: getfield L$2 : Ljava/lang/Object;
/*    */     //   343: checkcast com/intellij/history/LocalHistoryAction
/*    */     //   346: astore #5
/*    */     //   348: aload #8
/*    */     //   350: getfield L$1 : Ljava/lang/Object;
/*    */     //   353: checkcast com/intellij/openapi/editor/Document
/*    */     //   356: astore_1
/*    */     //   357: aload #8
/*    */     //   359: getfield L$0 : Ljava/lang/Object;
/*    */     //   362: checkcast com/intellij/openapi/project/Project
/*    */     //   365: astore_0
/*    */     //   366: nop
/*    */     //   367: aload #7
/*    */     //   369: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   372: aload #7
/*    */     //   374: pop
/*    */     //   375: aload #5
/*    */     //   377: invokeinterface finish : ()V
/*    */     //   382: goto -> 397
/*    */     //   385: astore #6
/*    */     //   387: aload #5
/*    */     //   389: invokeinterface finish : ()V
/*    */     //   394: aload #6
/*    */     //   396: athrow
/*    */     //   397: getstatic com/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils;
/*    */     //   400: aload_0
/*    */     //   401: aload_1
/*    */     //   402: invokevirtual shouldWait : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;)Z
/*    */     //   405: ifeq -> 462
/*    */     //   408: getstatic com/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils;
/*    */     //   411: aload_0
/*    */     //   412: aload #8
/*    */     //   414: aload #8
/*    */     //   416: aconst_null
/*    */     //   417: putfield L$0 : Ljava/lang/Object;
/*    */     //   420: aload #8
/*    */     //   422: aconst_null
/*    */     //   423: putfield L$1 : Ljava/lang/Object;
/*    */     //   426: aload #8
/*    */     //   428: aconst_null
/*    */     //   429: putfield L$2 : Ljava/lang/Object;
/*    */     //   432: aload #8
/*    */     //   434: iconst_4
/*    */     //   435: putfield label : I
/*    */     //   438: invokevirtual awaitProjectUpdate : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   441: dup
/*    */     //   442: aload #9
/*    */     //   444: if_acmpne -> 457
/*    */     //   447: aload #9
/*    */     //   449: areturn
/*    */     //   450: aload #7
/*    */     //   452: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   455: aload #7
/*    */     //   457: pop
/*    */     //   458: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   461: areturn
/*    */     //   462: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   465: areturn
/*    */     //   466: new java/lang/IllegalStateException
/*    */     //   469: dup
/*    */     //   470: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   473: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   476: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 62
/*    */     //   #45	-> 109
/*    */     //   #46	-> 124
/*    */     //   #47	-> 125
/*    */     //   #39	-> 170
/*    */     //   #50	-> 209
/*    */     //   #39	-> 253
/*    */     //   #53	-> 292
/*    */     //   #39	-> 335
/*    */     //   #57	-> 374
/*    */     //   #58	-> 382
/*    */     //   #57	-> 385
/*    */     //   #59	-> 397
/*    */     //   #60	-> 408
/*    */     //   #39	-> 447
/*    */     //   #62	-> 457
/*    */     //   #39	-> 466
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   109	64	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   201	55	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   284	54	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   366	19	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   397	44	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   109	64	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   192	64	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   275	63	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   357	28	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   397	11	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   109	55	2	content	Ljava/lang/String;
/*    */     //   109	55	3	commandName	Ljava/lang/String;
/*    */     //   124	49	5	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*    */     //   183	73	5	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*    */     //   266	72	5	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*    */     //   348	34	5	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*    */     //   385	9	5	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*    */     //   0	477	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   52	414	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   59	407	7	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   124	164	385	finally
/*    */     //   201	247	385	finally
/*    */     //   284	329	385	finally
/*    */     //   366	375	385	finally
/*    */     //   385	387	385	finally
/*    */   }
/*    */ 
/*    */   
/*    */   private static final Unit updateDocument$lambda$0(Document $document, String $content) {
/* 48 */     $document.setText($content);
/* 49 */     return Unit.INSTANCE;
/*    */   } private static final Unit updateDocument$lambda$1(Project $project, Document $document) {
/* 51 */     PsiDocumentManager.getInstance($project).commitDocument($document);
/* 52 */     return Unit.INSTANCE;
/*    */   } private static final Unit updateDocument$lambda$2(Document $document) {
/* 54 */     FileDocumentManager.getInstance().saveDocument($document);
/* 55 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DocumentUtil.kt", l = {47, 50, 53, 60}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"project", "document", "localHistoryAction", "project", "document", "localHistoryAction", "project", "document", "localHistoryAction"}, m = "updateDocument", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.DocumentUtilKt")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class DocumentUtilKt$updateDocument$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     DocumentUtilKt$updateDocument$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return DocumentUtilKt.updateDocument(null, null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\DocumentUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */