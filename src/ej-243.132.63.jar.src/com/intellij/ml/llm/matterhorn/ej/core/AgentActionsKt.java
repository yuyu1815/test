/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest;
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
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\032\032\020\002\032\0020\003*\0020\0042\f\020\005\032\b\022\004\022\0020\0070\006H\000\032L\020\b\032\024\022\n\022\b\022\004\022\0020\n0\006\022\004\022\002H\0130\t\"\004\b\000\020\0132\006\020\f\032\0020\r2\034\020\016\032\030\b\001\022\n\022\b\022\004\022\002H\0130\020\022\006\022\004\030\0010\0210\017H@¢\006\002\020\022\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\023"}, d2 = {"OUTPUT_FILE_NAME", "", "toTerminalRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;", "availableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "trackFileChanges", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "T", "project", "Lcom/intellij/openapi/project/Project;", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n1557#2:415\n1628#2,3:416\n1557#2:419\n1628#2,3:420\n1755#2,3:423\n*S KotlinDebug\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt\n*L\n246#1:415\n246#1:416,3\n248#1:419\n248#1:420,3\n251#1:423,3\n*E\n"})
/*     */ public final class AgentActionsKt
/*     */ {
/*     */   @NotNull
/*     */   public static final String OUTPUT_FILE_NAME = ".output.txt";
/*     */   
/*     */   @NotNull
/*     */   public static final TerminalCommandRequest toTerminalRequest(@NotNull SimpleActionRequest $this$toTerminalRequest, @NotNull List availableActions) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'availableActions'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   16: ldc 'cd'
/*     */     //   18: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   21: ifeq -> 573
/*     */     //   24: aload_0
/*     */     //   25: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   28: checkcast java/lang/CharSequence
/*     */     //   31: ldc '&&'
/*     */     //   33: checkcast java/lang/CharSequence
/*     */     //   36: iconst_0
/*     */     //   37: iconst_2
/*     */     //   38: aconst_null
/*     */     //   39: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   42: ifne -> 63
/*     */     //   45: aload_0
/*     */     //   46: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   49: checkcast java/lang/CharSequence
/*     */     //   52: bipush #10
/*     */     //   54: iconst_0
/*     */     //   55: iconst_2
/*     */     //   56: aconst_null
/*     */     //   57: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */     //   60: ifeq -> 573
/*     */     //   63: aload_1
/*     */     //   64: checkcast java/lang/Iterable
/*     */     //   67: astore_3
/*     */     //   68: iconst_0
/*     */     //   69: istore #4
/*     */     //   71: aload_3
/*     */     //   72: astore #5
/*     */     //   74: new java/util/ArrayList
/*     */     //   77: dup
/*     */     //   78: aload_3
/*     */     //   79: bipush #10
/*     */     //   81: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   84: invokespecial <init> : (I)V
/*     */     //   87: checkcast java/util/Collection
/*     */     //   90: astore #6
/*     */     //   92: iconst_0
/*     */     //   93: istore #7
/*     */     //   95: aload #5
/*     */     //   97: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   102: astore #8
/*     */     //   104: aload #8
/*     */     //   106: invokeinterface hasNext : ()Z
/*     */     //   111: ifeq -> 156
/*     */     //   114: aload #8
/*     */     //   116: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   121: astore #9
/*     */     //   123: aload #6
/*     */     //   125: aload #9
/*     */     //   127: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   130: astore #10
/*     */     //   132: astore #15
/*     */     //   134: iconst_0
/*     */     //   135: istore #11
/*     */     //   137: aload #10
/*     */     //   139: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   144: aload #15
/*     */     //   146: swap
/*     */     //   147: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   152: pop
/*     */     //   153: goto -> 104
/*     */     //   156: aload #6
/*     */     //   158: checkcast java/util/List
/*     */     //   161: nop
/*     */     //   162: checkcast java/lang/Iterable
/*     */     //   165: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   168: astore_2
/*     */     //   169: aload_0
/*     */     //   170: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   173: checkcast java/lang/CharSequence
/*     */     //   176: ldc '&&'
/*     */     //   178: checkcast java/lang/CharSequence
/*     */     //   181: iconst_0
/*     */     //   182: iconst_2
/*     */     //   183: aconst_null
/*     */     //   184: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   187: ifeq -> 222
/*     */     //   190: aload_0
/*     */     //   191: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   194: checkcast java/lang/CharSequence
/*     */     //   197: iconst_1
/*     */     //   198: anewarray java/lang/String
/*     */     //   201: astore #4
/*     */     //   203: aload #4
/*     */     //   205: iconst_0
/*     */     //   206: ldc '&&'
/*     */     //   208: aastore
/*     */     //   209: aload #4
/*     */     //   211: iconst_0
/*     */     //   212: iconst_0
/*     */     //   213: bipush #6
/*     */     //   215: aconst_null
/*     */     //   216: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   219: goto -> 250
/*     */     //   222: aload_0
/*     */     //   223: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   226: checkcast java/lang/CharSequence
/*     */     //   229: iconst_1
/*     */     //   230: newarray char
/*     */     //   232: astore #4
/*     */     //   234: aload #4
/*     */     //   236: iconst_0
/*     */     //   237: bipush #10
/*     */     //   239: castore
/*     */     //   240: aload #4
/*     */     //   242: iconst_0
/*     */     //   243: iconst_0
/*     */     //   244: bipush #6
/*     */     //   246: aconst_null
/*     */     //   247: invokestatic split$default : (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   250: astore_3
/*     */     //   251: aload_3
/*     */     //   252: checkcast java/lang/Iterable
/*     */     //   255: iconst_1
/*     */     //   256: invokestatic drop : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   259: checkcast java/lang/Iterable
/*     */     //   262: astore #5
/*     */     //   264: iconst_0
/*     */     //   265: istore #6
/*     */     //   267: aload #5
/*     */     //   269: astore #7
/*     */     //   271: new java/util/ArrayList
/*     */     //   274: dup
/*     */     //   275: aload #5
/*     */     //   277: bipush #10
/*     */     //   279: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   282: invokespecial <init> : (I)V
/*     */     //   285: checkcast java/util/Collection
/*     */     //   288: astore #8
/*     */     //   290: iconst_0
/*     */     //   291: istore #9
/*     */     //   293: aload #7
/*     */     //   295: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   300: astore #10
/*     */     //   302: aload #10
/*     */     //   304: invokeinterface hasNext : ()Z
/*     */     //   309: ifeq -> 396
/*     */     //   312: aload #10
/*     */     //   314: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   319: astore #11
/*     */     //   321: aload #8
/*     */     //   323: aload #11
/*     */     //   325: checkcast java/lang/String
/*     */     //   328: astore #12
/*     */     //   330: astore #15
/*     */     //   332: iconst_0
/*     */     //   333: istore #13
/*     */     //   335: aload #12
/*     */     //   337: checkcast java/lang/CharSequence
/*     */     //   340: iconst_1
/*     */     //   341: newarray char
/*     */     //   343: astore #14
/*     */     //   345: aload #14
/*     */     //   347: iconst_0
/*     */     //   348: bipush #10
/*     */     //   350: castore
/*     */     //   351: aload #14
/*     */     //   353: iconst_0
/*     */     //   354: iconst_0
/*     */     //   355: bipush #6
/*     */     //   357: aconst_null
/*     */     //   358: invokestatic split$default : (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   361: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   364: checkcast java/lang/String
/*     */     //   367: checkcast java/lang/CharSequence
/*     */     //   370: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   373: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   376: ldc ' '
/*     */     //   378: aconst_null
/*     */     //   379: iconst_2
/*     */     //   380: aconst_null
/*     */     //   381: invokestatic substringBefore$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   384: aload #15
/*     */     //   386: swap
/*     */     //   387: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   392: pop
/*     */     //   393: goto -> 302
/*     */     //   396: aload #8
/*     */     //   398: checkcast java/util/List
/*     */     //   401: nop
/*     */     //   402: astore #4
/*     */     //   404: aload #4
/*     */     //   406: checkcast java/lang/Iterable
/*     */     //   409: astore #5
/*     */     //   411: iconst_0
/*     */     //   412: istore #6
/*     */     //   414: aload #5
/*     */     //   416: instanceof java/util/Collection
/*     */     //   419: ifeq -> 439
/*     */     //   422: aload #5
/*     */     //   424: checkcast java/util/Collection
/*     */     //   427: invokeinterface isEmpty : ()Z
/*     */     //   432: ifeq -> 439
/*     */     //   435: iconst_0
/*     */     //   436: goto -> 493
/*     */     //   439: aload #5
/*     */     //   441: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   446: astore #7
/*     */     //   448: aload #7
/*     */     //   450: invokeinterface hasNext : ()Z
/*     */     //   455: ifeq -> 492
/*     */     //   458: aload #7
/*     */     //   460: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   465: astore #8
/*     */     //   467: aload #8
/*     */     //   469: checkcast java/lang/String
/*     */     //   472: astore #9
/*     */     //   474: iconst_0
/*     */     //   475: istore #10
/*     */     //   477: aload_2
/*     */     //   478: aload #9
/*     */     //   480: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   485: ifeq -> 448
/*     */     //   488: iconst_1
/*     */     //   489: goto -> 493
/*     */     //   492: iconst_0
/*     */     //   493: ifeq -> 528
/*     */     //   496: aload_3
/*     */     //   497: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   500: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   505: astore #5
/*     */     //   507: new com/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest
/*     */     //   510: dup
/*     */     //   511: aload #5
/*     */     //   513: aload #5
/*     */     //   515: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   520: aload_0
/*     */     //   521: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   524: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   527: areturn
/*     */     //   528: aload_0
/*     */     //   529: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   532: checkcast java/lang/CharSequence
/*     */     //   535: bipush #10
/*     */     //   537: iconst_0
/*     */     //   538: iconst_2
/*     */     //   539: aconst_null
/*     */     //   540: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */     //   543: ifeq -> 573
/*     */     //   546: aload_3
/*     */     //   547: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   550: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   555: astore #5
/*     */     //   557: new com/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest
/*     */     //   560: dup
/*     */     //   561: aload #5
/*     */     //   563: ldc 'Alert! Multi-line commands not supported.'
/*     */     //   565: aload_0
/*     */     //   566: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   569: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   572: areturn
/*     */     //   573: new com/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest
/*     */     //   576: dup
/*     */     //   577: aload_0
/*     */     //   578: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   581: aload_0
/*     */     //   582: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   585: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   590: aconst_null
/*     */     //   591: aload_0
/*     */     //   592: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   595: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   598: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #244	-> 12
/*     */     //   #246	-> 63
/*     */     //   #415	-> 71
/*     */     //   #416	-> 95
/*     */     //   #417	-> 123
/*     */     //   #246	-> 137
/*     */     //   #417	-> 147
/*     */     //   #418	-> 156
/*     */     //   #415	-> 161
/*     */     //   #246	-> 165
/*     */     //   #247	-> 169
/*     */     //   #248	-> 251
/*     */     //   #419	-> 267
/*     */     //   #420	-> 293
/*     */     //   #421	-> 321
/*     */     //   #249	-> 335
/*     */     //   #249	-> 376
/*     */     //   #421	-> 387
/*     */     //   #422	-> 396
/*     */     //   #419	-> 401
/*     */     //   #248	-> 402
/*     */     //   #251	-> 404
/*     */     //   #423	-> 414
/*     */     //   #424	-> 439
/*     */     //   #251	-> 477
/*     */     //   #424	-> 485
/*     */     //   #425	-> 492
/*     */     //   #251	-> 493
/*     */     //   #252	-> 496
/*     */     //   #253	-> 507
/*     */     //   #254	-> 511
/*     */     //   #255	-> 513
/*     */     //   #256	-> 520
/*     */     //   #253	-> 524
/*     */     //   #258	-> 528
/*     */     //   #259	-> 546
/*     */     //   #260	-> 557
/*     */     //   #261	-> 561
/*     */     //   #262	-> 563
/*     */     //   #263	-> 565
/*     */     //   #260	-> 569
/*     */     //   #267	-> 573
/*     */     //   #268	-> 577
/*     */     //   #269	-> 590
/*     */     //   #270	-> 591
/*     */     //   #267	-> 595
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   137	7	11	$i$a$-map-AgentActionsKt$toTerminalRequest$actionNames$1	I
/*     */     //   134	10	10	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   123	30	9	item$iv$iv	Ljava/lang/Object;
/*     */     //   95	63	7	$i$f$mapTo	I
/*     */     //   92	66	5	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   92	66	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   71	91	4	$i$f$map	I
/*     */     //   68	94	3	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   335	49	13	$i$a$-map-AgentActionsKt$toTerminalRequest$verbsAfterCd$1	I
/*     */     //   332	52	12	it	Ljava/lang/String;
/*     */     //   321	72	11	item$iv$iv	Ljava/lang/Object;
/*     */     //   293	105	9	$i$f$mapTo	I
/*     */     //   290	108	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   290	108	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   267	135	6	$i$f$map	I
/*     */     //   264	138	5	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   477	8	10	$i$a$-any-AgentActionsKt$toTerminalRequest$1	I
/*     */     //   474	11	9	it	Ljava/lang/String;
/*     */     //   467	25	8	element$iv	Ljava/lang/Object;
/*     */     //   414	79	6	$i$f$any	I
/*     */     //   411	82	5	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   507	21	5	action	Ljava/lang/String;
/*     */     //   557	16	5	action	Ljava/lang/String;
/*     */     //   169	404	2	actionNames	Ljava/util/Set;
/*     */     //   251	322	3	subCommands	Ljava/util/List;
/*     */     //   404	169	4	verbsAfterCd	Ljava/util/List;
/*     */     //   0	599	0	$this$toTerminalRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   0	599	1	availableActions	Ljava/util/List;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final <T> Object trackFileChanges(@NotNull Project project, @NotNull Function1<? super Continuation<? super T>, ? extends Object> action, @NotNull Continuation $completion) {
/* 288 */     return CoroutineScopeKt.coroutineScope(new AgentActionsKt$trackFileChanges$2(action, project, null), $completion);
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
/*     */   @DebugMetadata(f = "AgentActions.kt", l = {376, 378, 384}, i = {0, 0, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"collected", "disposable", "collected", "disposable", "result", "disposable", "result"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentActionsKt$trackFileChanges$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\020\000\032\024\022\n\022\b\022\004\022\0020\0030\002\022\004\022\002H\0040\001\"\004\b\000\020\004*\0020\005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nAgentActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,414:1\n607#2:415\n*S KotlinDebug\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2\n*L\n406#1:415\n*E\n"})
/*     */   static final class AgentActionsKt$trackFileChanges$2
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends FileChange>, ? extends T>>, Object>
/*     */   {
/*     */     Object L$0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Object L$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Object L$2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #8
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 347, 0 -> 40, 1 -> 131, 2 -> 199, 3 -> 291
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: new java/util/concurrent/ConcurrentLinkedQueue
/*     */       //   47: dup
/*     */       //   48: invokespecial <init> : ()V
/*     */       //   51: astore_2
/*     */       //   52: invokestatic getInstance : ()Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */       //   55: dup
/*     */       //   56: ldc 'getInstance(...)'
/*     */       //   58: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   61: astore_3
/*     */       //   62: ldc 'track-file-changes'
/*     */       //   64: invokestatic newDisposable : (Ljava/lang/String;)Lcom/intellij/openapi/Disposable;
/*     */       //   67: dup
/*     */       //   68: ldc 'newDisposable(...)'
/*     */       //   70: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   73: astore #4
/*     */       //   75: invokestatic getInstance : ()Lcom/intellij/openapi/vfs/VirtualFileManager;
/*     */       //   78: new com/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1
/*     */       //   81: dup
/*     */       //   82: aload_3
/*     */       //   83: aload_2
/*     */       //   84: invokespecial <init> : (Lcom/intellij/openapi/fileEditor/FileDocumentManager;Ljava/util/concurrent/ConcurrentLinkedQueue;)V
/*     */       //   87: checkcast com/intellij/openapi/vfs/AsyncFileListener
/*     */       //   90: aload #4
/*     */       //   92: invokevirtual addAsyncFileListener : (Lcom/intellij/openapi/vfs/AsyncFileListener;Lcom/intellij/openapi/Disposable;)V
/*     */       //   95: nop
/*     */       //   96: aload_0
/*     */       //   97: getfield $action : Lkotlin/jvm/functions/Function1;
/*     */       //   100: aload_0
/*     */       //   101: aload_0
/*     */       //   102: aload_2
/*     */       //   103: putfield L$0 : Ljava/lang/Object;
/*     */       //   106: aload_0
/*     */       //   107: aload #4
/*     */       //   109: putfield L$1 : Ljava/lang/Object;
/*     */       //   112: aload_0
/*     */       //   113: iconst_1
/*     */       //   114: putfield label : I
/*     */       //   117: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   122: dup
/*     */       //   123: aload #8
/*     */       //   125: if_acmpne -> 154
/*     */       //   128: aload #8
/*     */       //   130: areturn
/*     */       //   131: aload_0
/*     */       //   132: getfield L$1 : Ljava/lang/Object;
/*     */       //   135: checkcast com/intellij/openapi/Disposable
/*     */       //   138: astore #4
/*     */       //   140: aload_0
/*     */       //   141: getfield L$0 : Ljava/lang/Object;
/*     */       //   144: checkcast java/util/concurrent/ConcurrentLinkedQueue
/*     */       //   147: astore_2
/*     */       //   148: nop
/*     */       //   149: aload_1
/*     */       //   150: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   153: aload_1
/*     */       //   154: astore #5
/*     */       //   156: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */       //   161: aload_0
/*     */       //   162: checkcast kotlin/coroutines/Continuation
/*     */       //   165: aload_0
/*     */       //   166: aload_2
/*     */       //   167: putfield L$0 : Ljava/lang/Object;
/*     */       //   170: aload_0
/*     */       //   171: aload #4
/*     */       //   173: putfield L$1 : Ljava/lang/Object;
/*     */       //   176: aload_0
/*     */       //   177: aload #5
/*     */       //   179: putfield L$2 : Ljava/lang/Object;
/*     */       //   182: aload_0
/*     */       //   183: iconst_2
/*     */       //   184: putfield label : I
/*     */       //   187: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   190: dup
/*     */       //   191: aload #8
/*     */       //   193: if_acmpne -> 228
/*     */       //   196: aload #8
/*     */       //   198: areturn
/*     */       //   199: aload_0
/*     */       //   200: getfield L$2 : Ljava/lang/Object;
/*     */       //   203: astore #5
/*     */       //   205: aload_0
/*     */       //   206: getfield L$1 : Ljava/lang/Object;
/*     */       //   209: checkcast com/intellij/openapi/Disposable
/*     */       //   212: astore #4
/*     */       //   214: aload_0
/*     */       //   215: getfield L$0 : Ljava/lang/Object;
/*     */       //   218: checkcast java/util/concurrent/ConcurrentLinkedQueue
/*     */       //   221: astore_2
/*     */       //   222: nop
/*     */       //   223: aload_1
/*     */       //   224: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   227: aload_1
/*     */       //   228: pop
/*     */       //   229: getstatic com/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex.Companion : Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex$Companion;
/*     */       //   232: aload_0
/*     */       //   233: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   236: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex;
/*     */       //   239: astore #6
/*     */       //   241: aload_2
/*     */       //   242: aload #6
/*     */       //   244: aload_0
/*     */       //   245: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   248: <illegal opcode> invoke : (Ljava/util/concurrent/ConcurrentLinkedQueue;Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex;Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*     */       //   253: aload_0
/*     */       //   254: checkcast kotlin/coroutines/Continuation
/*     */       //   257: aload_0
/*     */       //   258: aload #4
/*     */       //   260: putfield L$0 : Ljava/lang/Object;
/*     */       //   263: aload_0
/*     */       //   264: aload #5
/*     */       //   266: putfield L$1 : Ljava/lang/Object;
/*     */       //   269: aload_0
/*     */       //   270: aconst_null
/*     */       //   271: putfield L$2 : Ljava/lang/Object;
/*     */       //   274: aload_0
/*     */       //   275: iconst_3
/*     */       //   276: putfield label : I
/*     */       //   279: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   282: dup
/*     */       //   283: aload #8
/*     */       //   285: if_acmpne -> 312
/*     */       //   288: aload #8
/*     */       //   290: areturn
/*     */       //   291: aload_0
/*     */       //   292: getfield L$1 : Ljava/lang/Object;
/*     */       //   295: astore #5
/*     */       //   297: aload_0
/*     */       //   298: getfield L$0 : Ljava/lang/Object;
/*     */       //   301: checkcast com/intellij/openapi/Disposable
/*     */       //   304: astore #4
/*     */       //   306: nop
/*     */       //   307: aload_1
/*     */       //   308: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   311: aload_1
/*     */       //   312: checkcast java/util/List
/*     */       //   315: astore #7
/*     */       //   317: aload #7
/*     */       //   319: aload #5
/*     */       //   321: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */       //   324: astore #5
/*     */       //   326: aload #4
/*     */       //   328: invokestatic dispose : (Lcom/intellij/openapi/Disposable;)V
/*     */       //   331: goto -> 344
/*     */       //   334: astore #6
/*     */       //   336: aload #4
/*     */       //   338: invokestatic dispose : (Lcom/intellij/openapi/Disposable;)V
/*     */       //   341: aload #6
/*     */       //   343: athrow
/*     */       //   344: aload #5
/*     */       //   346: areturn
/*     */       //   347: new java/lang/IllegalStateException
/*     */       //   350: dup
/*     */       //   351: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   353: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   356: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #288	-> 3
/*     */       //   #290	-> 44
/*     */       //   #291	-> 52
/*     */       //   #293	-> 62
/*     */       //   #295	-> 75
/*     */       //   #296	-> 78
/*     */       //   #372	-> 90
/*     */       //   #295	-> 92
/*     */       //   #375	-> 95
/*     */       //   #376	-> 96
/*     */       //   #288	-> 128
/*     */       //   #378	-> 165
/*     */       //   #288	-> 196
/*     */       //   #382	-> 228
/*     */       //   #384	-> 241
/*     */       //   #288	-> 288
/*     */       //   #410	-> 317
/*     */       //   #412	-> 326
/*     */       //   #413	-> 331
/*     */       //   #412	-> 334
/*     */       //   #413	-> 346
/*     */       //   #288	-> 347
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   52	79	2	collected	Ljava/util/concurrent/ConcurrentLinkedQueue;
/*     */       //   148	51	2	collected	Ljava/util/concurrent/ConcurrentLinkedQueue;
/*     */       //   222	60	2	collected	Ljava/util/concurrent/ConcurrentLinkedQueue;
/*     */       //   62	28	3	docMgr	Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */       //   75	56	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */       //   140	59	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */       //   214	77	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */       //   306	25	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */       //   334	13	4	disposable	Lcom/intellij/openapi/Disposable;
/*     */       //   156	43	5	result	Ljava/lang/Object;
/*     */       //   205	86	5	result	Ljava/lang/Object;
/*     */       //   297	27	5	result	Ljava/lang/Object;
/*     */       //   241	41	6	wsIndex	Lcom/intellij/workspaceModel/core/fileIndex/WorkspaceFileIndex;
/*     */       //   317	7	7	changes	Ljava/util/List;
/*     */       //   0	357	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2;
/*     */       //   44	303	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   95	122	334	finally
/*     */       //   148	190	334	finally
/*     */       //   222	282	334	finally
/*     */       //   306	326	334	finally
/*     */       //   334	336	334	finally
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final long invokeSuspend$lambda$0() {
/* 379 */       return VirtualFileManager.getInstance().syncRefresh();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final List invokeSuspend$lambda$4(ConcurrentLinkedQueue $collected, WorkspaceFileIndex $wsIndex, Project $project) {
/* 387 */       Sequence sequence = SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence($collected), $wsIndex::invokeSuspend$lambda$4$lambda$1), $project::invokeSuspend$lambda$4$lambda$2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 406 */       int $i$f$sortedBy = 0;
/* 407 */       return SequencesKt.toList(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 415 */           SequencesKt.sortedWith(sequence, new AgentActionsKt$trackFileChanges$2$invokeSuspend$lambda$4$$inlined$sortedBy$1()));
/*     */     }
/*     */     
/*     */     private static final boolean invokeSuspend$lambda$4$lambda$1(WorkspaceFileIndex $wsIndex, Raw it) {
/*     */       Intrinsics.checkNotNullExpressionValue(it.getFile().getUrl(), "getUrl(...)");
/*     */       return ($wsIndex.isUrlInContent(it.getFile().getUrl()) != ThreeState.NO);
/*     */     }
/*     */     
/*     */     private static final FileChange invokeSuspend$lambda$4$lambda$2(Project $project, Raw raw) {
/*     */       Raw raw1 = raw;
/*     */       if (raw1 instanceof Raw.Modify) {
/*     */       
/*     */       } else {
/*     */         throw new NoWhenBranchMatchedException();
/*     */       } 
/*     */       return (raw1 instanceof Raw.Create) ? FileChange.Companion.from($project, ((Raw.Create)raw).getFile(), null, ((Raw.Create)raw).getAfter()) : ((raw1 instanceof Raw.Delete) ? FileChange.Companion.from($project, ((Raw.Delete)raw).getFile(), ((Raw.Delete)raw).getBefore(), null) : (FileChange)"JD-Core does not support Kotlin");
/*     */     }
/*     */     
/*     */     AgentActionsKt$trackFileChanges$2(Function1<Continuation<? super T>, Object> $action, Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AgentActionsKt$trackFileChanges$2> $completion) {
/*     */       return (Continuation<Unit>)new AgentActionsKt$trackFileChanges$2(this.$action, this.$project, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AgentActionsKt$trackFileChanges$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentActionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */