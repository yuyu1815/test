/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ import com.intellij.diff.comparison.ComparisonManager;
/*     */ import com.intellij.diff.comparison.ComparisonPolicy;
/*     */ import com.intellij.diff.fragments.LineFragment;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistory;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.LinesBlock;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.PrintBlock;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Error;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.progress.EmptyProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\t\n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\"\020\017\032\b\022\004\022\0020\0210\0202\b\020\022\032\004\030\0010\0232\b\020\024\032\004\030\0010\023H\007JF\020\025\032\0020\0262\006\020\027\032\0020\0232\006\020\030\032\0020\0232\f\020\031\032\b\022\004\022\0020\0210\0202\f\020\032\032\b\022\004\022\0020\0330\0202\n\b\002\020\034\032\004\030\0010\035H@¢\006\002\020\036J0\020\037\032\0020\0262\006\020\027\032\0020\0232\f\020\031\032\b\022\004\022\0020\0210\0202\n\b\002\020\034\032\004\030\0010\035H@¢\006\002\020 J\026\020!\032\0020\"2\006\020#\032\0020\023H@¢\006\002\020$J(\020%\032\b\022\004\022\0020&0\020*\b\022\004\022\0020'0\0202\006\020(\032\0020)2\006\020*\032\0020\005H\002J\030\020+\032\0020\0052\006\020,\032\0020\0052\006\020-\032\0020\005H\002J2\020.\032\b\022\004\022\0020'0\0202\f\020/\032\b\022\004\022\0020'0\0202\f\0200\032\b\022\004\022\0020'0\0202\006\020*\032\0020\005H\002J0\0201\032\b\022\004\022\0020\0260\020*\b\022\004\022\0020\0330\0202\006\0202\032\002032\006\020#\032\0020\023H@¢\006\004\b4\0205J\031\0206\032\0020)*\0020\0262\006\0207\032\0020\"H\000¢\006\002\b8R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000R\016\020\n\032\0020\005XT¢\006\002\n\000R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016¨\0069"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;", "", "<init>", "()V", "MAX_SHOWN_FILE_ERRORS", "", "CODE_BLOCK_WINDOW_TOP_MARGIN", "CODE_BLOCK_WINDOW_BOTTOM_MARGIN", "CODE_BLOCK_WINDOW_MARGIN", "CODE_BLOCK_ERROR_MARGIN", "CODE_MERGE_BLOCKS_THRESHOLD", "extendedErrorPattern", "Lkotlin/text/Regex;", "getExtendedErrorPattern", "()Lkotlin/text/Regex;", "getCodeChanges", "", "Lcom/intellij/diff/fragments/LineFragment;", "documentBefore", "Lcom/intellij/openapi/editor/Document;", "documentAfter", "getCodeChangesAfter", "", "originalDocument", "changedDocument", "changes", "errors", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "agentSessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "(Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCodeChangesBefore", "(Lcom/intellij/openapi/editor/Document;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileFromDocumentUnsafe", "Lcom/intellij/openapi/vfs/VirtualFile;", "document", "(Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlockLines", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LinesBlock;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;", "isErrorBlock", "", "fileLinesCount", "getSafeLine", "line", "fileLines", "getPrintBlocks", "codeChangesBlocks", "errorBlocks", "toErrorMessages", "project", "Lcom/intellij/openapi/project/Project;", "toErrorMessages$ej_core", "(Ljava/util/List;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isExtendedErrorBlock", "file", "isExtendedErrorBlock$ej_core", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCodeEditUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeEditUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1#2:172\n1557#3:173\n1628#3,3:174\n1557#3:177\n1628#3,3:178\n1557#3:181\n1628#3,3:182\n1557#3:185\n1628#3,3:186\n*S KotlinDebug\n*F\n+ 1 CodeEditUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils\n*L\n70#1:173\n70#1:174,3\n94#1:177\n94#1:178,3\n155#1:181\n155#1:182,3\n161#1:185\n161#1:186,3\n*E\n"})
/*     */ public final class CodeEditUtils {
/*     */   @NotNull
/*  33 */   public static final CodeEditUtils INSTANCE = new CodeEditUtils(); public static final int MAX_SHOWN_FILE_ERRORS = 10; public static final int CODE_BLOCK_WINDOW_TOP_MARGIN = 5; public static final int CODE_BLOCK_WINDOW_BOTTOM_MARGIN = 5; public static final int CODE_BLOCK_WINDOW_MARGIN = 10; public static final int CODE_BLOCK_ERROR_MARGIN = 5; public static final int CODE_MERGE_BLOCKS_THRESHOLD = 20; @NotNull private static final Regex extendedErrorPattern = new Regex("indent|finally"); @NotNull public final Regex getExtendedErrorPattern() { return extendedErrorPattern; }
/*     */    @RequiresReadLock
/*     */   @NotNull
/*     */   public final List<LineFragment> getCodeChanges(@Nullable Document documentBefore, @Nullable Document documentAfter) {
/*  37 */     if (documentBefore == null || documentAfter == null) return CollectionsKt.emptyList(); 
/*  38 */     Intrinsics.checkNotNullExpressionValue(ComparisonManager.getInstance(), "getInstance(...)"); ComparisonManager comparisonManager = ComparisonManager.getInstance();
/*  39 */     Intrinsics.checkNotNullExpressionValue(comparisonManager.compareLines(
/*  40 */           documentBefore.getCharsSequence(), 
/*  41 */           documentAfter.getCharsSequence(), 
/*  42 */           ComparisonPolicy.DEFAULT, 
/*  43 */           (ProgressIndicator)new EmptyProgressIndicator()), "compareLines(...)"); return comparisonManager.compareLines(documentBefore.getCharsSequence(), documentAfter.getCharsSequence(), ComparisonPolicy.DEFAULT, (ProgressIndicator)new EmptyProgressIndicator());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object getCodeChangesAfter(@NotNull Document originalDocument, @NotNull Document changedDocument, @NotNull List changes, @NotNull List errors, @Nullable AgentSessionHistory agentSessionHistory, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$getCodeChangesAfter$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$getCodeChangesAfter$1
/*     */     //   13: astore #21
/*     */     //   15: aload #21
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #21
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$getCodeChangesAfter$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #21
/*     */     //   53: aload #21
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #20
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #22
/*     */     //   65: aload #21
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 436, 0 -> 92, 1 -> 151
/*     */     //   92: aload #20
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: aload #21
/*     */     //   101: aload #21
/*     */     //   103: aload_0
/*     */     //   104: putfield L$0 : Ljava/lang/Object;
/*     */     //   107: aload #21
/*     */     //   109: aload_2
/*     */     //   110: putfield L$1 : Ljava/lang/Object;
/*     */     //   113: aload #21
/*     */     //   115: aload_3
/*     */     //   116: putfield L$2 : Ljava/lang/Object;
/*     */     //   119: aload #21
/*     */     //   121: aload #4
/*     */     //   123: putfield L$3 : Ljava/lang/Object;
/*     */     //   126: aload #21
/*     */     //   128: aload #5
/*     */     //   130: putfield L$4 : Ljava/lang/Object;
/*     */     //   133: aload #21
/*     */     //   135: iconst_1
/*     */     //   136: putfield label : I
/*     */     //   139: invokevirtual getFileFromDocumentUnsafe : (Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   142: dup
/*     */     //   143: aload #22
/*     */     //   145: if_acmpne -> 205
/*     */     //   148: aload #22
/*     */     //   150: areturn
/*     */     //   151: aload #21
/*     */     //   153: getfield L$4 : Ljava/lang/Object;
/*     */     //   156: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory
/*     */     //   159: astore #5
/*     */     //   161: aload #21
/*     */     //   163: getfield L$3 : Ljava/lang/Object;
/*     */     //   166: checkcast java/util/List
/*     */     //   169: astore #4
/*     */     //   171: aload #21
/*     */     //   173: getfield L$2 : Ljava/lang/Object;
/*     */     //   176: checkcast java/util/List
/*     */     //   179: astore_3
/*     */     //   180: aload #21
/*     */     //   182: getfield L$1 : Ljava/lang/Object;
/*     */     //   185: checkcast com/intellij/openapi/editor/Document
/*     */     //   188: astore_2
/*     */     //   189: aload #21
/*     */     //   191: getfield L$0 : Ljava/lang/Object;
/*     */     //   194: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils
/*     */     //   197: astore_0
/*     */     //   198: aload #20
/*     */     //   200: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   203: aload #20
/*     */     //   205: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   208: astore #9
/*     */     //   210: iconst_0
/*     */     //   211: istore #10
/*     */     //   213: aload #9
/*     */     //   215: invokestatic originalFile : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   218: dup
/*     */     //   219: ifnonnull -> 225
/*     */     //   222: pop
/*     */     //   223: aload #9
/*     */     //   225: nop
/*     */     //   226: astore #7
/*     */     //   228: aload #4
/*     */     //   230: checkcast java/lang/Iterable
/*     */     //   233: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*     */     //   236: aload_2
/*     */     //   237: aload #7
/*     */     //   239: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function1;
/*     */     //   244: invokestatic map : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   247: invokestatic distinct : (Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
/*     */     //   250: bipush #10
/*     */     //   252: invokestatic take : (Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;
/*     */     //   255: invokestatic toList : (Lkotlin/sequences/Sequence;)Ljava/util/List;
/*     */     //   258: astore #8
/*     */     //   260: aload_3
/*     */     //   261: checkcast java/lang/Iterable
/*     */     //   264: astore #10
/*     */     //   266: iconst_0
/*     */     //   267: istore #11
/*     */     //   269: aload #10
/*     */     //   271: astore #12
/*     */     //   273: new java/util/ArrayList
/*     */     //   276: dup
/*     */     //   277: aload #10
/*     */     //   279: bipush #10
/*     */     //   281: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   284: invokespecial <init> : (I)V
/*     */     //   287: checkcast java/util/Collection
/*     */     //   290: astore #13
/*     */     //   292: iconst_0
/*     */     //   293: istore #14
/*     */     //   295: aload #12
/*     */     //   297: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   302: astore #15
/*     */     //   304: aload #15
/*     */     //   306: invokeinterface hasNext : ()Z
/*     */     //   311: ifeq -> 386
/*     */     //   314: aload #15
/*     */     //   316: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   321: astore #16
/*     */     //   323: aload #13
/*     */     //   325: aload #16
/*     */     //   327: checkcast com/intellij/diff/fragments/LineFragment
/*     */     //   330: astore #17
/*     */     //   332: astore #19
/*     */     //   334: iconst_0
/*     */     //   335: istore #18
/*     */     //   337: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */     //   340: dup
/*     */     //   341: aload #17
/*     */     //   343: invokeinterface getStartLine2 : ()I
/*     */     //   348: iconst_1
/*     */     //   349: iadd
/*     */     //   350: aload #17
/*     */     //   352: invokeinterface getEndLine2 : ()I
/*     */     //   357: aload #17
/*     */     //   359: invokeinterface getStartLine2 : ()I
/*     */     //   364: isub
/*     */     //   365: iconst_0
/*     */     //   366: iconst_0
/*     */     //   367: iconst_0
/*     */     //   368: bipush #28
/*     */     //   370: aconst_null
/*     */     //   371: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   374: aload #19
/*     */     //   376: swap
/*     */     //   377: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   382: pop
/*     */     //   383: goto -> 304
/*     */     //   386: aload #13
/*     */     //   388: checkcast java/util/List
/*     */     //   391: nop
/*     */     //   392: astore #9
/*     */     //   394: aload_0
/*     */     //   395: aload #9
/*     */     //   397: aload #8
/*     */     //   399: aload_2
/*     */     //   400: invokeinterface getLineCount : ()I
/*     */     //   405: invokespecial getPrintBlocks : (Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
/*     */     //   408: astore #10
/*     */     //   410: aload #7
/*     */     //   412: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   415: dup
/*     */     //   416: ldc 'toNioPath(...)'
/*     */     //   418: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   421: aload_2
/*     */     //   422: aload #10
/*     */     //   424: aconst_null
/*     */     //   425: bipush #20
/*     */     //   427: aload #5
/*     */     //   429: bipush #8
/*     */     //   431: aconst_null
/*     */     //   432: invokestatic printScreen$default : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   435: areturn
/*     */     //   436: new java/lang/IllegalStateException
/*     */     //   439: dup
/*     */     //   440: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   442: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   445: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 63
/*     */     //   #54	-> 97
/*     */     //   #47	-> 148
/*     */     //   #172	-> 210
/*     */     //   #54	-> 213
/*     */     //   #54	-> 225
/*     */     //   #54	-> 226
/*     */     //   #57	-> 228
/*     */     //   #69	-> 247
/*     */     //   #56	-> 258
/*     */     //   #70	-> 260
/*     */     //   #173	-> 269
/*     */     //   #174	-> 295
/*     */     //   #175	-> 323
/*     */     //   #70	-> 337
/*     */     //   #175	-> 377
/*     */     //   #176	-> 386
/*     */     //   #173	-> 391
/*     */     //   #70	-> 392
/*     */     //   #72	-> 394
/*     */     //   #73	-> 395
/*     */     //   #74	-> 397
/*     */     //   #75	-> 399
/*     */     //   #72	-> 405
/*     */     //   #79	-> 410
/*     */     //   #80	-> 421
/*     */     //   #81	-> 422
/*     */     //   #78	-> 424
/*     */     //   #82	-> 425
/*     */     //   #83	-> 427
/*     */     //   #78	-> 429
/*     */     //   #47	-> 436
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	54	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   198	27	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   225	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   226	210	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   97	45	1	originalDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   97	54	2	changedDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   189	36	2	changedDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   225	1	2	changedDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   226	210	2	changedDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   97	54	3	changes	Ljava/util/List;
/*     */     //   180	45	3	changes	Ljava/util/List;
/*     */     //   225	1	3	changes	Ljava/util/List;
/*     */     //   226	40	3	changes	Ljava/util/List;
/*     */     //   97	54	4	errors	Ljava/util/List;
/*     */     //   171	54	4	errors	Ljava/util/List;
/*     */     //   225	1	4	errors	Ljava/util/List;
/*     */     //   226	21	4	errors	Ljava/util/List;
/*     */     //   97	54	5	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   161	64	5	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   225	1	5	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   226	210	5	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   228	208	7	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   260	176	8	errorBlocks	Ljava/util/List;
/*     */     //   210	12	9	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   222	3	9	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   394	42	9	changesBlocks	Ljava/util/List;
/*     */     //   266	26	10	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   410	26	10	codeBlocks	Ljava/util/List;
/*     */     //   292	12	12	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   292	96	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   323	60	16	item$iv$iv	Ljava/lang/Object;
/*     */     //   334	40	17	it	Lcom/intellij/diff/fragments/LineFragment;
/*     */     //   213	12	10	$i$a$-let-CodeEditUtils$getCodeChangesAfter$file$1	I
/*     */     //   337	37	18	$i$a$-map-CodeEditUtils$getCodeChangesAfter$changesBlocks$1	I
/*     */     //   295	93	14	$i$f$mapTo	I
/*     */     //   269	123	11	$i$f$map	I
/*     */     //   0	446	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	383	21	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	376	20	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final PrintBlock getCodeChangesAfter$lambda$1(Document $changedDocument, VirtualFile $file, Error it) {
/*  58 */     Intrinsics.checkNotNullParameter(it, "it"); int startLine = it.getStartLineOneBasedIndex($changedDocument);
/*  59 */     boolean isExtended = INSTANCE.isExtendedErrorBlock$ej_core(it.getText(), $file);
/*  60 */     int bottomMargin = 
/*  61 */       (isExtended == true) ? 50 : 
/*  62 */       0;
/*     */     
/*  64 */     int topMargin = 
/*  65 */       (isExtended == true) ? 20 : 
/*  66 */       0;
/*     */     
/*  68 */     return new PrintBlock(startLine, 1, topMargin, bottomMargin, 0, 16, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object getCodeChangesBefore(@NotNull Document originalDocument, @NotNull List changes, @Nullable AgentSessionHistory agentSessionHistory, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$getCodeChangesBefore$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$getCodeChangesBefore$1
/*     */     //   13: astore #18
/*     */     //   15: aload #18
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #18
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$getCodeChangesBefore$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #18
/*     */     //   53: aload #18
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #17
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #19
/*     */     //   65: aload #18
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 385, 0 -> 92, 1 -> 143
/*     */     //   92: aload #17
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: aload #18
/*     */     //   101: aload #18
/*     */     //   103: aload_0
/*     */     //   104: putfield L$0 : Ljava/lang/Object;
/*     */     //   107: aload #18
/*     */     //   109: aload_1
/*     */     //   110: putfield L$1 : Ljava/lang/Object;
/*     */     //   113: aload #18
/*     */     //   115: aload_2
/*     */     //   116: putfield L$2 : Ljava/lang/Object;
/*     */     //   119: aload #18
/*     */     //   121: aload_3
/*     */     //   122: putfield L$3 : Ljava/lang/Object;
/*     */     //   125: aload #18
/*     */     //   127: iconst_1
/*     */     //   128: putfield label : I
/*     */     //   131: invokevirtual getFileFromDocumentUnsafe : (Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   134: dup
/*     */     //   135: aload #19
/*     */     //   137: if_acmpne -> 186
/*     */     //   140: aload #19
/*     */     //   142: areturn
/*     */     //   143: aload #18
/*     */     //   145: getfield L$3 : Ljava/lang/Object;
/*     */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory
/*     */     //   151: astore_3
/*     */     //   152: aload #18
/*     */     //   154: getfield L$2 : Ljava/lang/Object;
/*     */     //   157: checkcast java/util/List
/*     */     //   160: astore_2
/*     */     //   161: aload #18
/*     */     //   163: getfield L$1 : Ljava/lang/Object;
/*     */     //   166: checkcast com/intellij/openapi/editor/Document
/*     */     //   169: astore_1
/*     */     //   170: aload #18
/*     */     //   172: getfield L$0 : Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils
/*     */     //   178: astore_0
/*     */     //   179: aload #17
/*     */     //   181: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   184: aload #17
/*     */     //   186: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   189: astore #7
/*     */     //   191: iconst_0
/*     */     //   192: istore #8
/*     */     //   194: aload #7
/*     */     //   196: invokestatic originalFile : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   199: dup
/*     */     //   200: ifnonnull -> 206
/*     */     //   203: pop
/*     */     //   204: aload #7
/*     */     //   206: nop
/*     */     //   207: astore #5
/*     */     //   209: aload_2
/*     */     //   210: checkcast java/lang/Iterable
/*     */     //   213: astore #7
/*     */     //   215: iconst_0
/*     */     //   216: istore #8
/*     */     //   218: aload #7
/*     */     //   220: astore #9
/*     */     //   222: new java/util/ArrayList
/*     */     //   225: dup
/*     */     //   226: aload #7
/*     */     //   228: bipush #10
/*     */     //   230: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   233: invokespecial <init> : (I)V
/*     */     //   236: checkcast java/util/Collection
/*     */     //   239: astore #10
/*     */     //   241: iconst_0
/*     */     //   242: istore #11
/*     */     //   244: aload #9
/*     */     //   246: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   251: astore #12
/*     */     //   253: aload #12
/*     */     //   255: invokeinterface hasNext : ()Z
/*     */     //   260: ifeq -> 335
/*     */     //   263: aload #12
/*     */     //   265: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   270: astore #13
/*     */     //   272: aload #10
/*     */     //   274: aload #13
/*     */     //   276: checkcast com/intellij/diff/fragments/LineFragment
/*     */     //   279: astore #14
/*     */     //   281: astore #16
/*     */     //   283: iconst_0
/*     */     //   284: istore #15
/*     */     //   286: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */     //   289: dup
/*     */     //   290: aload #14
/*     */     //   292: invokeinterface getStartLine1 : ()I
/*     */     //   297: iconst_1
/*     */     //   298: iadd
/*     */     //   299: aload #14
/*     */     //   301: invokeinterface getEndLine1 : ()I
/*     */     //   306: aload #14
/*     */     //   308: invokeinterface getStartLine1 : ()I
/*     */     //   313: isub
/*     */     //   314: iconst_0
/*     */     //   315: iconst_0
/*     */     //   316: iconst_0
/*     */     //   317: bipush #28
/*     */     //   319: aconst_null
/*     */     //   320: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   323: aload #16
/*     */     //   325: swap
/*     */     //   326: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   331: pop
/*     */     //   332: goto -> 253
/*     */     //   335: aload #10
/*     */     //   337: checkcast java/util/List
/*     */     //   340: nop
/*     */     //   341: astore #6
/*     */     //   343: aload_0
/*     */     //   344: aload #6
/*     */     //   346: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   349: aload_1
/*     */     //   350: invokeinterface getLineCount : ()I
/*     */     //   355: invokespecial getPrintBlocks : (Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
/*     */     //   358: astore #7
/*     */     //   360: aload #5
/*     */     //   362: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   365: dup
/*     */     //   366: ldc 'toNioPath(...)'
/*     */     //   368: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   371: aload_1
/*     */     //   372: aload #7
/*     */     //   374: aconst_null
/*     */     //   375: bipush #20
/*     */     //   377: aload_3
/*     */     //   378: bipush #8
/*     */     //   380: aconst_null
/*     */     //   381: invokestatic printScreen$default : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   384: areturn
/*     */     //   385: new java/lang/IllegalStateException
/*     */     //   388: dup
/*     */     //   389: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   391: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   394: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 63
/*     */     //   #92	-> 97
/*     */     //   #87	-> 140
/*     */     //   #172	-> 191
/*     */     //   #92	-> 194
/*     */     //   #92	-> 206
/*     */     //   #92	-> 207
/*     */     //   #94	-> 209
/*     */     //   #177	-> 218
/*     */     //   #178	-> 244
/*     */     //   #179	-> 272
/*     */     //   #94	-> 286
/*     */     //   #179	-> 326
/*     */     //   #180	-> 335
/*     */     //   #177	-> 340
/*     */     //   #94	-> 341
/*     */     //   #96	-> 343
/*     */     //   #97	-> 344
/*     */     //   #98	-> 346
/*     */     //   #99	-> 349
/*     */     //   #96	-> 355
/*     */     //   #103	-> 360
/*     */     //   #104	-> 371
/*     */     //   #105	-> 372
/*     */     //   #102	-> 374
/*     */     //   #106	-> 375
/*     */     //   #107	-> 377
/*     */     //   #102	-> 378
/*     */     //   #87	-> 385
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   179	27	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   206	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   207	178	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   97	46	1	originalDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   170	36	1	originalDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   206	1	1	originalDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   207	178	1	originalDocument	Lcom/intellij/openapi/editor/Document;
/*     */     //   97	46	2	changes	Ljava/util/List;
/*     */     //   161	45	2	changes	Ljava/util/List;
/*     */     //   206	1	2	changes	Ljava/util/List;
/*     */     //   207	8	2	changes	Ljava/util/List;
/*     */     //   97	46	3	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   152	54	3	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   206	1	3	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   207	178	3	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   209	176	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   343	42	6	changesBlocks	Ljava/util/List;
/*     */     //   191	12	7	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   203	3	7	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   215	26	7	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   360	25	7	codeBlocks	Ljava/util/List;
/*     */     //   241	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   241	96	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   272	60	13	item$iv$iv	Ljava/lang/Object;
/*     */     //   283	40	14	it	Lcom/intellij/diff/fragments/LineFragment;
/*     */     //   194	12	8	$i$a$-let-CodeEditUtils$getCodeChangesBefore$file$1	I
/*     */     //   286	37	15	$i$a$-map-CodeEditUtils$getCodeChangesBefore$changesBlocks$1	I
/*     */     //   244	93	11	$i$f$mapTo	I
/*     */     //   218	123	8	$i$f$map	I
/*     */     //   0	395	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	332	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	325	17	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object getFileFromDocumentUnsafe(@NotNull Document document, @NotNull Continuation $completion) {
/* 112 */     return CoroutinesKt.readAction(document::getFileFromDocumentUnsafe$lambda$5, $completion); } private static final VirtualFile getFileFromDocumentUnsafe$lambda$5(Document $document) {
/* 113 */     Intrinsics.checkNotNull(FileDocumentManager.getInstance().getFile($document)); return FileDocumentManager.getInstance().getFile($document);
/*     */   }
/*     */ 
/*     */   
/*     */   private final List<LinesBlock> getBlockLines(List $this$getBlockLines, boolean isErrorBlock, int fileLinesCount) {
/* 118 */     List<LinesBlock> result = new ArrayList();
/* 119 */     for (PrintBlock block : $this$getBlockLines) {
/*     */       
/* 121 */       int i = block.getTopMargin();
/* 122 */       boolean bool1 = isErrorBlock;
/*     */       
/* 124 */       if (!bool1) { boolean bool = Intrinsics.areEqual(block, CollectionsKt.first($this$getBlockLines));
/*     */         
/* 126 */         if (!bool) {  }
/*     */         else { throw new NoWhenBranchMatchedException(); }
/*     */          }
/*     */       else { throw new NoWhenBranchMatchedException(); }
/* 130 */        bool1 = (bool1 == true) ? true : "JD-Core does not support Kotlin"; int topMargin = Math.max(i, bool1); i = (topMargin >= 0) ? 1 : 0; if (_Assertions.ENABLED && i == 0) { String str = "Assertion failed"; throw new AssertionError(str); }
/*     */       
/* 132 */       int j = block.getBottomMargin();
/* 133 */       boolean bool2 = isErrorBlock;
/*     */       
/* 135 */       if (!bool2) { boolean bool = Intrinsics.areEqual(block, CollectionsKt.last($this$getBlockLines));
/*     */         
/* 137 */         if (!bool) {  }
/*     */         else { throw new NoWhenBranchMatchedException(); }
/*     */          }
/*     */       else { throw new NoWhenBranchMatchedException(); }
/* 141 */        bool2 = (bool2 == true) ? true : "JD-Core does not support Kotlin"; int bottomMargin = Math.max(j, bool2); j = (bottomMargin >= 0) ? 1 : 0; if (_Assertions.ENABLED && j == 0) { String str = "Assertion failed"; throw new AssertionError(str); }
/* 142 */        result.add(new LinesBlock(getSafeLine(block.getStartLine() - topMargin, fileLinesCount), getSafeLine(block.getStartLine() + Math.max(0, block.getWindow() - 1) + bottomMargin, fileLinesCount)));
/*     */     } 
/* 144 */     return result;
/*     */   }
/*     */   private final int getSafeLine(int line, int fileLines) {
/* 147 */     return Math.min(Math.max(1, line), fileLines);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final List<PrintBlock> getPrintBlocks(List<PrintBlock> codeChangesBlocks, List<PrintBlock> errorBlocks, int fileLinesCount) {
/* 153 */     List list1 = CollectionsKt.plus(getBlockLines(codeChangesBlocks, false, fileLinesCount), 
/* 154 */         getBlockLines(errorBlocks, true, fileLinesCount));
/* 155 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     List list2 = list1; Collection<PrintBlock> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 182 */     for (Object item$iv$iv : list2) {
/* 183 */       LinesBlock linesBlock = (LinesBlock)item$iv$iv; Collection<PrintBlock> collection = destination$iv$iv; int $i$a$-map-CodeEditUtils$getPrintBlocks$1 = 0; collection.add(new PrintBlock(linesBlock.getFromLine(), linesBlock.getUntilLine() - linesBlock.getFromLine(), 0, 0, 0, 28, null));
/* 184 */     }  return (List<PrintBlock>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object toErrorMessages$ej_core(@NotNull List $this$toErrorMessages, @NotNull Project project, @NotNull Document document, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$toErrorMessages$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$toErrorMessages$1
/*     */     //   13: astore #19
/*     */     //   15: aload #19
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #19
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils$toErrorMessages$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #19
/*     */     //   53: aload #19
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #18
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #20
/*     */     //   65: aload #19
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 378, 0 -> 92, 1 -> 136
/*     */     //   92: aload #18
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_2
/*     */     //   98: aload_3
/*     */     //   99: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*     */     //   104: aload #19
/*     */     //   106: aload #19
/*     */     //   108: aload_1
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #19
/*     */     //   114: aload_2
/*     */     //   115: putfield L$1 : Ljava/lang/Object;
/*     */     //   118: aload #19
/*     */     //   120: iconst_1
/*     */     //   121: putfield label : I
/*     */     //   124: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   127: dup
/*     */     //   128: aload #20
/*     */     //   130: if_acmpne -> 161
/*     */     //   133: aload #20
/*     */     //   135: areturn
/*     */     //   136: aload #19
/*     */     //   138: getfield L$1 : Ljava/lang/Object;
/*     */     //   141: checkcast com/intellij/openapi/project/Project
/*     */     //   144: astore_2
/*     */     //   145: aload #19
/*     */     //   147: getfield L$0 : Ljava/lang/Object;
/*     */     //   150: checkcast java/util/List
/*     */     //   153: astore_1
/*     */     //   154: aload #18
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #18
/*     */     //   161: checkcast com/intellij/psi/PsiFile
/*     */     //   164: astore #5
/*     */     //   166: aload_2
/*     */     //   167: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   170: dup
/*     */     //   171: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   174: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   177: aload #5
/*     */     //   179: invokeinterface getOriginalFile : ()Lcom/intellij/psi/PsiFile;
/*     */     //   184: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   189: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   192: invokeinterface relativize : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*     */     //   197: astore #6
/*     */     //   199: aload_1
/*     */     //   200: checkcast java/lang/Iterable
/*     */     //   203: astore #7
/*     */     //   205: iconst_0
/*     */     //   206: istore #8
/*     */     //   208: aload #7
/*     */     //   210: astore #9
/*     */     //   212: new java/util/ArrayList
/*     */     //   215: dup
/*     */     //   216: aload #7
/*     */     //   218: bipush #10
/*     */     //   220: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   223: invokespecial <init> : (I)V
/*     */     //   226: checkcast java/util/Collection
/*     */     //   229: astore #10
/*     */     //   231: iconst_0
/*     */     //   232: istore #11
/*     */     //   234: aload #9
/*     */     //   236: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   241: astore #12
/*     */     //   243: aload #12
/*     */     //   245: invokeinterface hasNext : ()Z
/*     */     //   250: ifeq -> 371
/*     */     //   253: aload #12
/*     */     //   255: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   260: astore #13
/*     */     //   262: aload #10
/*     */     //   264: aload #13
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error
/*     */     //   269: astore #14
/*     */     //   271: astore #17
/*     */     //   273: iconst_0
/*     */     //   274: istore #15
/*     */     //   276: aload #14
/*     */     //   278: astore #16
/*     */     //   280: aload #16
/*     */     //   282: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError
/*     */     //   285: ifeq -> 319
/*     */     //   288: aload #6
/*     */     //   290: aload #14
/*     */     //   292: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError
/*     */     //   295: invokevirtual getLine : ()I
/*     */     //   298: aload #14
/*     */     //   300: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError
/*     */     //   303: invokevirtual getColumn : ()I
/*     */     //   306: aload #14
/*     */     //   308: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   311: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;IILjava/lang/String;)Ljava/lang/String;
/*     */     //   316: goto -> 358
/*     */     //   319: aload #16
/*     */     //   321: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError
/*     */     //   324: ifeq -> 350
/*     */     //   327: aload #6
/*     */     //   329: aload #14
/*     */     //   331: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError
/*     */     //   334: invokevirtual getOffset : ()I
/*     */     //   337: aload #14
/*     */     //   339: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   342: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;ILjava/lang/String;)Ljava/lang/String;
/*     */     //   347: goto -> 358
/*     */     //   350: new kotlin/NoWhenBranchMatchedException
/*     */     //   353: dup
/*     */     //   354: invokespecial <init> : ()V
/*     */     //   357: athrow
/*     */     //   358: nop
/*     */     //   359: aload #17
/*     */     //   361: swap
/*     */     //   362: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   367: pop
/*     */     //   368: goto -> 243
/*     */     //   371: aload #10
/*     */     //   373: checkcast java/util/List
/*     */     //   376: nop
/*     */     //   377: areturn
/*     */     //   378: new java/lang/IllegalStateException
/*     */     //   381: dup
/*     */     //   382: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   384: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   387: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 63
/*     */     //   #158	-> 97
/*     */     //   #157	-> 133
/*     */     //   #160	-> 166
/*     */     //   #161	-> 199
/*     */     //   #185	-> 208
/*     */     //   #186	-> 234
/*     */     //   #187	-> 262
/*     */     //   #162	-> 276
/*     */     //   #163	-> 280
/*     */     //   #164	-> 319
/*     */     //   #162	-> 350
/*     */     //   #165	-> 358
/*     */     //   #187	-> 362
/*     */     //   #188	-> 371
/*     */     //   #185	-> 376
/*     */     //   #161	-> 377
/*     */     //   #157	-> 378
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	39	1	$this$toErrorMessages	Ljava/util/List;
/*     */     //   154	51	1	$this$toErrorMessages	Ljava/util/List;
/*     */     //   97	39	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   145	54	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   97	30	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   166	33	5	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   199	151	6	fileRelativePath	Ljava/nio/file/Path;
/*     */     //   358	20	6	fileRelativePath	Ljava/nio/file/Path;
/*     */     //   205	26	7	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   231	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   231	119	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   358	15	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   262	11	13	item$iv$iv	Ljava/lang/Object;
/*     */     //   273	46	14	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;
/*     */     //   319	31	14	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;
/*     */     //   276	83	15	$i$a$-map-CodeEditUtils$toErrorMessages$2	I
/*     */     //   234	139	11	$i$f$mapTo	I
/*     */     //   208	169	8	$i$f$map	I
/*     */     //   0	388	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	325	19	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	318	18	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final PsiFile toErrorMessages$lambda$7(Project $project, Document $document) {
/*     */     if (PsiDocumentManager.getInstance($project).getPsiFile($document) == null) {
/*     */       PsiDocumentManager.getInstance($project).getPsiFile($document);
/*     */       throw new IllegalStateException("PSI file is expected to present if document is already obtained".toString());
/*     */     } 
/*     */     return PsiDocumentManager.getInstance($project).getPsiFile($document);
/*     */   }
/*     */   
/*     */   public final boolean isExtendedErrorBlock$ej_core(@NotNull String $this$isExtendedErrorBlock, @NotNull VirtualFile file) {
/*     */     Intrinsics.checkNotNullParameter($this$isExtendedErrorBlock, "<this>");
/*     */     Intrinsics.checkNotNullParameter(file, "file");
/*     */     if (Intrinsics.areEqual(file.getExtension(), "py")) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$isExtendedErrorBlock.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */       String str = $this$isExtendedErrorBlock.toLowerCase(Locale.ROOT);
/*     */       if (extendedErrorPattern.containsMatchIn(str));
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CodeEditUtils.kt", l = {54}, i = {0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"this", "changedDocument", "changes", "errors", "agentSessionHistory"}, m = "getCodeChangesAfter", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.CodeEditUtils")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CodeEditUtils$getCodeChangesAfter$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     CodeEditUtils$getCodeChangesAfter$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CodeEditUtils.this.getCodeChangesAfter(null, null, null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CodeEditUtils.kt", l = {92}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "originalDocument", "changes", "agentSessionHistory"}, m = "getCodeChangesBefore", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.CodeEditUtils")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CodeEditUtils$getCodeChangesBefore$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     CodeEditUtils$getCodeChangesBefore$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CodeEditUtils.this.getCodeChangesBefore(null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CodeEditUtils.kt", l = {158}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$toErrorMessages", "project"}, m = "toErrorMessages$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.CodeEditUtils")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CodeEditUtils$toErrorMessages$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     CodeEditUtils$toErrorMessages$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CodeEditUtils.this.toErrorMessages$ej_core(null, null, null, (Continuation<? super List<String>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\CodeEditUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */