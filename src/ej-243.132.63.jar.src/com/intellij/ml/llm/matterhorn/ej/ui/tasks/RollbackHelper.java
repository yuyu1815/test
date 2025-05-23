/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\"\020\006\032\020\022\004\022\0020\b\022\006\022\004\030\0010\t0\0072\f\020\n\032\b\022\004\022\0020\f0\013J,\020\r\032\0020\0162\006\020\017\032\0020\0202\024\020\021\032\020\022\004\022\0020\b\022\006\022\004\030\0010\t0\007H@¢\006\002\020\022R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "computeRollbackState", "", "Ljava/nio/file/Path;", "", "steps", "Lkotlin/sequences/Sequence;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "applyFilesState", "", "project", "Lcom/intellij/openapi/project/Project;", "fileContents", "(Lcom/intellij/openapi/project/Project;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nRollback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rollback.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,71:1\n14#2:72\n*S KotlinDebug\n*F\n+ 1 Rollback.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper\n*L\n17#1:72\n*E\n"})
/*    */ public final class RollbackHelper {
/*    */   @NotNull
/* 17 */   public static final RollbackHelper INSTANCE = new RollbackHelper(); public static final int $stable = 8; static { int $i$f$logger = 0;
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
/* 72 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(RollbackHelper.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(RollbackHelper.class);
/*    */   
/*    */   @NotNull
/*    */   public final Map<Path, String> computeRollbackState(@NotNull Sequence steps) {
/*    */     Intrinsics.checkNotNullParameter(steps, "steps");
/*    */     HashMap<Object, Object> pathToInitialState = new HashMap<>();
/*    */     for (StepEntity stepEntity : steps) {
/*    */       List changes = stepEntity.getChanges();
/*    */       for (FileChange change : changes) {
/*    */         if (!pathToInitialState.containsKey(change.getPath()))
/*    */           pathToInitialState.put(change.getPath(), change.getInitialContent()); 
/*    */       } 
/*    */     } 
/*    */     return (Map)pathToInitialState;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object applyFilesState(@NotNull Project project, @NotNull Map fileContents, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper$applyFilesState$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper$applyFilesState$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper$applyFilesState$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 891, 0 -> 104, 1 -> 311, 2 -> 435, 3 -> 590, 4 -> 706, 5 -> 824
/*    */     //   104: aload #11
/*    */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   109: aload_1
/*    */     //   110: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   113: dup
/*    */     //   114: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   117: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*    */     //   120: dup
/*    */     //   121: ldc 'toNioPath(...)'
/*    */     //   123: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   126: astore #4
/*    */     //   128: aload_2
/*    */     //   129: invokeinterface entrySet : ()Ljava/util/Set;
/*    */     //   134: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   139: astore #5
/*    */     //   141: aload #5
/*    */     //   143: invokeinterface hasNext : ()Z
/*    */     //   148: ifeq -> 887
/*    */     //   151: aload #5
/*    */     //   153: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   158: checkcast java/util/Map$Entry
/*    */     //   161: astore #6
/*    */     //   163: aload #6
/*    */     //   165: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   170: checkcast java/nio/file/Path
/*    */     //   173: astore #7
/*    */     //   175: aload #6
/*    */     //   177: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   182: checkcast java/lang/String
/*    */     //   185: astore #8
/*    */     //   187: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   190: aload #7
/*    */     //   192: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   197: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   200: aload #4
/*    */     //   202: aload #7
/*    */     //   204: invokeinterface resolve : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*    */     //   209: iconst_1
/*    */     //   210: invokestatic findFile : (Ljava/nio/file/Path;Z)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   213: astore #9
/*    */     //   215: aload #9
/*    */     //   217: ifnonnull -> 236
/*    */     //   220: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   223: aload #7
/*    */     //   225: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   230: invokevirtual warn : (Ljava/lang/String;)V
/*    */     //   233: goto -> 141
/*    */     //   236: aload #8
/*    */     //   238: ifnonnull -> 374
/*    */     //   241: aload_1
/*    */     //   242: ldc 'command.revert.file.name'
/*    */     //   244: iconst_0
/*    */     //   245: anewarray java/lang/Object
/*    */     //   248: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   251: aload #9
/*    */     //   253: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*    */     //   258: aload #12
/*    */     //   260: aload #12
/*    */     //   262: aload_1
/*    */     //   263: putfield L$0 : Ljava/lang/Object;
/*    */     //   266: aload #12
/*    */     //   268: aload #4
/*    */     //   270: putfield L$1 : Ljava/lang/Object;
/*    */     //   273: aload #12
/*    */     //   275: aload #5
/*    */     //   277: putfield L$2 : Ljava/lang/Object;
/*    */     //   280: aload #12
/*    */     //   282: aload #7
/*    */     //   284: putfield L$3 : Ljava/lang/Object;
/*    */     //   287: aload #12
/*    */     //   289: aconst_null
/*    */     //   290: putfield L$4 : Ljava/lang/Object;
/*    */     //   293: aload #12
/*    */     //   295: iconst_1
/*    */     //   296: putfield label : I
/*    */     //   299: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   302: dup
/*    */     //   303: aload #13
/*    */     //   305: if_acmpne -> 357
/*    */     //   308: aload #13
/*    */     //   310: areturn
/*    */     //   311: aload #12
/*    */     //   313: getfield L$3 : Ljava/lang/Object;
/*    */     //   316: checkcast java/nio/file/Path
/*    */     //   319: astore #7
/*    */     //   321: aload #12
/*    */     //   323: getfield L$2 : Ljava/lang/Object;
/*    */     //   326: checkcast java/util/Iterator
/*    */     //   329: astore #5
/*    */     //   331: aload #12
/*    */     //   333: getfield L$1 : Ljava/lang/Object;
/*    */     //   336: checkcast java/nio/file/Path
/*    */     //   339: astore #4
/*    */     //   341: aload #12
/*    */     //   343: getfield L$0 : Ljava/lang/Object;
/*    */     //   346: checkcast com/intellij/openapi/project/Project
/*    */     //   349: astore_1
/*    */     //   350: aload #11
/*    */     //   352: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   355: aload #11
/*    */     //   357: pop
/*    */     //   358: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   361: aload #7
/*    */     //   363: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   368: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   371: goto -> 141
/*    */     //   374: aload #9
/*    */     //   376: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*    */     //   381: aload #12
/*    */     //   383: aload #12
/*    */     //   385: aload_1
/*    */     //   386: putfield L$0 : Ljava/lang/Object;
/*    */     //   389: aload #12
/*    */     //   391: aload #4
/*    */     //   393: putfield L$1 : Ljava/lang/Object;
/*    */     //   396: aload #12
/*    */     //   398: aload #5
/*    */     //   400: putfield L$2 : Ljava/lang/Object;
/*    */     //   403: aload #12
/*    */     //   405: aload #7
/*    */     //   407: putfield L$3 : Ljava/lang/Object;
/*    */     //   410: aload #12
/*    */     //   412: aload #8
/*    */     //   414: putfield L$4 : Ljava/lang/Object;
/*    */     //   417: aload #12
/*    */     //   419: iconst_2
/*    */     //   420: putfield label : I
/*    */     //   423: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   426: dup
/*    */     //   427: aload #13
/*    */     //   429: if_acmpne -> 491
/*    */     //   432: aload #13
/*    */     //   434: areturn
/*    */     //   435: aload #12
/*    */     //   437: getfield L$4 : Ljava/lang/Object;
/*    */     //   440: checkcast java/lang/String
/*    */     //   443: astore #8
/*    */     //   445: aload #12
/*    */     //   447: getfield L$3 : Ljava/lang/Object;
/*    */     //   450: checkcast java/nio/file/Path
/*    */     //   453: astore #7
/*    */     //   455: aload #12
/*    */     //   457: getfield L$2 : Ljava/lang/Object;
/*    */     //   460: checkcast java/util/Iterator
/*    */     //   463: astore #5
/*    */     //   465: aload #12
/*    */     //   467: getfield L$1 : Ljava/lang/Object;
/*    */     //   470: checkcast java/nio/file/Path
/*    */     //   473: astore #4
/*    */     //   475: aload #12
/*    */     //   477: getfield L$0 : Ljava/lang/Object;
/*    */     //   480: checkcast com/intellij/openapi/project/Project
/*    */     //   483: astore_1
/*    */     //   484: aload #11
/*    */     //   486: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   489: aload #11
/*    */     //   491: checkcast com/intellij/openapi/editor/Document
/*    */     //   494: astore #10
/*    */     //   496: aload #10
/*    */     //   498: ifnonnull -> 517
/*    */     //   501: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   504: aload #7
/*    */     //   506: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   511: invokevirtual warn : (Ljava/lang/String;)V
/*    */     //   514: goto -> 141
/*    */     //   517: aload_1
/*    */     //   518: ldc 'command.revert.file.name'
/*    */     //   520: iconst_0
/*    */     //   521: anewarray java/lang/Object
/*    */     //   524: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   527: aload #10
/*    */     //   529: aload #8
/*    */     //   531: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   536: aload #12
/*    */     //   538: aload #12
/*    */     //   540: aload_1
/*    */     //   541: putfield L$0 : Ljava/lang/Object;
/*    */     //   544: aload #12
/*    */     //   546: aload #4
/*    */     //   548: putfield L$1 : Ljava/lang/Object;
/*    */     //   551: aload #12
/*    */     //   553: aload #5
/*    */     //   555: putfield L$2 : Ljava/lang/Object;
/*    */     //   558: aload #12
/*    */     //   560: aload #7
/*    */     //   562: putfield L$3 : Ljava/lang/Object;
/*    */     //   565: aload #12
/*    */     //   567: aload #10
/*    */     //   569: putfield L$4 : Ljava/lang/Object;
/*    */     //   572: aload #12
/*    */     //   574: iconst_3
/*    */     //   575: putfield label : I
/*    */     //   578: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   581: dup
/*    */     //   582: aload #13
/*    */     //   584: if_acmpne -> 646
/*    */     //   587: aload #13
/*    */     //   589: areturn
/*    */     //   590: aload #12
/*    */     //   592: getfield L$4 : Ljava/lang/Object;
/*    */     //   595: checkcast com/intellij/openapi/editor/Document
/*    */     //   598: astore #10
/*    */     //   600: aload #12
/*    */     //   602: getfield L$3 : Ljava/lang/Object;
/*    */     //   605: checkcast java/nio/file/Path
/*    */     //   608: astore #7
/*    */     //   610: aload #12
/*    */     //   612: getfield L$2 : Ljava/lang/Object;
/*    */     //   615: checkcast java/util/Iterator
/*    */     //   618: astore #5
/*    */     //   620: aload #12
/*    */     //   622: getfield L$1 : Ljava/lang/Object;
/*    */     //   625: checkcast java/nio/file/Path
/*    */     //   628: astore #4
/*    */     //   630: aload #12
/*    */     //   632: getfield L$0 : Ljava/lang/Object;
/*    */     //   635: checkcast com/intellij/openapi/project/Project
/*    */     //   638: astore_1
/*    */     //   639: aload #11
/*    */     //   641: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   644: aload #11
/*    */     //   646: pop
/*    */     //   647: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*    */     //   652: aload #12
/*    */     //   654: aload #12
/*    */     //   656: aload_1
/*    */     //   657: putfield L$0 : Ljava/lang/Object;
/*    */     //   660: aload #12
/*    */     //   662: aload #4
/*    */     //   664: putfield L$1 : Ljava/lang/Object;
/*    */     //   667: aload #12
/*    */     //   669: aload #5
/*    */     //   671: putfield L$2 : Ljava/lang/Object;
/*    */     //   674: aload #12
/*    */     //   676: aload #7
/*    */     //   678: putfield L$3 : Ljava/lang/Object;
/*    */     //   681: aload #12
/*    */     //   683: aload #10
/*    */     //   685: putfield L$4 : Ljava/lang/Object;
/*    */     //   688: aload #12
/*    */     //   690: iconst_4
/*    */     //   691: putfield label : I
/*    */     //   694: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   697: dup
/*    */     //   698: aload #13
/*    */     //   700: if_acmpne -> 762
/*    */     //   703: aload #13
/*    */     //   705: areturn
/*    */     //   706: aload #12
/*    */     //   708: getfield L$4 : Ljava/lang/Object;
/*    */     //   711: checkcast com/intellij/openapi/editor/Document
/*    */     //   714: astore #10
/*    */     //   716: aload #12
/*    */     //   718: getfield L$3 : Ljava/lang/Object;
/*    */     //   721: checkcast java/nio/file/Path
/*    */     //   724: astore #7
/*    */     //   726: aload #12
/*    */     //   728: getfield L$2 : Ljava/lang/Object;
/*    */     //   731: checkcast java/util/Iterator
/*    */     //   734: astore #5
/*    */     //   736: aload #12
/*    */     //   738: getfield L$1 : Ljava/lang/Object;
/*    */     //   741: checkcast java/nio/file/Path
/*    */     //   744: astore #4
/*    */     //   746: aload #12
/*    */     //   748: getfield L$0 : Ljava/lang/Object;
/*    */     //   751: checkcast com/intellij/openapi/project/Project
/*    */     //   754: astore_1
/*    */     //   755: aload #11
/*    */     //   757: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   760: aload #11
/*    */     //   762: pop
/*    */     //   763: aload_1
/*    */     //   764: aload #10
/*    */     //   766: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*    */     //   771: aload #12
/*    */     //   773: aload #12
/*    */     //   775: aload_1
/*    */     //   776: putfield L$0 : Ljava/lang/Object;
/*    */     //   779: aload #12
/*    */     //   781: aload #4
/*    */     //   783: putfield L$1 : Ljava/lang/Object;
/*    */     //   786: aload #12
/*    */     //   788: aload #5
/*    */     //   790: putfield L$2 : Ljava/lang/Object;
/*    */     //   793: aload #12
/*    */     //   795: aload #7
/*    */     //   797: putfield L$3 : Ljava/lang/Object;
/*    */     //   800: aload #12
/*    */     //   802: aconst_null
/*    */     //   803: putfield L$4 : Ljava/lang/Object;
/*    */     //   806: aload #12
/*    */     //   808: iconst_5
/*    */     //   809: putfield label : I
/*    */     //   812: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   815: dup
/*    */     //   816: aload #13
/*    */     //   818: if_acmpne -> 870
/*    */     //   821: aload #13
/*    */     //   823: areturn
/*    */     //   824: aload #12
/*    */     //   826: getfield L$3 : Ljava/lang/Object;
/*    */     //   829: checkcast java/nio/file/Path
/*    */     //   832: astore #7
/*    */     //   834: aload #12
/*    */     //   836: getfield L$2 : Ljava/lang/Object;
/*    */     //   839: checkcast java/util/Iterator
/*    */     //   842: astore #5
/*    */     //   844: aload #12
/*    */     //   846: getfield L$1 : Ljava/lang/Object;
/*    */     //   849: checkcast java/nio/file/Path
/*    */     //   852: astore #4
/*    */     //   854: aload #12
/*    */     //   856: getfield L$0 : Ljava/lang/Object;
/*    */     //   859: checkcast com/intellij/openapi/project/Project
/*    */     //   862: astore_1
/*    */     //   863: aload #11
/*    */     //   865: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   868: aload #11
/*    */     //   870: pop
/*    */     //   871: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/RollbackHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   874: aload #7
/*    */     //   876: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   881: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   884: goto -> 141
/*    */     //   887: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   890: areturn
/*    */     //   891: new java/lang/IllegalStateException
/*    */     //   894: dup
/*    */     //   895: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   898: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   901: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 60
/*    */     //   #33	-> 109
/*    */     //   #35	-> 128
/*    */     //   #35	-> 139
/*    */     //   #35	-> 170
/*    */     //   #35	-> 182
/*    */     //   #36	-> 187
/*    */     //   #37	-> 200
/*    */     //   #38	-> 215
/*    */     //   #39	-> 220
/*    */     //   #40	-> 233
/*    */     //   #42	-> 236
/*    */     //   #43	-> 241
/*    */     //   #32	-> 308
/*    */     //   #46	-> 357
/*    */     //   #47	-> 371
/*    */     //   #49	-> 374
/*    */     //   #32	-> 432
/*    */     //   #52	-> 496
/*    */     //   #53	-> 501
/*    */     //   #54	-> 514
/*    */     //   #56	-> 517
/*    */     //   #32	-> 587
/*    */     //   #60	-> 646
/*    */     //   #32	-> 703
/*    */     //   #63	-> 762
/*    */     //   #32	-> 821
/*    */     //   #66	-> 870
/*    */     //   #68	-> 887
/*    */     //   #32	-> 891
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   109	30	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   139	172	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   350	85	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   484	106	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   639	67	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   755	69	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   863	28	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   109	30	2	fileContents	Ljava/util/Map;
/*    */     //   128	11	4	projectPath	Ljava/nio/file/Path;
/*    */     //   139	172	4	projectPath	Ljava/nio/file/Path;
/*    */     //   341	94	4	projectPath	Ljava/nio/file/Path;
/*    */     //   475	115	4	projectPath	Ljava/nio/file/Path;
/*    */     //   630	76	4	projectPath	Ljava/nio/file/Path;
/*    */     //   746	78	4	projectPath	Ljava/nio/file/Path;
/*    */     //   854	37	4	projectPath	Ljava/nio/file/Path;
/*    */     //   175	136	7	path	Ljava/nio/file/Path;
/*    */     //   321	114	7	path	Ljava/nio/file/Path;
/*    */     //   455	135	7	path	Ljava/nio/file/Path;
/*    */     //   610	96	7	path	Ljava/nio/file/Path;
/*    */     //   726	98	7	path	Ljava/nio/file/Path;
/*    */     //   834	50	7	path	Ljava/nio/file/Path;
/*    */     //   187	33	8	initialContent	Ljava/lang/String;
/*    */     //   236	5	8	initialContent	Ljava/lang/String;
/*    */     //   374	61	8	initialContent	Ljava/lang/String;
/*    */     //   445	56	8	initialContent	Ljava/lang/String;
/*    */     //   517	64	8	initialContent	Ljava/lang/String;
/*    */     //   215	5	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   236	66	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   374	52	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   496	94	10	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   600	106	10	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   716	99	10	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   0	902	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	841	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	834	11	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit applyFilesState$lambda$0(VirtualFile $file) {
/*    */     $file.delete(INSTANCE);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Document applyFilesState$lambda$1(VirtualFile $file) {
/*    */     return FileDocumentManager.getInstance().getDocument($file);
/*    */   }
/*    */   
/*    */   private static final Unit applyFilesState$lambda$2(Document $document, String $initialContent) {
/*    */     $document.setText($initialContent);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit applyFilesState$lambda$3() {
/*    */     FileDocumentManager.getInstance().saveAllDocuments();
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit applyFilesState$lambda$4(Project $project, Document $document) {
/*    */     PsiDocumentManager.getInstance($project).commitDocument($document);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "Rollback.kt", l = {43, 49, 56, 60, 63}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3"}, n = {"project", "projectPath", "path", "project", "projectPath", "path", "initialContent", "project", "projectPath", "path", "document", "project", "projectPath", "path", "document", "project", "projectPath", "path"}, m = "applyFilesState", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.RollbackHelper")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RollbackHelper$applyFilesState$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     int label;
/*    */     
/*    */     RollbackHelper$applyFilesState$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return RollbackHelper.this.applyFilesState(null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\RollbackHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */